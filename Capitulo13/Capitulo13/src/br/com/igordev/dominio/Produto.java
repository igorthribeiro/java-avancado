
package br.com.igordev.dominio;

import br.com.igordev.util.Formata;
import java.io.Serializable;
import java.util.Objects;


public class Produto implements Serializable{
    
    private static final long serialVersionUID =1l;
    
    private int id;
    private String descricao;
    private double valor;

    public Produto(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public Produto(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String info = "Item: " + id + " - " + descricao + " : " + Formata.moeda(valor);
        return info;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produto) {
            Produto p = (Produto) obj;
            return this.getId() == p.getId() && this.getDescricao().equals(p.getDescricao());
           
        }
        return false;
    }
    
}