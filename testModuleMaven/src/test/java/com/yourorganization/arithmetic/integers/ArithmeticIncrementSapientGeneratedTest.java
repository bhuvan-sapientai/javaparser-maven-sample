package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArithmeticIncrementSapientGeneratedTest {

    //Sapient generated method id: ${incrementTest}, hash: 5B62E59FF2459BAACFAE47F7B18D3E5B
    @Test()
    void incrementTest() {
        //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.increment(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    //Sapient generated method id: ${decrementTest}, hash: 17F537DB71A036E39B137C8467B59AA1
    @Test()
    void decrementTest() {
        //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.decrement(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${incrementLaterWhenBEquals0}, hash: 1625AF56088AF35A55C6BB8C077DBAB5
    @Test()
    void incrementLaterWhenBEquals0() {
        /* Branches:
         * (b == 0) : true
         */
         //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.incrementLater(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${incrementLaterWhenBNotEquals0}, hash: 92DFB54300061F33F602EC8D944BB278
    @Test()
    void incrementLaterWhenBNotEquals0() {
        /* Branches:
         * (b == 0) : false
         */
         //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.incrementLater(-1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${decrementLaterWhenBEquals0}, hash: 0DD2921D9AA0C76A35F3EA4F1C9037A7
    @Test()
    void decrementLaterWhenBEquals0() {
        /* Branches:
         * (b == 0) : true
         */
         //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.decrementLater(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${decrementLaterWhenBNotEquals0}, hash: 0AAA87361EA14A4AE6168ED7E03318B5
    @Test()
    void decrementLaterWhenBNotEquals0() {
        /* Branches:
         * (b == 0) : false
         */
         //Arrange Statement(s)
        ArithmeticIncrement target = new ArithmeticIncrement();
        
        //Act Statement(s)
        int result = target.decrementLater(-1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-4)));
    }
}
