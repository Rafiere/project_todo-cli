package dev.piccodev.todocli.todo.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class TaskCommand {

    @ShellMethod(key = "hello-world", value = "Prints hello world")
    public String helloWorld(){
        return "Hello World!";
    }
}
