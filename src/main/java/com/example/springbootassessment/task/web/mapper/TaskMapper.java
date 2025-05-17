package com.example.springbootassessment.task.web.mapper;

import com.example.springbootassessment.task.domain.Task;
import com.example.springbootassessment.task.web.dto.TaskOverviewDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskOverviewDto map(Task task);

}
