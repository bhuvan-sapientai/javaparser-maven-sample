package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticSubtractSapientGeneratedTest {

    //Sapient generated method id: ${subtractTest}, hash: C955DED14F167E00AE5DF32459102D3C
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        ArithmeticSubtract target = new ArithmeticSubtract();
        
        //Act Statement(s)
        int result = target.subtract(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
