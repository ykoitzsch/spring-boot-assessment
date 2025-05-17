package com.example.springbootassessment.factories;

import com.example.springbootassessment.task.persistence.TaskEntity;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

import static java.util.UUID.randomUUID;

@UtilityClass
public final class TaskEntityFactory {

    public static TaskEntity create() {
        return TaskEntity
                .withoutProjectAndIdBuilder()
                .description("description %s".formatted(randomUUID()))
                .isCompleted(false)
                .dueDate(LocalDateTime.now())
                .title("title %s".formatted(randomUUID()))
                .build();
    }
}
