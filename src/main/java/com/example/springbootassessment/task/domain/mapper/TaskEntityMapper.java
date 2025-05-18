package com.example.springbootassessment.task.domain.mapper;

import com.example.springbootassessment.task.domain.Task;
import com.example.springbootassessment.task.persistence.TaskEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskEntityMapper {
    Task map(TaskEntity entity);
}
