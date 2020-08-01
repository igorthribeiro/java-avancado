/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.LataGraxa;
import br.com.igordev.dominio.LoteTijolo;

/**
 *
 * @author igordev
 */
public class TesteLubrificante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LataGraxa lataGraxa = new LataGraxa();
        lataGraxa.setLitros(1000);
        lataGraxa.setValorLitro(2.50);
        System.out.println(lataGraxa);
    }
}
