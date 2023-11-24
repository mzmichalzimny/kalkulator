package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {
    @Mock
    private Statistics statisticsMock;

    private ForumStatistics ForumStatistics;
    private List<String> usersNames;

    @BeforeEach
    void init() {
        ForumStatistics = new ForumStatistics();
        usersNames = new ArrayList<>();
    }

    @Test
    void testCalculateAdvStatisticsNoPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, ForumStatistics.getPostsCount());
        assertEquals(0, ForumStatistics.getAvgPostsPerUser(), 0.01);
        assertEquals(0, ForumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, ForumStatistics.getPostsCount());
    }

    @Test
    void testCalculateAdvStatisticsNoComments() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, ForumStatistics.getCommentsCount());
        assertEquals(0, ForumStatistics.getAvgCommentsPerUser(), 0.01);
        assertEquals(0, ForumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertTrue(ForumStatistics.getAvgCommentsPerPost() < 1);
    }

    @Test
    void testCalculateAdvStatisticsCommentsGreaterThanPosts() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertTrue(ForumStatistics.getAvgCommentsPerPost() > 1);
    }

    @Test
    void testCalculateAdvStatisticsNoUsers() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(Collections.emptyList());

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, ForumStatistics.getUsersCount());
        assertEquals(0, ForumStatistics.getAvgPostsPerUser(), 0.01);
        assertEquals(0, ForumStatistics.getAvgCommentsPerUser(), 0.01);
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        // Given
        usersNames = IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).collect(Collectors.toList());
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, ForumStatistics.getUsersCount());
    }
}
