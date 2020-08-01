/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import br.com.igordev.dominio.Carrinho;
import br.com.igordev.dominio.LataGraxa;
import br.com.igordev.dominio.LoteTijolo;

/**
 *
 * @author igordev
 */
public class TesteCarrinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoteTijolo lt = new LoteTijolo();
        lt.setQuantidade(500);
        lt.setValorUnitario(.50);
        LataGraxa lg = new LataGraxa();
        lg.setLitros(1000);
        lg.setValorLitro(1.50);
        
        Carrinho carrinho = new Carrinho();
        carrinho.adiciona(lt);
        carrinho.adiciona(lg);
        System.out.println(carrinho);
    }
    
}
