package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticSubtractSapientGeneratedTest {

    //Sapient generated method id: ${subtractTest}, hash: BA1F37AF442A6BE9E0A1904D15E35B97
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        ArithmeticSubtract target = new ArithmeticSubtract();
        
        //Act Statement(s)
        double result = target.subtract(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }
}
