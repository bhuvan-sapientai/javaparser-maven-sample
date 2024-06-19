package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticAddSapientGeneratedTest {

    //Sapient generated method id: ${addTest}, hash: EB72479B0656B8F69B6195F07DAC7225
    @Test()
    void addTest() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        int result = target.add(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    //Sapient generated method id: ${add2Test}, hash: CFB86574244D32C66691B80177B459D0
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        int result = target.add2(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3)));
    }

    //Sapient generated method id: ${add3Test}, hash: 9FD4A88E25811B1B328AA63EA22A844B
    @Test()
    void add3Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        short result = target.add3((short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 3)));
    }

    //Sapient generated method id: ${add4Test}, hash: 1F99F85164EA616A05258CC7B1308DFD
    @Test()
    void add4Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        short result = target.add4();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 4)));
    }

    //Sapient generated method id: ${add5Test}, hash: 76D824B7A5D2E60F2E3676F74E9A3014
    @Test()
    void add5Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        byte result = target.add5((byte) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 3)));
    }

    //Sapient generated method id: ${add6Test}, hash: 411CCEAD178E48F9C44FD1FB913E0F5A
    @Test()
    void add6Test() {
        //Arrange Statement(s)
        ArithmeticAdd target = new ArithmeticAdd();
        
        //Act Statement(s)
        byte result = target.add6();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 4)));
    }
}
