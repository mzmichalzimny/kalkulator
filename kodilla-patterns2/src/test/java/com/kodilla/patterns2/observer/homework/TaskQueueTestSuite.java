package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue miQueue = new TaskQueue("Mi quene");
        TaskQueue maQueue = new TaskQueue("Ma queue");
        TaskQueue tomekQueue = new TaskQueue("Tomek queue");
        Mentor michalMentor = new Mentor("Michal Mentor");
        Mentor adamMentor = new Mentor("Adam Mentor");
        miQueue.registerObserver(michalMentor);
        maQueue.registerObserver(adamMentor);
        tomekQueue.registerObserver(adamMentor);
        //When
        miQueue.addTask("John's task 1");
        miQueue.addTask("John's task 2");
        maQueue.addTask("Ivone's task 1");
        tomekQueue.addTask("Jessie's task 1");
        tomekQueue.addTask("Jessie's task 2");
        tomekQueue.addTask("Jessie's task 3");
        //Then
        assertEquals(2, michalMentor.getUpdateCount());
        assertEquals(4, adamMentor.getUpdateCount());
    }
}