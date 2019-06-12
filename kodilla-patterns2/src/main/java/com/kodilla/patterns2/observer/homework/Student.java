package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements Observable {
    private final String username;
    private final Queue<Exercise> exerciseQueue;
    private final List<Observer> observers;

    public Student(String username) {
        this.username = username;
        exerciseQueue = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        exerciseQueue.offer(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream()
                .forEach(observer -> observer.update(this));
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.add(observer);
    }

    public String getUsername() {
        return username;
    }

    public Queue<Exercise> getExerciseQueue() {
        return exerciseQueue;
    }
}
