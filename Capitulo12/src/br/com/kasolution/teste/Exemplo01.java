package br.com.kasolution.teste;


import static br.com.kasolution.formata.Formata.data;
import java.time.LocalDateTime;
import static java.time.Month.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igort
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId london = ZoneId.of("Europe/London");
        LocalDateTime reuniao = LocalDateTime.of(2018, SEPTEMBER, 20, 15, 30);
        ZonedDateTime reuniaoSP = ZonedDateTime.of(reuniao, saoPaulo);
        ZonedDateTime reuniaoLondres = reuniaoSP.withZoneSameInstant(london); 
        System.out.println("Notificar São Paulo às: " + data(reuniaoSP));
        System.out.println("Notificar Londres às: " + data(reuniaoLondres));
    }

}
