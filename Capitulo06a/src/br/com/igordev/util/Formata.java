/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.util;

import java.text.NumberFormat;

/**
 *
 * @author igordev
 */
public class Formata {
    public static String moeda(double valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }
}
