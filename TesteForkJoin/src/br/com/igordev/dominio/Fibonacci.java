package br.com.igordev.dominio;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 130955800299
 */
public class Fibonacci extends RecursiveTask<Long> {

    /**
     * @param args the command line arguments
     */
    final long n;

    Fibonacci(long n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return n;
        }
        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(n - 2);
        return f2.compute() + f1.join(); //milisegundos = 78
        //return f1.join() + f2.compute();   //milisegundos = 236
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        Fibonacci f = new Fibonacci(30);
        Long time = System.currentTimeMillis();
        System.out.println(pool.invoke(f));
        System.out.println(System.currentTimeMillis() - time);
    }

}
