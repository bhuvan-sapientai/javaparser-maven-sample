package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticNegateSapientGeneratedTest {

    //Sapient generated method id: ${negateTest}, hash: 98E2F48FAE42B689FBC6584B8FF2EE2A
    @Test()
    void negateTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        int result = target.negate(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${negateFixedTest}, hash: 9B4B62AD0CDCE6A43E9B2DB8E4F33D14
    @Test()
    void negateFixedTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        int result = target.negateFixed();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }
}
