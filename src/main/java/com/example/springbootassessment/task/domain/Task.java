package com.example.springbootassessment.task.domain;

import java.time.LocalDateTime;

public record Task(
        long id,
        String title,
        String description,
        boolean completed,
        LocalDateTime dueDate
) {
}
