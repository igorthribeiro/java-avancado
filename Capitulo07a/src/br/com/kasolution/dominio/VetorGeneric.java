package br.com.kasolution.dominio;

import java.util.Arrays;


@SuppressWarnings("EqualsAndHashcode")
public class VetorGeneric<T> {
    
    @SuppressWarnings("FieldMayBeFinal")
    private T[] pilha;
    private int tamanho;

    public VetorGeneric(int tamanho) {
        pilha =  (T[]) new Object[tamanho];
    }

    public final void add(T t) { if (tamanho < pilha.length) pilha[tamanho++] = t; }
    
    public final T remove() {
        T elemento = null;
        if (tamanho > 0) {
            elemento = pilha[--tamanho];
            pilha[tamanho] = null;
        }
        return elemento;
    }
    
    public final T[] get() { return pilha; }
    
    public final int getSize() { return tamanho; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tamanho; i++) {
            if (i == tamanho || pilha[i] == null)
                return sb.substring(2);
            else
                sb.append(", ").append(pilha[i].toString());    
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof VetorGeneric<?>) {
            VetorGeneric<?> vG = (VetorGeneric<?>) object;
            return Arrays.equals(this.get(), vG.get());
        }
        return false;        
    }
}