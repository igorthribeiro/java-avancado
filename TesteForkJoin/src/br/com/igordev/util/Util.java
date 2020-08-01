package br.com.igordev.util;

import java.util.Random;

public class Util {

    public static Long[] getRandomArray(int size) {
        Long[] longArray = new Long[size];//new long[10000000];
        Random randomValues = new Random();
        
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = new Long(randomValues.nextInt(100000));
        }

        return longArray;
    }

}
