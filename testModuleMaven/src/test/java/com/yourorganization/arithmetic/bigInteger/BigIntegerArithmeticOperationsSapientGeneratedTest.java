package com.yourorganization.arithmetic.bigInteger;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BigIntegerArithmeticOperationsSapientGeneratedTest {

    //Sapient generated method id: ${addTest}, hash: 52CBBF840C2EBBD7E162C141C2B48DFD
    @Test()
    void addTest() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.add(new BigInteger("1"), new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("2"))));
    }

    //Sapient generated method id: ${add2Test}, hash: 92C54802437E69EA10B5F78F5DDEACD1
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.add2(new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("11"))));
    }

    //Sapient generated method id: ${add3Test}, hash: 95B1F77846010F1CB63D2C6C7D81CADB
    @Test()
    void add3Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.add3();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("11"))));
    }

    //Sapient generated method id: ${subtractTest}, hash: 13D9CFE353C3581CD3ECB7DED56A414B
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.subtract(new BigInteger("1"), new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("0"))));
    }

    //Sapient generated method id: ${subtract2Test}, hash: DEBE4EA8C645CDF54CA67E9AB45EEF97
    @Test()
    void subtract2Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.subtract2(new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("9"))));
    }

    //Sapient generated method id: ${subtract3Test}, hash: 199C3F0583C5A875D7A62F4385FFD208
    @Test()
    void subtract3Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.subtract3();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("9"))));
    }

    //Sapient generated method id: ${multiplyTest}, hash: 9FCCA681CC8C386A806EEE247390336B
    @Test()
    void multiplyTest() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.multiply(new BigInteger("1"), new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("1"))));
    }

    //Sapient generated method id: ${multiply2Test}, hash: 1AFA0BBDB30AC152CEF3FDEE4E52E292
    @Test()
    void multiply2Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.multiply2(new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("10"))));
    }

    //Sapient generated method id: ${multiply3Test}, hash: B1B0ED3D61DA5592626E0E76224672BB
    @Test()
    void multiply3Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.multiply3();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("10"))));
    }

    //Sapient generated method id: ${divideTest}, hash: 2446806094D9AD6F6F7394BD02F5FEE5
    @Test()
    void divideTest() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.divide(new BigInteger("1"), new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("1"))));
    }

    //Sapient generated method id: ${divide2Test}, hash: 594ACB9202B6D5C7C80533FE3FE640A2
    @Test()
    void divide2Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.divide2(new BigInteger("1"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("10"))));
    }

    //Sapient generated method id: ${divide3Test}, hash: 48572C0FCAE6787A9D4C3D607039DD8B
    @Test()
    void divide3Test() {
        //Arrange Statement(s)
        BigIntegerArithmeticOperations target = new BigIntegerArithmeticOperations();
        
        //Act Statement(s)
        BigInteger result = target.divide3();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("10"))));
    }
}
