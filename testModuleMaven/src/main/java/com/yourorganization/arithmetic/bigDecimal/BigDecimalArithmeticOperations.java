package com.yourorganization.arithmetic.bigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalArithmeticOperations {

    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public BigDecimal add2(BigDecimal b) {
        BigDecimal a = BigDecimal.valueOf(11.2);
        return a.add(b);
    }

    public BigDecimal add3() {
        BigDecimal a = BigDecimal.valueOf(1.23);
        BigDecimal b = BigDecimal.valueOf(3.7);
        return a.add(b);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public BigDecimal subtract2(BigDecimal b) {
        BigDecimal a = BigDecimal.valueOf(2.123);
        return a.subtract(b);
    }

    public BigDecimal subtract3() {
        BigDecimal a = BigDecimal.valueOf(1.101);
        BigDecimal b = BigDecimal.valueOf(2.22);
        return a.subtract(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public BigDecimal multiply2(BigDecimal b) {
        BigDecimal a = BigDecimal.valueOf(2.1);
        return a.multiply(b);
    }

    public BigDecimal multiply3() {
        BigDecimal a = BigDecimal.valueOf(1.107);
        BigDecimal b = BigDecimal.valueOf(2.2);
        return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }

    public BigDecimal divide2(BigDecimal b) {
        BigDecimal a = BigDecimal.valueOf(2.103);
        return a.divide(b);
    }

    public BigDecimal divide3() {
        BigDecimal a = BigDecimal.valueOf(1.712);
        BigDecimal b = BigDecimal.valueOf(3.424);
        return a.divide(b);
    }


    public BigDecimal createBigDecimal(String value) {
        return new BigDecimal(value);
    }

    public BigDecimal createBigDecimal2() {
        return new BigDecimal("1.23");
    }


    public BigInteger createBigInteger(String value) {
        return new BigInteger(value);
    }

    public BigInteger createBigInteger2() {
        return new BigInteger("10");
    }

    public int compareToWithNull() {
        return BigInteger.valueOf(10L).compareTo(null);
    }



}
