package com.yourorganization.arithmetic.add;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AddSapientGeneratedTest {

    //Sapient generated method id: ${add1Test}, hash: D8D33512DB169E342CB0CA9D492DCF9D
    @Test()
    void add1Test() {
        //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add1(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${add2Test}, hash: 3E2D3D8FA9821DDDC3A026DDF0394A4B
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add2(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }

    //Sapient generated method id: ${add3WhenAGreaterThanB}, hash: A1422D8B2A1E03718ADACB0C1B459216
    @Test()
    void add3WhenAGreaterThanB() {
        /* Branches:
         * (a > b) : true
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add3(Double.parseDouble("0.5"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.5"), 0.00001)));
    }

    //Sapient generated method id: ${add3WhenANotGreaterThanB}, hash: 6B358D052AF77448E58C96BE36C03BB6
    @Test()
    void add3WhenANotGreaterThanB() {
        /* Branches:
         * (a > b) : false
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add3(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${add4WhenALessThanB}, hash: D4EA9D4F69A47AA4788D5F2A413D34A2
    @Test()
    void add4WhenALessThanB() {
        /* Branches:
         * (a < b) : true
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add4(Double.parseDouble("-0.5"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("-0.5"), 0.00001)));
    }

    //Sapient generated method id: ${add4WhenANotLessThanB}, hash: 0B46597E118535137C6E4AB94C16FE1D
    @Test()
    void add4WhenANotLessThanB() {
        /* Branches:
         * (a < b) : false
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add4(Double.parseDouble("2.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }
}
