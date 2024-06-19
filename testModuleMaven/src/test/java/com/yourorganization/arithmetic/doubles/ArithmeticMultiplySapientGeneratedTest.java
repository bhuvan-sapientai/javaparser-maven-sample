package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticMultiplySapientGeneratedTest {

    //Sapient generated method id: ${multiplyTest}, hash: 8FAA9DE03D9B9CC263244B00769111DC
    @Test()
    void multiplyTest() {
        //Arrange Statement(s)
        ArithmeticMultiply target = new ArithmeticMultiply();
        
        //Act Statement(s)
        double result = target.multiply(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }
}
