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
public class Exemplo02 {

    public static void main(String[] args) {
        List<Funcionario> emps = Funcionario.getFuncionarios();

        System.out.println("==> Morador(a) Rio de Janeiro:");
        Optional<Funcionario> funcionario = emps
                .stream()
                .filter(f -> f.getEstado().equals("RJ"))
                .findFirst();
        if (funcionario.isPresent()) {
            System.out.print("\t");
            Funcionario.print(funcionario.get());
        }

        System.out.println("==> Todos funcionários moram no RJ?");
        boolean b = emps.stream()
                .allMatch(f -> f.getEstado().equals("RJ"));
        System.out.println((b) ? "\tSIM" : "\tNÃO");

    }

}
