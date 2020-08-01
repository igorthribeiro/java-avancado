package br.com.kasolution.dominio;

import java.util.Arrays;

public class VetorString {

    private String[] pilha;
    private int tamanho;

    public VetorString(int tamanho) {
        pilha = new String[tamanho];
    }

    public final void add(String s) {
        if (tamanho < pilha.length) {
            pilha[tamanho++] = s;
        }
    }

    public final String remove() {
        String elemento = null;
        if (tamanho > 0) {
            elemento = pilha[--tamanho];
            pilha[tamanho] = null;
        }
        return elemento;
    }

    public final String[] get() {
        return pilha;
    }

    public final int getSize() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tamanho; i++) {
            if (i == tamanho || pilha[i] == null) {
                return sb.substring(2);
            } else {
                sb.append(", ").append(pilha[i].toString());
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof VetorString) {
            VetorString vS = (VetorString) object;
            return Arrays.equals(this.get(), vS.get());
        }
        return false;
    }

}
