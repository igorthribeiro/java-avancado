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
public class ErrosFilho extends ErrosPai {

    @Override
    public void valida(int numero) throws RuntimeException {
        try {
            super.valida(numero);
        } catch (SistemaException e) {
            throw new RuntimeException("Erro de runtime: " + e.getMessage());
        }
    }
}
