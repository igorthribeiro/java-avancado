/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import com.kasolution.dominio.Funcionario;
import java.text.NumberFormat;
import java.util.List;

/**
 *
 * @author igort
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Funcionario> emps = Funcionario.getFuncionarios();

        System.out.println("==> Nome das mulheres:");
        emps.stream()
                .filter(f -> f.getSexo() == 'F')
                .peek(f -> System.out.print("\t"))
                .map(Funcionario::getNome).forEach(System.out::println);

        System.out.println("==> Média salário Mulheres:");
        double media = emps.stream()
                .filter(f -> f.getSexo() == 'F')
                .mapToDouble(Funcionario::getSalario).average().getAsDouble();
        System.out.println("\t" + NumberFormat.getCurrencyInstance().format(media));    

    }

}
