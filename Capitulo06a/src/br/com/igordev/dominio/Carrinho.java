/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import br.com.igordev.interfaces.ItemCalculavel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igordev
 */
public class Carrinho {
    
    private List<ItemCalculavel> itens = new ArrayList<>();
    
    public void adiciona(ItemCalculavel item) {
        itens.add(item);
    }
    
    public void remove(ItemCalculavel item) {
        itens.remove(item);
    }

    @Override
    public String toString() {
        double totalCarrinho = 0;
        String info = "Itens carrinho: ";
        for (ItemCalculavel i : itens) {
            info += "\n" +  i + "\n";
            totalCarrinho += i.calculaTotal();
        }
        info += "Total Carrinho: " + totalCarrinho;
        return info;
    }
    
    
    
}
