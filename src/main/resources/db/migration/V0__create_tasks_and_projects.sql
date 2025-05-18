CREATE TABLE projects
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(255) NOT NULL,
    description VARCHAR(1000)
);

CREATE TABLE tasks
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    project_id  BIGINT,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(1000),
    completed   BOOLEAN      NOT NULL,
    due_date    TIMESTAMP,
    CONSTRAINT fk_task_project
        FOREIGN KEY (project_id) REFERENCES projects (id)
            ON DELETE CASCADE
);

