package br.com.kasolution.teste;


import java.time.Instant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igort
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        Thread.sleep(0, 5);
        Instant later = Instant.now();
        System.out.println("Now: " + now);
        System.out.println("Later: " + later);
    }
    
}
