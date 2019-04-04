package com.kodilla.testing.forum.statistics;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.List;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsForUser = 0;
    private double averageCommentsForUser = 0;
    private double averageCommentsForPost = 0;

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers != 0) {
            averagePostsForUser = numberOfPosts / numberOfUsers;
            averageCommentsForUser = numberOfComments / numberOfUsers;
        }
        if(numberOfPosts != 0) {
            averageCommentsForPost = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("The forum has " + numberOfUsers + " users.");
        System.out.println("In the forum are " + numberOfPosts + " posts and " + numberOfComments + " comments.");
        System.out.println("That means that there are " + averagePostsForUser + " posts per user, " + averageCommentsForUser
                + " comments per user and " + averageCommentsForPost + " comments per post.");
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
}
