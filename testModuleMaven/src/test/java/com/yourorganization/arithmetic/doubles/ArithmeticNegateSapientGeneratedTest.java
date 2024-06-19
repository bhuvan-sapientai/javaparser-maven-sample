package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticNegateSapientGeneratedTest {

    //Sapient generated method id: ${negateTest}, hash: D0879FE13B107D71F7E2B70813A011BD
    @Test()
    void negateTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        double result = target.negate(Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${negateFixedTest}, hash: B260CA1CC1A4FAB1B414AF06782A9298
    @Test()
    void negateFixedTest() {
        //Arrange Statement(s)
        ArithmeticNegate target = new ArithmeticNegate();
        
        //Act Statement(s)
        double result = target.negateFixed();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("-1.0"), 0.00001)));
    }
}
