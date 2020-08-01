/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import br.com.igordev.util.Formata;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loc
 */
public class Carrinho implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private LocalDate dataCompra;
    private List<Produto> produtos;
    private transient double totalCompra;

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

    //escreve o objeto para Arquivo
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(LocalDateTime.now());
    }

    private void readObject(ObjectInputStream ois)
            throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        //recalcular todal
        if (totalCompra == 0 && produtos.size() > 0) {
            this.totalCompra = produtos.stream()
                    .mapToDouble(Produto::getValor)
                    .sum();
        }
        LocalDateTime dataHoraArquivo = (LocalDateTime) ois.readObject();
        System.out.println("Data e hora da geração do arquivo: " + Formata.data(dataHoraArquivo));
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
}
