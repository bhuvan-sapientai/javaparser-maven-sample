package com.yourorganization.arithmetic.bytes;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ByteBoundarySapientGeneratedTest {

    //Sapient generated method id: ${translateWhenCodePointLessThanBelow}, hash: 2CB111DD0FA881A4B7D1C140DEF1E538
    @Test()
    void translateWhenCodePointLessThanBelow() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : true
         */
         //Arrange Statement(s)
        ByteBoundary target = new ByteBoundary();
        Writer writer = Writer.nullWriter();
        
        //Act Statement(s)
        boolean result = target.translate((byte) -1, writer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${translateWhenCodePointNotGreaterThanAbove}, hash: 4A2C3AC14FB6E996B757F3B1A7C38A38
    @Test()
    void translateWhenCodePointNotGreaterThanAbove() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : false
         * (codePoint > above) : false
         */
         //Arrange Statement(s)
        ByteBoundary target = new ByteBoundary();
        Writer writer = Writer.nullWriter();
        
        //Act Statement(s)
        boolean result = target.translate((byte) 0, writer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
