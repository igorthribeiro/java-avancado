/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.Banco;
import br.com.igordev.dominio.Cliente;
import br.com.igordev.dominio.contas.ContaAPrazo;
import br.com.igordev.dominio.contas.ContaCorrente;
import br.com.igordev.enums.Prazo;

/**
 *
 * @author igordev
 */
public class TesteBanco {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Victor Augusto");
       
        Cliente c2 = new Cliente("Marcos Lima");
        c2.setCpf("356.239.482-94");

        Cliente c3 = new Cliente("Marcos Lima");
        c3.setCpf("356.239.482-94");
        
        Banco banco = Banco.getInstance();
        banco.setNome("Bradesco");
        
        banco.adiciona(c1);
        banco.adiciona(c2);
        banco.adiciona(c3);
        
        ContaCorrente cc1 = new ContaCorrente("12345-6", 1000.00);
        ContaAPrazo cap1 = new ContaAPrazo("54321-0", Prazo.DOZE_MESES);

        c1.adicionaConta(cap1);
        c2.adicionaConta(cc1);   
        
        System.out.println(banco);
    }
}
