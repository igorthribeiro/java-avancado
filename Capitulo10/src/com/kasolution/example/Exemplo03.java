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
public class Exemplo03 {

    public static void main(String[] args) {
        List<Funcionario> emps = Funcionario.getFuncionarios();

        System.out.println("==> Morador(a) Rio de Janeiro:");
        String estado = "RJ";
        Funcionario.print(getFunc(emps, estado));
    }

    public static Funcionario getFunc(List<Funcionario> fs, String estado) {
        Optional<Funcionario> funcionario = fs
                .stream()
                .filter(f -> f.getEstado().equals(estado))
                .findAny();
        if (funcionario.isPresent()) {
            return funcionario.get();
        }
        return null;
    }
}
