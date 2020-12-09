/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import types.DespesaType;

/**
 *
 * @author amaranth.rosa
 */
public class Lazer extends Despesa {

    public Lazer(double valor) {
        super(valor);
    }

    public String getDescricao() {
        return DespesaType.LAZER.getDescription();
    }

    @Override
    public String geraSaidaCSV() {
        return getDescricao() + ";" + super.getValorDespesa() + ";";
    }

}