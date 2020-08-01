/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;
import br.com.kasolution.dominio.Funcao;
import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class TesteClasseLocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //classe local
        class Soma implements Funcao {
            @Override
            public BigDecimal efetua(BigDecimal x, BigDecimal y) {
                return x.add(y);
            }
        }// fim classe
        Calculadora c = new Calculadora();
        Soma soma = new Soma();
        System.out.println("Calcular soma: " + c.calcula(new BigDecimal(2), new BigDecimal(5), soma));
    }
}
