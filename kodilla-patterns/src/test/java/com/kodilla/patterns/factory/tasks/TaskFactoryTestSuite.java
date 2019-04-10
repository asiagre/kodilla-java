package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.createTask(TaskKind.SHOPPING);

        //Then
        Assert.assertEquals("buying carpet", shoppingTask.getTaskName());
        Assert.assertNotEquals(true, shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.createTask(TaskKind.PAINTING);

        //Then
        Assert.assertEquals("painting picture", paintingTask.getTaskName());
        Assert.assertNotEquals(true, paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.createTask(TaskKind.DRIVING);

        //Then
        Assert.assertEquals("driving to London", drivingTask.getTaskName());
        Assert.assertNotEquals(true, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
