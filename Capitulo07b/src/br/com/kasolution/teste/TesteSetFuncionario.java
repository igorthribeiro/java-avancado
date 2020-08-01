/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.domino.Funcionario;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class TesteSetFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Funcionario> funcs = new HashSet<>(); //CTRL+SHIFT+I
        Funcionario f1 = new Funcionario.Builder()
                .nome("Maria")
                .salario(1000.00).build();
        Funcionario f2 = new Funcionario.Builder()
                .nome("Maria")
                .salario(1000.00).build();
        
        funcs.add(f1);
        funcs.add(f2);
        funcs.forEach(System.out::println); //funcs.forEach(f -> System.out.println(f));
    }
}
