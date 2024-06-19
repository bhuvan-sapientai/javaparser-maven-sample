package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticRemainderSapientGeneratedTest {

    //Sapient generated method id: ${getRemainderTest}, hash: DA94203B8C936C0A599D188A48AEA6E7
    @Test()
    void getRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        float result = target.getRemainder(Float.parseFloat("1.0"), Float.parseFloat("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${fixedRemainderTest}, hash: BB40F3F5904614E98B291B2E5461114E
    @Test()
    void fixedRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        float result = target.fixedRemainder();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("1.0"))));
    }
}
