/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import com.kasolution.dominio.Funcionario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author igort
 */
public class Exemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Funcionario> emps = Funcionario.getFuncionarios();

        System.out.println("==> Ordenado por nome:");
        emps.stream()
                .sorted((f1, f2) -> sortName(f1, f2))
                .peek(e -> System.out.print("\t"))
                .forEach(Funcionario::print);

        System.out.println("\n==> Ordenado por idade (inversa):");

        emps.stream()
                .sorted((f1, f2) -> sortIdade(f1, f2))
                .peek(e -> System.out.print("\t"))
                .forEach(Funcionario::print);

        System.out.println("\n==> Ordem natural:");

        emps.stream()
                .sorted()
                .peek(e -> System.out.print("\t"))
                .forEach(Funcionario::print);

        System.out.println("\n==> Mais velho:");
        Optional<Funcionario> optV = 
                emps.stream().max((f1, f2) -> sortIdade(f2, f1));
        if (optV.isPresent()) {
            System.out.print("\t");
            Funcionario.print(optV.get());
        }

        System.out.println("\n==> Mais jovem:");
        Optional<Funcionario> optJ = 
                emps.stream().max((f1, f2) -> sortIdade(f1, f2));
        if (optJ.isPresent()) {
            System.out.print("\t");
            Funcionario.print(optJ.get());
        }

    }
    
    
    public static int sortName(Funcionario f1, Funcionario f2) {
        return f1.getNome().compareTo(f2.getNome());
    }

    public static int sortIdade(Funcionario f1, Funcionario f2) {
        Integer i1 = f1.getIdade();
        Integer i2 = f2.getIdade();
        return i2.compareTo(i1);
    }    
}
