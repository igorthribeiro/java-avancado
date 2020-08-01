/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class TesteListaSet {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Set<String> set = new HashSet<>();
        //list
        lista.add("A");
        lista.add("B");
        lista.add("B");
        lista.add("C");
        //set
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        System.out.println("Lista: " + lista);
        System.out.println("Set: " + set);
    }
}
