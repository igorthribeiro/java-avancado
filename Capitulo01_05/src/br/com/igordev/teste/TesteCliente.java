/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.Cliente;
import br.com.igordev.dominio.contas.ContaAPrazo;
import br.com.igordev.dominio.contas.ContaCorrente;
import br.com.igordev.enums.Prazo;

/**
 *
 * @author igordev
 */
public class TesteCliente {
    public static void main(String[] args) {
        ContaAPrazo cap1 = new ContaAPrazo("12345-6", Prazo.SEIS_MESES);
        ContaAPrazo cap2 = new ContaAPrazo("12345-7", Prazo.DOZE_MESES);
        ContaCorrente cc1 = new ContaCorrente("54321-0", 1000.00);
        ContaCorrente cc2 = new ContaCorrente("54321-1", 2000.00);
        
        Cliente c1 = new Cliente("Victor Augusto");
        c1.adicionaConta(cap1, cap2, cc1, cc2);
        
        System.out.println(c1);
        
    }
}
