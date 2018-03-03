package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList getToDoList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Task 1 to do");
        toDoList.add("Task 2 to do");
        return new TaskList(toDoList);
    }

    @Bean
    public TaskList getInProgressList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Task 2 in progress");
        return new TaskList(toDoList);
    }

    @Bean
    public TaskList getDoneList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Task 1 has been done");
        return new TaskList(toDoList);
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
}
