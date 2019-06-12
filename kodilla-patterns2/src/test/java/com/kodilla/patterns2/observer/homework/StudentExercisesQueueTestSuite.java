package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentExercisesQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePinkman = new Student("Jessie Pinkman");
        Student davidShuman = new Student("David Shuman");
        Student clarkGable = new Student("Clark Gable");
        Mentor stephanieClarckson = new Mentor("Stephanie Clarckson");
        Mentor lindaKovalsky = new Mentor("Linda Kovalsky");
        johnSmith.registerObserver(stephanieClarckson);
        ivoneEscobar.registerObserver(lindaKovalsky);
        jessiePinkman.registerObserver(lindaKovalsky);
        davidShuman.registerObserver(stephanieClarckson);
        clarkGable.registerObserver(stephanieClarckson);

        //When
        johnSmith.addExercise(new Exercise("One", "One content"));
        ivoneEscobar.addExercise(new Exercise("Two", "Two content"));
        jessiePinkman.addExercise(new Exercise("Three", "Three content"));
        davidShuman.addExercise(new Exercise("Four", "Four content"));
        clarkGable.addExercise(new Exercise("Five", "Five content"));
        johnSmith.addExercise(new Exercise("Six", "Six content"));
        ivoneEscobar.addExercise(new Exercise("Seven", "Seven content"));
        johnSmith.addExercise(new Exercise("Eight", "Eight content"));

        //Then
        assertEquals(5, stephanieClarckson.getExerciseCount());
        assertEquals(3, lindaKovalsky.getExerciseCount());

    }

}