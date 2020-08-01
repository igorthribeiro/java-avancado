/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

/**
 *
 * @author 130955800299
 */
public class TesteMyThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.start();
        mt2.start();
    }
    
}
