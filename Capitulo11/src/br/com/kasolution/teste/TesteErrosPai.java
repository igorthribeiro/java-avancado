/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.ErrosPai;
import br.com.kasolution.dominio.SistemaException;

/**
 *
 * @author Aluno
 */
public class TesteErrosPai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErrosPai ep = new ErrosPai();
        try {
            ep.valida(-5);
        } catch (SistemaException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
