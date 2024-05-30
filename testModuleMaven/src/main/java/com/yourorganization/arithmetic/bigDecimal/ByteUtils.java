package com.yourorganization.arithmetic.bigDecimal;

import java.math.BigInteger;

public class ByteUtils {

    public static BigInteger bytesToBigInteger(byte[] bytes) {
        return new BigInteger(1, bytes);
    }

}
