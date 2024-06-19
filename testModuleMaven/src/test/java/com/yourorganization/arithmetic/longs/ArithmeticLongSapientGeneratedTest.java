package com.yourorganization.arithmetic.longs;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticLongSapientGeneratedTest {

    //Sapient generated method id: ${addTest}, hash: F7A06EECE3686A8C86A9B76FB225A616
    @Test()
    void addTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.add(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2L)));
    }

    //Sapient generated method id: ${add2Test}, hash: 5F13566587AE8A293FC90DAA5D62C46A
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.add2(1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3L)));
    }

    //Sapient generated method id: ${divideTest}, hash: AF4B84320D7A9EAE23F0620F3D01FB0F
    @Test()
    void divideTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.divide(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1L)));
    }

    //Sapient generated method id: ${incrementTest}, hash: C5071002090CD66BF2D09A246C938069
    @Test()
    void incrementTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.increment(1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2L)));
    }

    //Sapient generated method id: ${multiplyTest}, hash: 5F699742C489BD45259DF610C1E3B125
    @Test()
    void multiplyTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.multiply(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1L)));
    }

    //Sapient generated method id: ${negateTest}, hash: A55E729E2C497DC7AD24B1079335EED4
    @Test()
    void negateTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.negate(1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1L)));
    }

    //Sapient generated method id: ${negateFixedTest}, hash: 673C65B2D89F36135F100373D6977F94
    @Test()
    void negateFixedTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.negateFixed();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1L)));
    }

    //Sapient generated method id: ${getRemainderTest}, hash: 918E744DC96D1E7658057CE0AF801C64
    @Test()
    void getRemainderTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.getRemainder(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${fixedRemainderTest}, hash: 92C927181442B7EA873171F121397131
    @Test()
    void fixedRemainderTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.fixedRemainder();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1L)));
    }

    //Sapient generated method id: ${subtractTest}, hash: B9F3CF7D2CFA5712AF1E418832657E60
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        ArithmeticLong target = new ArithmeticLong();
        
        //Act Statement(s)
        long result = target.subtract(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }
}
