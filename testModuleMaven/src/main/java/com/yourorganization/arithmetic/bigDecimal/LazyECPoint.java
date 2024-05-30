package com.yourorganization.arithmetic.bigDecimal;

import lombok.Getter;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

public class LazyECPoint {

    private final ECCurve curve;
    private final byte[] bits;
    @Getter
    private final boolean compressed;

    // This field is effectively final - once set it won't change again. However it can be set after
    // construction.
    @Nullable
    private ECPoint point;

    public LazyECPoint(ECPoint point, boolean compressed) {
        this.point = Objects.requireNonNull(point).normalize();
        this.compressed = compressed;
        this.curve = null;
        this.bits = null;
    }

    public byte[] getEncoded() {
        return Arrays.copyOf(bits, bits.length);
    }

}
