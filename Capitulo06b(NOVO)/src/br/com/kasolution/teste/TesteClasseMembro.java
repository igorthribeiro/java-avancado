/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;
import br.com.kasolution.dominio.classe.interna.Operacao;
import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class TesteClasseMembro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        //função
        Operacao.Soma s = new Operacao().new Soma();
        
        //constantes
        BigDecimal n1 = new BigDecimal(2);
        BigDecimal n2 = new BigDecimal(5);
        //método funcional
        System.out.println("Calcular soma: " + c.calcula(n1, n2, s));
    }
}
