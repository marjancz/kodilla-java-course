package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        //(List<String> tasks)
        tasks = new ArrayList<>();
    }

    public List<String> addTask(String task) {
        tasks.add(task);
        return tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
