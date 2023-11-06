package dev.piccodev.todocli.todo.command;

import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.CommandAvailability;

/* Tudo o que ficar no "@Command" externo será herdado pelos "@Command" internos, a não ser que ele seja sobrescrito.*/
@Command(group = "Introduction")
public class HelloCommand {

    /* Esse é um comando que pode ser chamado pela CLI através do comando "hello-world". */
    @Command(command = "hello-world", description = "Prints 'Hello World'.")
    public String helloWorld(){
        return "Hello World!";
    }

    /* Esse comando estará disponível ou não para ser chamado de acordo com o "oddDayCheck", que é um bean da aplicação e
    * faz essa verificação.*/
    @Command(command = "hello-world-with-availability", description = "Prints 'Hello World'. The method will work if we are on an odd number day.")
    @CommandAvailability(provider = "oddDayCheck")
    public String helloWorldIfHasAvailability(){
        return "Hello World with availability!";
    }

    @Command(command = "hello-world-with-runtime-exception", description = "Prints 'Hello World' and throw a runtime exception.")
    public String throwRuntimeException(){
        System.out.println("Hello World!");

        throw new RuntimeException();
    }

//    O método abaixo só funcionará dentro dessa classe, e não como um handler global, por isso, deveremos utilizar outra
    //classe
//    @ExceptionResolver
//    public CommandHandlingResult resolve(Exception e) {
//        System.out.println("Entrou!");
//        return CommandHandlingResult.of("Exception", 42);
//    }
}
