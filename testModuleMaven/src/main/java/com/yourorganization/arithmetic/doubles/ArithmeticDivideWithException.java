package com.yourorganization.arithmetic.doubles;

public class ArithmeticDivideWithException {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can't be zero!");
        }

        return a / b;
    }
}
