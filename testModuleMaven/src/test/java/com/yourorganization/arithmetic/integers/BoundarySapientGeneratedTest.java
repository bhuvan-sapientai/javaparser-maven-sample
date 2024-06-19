package com.yourorganization.arithmetic.integers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BoundarySapientGeneratedTest {

    //Sapient generated method id: ${translateWhenCodePointLessThanBelow}, hash: 138D1387E4D1B10472478DE26BFC0259
    @Test()
    void translateWhenCodePointLessThanBelow() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : true
         */
         //Arrange Statement(s)
        Boundary target = new Boundary();
        Writer writer = Writer.nullWriter();
        
        //Act Statement(s)
        boolean result = target.translate(-1, writer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${translateWhenCodePointNotGreaterThanAbove}, hash: B9EEEE0E8DDF273F830BBFC158277F48
    @Disabled()
    @Test()
    void translateWhenCodePointNotGreaterThanAbove() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : false
         * (codePoint > above) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Boundary target = new Boundary();
        Writer writer = Writer.nullWriter();
        
        //Act Statement(s)
        boolean result = target.translate(0, writer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
