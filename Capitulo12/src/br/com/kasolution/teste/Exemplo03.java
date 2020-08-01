package br.com.kasolution.teste;


import static br.com.kasolution.formata.Formata.data;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igort
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Period p = Period.ofMonths(1).plusDays(5);
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime novaData = ldt.plus(p);
        System.out.println("Nova data: " + data(novaData));
        
        //Calculo da pascoa 2020
        LocalDate quartaCinza = LocalDate.of(2020, 2, 26);
        Period diasPascoa = Period.ofDays(46);
        LocalDate dataPascoa = quartaCinza.plus(diasPascoa);
        System.out.println("Data páscoa: " + data(dataPascoa));
        
        Duration d = Duration.ofHours(5);
        novaData = novaData.plus(d);
        System.out.println("Nova data (hora): " + data(novaData));
        
        
        LocalDate ld = LocalDate.now();
        LocalDate natal = LocalDate.of(2018, Month.DECEMBER, 25);
        long diasAte = DAYS.between(ld, natal);
        System.out.printf("Faltam %1d dias para o natal!\n", diasAte);
        Period pNatal = Period.between(ld, natal);
        System.out.printf("Faltam %1d meses e %2d dias para o natal!\n", pNatal.getMonths(), pNatal.getDays());
        
        ZonedDateTime zdtHoje = ZonedDateTime.now();
        System.out.println("Hoje: " + data(zdtHoje));
    }
    
}
