package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Test log");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        assertEquals("Test log", log);
    }
}