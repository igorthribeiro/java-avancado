/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.domino.Funcionario;

/**
 *
 * @author Aluno
 */
public class TesteBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario.Builder().build();
        System.out.println("F1: " + f1.toString());
        Funcionario f2 = new Funcionario.Builder().nome("Renato Silva").build();
        System.out.println("F2: " + f2);
        Funcionario f3 = new Funcionario.Builder().salario(12_000.00).nome("Marta Cunha").build();
        System.out.println("F3: " + f3);
    }
}
