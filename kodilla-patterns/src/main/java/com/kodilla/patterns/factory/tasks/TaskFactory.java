package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "ShoppingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Party shopping", "Black mini dress",
                        1.0);
            case PAINTING:
                return new PaintingTask("The Marjancz house painting", "blue and white",
                        "the attic");
            case DRIVING:
                return new DrivingTask("Night course driving","Warsaw",
                        "Yellow cab");
            default:
                return null;
        }
    }
}
