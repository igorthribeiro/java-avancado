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
public class Calculadora {
    
    public BigDecimal calcula(BigDecimal x, BigDecimal y, Funcao f) {
        return f.efetua(x, y);
    }
}
