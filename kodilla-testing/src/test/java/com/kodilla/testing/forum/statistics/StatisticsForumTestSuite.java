package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testStatisticsWhenNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 0;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForPost = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(0, (int) averagePostsForUser);
        Assert.assertEquals(0, (int) averageCommentsForPost);
    }

    @Test
    public void testStatisticsOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 1000;
        int commentsCount = 2000;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForPost = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(500, (int) averagePostsForUser);
        Assert.assertEquals(2, (int) averageCommentsForPost);
    }

    @Test
    public void testStatisticsWhenNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 10;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfComments = forumStatistics.getNumberOfComments();
        double averageCommentsForUser = forumStatistics.getAverageCommentsForUser();
        double averageCommentsForPost = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(0, (int) averageCommentsForUser);
        Assert.assertEquals(0, (int) averageCommentsForPost);
    }

    @Test
    public void testStatisticsLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 100;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        int numberOfComments = forumStatistics.getNumberOfComments();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForUser = forumStatistics.getAverageCommentsForUser();
        double averageCommentsForPost = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(10, numberOfComments);
        Assert.assertEquals(50, (int) averagePostsForUser);
        Assert.assertEquals(5, (int) averageCommentsForUser);
        Assert.assertEquals(0, (int) averageCommentsForPost);
    }

    @Test
    public void testStatisticsMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        int numberOfComments = forumStatistics.getNumberOfComments();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForUser = forumStatistics.getAverageCommentsForUser();
        double averageCommentsForPost = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(1000, numberOfComments);
        Assert.assertEquals(50, (int) averagePostsForUser);
        Assert.assertEquals(500, (int) averageCommentsForUser);
        Assert.assertEquals(10, (int) averageCommentsForPost);
    }

    @Test
    public void testStatisticsNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        int postsCount = 100;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfUsers = forumStatistics.getNumberOfUsers();
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        int numberOfComments = forumStatistics.getNumberOfComments();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForUser = forumStatistics.getAverageCommentsForUser();

        //Then
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(10, numberOfComments);
        Assert.assertEquals(0, (int) averagePostsForUser);
        Assert.assertEquals(0, (int) averageCommentsForUser);
    }

    @Test
    public void testStatisticsOfUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Ala");
        usersNames.add("Magda");
        int postsCount = 100;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int numberOfUsers = forumStatistics.getNumberOfUsers();
        int numberOfPosts = forumStatistics.getNumberOfPosts();
        int numberOfComments = forumStatistics.getNumberOfComments();
        double averagePostsForUser = forumStatistics.getAveragePostsForUser();
        double averageCommentsForUser = forumStatistics.getAverageCommentsForUser();

        //Then
        Assert.assertEquals(2, numberOfUsers);
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(10, numberOfComments);
        Assert.assertEquals(50, (int) averagePostsForUser);
        Assert.assertEquals(5, (int) averageCommentsForUser);
    }
}
