package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticDivideSapientGeneratedTest {

    //Sapient generated method id: ${divideTest}, hash: 7A66F2A1E5E6F88C32242C4A7D4C82B5
    @Test()
    void divideTest() {
        //Arrange Statement(s)
        ArithmeticDivide target = new ArithmeticDivide();
        
        //Act Statement(s)
        int result = target.divide(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }
}
