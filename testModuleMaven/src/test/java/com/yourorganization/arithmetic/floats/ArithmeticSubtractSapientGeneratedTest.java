package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticSubtractSapientGeneratedTest {

    //Sapient generated method id: ${subtractTest}, hash: AC67DC2AFB382AA0388C9D71D9E10771
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        ArithmeticSubtract target = new ArithmeticSubtract();
        
        //Act Statement(s)
        float result = target.subtract(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }
}
