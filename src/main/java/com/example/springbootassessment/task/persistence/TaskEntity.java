package com.example.springbootassessment.task.persistence;

import com.example.springbootassessment.project.persistence.ProjectEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private ProjectEntity project;

    @Builder(builderMethodName = "withoutProjectAndIdBuilder")
    @SuppressWarnings("unused")
    public TaskEntity(String title, String description, boolean isCompleted, LocalDateTime dueDate) {
        this.title = title;
        this.description = description;
        this.completed = isCompleted;
        this.dueDate = dueDate;
    }
}
