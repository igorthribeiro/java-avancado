/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import com.kasolution.dominio.Funcionario;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author igort
 */
public class Exemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Funcionario> emps = Funcionario.getFuncionarios();


        System.out.println("=== MODO ANALITICO EX.1 ===");
        //Collector<Container do resultado, Acumulador de objetos, Jogar os objetos acumulados no Container>
        String s1 = emps.stream().collect(
                () -> new StringBuilder(),                       //container
                (sb1, f) -> sb1.append(",").append(f.getNome()), //acumulador
                (sb1, sb2) -> sb1.append(sb2))                   //junção
                .substring(1);
        System.out.println(s1);

        System.out.println("\n=== MODO SINTÉTICO EX.1===");
        String s2 = emps.stream().map(Funcionario::getNome).collect(Collectors.joining(","));
        System.out.println(s2);

        System.out.println("\n=== MODO ANALITICO EX.2 ===");
        //Set set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        Set<Funcionario> set = emps.stream().collect(
                () -> new TreeSet(),
                (ts, e) -> ts.add(e),
                (ts1, ts2) -> ts1.addAll(ts2));
        set.stream().peek(e -> System.out.print("\t")).forEach(System.out::println);
        
        System.out.println();
        System.out.println("\n=== MODO SINTÉTICO EX.2 ===");
        Set set2 = emps.stream().collect(Collectors.toCollection(() -> new TreeSet()));
        //Set set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
        //Set set2 = stream2.collect(Collectors.toSet());
        set2.stream().peek(e -> System.out.print("\t")).forEach(System.out::println);

        System.out.println("\n=== MODO ANALITICO COM TESTE ANTES DE ADD ===");
        Set set3 = emps.stream().collect(() -> new TreeSet(), (ts, e) -> {
            if (e.getSexo() == 'F') {
                ts.add(e);
            }
        }, (ts1, ts2) -> ts1.addAll(ts2));
        set3.stream().peek(e -> System.out.print("\t")).forEach(System.out::println);
    }
    
}
