package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
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

    private ForumStatistics forumStatistics;
    private List<String> usersNames;

    @BeforeEach
    public void init() {
        // Tworzenie mocka dla interfejsu Statistics
        statisticsMock = Mockito.mock(Statistics.class);

        // Tworzenie obiektu ForumStatistics
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatistics() {
        // Definiowanie zachowania mocka
        Mockito.when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2"));
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(20);

        // Wywołanie metody calculateAdvStatistics
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Sprawdzanie, czy obliczone statystyki są poprawne
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(10, forumStatistics.getPostsCount());
        assertEquals(20, forumStatistics.getCommentsCount());
        assertEquals(5.0, forumStatistics.getAvgPostsPerUser());
        assertEquals(10.0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(2.0, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsNoPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, ForumStatistics.getPostsCount());
    }

    @Test
    void testCalculateAdvStatisticsNoComments() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertTrue(forumStatistics.getAvgCommentsPerPost() < 1);
    }

    @Test
    void testCalculateAdvStatisticsCommentsGreaterThanPosts() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertTrue(forumStatistics.getAvgCommentsPerPost() > 1);
    }

    @Test
    void testCalculateAdvStatisticsNoUsers() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(Collections.emptyList());

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, forumStatistics.getUsersCount());
        assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        // Given
        usersNames = IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).collect(Collectors.toList());
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, forumStatistics.getUsersCount());
    }
}
