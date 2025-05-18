package com.example.springbootassessment.task.web.controller;

import com.example.springbootassessment.factories.TaskEntityFactory;
import com.example.springbootassessment.project.repository.ProjectRepository;
import com.example.springbootassessment.task.domain.Task;
import com.example.springbootassessment.task.repository.TaskRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class TaskIntegrationTest {

    @Autowired
    private WebTestClient webTestClient;

    @AfterEach
    void tearDown() {
        // todo: make sure that after the test all data is clean
    }

    @Test
    @DisplayName("should load all tasks")
    void shouldLoadAllTasks() {
        // given

        // when

        // then
        fail("todo: implement");
    }

    @Test
    @DisplayName("should load task by project id")
    @Sql("/data/setup-task-with-project.sql")
    void shouldLoadTasksByProjectId() {
        // given

        // when

        // then
        fail("todo: implement");
    }

    @Test
    @DisplayName("given project id does not exist, when loading tasks by project id, then should return 404")
    void givenProjectIdDoesNotExistWhenLoadingTasksByProjectIdThenShouldReturn404() {
        // given

        // when

        // then
        fail("todo: implement");
    }

}