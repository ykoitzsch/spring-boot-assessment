package com.example.springbootassessment.task.service;

import com.example.springbootassessment.task.domain.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Set;

@Primary
@Service
@RequiredArgsConstructor
public class TaskWebService implements TaskService {

    @Override
    public Set<Task> findAll() {
        throw new RuntimeException("Task Webservice is currently not supported");
    }

    @Override
    public Set<Task> findAllByProjectId(Long projectId) {
        throw new RuntimeException("Task Webservice is currently not supported");
    }
}
