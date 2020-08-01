package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;
import br.com.kasolution.dominio.classe.estatica.Operacao;
import java.math.BigDecimal;

public class TesteClasseEstatica {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        //função
        Operacao.Soma s  = new Operacao.Soma();
        
        //constantes
        BigDecimal n1 = new BigDecimal(2);
        BigDecimal n2 = new BigDecimal(5);
        //método funcional
        System.out.println("Calcular soma: " + c.calcula(n1, n2, s));

    }

}
