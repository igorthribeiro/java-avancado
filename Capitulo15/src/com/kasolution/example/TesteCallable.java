/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 *
 * @author 130955800299
 */
public class TesteCallable {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Long> c = () -> {
            long l = IntStream.rangeClosed(1, 1000).peek(p -> dormir(5)).sum();
            return l;
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Long> f1 = es.submit(c);
        Future<Long> f2 = es.submit(c);
        es.shutdown();

//        try {
//            System.out.printf("Soma: %1.2f\n", +f1.get(10, TimeUnit.NANOSECONDS));
//            System.out.printf("Soma: %1.2f\n", +f2.get(10, TimeUnit.NANOSECONDS));
//        } catch (TimeoutException ex) {
//            System.out.println("Tempo de Espera esgotado!");
//        }
        
        System.out.printf("Soma: %d\n", +f1.get()+f2.get());

    }
    
    public static void dormir(int millis) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
