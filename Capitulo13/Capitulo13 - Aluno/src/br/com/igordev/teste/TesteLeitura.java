/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import java.util.Scanner;
import br.com.igordev.dominio.Carrinho;

/**
 *
 * @author Loc
 */
public class TesteLeitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o #ID da compra: ");
        int idCompra = scanner.nextInt();
        
        String arquivoCarrinho = "digite_a_pasta/nome_arquivo" + idCompra + ".dat";

        Carrinho carrinho = null;
        //try/catch leitura
    }
}
