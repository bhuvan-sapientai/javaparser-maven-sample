package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticDivideSapientGeneratedTest {

    //Sapient generated method id: ${divideTest}, hash: 2B7C5537518B259EC65BFA160E752F02
    @Test()
    void divideTest() {
        //Arrange Statement(s)
        ArithmeticDivide target = new ArithmeticDivide();
        
        //Act Statement(s)
        float result = target.divide(Float.parseFloat("4.0"), Float.parseFloat("2.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("2.0"))));
    }
}
