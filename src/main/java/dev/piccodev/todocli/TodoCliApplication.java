package dev.piccodev.todocli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@CommandScan
public class TodoCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoCliApplication.class, args);
	}

}
