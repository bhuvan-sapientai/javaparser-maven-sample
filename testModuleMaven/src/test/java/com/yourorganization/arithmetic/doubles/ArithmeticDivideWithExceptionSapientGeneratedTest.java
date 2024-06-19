package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticDivideWithExceptionSapientGeneratedTest {

    //Sapient generated method id: ${divideWhenBEquals0ThrowsIllegalArgumentException}, hash: 4B7C7F58D6083B1B88B8F3B9D65ED0AE
    @Test()
    void divideWhenBEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (b == 0) : true
         */
         //Arrange Statement(s)
        ArithmeticDivideWithException target = new ArithmeticDivideWithException();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Divisor can't be zero!");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.divide(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${divideWhenBNotEquals0}, hash: 74920414E29D87BFDA195E082A7CCF78
    @Test()
    void divideWhenBNotEquals0() {
        /* Branches:
         * (b == 0) : false
         */
         //Arrange Statement(s)
        ArithmeticDivideWithException target = new ArithmeticDivideWithException();
        
        //Act Statement(s)
        double result = target.divide(Double.parseDouble("-1.0"), Double.parseDouble("-1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }
}
