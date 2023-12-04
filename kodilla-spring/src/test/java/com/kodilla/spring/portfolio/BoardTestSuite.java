package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        //Given
        String toDoTask = "To Do Task";
        String inProgressTask = "In Progress Task";
        String doneTask = "Done Task";

        //When
        board.getToDoList().getTasks().add(toDoTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneTask);

        //Then
        assertEquals(toDoTask, board.getToDoList().getTasks().get(0));
        assertEquals(inProgressTask, board.getInProgressList().getTasks().get(0));
        assertEquals(doneTask, board.getDoneList().getTasks().get(0));
    }
}