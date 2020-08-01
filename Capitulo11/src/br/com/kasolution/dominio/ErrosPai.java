/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.dominio;

/**
 *
 * @author Aluno
 */
public class ErrosPai {
    
    public void valida(int numero) throws SistemaException {
        if (numero < 0) {
            throw new SistemaException("O número informado é negativo!");
        }
    }
}
