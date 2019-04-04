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
        //given
        List<Integer> emptyArrayList = new ArrayList<Integer>();
        //when
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(emptyArrayList);
        //then
        Assert.assertEquals(emptyArrayList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list.");
        //given
        List<Integer> normalList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            normalList.add(i);
        }
        //when
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        List<Integer> testList = new ArrayList<Integer>();
        for(int i = 0; i < normalList.size(); i++) {
            if(normalList.get(i) % 2 == 0) {
                testList.add(normalList.get(i));
            }
        }
        //then
        for(int i = 0; i < result.size(); i++) {
            Assert.assertEquals(result.get(i), testList.get(i));
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
