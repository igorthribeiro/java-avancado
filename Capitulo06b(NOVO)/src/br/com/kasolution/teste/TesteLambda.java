/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;
import br.com.kasolution.dominio.Funcao;
import br.com.kasolution.dominio.classe.externa.Subtracao;
import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class TesteLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        //função
        Funcao soma = (BigDecimal x, BigDecimal y) -> x.add(y);
        Funcao subtracao  = (x, y) -> x.subtract(y);
        //constantes
        BigDecimal n1 = new BigDecimal(2);
        BigDecimal n2 = new BigDecimal(5);
        //método funcional
        System.out.println("Calcular soma: " + c.calcula(n1, n2, soma));
        System.out.println("Calcular subtração: " + c.calcula(n1, n2, subtracao));
        System.out.println("Calcular multiplicação: " + c.calcula(n1, n2, (x, y) -> x.multiply(y)));
        System.out.println("Calcular soma (static): " + c.calcula(n1, n2, Funcao::soma));
    }
    
}
