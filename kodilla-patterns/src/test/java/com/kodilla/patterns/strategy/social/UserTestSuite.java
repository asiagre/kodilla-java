package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials jan = new Millenials("Jan Kowalski");
        YGeneration anna = new YGeneration("Anna Nowak");
        ZGeneration piotr = new ZGeneration("Piotr Kowal");

        //When
        String millenialsSocial = jan.sharePost();
        System.out.println("Millenials use " + millenialsSocial);
        String yGenerationSocial = anna.sharePost();
        System.out.println("YGeneration use " + yGenerationSocial);
        String zGenerationSocial = piotr.sharePost();
        System.out.println("ZGeneration use " + zGenerationSocial);

        //Then
        Assert.assertEquals("Facebook!", millenialsSocial);
        Assert.assertEquals("Twitter!", yGenerationSocial);
        Assert.assertEquals("Snapchat!", zGenerationSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials jan = new Millenials("Jan Kowalski");
        String janSocial = jan.sharePost();
        System.out.println(jan.getName() + " uses " + janSocial);

        //When
        jan.setSocialPublisher(new TwitterPublisher());
        janSocial = jan.sharePost();
        System.out.println(jan.getName() + " uses " + janSocial);

        //Then
        Assert.assertEquals("Twitter!", janSocial);

    }
}
