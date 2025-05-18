package com.example.springbootassessment.task.web.controller;

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

    // todo: inject the task service, that loads the tasks from the database
    /*
    there are two implementations of the same TaskService interface, we need to ensure
    that the right one is used by spring DI here!
     */

    @GetMapping
    public List<TaskDetailDto> getAllTasks() {
        throw new RuntimeException("todo: implement");
    }

    @GetMapping("/{projectId}")
    public List<TaskDetailDto> getTasksByProjectId(@PathVariable Long projectId) {
        throw new RuntimeException("todo: implement");
    }
}
