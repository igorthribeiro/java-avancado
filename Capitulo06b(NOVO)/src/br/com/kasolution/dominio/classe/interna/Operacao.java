/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.dominio.classe.interna;

import br.com.kasolution.dominio.Funcao;
import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class Operacao {
    
    //classe interna (membro)
    public class Soma implements Funcao {
        @Override
        public BigDecimal efetua(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    }//fim classe Soma
   
}
