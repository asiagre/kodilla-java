package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public Task createTask(TaskKind taskKind) {
        Task task;
        switch(taskKind) {
            case SHOPPING: {
                task = new ShoppingTask("buying carpet", "carpet", 2.0);
                break;
            }
            case PAINTING: {
                task = new PaintingTask("painting picture", "red", "picture");
                break;
            }
            case DRIVING: {
                task = new DrivingTask("driving to London", "London", "car");
                break;
            }
            default: {
                task = null;
            }
        }
        return task;
    }
}
