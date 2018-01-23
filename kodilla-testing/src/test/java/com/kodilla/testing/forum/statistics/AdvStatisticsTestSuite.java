package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("\nAll tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test No. #" + testCounter + " has been executed successfully.");
    }

    @Test
    public void whenPostCountIsZero() {
        List<String> users = Arrays.asList("Mariusz", "Jola", "Magda", "Marcin", "Asia");
        int posts = 0;
        int comments = 100;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        try {
            postsPerUser = posts / users.size();
            commentsPerUser = comments / users.size();
            commentsPerPost = comments / posts;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);;
    }

    @Test
    public void whenPostCountIsThousand() {
        List<String> users = Arrays.asList("Mariusz", "Jola", "Magda", "Marcin", "Asia");
        int posts = 1000;
        int comments = 100;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }

    @Test
    public void whenCommentCountIsZero() {
        List<String> users = Arrays.asList("Mariusz", "Jola", "Magda", "Marcin", "Asia");
        int posts = 1000;
        int comments = 0;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }

    @Test
    public void whenCommentCountIsLessThanPosts() {
        List<String> users = Arrays.asList("Mariusz", "Jola", "Magda", "Marcin", "Asia");
        int posts = 2000;
        int comments = 1000;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }

    @Test
    public void whenCommentCountIsMoreThanPosts() {
        List<String> users = Arrays.asList("Mariusz", "Jola", "Magda", "Marcin", "Asia");
        int posts = 10;
        int comments = 1000;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }

    @Test
    public void whenUsersCountIsZero() {
        List<String> users = new ArrayList<>();
        int posts = 1000;
        int comments = 100;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;
        try {
            postsPerUser = posts / users.size();
            commentsPerUser = comments / users.size();
            commentsPerPost = comments / posts;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }

    @Test
    public void whenUsersCountIsHundred() {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + (i + 1));
        }
        int posts = 1000;
        int comments = 2000;
        double postsPerUser = posts / users.size();
        double commentsPerUser = comments / users.size();
        double commentsPerPost = comments / posts;

        //Given
        Statistics StatisticsMock = mock(Statistics.class);
        when(StatisticsMock.usersNames()).thenReturn(users);
        when(StatisticsMock.postsCount()).thenReturn(posts);
        when(StatisticsMock.commentsCount()).thenReturn(comments);
        //When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(StatisticsMock);
        int postsResult = advStatistics.getPosts();
        int commentsResult = advStatistics.getComments();
        int usersResult = advStatistics.getUsers();
        double postsPerUserResult = advStatistics.getPostsPerUser();
        double commentsPerUserResult = advStatistics.getCommentsPerUser();
        double commentsPerPostResult = advStatistics.getCommentsPerPost();
        double delta = 1e-5;
        //Then
        Assert.assertEquals(posts, postsResult);
        Assert.assertEquals(comments, commentsResult);
        Assert.assertEquals(users.size(), usersResult);
        Assert.assertEquals(postsPerUser, postsPerUserResult, delta);
        Assert.assertEquals(commentsPerUser, commentsPerUserResult, delta);
        Assert.assertEquals(commentsPerPost, commentsPerPostResult, delta);
    }
}
