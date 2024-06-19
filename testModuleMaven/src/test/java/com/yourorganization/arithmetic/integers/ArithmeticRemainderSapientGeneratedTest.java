package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticRemainderSapientGeneratedTest {

    //Sapient generated method id: ${getRemainderTest}, hash: E08DE7421C5F29B4E6007C890839726B
    @Test()
    void getRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        int result = target.getRemainder(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${fixedRemainderTest}, hash: 1C8D5724AFE0BC0A8357B3A3535CC135
    @Test()
    void fixedRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        int result = target.fixedRemainder();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }
}
