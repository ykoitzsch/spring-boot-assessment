package com.example.springbootassessment.task.service;

import com.example.springbootassessment.task.domain.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskDatabaseService implements TaskService {

    @Override
    public List<Task> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Task> findAllByProjectId(Long projectId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
