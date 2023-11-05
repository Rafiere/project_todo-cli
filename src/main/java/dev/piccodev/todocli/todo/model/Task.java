package dev.piccodev.todocli.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private LocalDate dueDate;
    private boolean isDone;

    public Task() {}

    private Task(final String name, final String description, final LocalDate dueDate, final boolean isDone) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isDone = isDone;
    }

    public static Task of(final String name, final String description, final LocalDate dueDate, final boolean isDone) {
        return new Task(name, description, dueDate, isDone);
    }

    public Task complete(){
        this.isDone = true;

        return this;
    }
}
