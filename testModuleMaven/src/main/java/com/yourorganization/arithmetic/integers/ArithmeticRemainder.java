package com.yourorganization.arithmetic.integers;

public class ArithmeticRemainder {

    public int getRemainder(int a, int b) {
        return a % b;
    }

    public int fixedRemainder() {
        int a = 3;
        int b = 2;
        return getRemainderPrivate(a, b);
    }

    private int getRemainderPrivate(int a, int b) {
        return a % b;
    }

}
