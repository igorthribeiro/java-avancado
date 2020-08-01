/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igordev.exemplo;

import java.util.List;
import java.util.stream.LongStream;

public class TesteParallel {

    static List<Long> ints;
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            getTempo();
        }
    }
    
    public static long sum() {
        return LongStream.rangeClosed(1, 1_000_000_000).parallel().reduce(0L, (e, s) -> e + s);
    }
    
    public static void getTempo() {
        long startTime = System.currentTimeMillis();
        long total = sum();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.printf("[PARALLEL] - Total: %1d - Tempo Gasto: %2d \n", total, endTime);
    }
}
