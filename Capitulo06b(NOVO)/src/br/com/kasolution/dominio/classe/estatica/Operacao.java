package br.com.kasolution.dominio.classe.estatica;

import br.com.kasolution.dominio.Funcao;
import java.math.BigDecimal;

public class Operacao {

        //classe estatica
    public static class Soma implements Funcao {
        @Override
        public BigDecimal efetua(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    }//fim classe Subtracao

    
}
