/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Student
 */
public class Formata {
    public static String moeda(double valor){
        return NumberFormat.getCurrencyInstance().format(valor);
    }
    public static String data(LocalDate data){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
        return data.format(dtf);
    }

    public static String data(LocalDateTime data){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE) - hh:mm:ss a");
        return data.format(dtf);
    }
}
