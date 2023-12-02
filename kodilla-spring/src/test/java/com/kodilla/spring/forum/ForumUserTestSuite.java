package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Autowired
    private ForumUser user;

    @Test
    void testGetUsername() {
        //When
        String name = user.getUsername();

        //Then
        assertEquals("John Smith", name);
    }
}