package com.kodilla.patterns.factory.tasks;

import java.util.List;

public interface Task {
    List<String> executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
