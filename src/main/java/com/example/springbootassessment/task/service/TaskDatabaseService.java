package com.example.springbootassessment.task.service;

import com.example.springbootassessment.task.domain.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TaskDatabaseService implements TaskService {

    @Override
    public Set<Task> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Task createTask(Task task) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
