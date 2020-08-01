/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import java.util.ArrayDeque;
import java.util.Deque;

public class TesteDeque {

    public static void main(String[] args) {
        // TODO code application logic here
        Deque deque = new ArrayDeque<>();
        deque.add("A"); //final da fila
        deque.add("B"); //inicio da fila (pilha)
        deque.push("C");
        deque.push("D");
        deque.add("E");
        deque.add("F");
        System.out.println("Deque: " + deque);
        //remove e pop sempre tiram o elemento 0
        System.out.println("Saiu: " + deque.pop());
        System.out.println("Saiu: " + deque.pop());
        System.out.println("Saiu: " + deque.remove());
        System.out.println("Saiu: " + deque.remove());
        System.out.println("Deque: " + deque);
    }
}
