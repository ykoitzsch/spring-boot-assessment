package com.example.springbootassessment.common.web.advice;

import com.example.springbootassessment.task.domain.exception.TaskNotFoundException;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ProblemDetail> handleTaskNotFound(TaskNotFoundException ex) {
        // todo: return ResponseEntity 404 not found with body of the given type (ProblemDetail.forStatusAndDetail)
        throw new UnsupportedOperationException("not implemented yet");
    }
}
