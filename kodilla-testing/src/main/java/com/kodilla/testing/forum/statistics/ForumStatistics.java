package com.kodilla.testing.forum.statistics;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatistics {
    private int usersCount;
    private static int postsCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount > 0) {
            avgPostsPerUser = (double) postsCount / usersCount;
            avgCommentsPerUser = (double) commentsCount / usersCount;
        }

        if (postsCount > 0) {
            avgCommentsPerPost = (double) commentsCount / postsCount;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + avgPostsPerUser);
        System.out.println("Average number of comments per user: " + avgCommentsPerUser);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
    public int getUsersCount() {
        return usersCount;
    }

    public static int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}