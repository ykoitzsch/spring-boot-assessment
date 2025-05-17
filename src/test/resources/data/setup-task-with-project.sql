INSERT INTO projects (id, name, description)
VALUES (1, 'Demo Project', 'A project for testing purposes');

INSERT INTO tasks (id, title, description, completed, due_date, project_id)
VALUES (1, 'Task 1', 'Description for Task 1', FALSE, '2025-06-01T10:00:00', 1),
       (2, 'Task 2', 'Description for Task 2', FALSE, '2025-06-02T10:00:00', 1),
       (3, 'Task 3', 'Description for Task 3', TRUE, '2025-06-03T10:00:00', 1),
       (4, 'Task 4', 'Description for Task 4', FALSE, '2025-06-04T10:00:00', 1),
       (5, 'Task 5', 'Description for Task 5', TRUE, '2025-06-05T10:00:00', 1);

