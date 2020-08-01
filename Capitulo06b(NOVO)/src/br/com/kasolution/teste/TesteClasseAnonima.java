/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;
import br.com.kasolution.dominio.Funcao;
import br.com.kasolution.dominio.classe.externa.Soma;
import br.com.kasolution.dominio.classe.externa.Subtracao;
import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class TesteClasseAnonima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        //função (classe interna anônima)
        Funcao soma = new Funcao() {
            @Override
            public BigDecimal efetua(BigDecimal x, BigDecimal y) {
                return x.add(y);
            }
        };
        
        Funcao sb  = new Funcao() {
            @Override
            public BigDecimal efetua(BigDecimal x, BigDecimal y) {
                return x.subtract(y);
            }
        };
        
        //constantes
        BigDecimal n1 = new BigDecimal(2);
        BigDecimal n2 = new BigDecimal(5);
        //método funcional
        System.out.println("Calcular soma: " + c.calcula(n1, n2, soma));
        System.out.println("Calcular subtração: " + c.calcula(n1, n2, sb));
    }
}
