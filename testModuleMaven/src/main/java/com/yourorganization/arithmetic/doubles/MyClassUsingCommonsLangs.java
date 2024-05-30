package com.yourorganization.arithmetic.doubles;

import org.apache.commons.lang3.text.StrBuilder;

public class MyClassUsingCommonsLangs {

    public StrBuilder append(final boolean value) {
        int capacity = 1;
        if (value) {
            capacity = 5;
        } else {
            capacity = 10;
        }
        return new StrBuilder(10);
    }


    public StrBuilder appendln(final boolean value) {
        return append(value).appendNewLine();
    }
}
