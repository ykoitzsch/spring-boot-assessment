package com.example.springbootassessment.task.web.mapper;

import com.example.springbootassessment.task.domain.Task;
import com.example.springbootassessment.task.web.dto.TaskDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto map(Task task);

}
