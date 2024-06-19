package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticRemainderSapientGeneratedTest {

    //Sapient generated method id: ${getRemainderTest}, hash: 5F653A0B046E5053ACBB46F185911CA3
    @Test()
    void getRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        double result = target.getRemainder(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${fixedRemainderTest}, hash: D99383346DAD56BB374F8C64FED7E173
    @Test()
    void fixedRemainderTest() {
        //Arrange Statement(s)
        ArithmeticRemainder target = new ArithmeticRemainder();
        
        //Act Statement(s)
        double result = target.fixedRemainder();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }
}
