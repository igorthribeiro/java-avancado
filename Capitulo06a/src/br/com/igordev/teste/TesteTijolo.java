/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.LoteTijolo;

/**
 *
 * @author igordev
 */
public class TesteTijolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoteTijolo loteTijolo = new LoteTijolo();
        loteTijolo.setQuantidade(500);
        loteTijolo.setValorUnitario(.60);
        System.out.println(loteTijolo);
    }
    
}
