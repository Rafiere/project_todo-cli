package dev.piccodev.todocli.todo.command.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.Availability;
import org.springframework.shell.AvailabilityProvider;

import java.time.LocalDate;

@Configuration
public class AvailabilityBeans {

    /* Abaixo, temos um bean, que retornará um "supplier". Ele ficará responsável por dizer se um método poderá ou não
    * ser chamado. Isso serve apenas para os métodos que estejam utilizando esse bean para realizar a avaliação de disponibilidade.
    * Assim, esses métodos só poderão ser chamados se estivermos em um dia ímpar do mês. */
    @Bean
    public AvailabilityProvider oddDayCheck(){
        return () -> LocalDate.now().getDayOfMonth() % 2 == 0 ?
                Availability.unavailable("You can only use this command on odd days.") :
                Availability.available();
    }
}
