package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy,
                        final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public List<String> executeTask() {
        List<String> shoppingTaskList = new ArrayList<>();
        shoppingTaskList.add(taskName);
        return shoppingTaskList;
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
