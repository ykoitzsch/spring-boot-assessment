package com.example.springbootassessment.task.service;

import com.example.springbootassessment.task.domain.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
@RequiredArgsConstructor
public class TaskWebService implements TaskService {

    @Override
    public List<Task> findAll() {
        throw new RuntimeException("Task Webservice is currently not supported");
    }

    @Override
    public List<Task> findAllByProjectId(Long projectId) {
        throw new RuntimeException("Task Webservice is currently not supported");
    }
}
