/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import com.kasolution.dominio.Funcionario;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author igort
 */
public class Exemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Funcionario> emps = Funcionario.getFuncionarios();

        System.out.println("==> Funcionarios por Estado:");
        Map<String, List<Funcionario>> funcs;
        funcs = emps.stream().collect(Collectors.groupingBy(Funcionario::getEstado));
        
        funcs.forEach((k, v) -> {
            System.out.println("Estado: " + k);
            long total = v.stream()
                    .peek(f -> System.out.println("\t"+ f))
                    .count();
            System.out.println("Total: " + total + "\n");
        });      
    }
    
}
