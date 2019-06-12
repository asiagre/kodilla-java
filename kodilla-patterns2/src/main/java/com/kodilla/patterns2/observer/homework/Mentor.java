package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int exerciseCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getUsername() + " has send exercise. Total number of exercises: " + student.getExerciseQueue().size());
        exerciseCount++;
    }

    public String getName() {
        return name;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
