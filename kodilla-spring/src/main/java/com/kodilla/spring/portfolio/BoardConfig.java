package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList();
        toDoList.addTask("Task 1 to do");
        toDoList.addTask("Task 2 to do");
        return toDoList;
//        return new TaskList(Arrays.asList("Task 1 to do", "Task 2 to do"));
    }

    @Bean
    public TaskList getInProgressList() {
        TaskList inProgressList = new TaskList();
        inProgressList.addTask("Task 2 in progress");
        return inProgressList;
//        return new TaskList(Arrays.asList("Task 2 in progress"));
    }


    @Bean
    public TaskList getDoneList() {
        TaskList doneList = new TaskList();
        doneList.addTask("Task 1 has been done");
        return doneList;
//        return new TaskList(Arrays.asList("Task 1 has been done"));
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
}
