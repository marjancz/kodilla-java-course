package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User marjancz = new Millenilas("Mariusz Janczyk");
        User neo = new YGeneration("Thomas Anderson");
        User batman = new ZGeneration("Bruce Wayne");

        //When
        String marjanczShare = marjancz.sharePost();
        System.out.println("Marjancz: " + marjanczShare);
        String neoShare = neo.sharePost();
        System.out.println("Neo: " + neoShare);
        String batmanShare = batman.sharePost();
        System.out.println("Batman: " + batmanShare);

        //Then
        Assert.assertEquals("I'm using Facebook to publish my messages", marjanczShare);
        Assert.assertEquals("I'm using Snapchat to publish my messages", neoShare);
        Assert.assertEquals("I'm using Twitter to publish my messages", batmanShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User marjancz = new Millenilas("Mariusz Janczyk");

        //When
        String marjanczShare = marjancz.sharePost();
        System.out.println("Marjancz: " + marjanczShare);
        marjancz.setSocialStrategy(new TwitterPublisher());
        marjanczShare = marjancz.sharePost();
        System.out.println("Marjancz now: " + marjanczShare);

        //Then
        Assert.assertEquals("I'm using Twitter to publish my messages", marjanczShare);
    }
}
