# Spring Boot Assessment Project

This project is an assessment for working with Spring Boot, REST APIs, and testing. There are several open TODOs in the codebase that you need to complete as part of the assessment.

## Tasks to Complete

### 1. TaskController Implementation
- Inject the correct `TaskService` implementation into `TaskController`. There are two implementations; ensure the correct one is used via Spring dependency injection.
- Implement the following endpoints in `TaskController`:
  - `GET /tasks`: Return all tasks as `TaskDto`.
  - `GET /tasks/{projectId}`: Return all tasks for a given project ID as `TaskDto`.

### 2. Service and Integration Tests
- In `TaskDatabaseServiceTest.java` and `TaskIntegrationTest.java`, implement the test logic (currently marked with `fail("todo: implement")`).
- In `TaskIntegrationTest`, ensure that after each test, all test data is cleaned up.

## How to Run
1. Build the project with Maven:
   ```sh
   ./mvnw clean install
   ```
2. Run the application:
   ```sh
   ./mvnw spring-boot:run
   ```
3. Run the tests:
   ```sh
   ./mvnw test
   ```

## Notes
- Check for `// todo:` comments in the codebase for all open tasks.
- Follow best practices for Spring Boot, REST, and testing.
- Use the provided database migration and test data scripts as needed.

Good luck!
