/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author 130955800299
 */
public class TesteExecutorService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i <= 1000; i++) {
                try {
                    Thread.sleep(0, 100);
                } catch (InterruptedException ex) {
                    //ignorar;
                }
                System.out.println("i: " + i);
            }
        };
        
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(r);
        es.execute(r);
        es.shutdown();
    }
    
}
