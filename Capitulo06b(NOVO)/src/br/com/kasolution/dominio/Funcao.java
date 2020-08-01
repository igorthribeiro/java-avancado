/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.dominio;

import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */

@FunctionalInterface
public interface Funcao {
    BigDecimal efetua(BigDecimal x, BigDecimal y);
    
    //java 8+ (não pode ser sobrescrito)
    static BigDecimal soma(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
    
    //java 8+
    default BigDecimal subtracao(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
  
}
