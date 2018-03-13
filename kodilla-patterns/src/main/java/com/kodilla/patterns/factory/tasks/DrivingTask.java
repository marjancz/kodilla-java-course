package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public List<String> executeTask() {
        List<String> drivingTaskList = new ArrayList<>();
        drivingTaskList.add(taskName);
        return drivingTaskList;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask().contains(taskName)) {
            return true;
        } else {
            return false;
        }
    }
}
