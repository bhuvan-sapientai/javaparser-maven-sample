package com.yourorganization.arithmetic.integers;

public class ArithmeticIncrement {

    public int increment(int a) {
        return ++a;
    }

    public int decrement(int a) {
        return --a;
    }

    public int incrementLater(int a) {
        int b = a++;
        if (b == 0) {
            return a;
        } else {
            return a * 2;
        }
    }

    public int decrementLater(int a) {
        int b = a--;
        if (b == 0) {
            return a;
        } else {
            return a * 2;
        }
    }


}
