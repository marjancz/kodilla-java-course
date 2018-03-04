package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList getToDoList() {
        return new TaskList(Arrays.asList("Task 1 to do", "Task 2 to do"));
    }

    @Bean
    public TaskList getInProgressList() {
        return new TaskList(Arrays.asList("Task 2 in progress"));
    }


    @Bean
    public TaskList getDoneList() {
        return new TaskList(Arrays.asList("Task 1 has been done"));
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
}
