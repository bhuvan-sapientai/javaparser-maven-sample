package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticDivideSapientGeneratedTest {

    //Sapient generated method id: ${divideTest}, hash: E0B541F51356530BBC59CFEB1ED8CB4C
    @Test()
    void divideTest() {
        //Arrange Statement(s)
        ArithmeticDivide target = new ArithmeticDivide();
        
        //Act Statement(s)
        double result = target.divide(Double.parseDouble("4.0"), Double.parseDouble("2.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("2.0"), 0.00001)));
    }
}
