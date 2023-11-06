package dev.piccodev.todocli.exceptions.resolvers;

import dev.piccodev.todocli.exceptions.custom.BusinessRuleException;
import org.springframework.shell.command.CommandExceptionResolver;
import org.springframework.shell.command.CommandHandlingResult;
import org.springframework.shell.command.annotation.Command;

//Estamos utilizando o @Command para conseguirmos escanear essa classe e adicioná-la como um bean.
@Command
public class CustomExceptionResolver implements CommandExceptionResolver {


    //As exceptions lançadas pelas classes "@Command" serão tratadas por esse método.

    @Override
    public CommandHandlingResult resolve(Exception e) {

        if (e instanceof BusinessRuleException) {
            return CommandHandlingResult.of("A BusinessRuleException was thrown\n\n" + e.getMessage(), 42);
        }

        if (e instanceof RuntimeException) {
            return CommandHandlingResult.of("A RuntimeException was thrown\n\n", 42);
        }

        return CommandHandlingResult.of("An Exception was thrown\n\n" + e.getMessage(), 42);
    }
}