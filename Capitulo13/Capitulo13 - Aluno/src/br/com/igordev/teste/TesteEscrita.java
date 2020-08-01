/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import br.com.igordev.dominio.Carrinho;
import br.com.igordev.dominio.Produto;
import java.time.LocalDate;

/**
 *
 * @author Loc
 */
public class TesteEscrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o código do carrinho: ");
        int id = scanner.nextInt();
        
        Carrinho carrinho = new Carrinho(id, LocalDate.now());
        carrinho.adicionar(new Produto(200, "Monitor LED FullHD",1500.00));
        carrinho.adicionar(new Produto(210, "Mouse Optico Microsoft", 49.90));
        carrinho.adicionar(new Produto(220, "Teclado Multilaser", 39.90));
        
        
        //pasta para salvar o arquivo
        String arquivoCarrinho = "digite_a_pasta/nome_arquivo" + carrinho.getId() +".dat";
        
        //try/catch escrita


    }//fim main
    
}//fim classe
