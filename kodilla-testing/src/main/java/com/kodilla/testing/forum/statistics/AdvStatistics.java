package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    private int users;
    private int posts;
    private int comments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        try {
            postsPerUser = posts / users;
            commentsPerUser = comments / users;
            commentsPerPost = comments / posts;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by 0");
        }
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Statistics of the forum: " + "\nTotal users: " + users +
                "\nTotal posts: " + posts + "\nTotal comments: " + comments +
                "\nAverage post per user: " + postsPerUser + "\nAverage comments per user: " +
                commentsPerUser + "\nAverage comments per post: " + commentsPerPost);
    }
}