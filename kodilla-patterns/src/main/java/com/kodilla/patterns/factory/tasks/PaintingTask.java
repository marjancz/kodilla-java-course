package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(final String taskName, final String color,
                        final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public List<String> executeTask() {
        List<String> paintingTaskList = new ArrayList<>();
        paintingTaskList.add(taskName);
        isTaskExecuted = true;
        return paintingTaskList;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}