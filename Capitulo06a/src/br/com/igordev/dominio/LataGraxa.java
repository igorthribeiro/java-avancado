/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import br.com.igordev.interfaces.ItemCalculavel;

/**
 *
 * @author igordev
 */
public class LataGraxa extends Lubrificante implements ItemCalculavel{

    @Override
    public double calculaTotal() {
        return getLitros() * getValorLitro();
    }
    
}
