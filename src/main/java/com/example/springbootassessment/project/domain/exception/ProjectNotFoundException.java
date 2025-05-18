package com.example.springbootassessment.project.domain.exception;

public class ProjectNotFoundException extends RuntimeException {
    public ProjectNotFoundException(Long projectId) {
        super("project with id %d not found".formatted(projectId));
    }
}

