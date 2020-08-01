/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.teste;

import br.com.kasolution.dominio.ErrosFilho;

/**
 *
 * @author Aluno
 */
public class TesteErrosFilho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErrosFilho ef = new ErrosFilho();
        ef.valida(-5);
    }
}
