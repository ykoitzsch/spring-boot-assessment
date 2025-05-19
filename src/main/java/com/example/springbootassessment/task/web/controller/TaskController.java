package com.example.springbootassessment.task.web.controller;

import com.example.springbootassessment.task.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        throw new RuntimeException("todo: implement");
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<List<TaskDto>> getTasksByProjectId(@PathVariable Long projectId) {
        throw new RuntimeException("todo: implement");
    }
}
