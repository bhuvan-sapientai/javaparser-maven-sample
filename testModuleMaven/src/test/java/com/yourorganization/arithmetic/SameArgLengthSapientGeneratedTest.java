package com.yourorganization.arithmetic;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SameArgLengthSapientGeneratedTest {

    //Sapient generated method id: ${longValueTest}, hash: 409AA92D11EFB102E6B36FEFC5A80AC4
    @Test()
    void longValueTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        SameArgLength target = new SameArgLength(byteArray, 0);
        
        //Act Statement(s)
        long result = target.longValue();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }
}
