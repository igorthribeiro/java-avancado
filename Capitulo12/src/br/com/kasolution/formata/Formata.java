package br.com.kasolution.formata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Formata {

    private static final String PADRAO_D = "EEEE, MMMM dd, YYYY G";
    private static final String PADRAO_DH = "EEEE, MMMM dd, YYYY G, hh:mm a";
    private static final String PADRAO_DHZ = "EEEE, MMMM dd, YYYY G, hh:mm a VV";
    
    public static String data(LocalDateTime dataHora) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PADRAO_DH);
        return dtf.format(dataHora);
    }
    
    public static String data(ZonedDateTime zonaDataHora) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PADRAO_DHZ);
        return dtf.format(zonaDataHora);
    }
    
    public static String data(LocalDate data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PADRAO_D);
        return dtf.format(data);
    }
    
}
