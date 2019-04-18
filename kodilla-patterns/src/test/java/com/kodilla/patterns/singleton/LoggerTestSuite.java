package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        LoggerEnum.INSTANCE.log("This is a log.");
        //When
        String log = LoggerEnum.INSTANCE.getLastLog();
        //Then
        Assert.assertEquals("This is a log.", log);
    }
}
