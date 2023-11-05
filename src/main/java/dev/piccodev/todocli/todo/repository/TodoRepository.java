package dev.piccodev.todocli.todo.repository;

import dev.piccodev.todocli.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, String> {
}
