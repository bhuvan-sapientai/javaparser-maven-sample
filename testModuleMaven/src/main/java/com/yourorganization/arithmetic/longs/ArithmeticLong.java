package com.yourorganization.arithmetic.longs;

public class ArithmeticLong {

    public long add(long a, long b) {
        return a + b;
    }

    public long add2(long a) {
        return a + 2;
    }

    public long divide(long a, long b) {
        return a / b;
    }

    public long increment(long a) {
        return ++a;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long negate(long a) {
        return -a;
    }

    public long negateFixed() {
        long a = 1;
        return -a;
    }

    public long getRemainder(long a, long b) {
        return a % b;
    }

    public long fixedRemainder() {
        return 3 % 2;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

}
