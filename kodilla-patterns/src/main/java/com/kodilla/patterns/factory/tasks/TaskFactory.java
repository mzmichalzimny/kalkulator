package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Buy", "Apples", 5);
            case PAINTING -> new PaintingTask("Paint room", "Blue", "Living room");
            case DRIVING -> new DrivingTask("Drive to work", "Office", "Car");
            default -> null;
        };
    }
}