package br.com.kasolution.teste;

import java.time.LocalDate;
import static br.com.kasolution.formata.Formata.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteFormata {

    public static void main(String[] args) {
        System.out.println(data(LocalDate.now()));
        System.out.println(data(LocalDateTime.now()));
        System.out.println(data(
                ZonedDateTime.of(LocalDateTime.now(),
                ZoneId.of("America/Sao_Paulo")
                )));
    }

}
