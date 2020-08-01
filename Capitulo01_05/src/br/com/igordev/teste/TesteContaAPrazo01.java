/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.Cliente;
import br.com.igordev.dominio.contas.ContaAPrazo;
import static br.com.igordev.enums.Prazo.*;

/**
 *
 * @author igordev
 */
public class TesteContaAPrazo01 {

    public static void main(String[] args) {
//        ContaAPrazo cap1 = new ContaAPrazo("12345-6", 6);
//        ContaAPrazo cap2 = new ContaAPrazo("12345-7", 6);

        ContaAPrazo cap1 = new ContaAPrazo("12345-6", SEIS_MESES);
        ContaAPrazo cap2 = new ContaAPrazo("12345-7", SEIS_MESES);

        Cliente cl1 = new Cliente("Igor Ribeiro");
        cl1.adicionaConta(cap1);
        cl1.adicionaConta(cap2);
        
        cap1.depositar(-1000);
        cap2.depositar(2000);
        
        System.out.println(cl1);
    }
}
