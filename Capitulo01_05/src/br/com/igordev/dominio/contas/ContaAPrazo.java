/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio.contas;

import br.com.igordev.enums.Prazo;
import static br.com.igordev.util.Formata.*;
import java.time.LocalDate;

/**
 *
 * @author igordev
 */
public class ContaAPrazo extends Conta {

    public static final int SEIS_MESES = 6;
    public static final int DOZE_MESES = 12;
    public static final int DEZOITO_MESES = 18;

    private LocalDate dataMaturidade;

    public ContaAPrazo() {
    }

    public ContaAPrazo(String numero, Prazo prazo) {
        super(numero);
        setDataMaturidade(prazo);
    }
    
//    public void setDataMaturidade(int meses) {
//        switch (meses) {
//            case SEIS_MESES:
//            case DOZE_MESES:
//            case DEZOITO_MESES:
//                LocalDate hoje = LocalDate.now();
//                this.dataMaturidade = hoje.plusMonths(meses);
//                break;
//            default:
//                System.out.println("Quantidade de meses inválida.");
//                this.dataMaturidade = null;
//                break;
//        }
//    }

//    public void setDataMaturidade(Prazo prazo) {
//        switch (prazo) {
//            case SEIS_MESES:
//            case DOZE_MESES:
//            case DEZOITO_MESES:
//                LocalDate hoje = LocalDate.now();
//                this.dataMaturidade = hoje.plusMonths(prazo.getPrazo());
//                break;
//            default:
//                System.out.println("Quantidade de meses inválida.");
//                this.dataMaturidade = null;
//                break;
//        }
//    }

    final public void setDataMaturidade(Prazo prazo) {
        LocalDate hoje = LocalDate.now();
        this.dataMaturidade = hoje.plusMonths(prazo.getPrazo());
    }

    public LocalDate getDataMaturidade() {
        return dataMaturidade;
    }

    public void setDataMaturidade(LocalDate dataMaturidade) {
        this.dataMaturidade = dataMaturidade;
    }

    public void saca(double valor) {
        LocalDate hoje = LocalDate.now();
        if (hoje.isAfter(dataMaturidade)) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Não atingiu a data de maturidade");
        }
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n\t[* Conta a prazo *]")
                .append("\n\tData maturidade: ")
                .append(data(dataMaturidade))
                .toString();
    }    
    
}
