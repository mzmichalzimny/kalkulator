package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials("Millenial");
        User yGen = new YGeneration("YGen");
        User zGen = new ZGeneration("ZGen");

        //When
        String millenialShares = millenial.sharePost();
        System.out.println("Millenial shares post on: " + millenialShares);
        String yGenShares = yGen.sharePost();
        System.out.println("YGen shares post on: " + yGenShares);
        String zGenShares = zGen.sharePost();
        System.out.println("ZGen shares post on: " + zGenShares);

        //Then
        assertEquals("Facebook", millenialShares);
        assertEquals("Twitter", yGenShares);
        assertEquals("Snapchat", zGenShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenial = new Millenials("Millenial");

        //When
        String millenialShares = millenial.sharePost();
        System.out.println("Millenial shares post on: " + millenialShares);
        millenial.setSocialPublisher(new SnapchatPublisher());
        millenialShares = millenial.sharePost();
        System.out.println("Millenial now shares post on: " + millenialShares);

        //Then
        assertEquals("Snapchat", millenialShares);
    }
}