package com.yourorganization.arithmetic.bigDecimal;

import lombok.Getter;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.FixedPointUtil;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Objects;

@Getter
public class ECKey {
    public static final ECDomainParameters CURVE;
    private byte[] pubKeyHash;

    protected final LazyECPoint pub;
    @Nullable
    protected final BigInteger priv;
    private static final X9ECParameters CURVE_PARAMS = CustomNamedCurves.getByName("secp256k1");
    public static final BigInteger HALF_CURVE_ORDER;


    static {
        // Tell Bouncy Castle to precompute data that's needed during secp256k1 calculations.
        FixedPointUtil.precompute(CURVE_PARAMS.getG());
        CURVE = new ECDomainParameters(CURVE_PARAMS.getCurve(), CURVE_PARAMS.getG(), CURVE_PARAMS.getN(),
                CURVE_PARAMS.getH());
        HALF_CURVE_ORDER = CURVE_PARAMS.getN().shiftRight(1);
    }

    protected ECKey(@Nullable BigInteger priv, LazyECPoint pub) {
        this.priv = priv;
        this.pub = Objects.requireNonNull(pub);
    }

    public byte[] getPubKey() {
        return pub.getEncoded();
    }
    public boolean isCompressed() {
        return pub.isCompressed();
    }

    public static ECKey fromPrivate(BigInteger privKey, boolean compressed) {
        ECPoint point = publicPointFromPrivate(privKey);
        return new ECKey(privKey, new LazyECPoint(point, compressed));
    }

    public static ECPoint publicPointFromPrivate(BigInteger privKey) {
        if (privKey.bitLength() > CURVE.getN().bitLength()) {
            privKey = privKey.mod(CURVE.getN());
        }
        return new FixedPointCombMultiplier().multiply(CURVE.getG(), privKey);
    }
}
