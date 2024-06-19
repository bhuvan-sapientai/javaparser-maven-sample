package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticMultiplySapientGeneratedTest {

    //Sapient generated method id: ${multiplyTest}, hash: 4DD2F4792820E45A113114262822DCBF
    @Test()
    void multiplyTest() {
        //Arrange Statement(s)
        ArithmeticMultiply target = new ArithmeticMultiply();
        
        //Act Statement(s)
        int result = target.multiply(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }
}
