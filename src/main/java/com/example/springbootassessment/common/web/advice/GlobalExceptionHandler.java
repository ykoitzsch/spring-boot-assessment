package com.example.springbootassessment.common.web.advice;

import com.example.springbootassessment.project.domain.exception.ProjectNotFoundException;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProjectNotFoundException.class)
    public ResponseEntity<ProblemDetail> handleTaskNotFound(ProjectNotFoundException ex) {
        // todo: return ResponseEntity 404 not found with body of the given type (ProblemDetail.forStatusAndDetail)
        throw new RuntimeException("todo: implement");
    }
}
