package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addToDoList("Task 3 to do");
        board.addToDoList("Task 4 to do");
        board.addInProgressList("Task 4 in progress");
        board.addDoneList("Task 3 has been done");

        //Then
        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);
        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);
        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);
    }
}

