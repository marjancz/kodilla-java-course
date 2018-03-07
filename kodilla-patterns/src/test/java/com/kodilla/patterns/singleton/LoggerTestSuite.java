package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("Connection established");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Created log: " + log);

        //Then
        Assert.assertEquals("Connection established", log);
    }
}
