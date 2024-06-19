package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticNegateSapientGeneratedTest {

    //Sapient generated method id: ${negateTest}, hash: BAA996A11E6F48DD875FC19D0A34BF60
    @Test()
    void negateTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        float result = target.negate(Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("1.0"))));
    }

    //Sapient generated method id: ${negateFixedTest}, hash: C55C7B665CD7AAC5EF31ECB8AAD82B53
    @Test()
    void negateFixedTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        float result = target.negateFixed();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("-1.0"))));
    }
}
