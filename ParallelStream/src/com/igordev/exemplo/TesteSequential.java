/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igordev.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

/**
 *
 * @author 130955800299
 */
public class TesteSequential {

    static List<Long> ints;
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            getTempo();
        }
    }
    
    public static long sum() {
        return LongStream.rangeClosed(1, 1_000_000_000).sequential().reduce(0L, (e, s) -> e + s);
    }
    
    public static void getTempo() {
        long startTime = System.currentTimeMillis();
        long total = sum();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.printf("[SEQUENTIAL] - Total: %1d - Tempo Gasto: %2d \n", total, endTime);
    }
}
