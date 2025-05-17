package com.example.springbootassessment.task.web.dto;

import java.time.LocalDateTime;

public record TaskDetailDto(
        Long id,
        String title,
        String description,
        boolean completed,
        LocalDateTime dueDate
) {
}
