package com.kasolution.example;

import com.kasolution.dominio.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class ExemploNuncaFazer {

    public static void main(String[] args) {
        List<Funcionario> funcs = Funcionario.getFuncionarios();
        List<Funcionario> homens = new ArrayList<>();
        
        long total = funcs.stream()
                .filter(f -> f.getSexo() == 'M')
                .peek(homens::add)
                .count();
        System.out.println("Funcionarios copiados: " + total);
        homens.forEach(System.out::println);
    }

}
