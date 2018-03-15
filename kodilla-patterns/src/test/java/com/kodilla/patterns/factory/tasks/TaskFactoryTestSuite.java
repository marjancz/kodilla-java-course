package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Party shopping", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("The Marjancz house painting", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Night course driving", driving.getTaskName());
    }
}
