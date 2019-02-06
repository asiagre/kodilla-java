package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing empty list.");
        List<Integer> emptyArrayList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(emptyArrayList);
        Assert.assertEquals(emptyArrayList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list.");
        List<Integer> normalList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        for(int i = 0; i < 10; i++) {
            normalList.add(i);
        }
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        for(Integer number : result) {
            Assert.assertTrue(number % 2 == 0);
        }
    }

    @Before
    public void before() {
        System.out.println("Test case: before");
    }

    @After
    public void after() {
        System.out.println("Test case: after");
    }
}
