package com.example.springbootassessment.task.service;

import com.example.springbootassessment.task.domain.Task;

import java.util.Set;

public interface TaskService {
    Set<Task> findAll();

    Task createTask(Task task);
}
