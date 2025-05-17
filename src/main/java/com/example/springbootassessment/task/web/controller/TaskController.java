package com.example.springbootassessment.task.web.controller;

import com.example.springbootassessment.task.service.TaskService;
import com.example.springbootassessment.task.web.dto.TaskDetailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<TaskDetailDto> getAllTasks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping("/{projectId}")
    public List<TaskDetailDto> getTasksByProjectId(@PathVariable Long projectId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
