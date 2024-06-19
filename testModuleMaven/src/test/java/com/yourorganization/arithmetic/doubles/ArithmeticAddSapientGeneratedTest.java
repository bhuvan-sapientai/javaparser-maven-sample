package com.yourorganization.arithmetic.doubles;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticAddSapientGeneratedTest {

    //Sapient generated method id: ${addTest}, hash: FA33C9C76A491E958131769EA9CA10D8
    @Test()
    void addTest() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        double result = target.add(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${add2Test}, hash: 50B290F652DACE3F4420A4EB9C534E2B
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        double result = target.add2(Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("2.0"), 0.00001)));
    }

    //Sapient generated method id: ${add3Test}, hash: 8B408034AAF466C35CD2F314C114410E
    @Disabled()
    @Test()
    void add3Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        double result = target.add3();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }
}
