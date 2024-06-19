package com.yourorganization.arithmetic.floats;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticAddSapientGeneratedTest {

    //Sapient generated method id: ${addTest}, hash: A9F11239887CE01E8CC4F61A43883E9B
    @Test()
    void addTest() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        float result = target.add(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${add2Test}, hash: 9B3E6BCB0137F8807A389EFF0999B4E4
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        float result = target.add2(Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("2.0"))));
    }
}
