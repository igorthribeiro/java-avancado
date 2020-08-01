/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Aluno
 */
public class TesteOrdenaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("D");
        set.add("F");
        set.add("A");
        set.add("J");
        set.add("X");
        set.add("S");
        System.out.println("Lista: " + set);
    }
    
}
