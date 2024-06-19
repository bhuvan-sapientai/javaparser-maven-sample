package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticMultiplySapientGeneratedTest {

    //Sapient generated method id: ${multiplyTest}, hash: D7F4E15065D941FB040EAD6DC0EDD1F8
    @Test()
    void multiplyTest() {
        //Arrange Statement(s)
        ArithmeticMultiply target = new ArithmeticMultiply();
        
        //Act Statement(s)
        float result = target.multiply(Float.parseFloat("1.0"), Float.parseFloat("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("1.0"))));
    }
}
