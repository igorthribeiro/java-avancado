/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.domino.Funcionario;
import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Aluno
 */
public class TesteOrdenaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario.Builder()
                .nome("Newson")
                .dataAdmissao(LocalDate.of(2009, Month.AUGUST, 12))
                .salario(23_000.00)
                .build();
        
        Funcionario f2 = new Funcionario.Builder()
                .nome("Fabian")
                .dataAdmissao(LocalDate.of(2000, Month.FEBRUARY, 4))
                .salario(25_000.00)
                .build();
        
        Funcionario f3 = new Funcionario.Builder()
                .nome("Abilio")
                .dataAdmissao(LocalDate.of(2000, Month.JULY, 5))
                .salario(24_000.00)
                .build();
        
        Set<Funcionario> set = new TreeSet<>();
        set.add(f1);
        set.add(f2);
        set.add(f3);
        set.forEach(System.out::println);
    }
}
