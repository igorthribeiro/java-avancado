/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 130955800299
 */
public class TesteRunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
    }

}
