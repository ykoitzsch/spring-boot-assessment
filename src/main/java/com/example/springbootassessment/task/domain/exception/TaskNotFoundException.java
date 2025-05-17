package com.example.springbootassessment.task.domain.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long taskId) {
        super("Task with id " + taskId + " not found");
    }
}

