/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import br.com.igordev.util.Formata;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loc
 */
public class Carrinho /* marker */ {
    
    //versionamento


    private int id;
    private LocalDate dataCompra;
    private List<Produto> produtos;
    private /* não gravar no arquivo */ double totalCompra;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    public Carrinho(int id, LocalDate dataCompra) {
        this();
        this.id = id;
        this.dataCompra = dataCompra;
        this.totalCompra = 0;
    }

    public double getTotalCompra() {
        return this.totalCompra;
    }

    public int getId() {
        return this.id;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void adicionar(Produto p) {
        if (!produtos.contains(p)) {
            produtos.add(p);
            this.totalCompra += p.getValor();
        }
    }

    public void removerItem(Produto p) {
        produtos.remove(p);
        this.totalCompra -= p.getValor();
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return new StringBuilder("Carrinho: ").append(id)
                .append("\nData Compra: ").append(Formata.data(dataCompra))
                .append("\n[-- LISTA DE ITENS --]")
                .append(
                        produtos.stream()
                                .map(p -> new StringBuilder("\n\t").append(p))
                                .reduce((s1, s2) -> s1.append(s2))
                                .get()
                )
                .append("\nTotal Compra: ").append(Formata.moeda(totalCompra))
                .toString();
    }

    //escreve o objeto para arquivo


    //lê arquivo para o objeto

}
