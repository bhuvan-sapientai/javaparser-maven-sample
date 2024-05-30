package com.yourorganization.arithmetic.bigDecimal;

import com.google.common.primitives.Bytes;
import org.bouncycastle.crypto.generators.SCrypt;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkState;

public class BigDecimalSamples {

    public final boolean ecMultiply;
    public final boolean compressed;
    public final boolean hasLotAndSequence;
    public final byte[] addressHash;
    public final byte[] content;
    protected final byte[] bytes;

    public BigDecimalSamples(byte[] bytes, boolean ecMultiply, boolean compressed,
                             boolean hasLotAndSequence, byte[] addressHash, byte[] content) throws AddressFormatException {
        this.bytes = bytes;
        this.ecMultiply = ecMultiply;
        this.compressed = compressed;
        this.hasLotAndSequence = hasLotAndSequence;
        this.addressHash = addressHash;
        this.content = content;
    }

    public ECKey decrypt(String passphrase) throws AddressFormatException {
        String normalizedPassphrase = Normalizer.normalize(passphrase, Normalizer.Form.NFC);
        return decryptEC(normalizedPassphrase);
    }

    private ECKey decryptEC(String normalizedPassphrase) {

        byte[] ownerEntropy = Arrays.copyOfRange(content, 0, 8);
        byte[] ownerSalt = Arrays.copyOfRange(ownerEntropy, 0, 4);

        byte[] passFactorBytes = org.bouncycastle.crypto.generators.SCrypt.generate(normalizedPassphrase.getBytes(StandardCharsets.UTF_8), ownerSalt, 16384, 8, 8, 32);

        BigInteger passFactor = ByteUtils.bytesToBigInteger(passFactorBytes);
        ECKey k = ECKey.fromPrivate(passFactor, true);

        byte[] salt = Bytes.concat(addressHash, ownerEntropy);
        checkState(salt.length == 12);
        byte[] derived = SCrypt.generate(k.getPubKey(), salt, 1024, 1, 1, 64);

        byte[] decrypted2 = Arrays.copyOfRange(content, 16, 32);
        checkState(decrypted2.length == 16);
        for (int i = 0; i < 16; i++)
            decrypted2[i] ^= derived[i + 16];

        byte[] encrypted1 = Bytes.concat(Arrays.copyOfRange(content, 8, 16), Arrays.copyOfRange(decrypted2, 0, 8));
        checkState(encrypted1.length == 16);
        for (int i = 0; i < 16; i++)
            encrypted1[i] ^= derived[i];

        byte[] seed = Bytes.concat(encrypted1, Arrays.copyOfRange(decrypted2, 8, 16));
        BigInteger seedFactor = ByteUtils.bytesToBigInteger(Sha256Hash.hashTwice(seed));
        BigInteger priv = passFactor.multiply(seedFactor).mod(ECKey.CURVE.getN());

        return ECKey.fromPrivate(priv, compressed);

    }


}
