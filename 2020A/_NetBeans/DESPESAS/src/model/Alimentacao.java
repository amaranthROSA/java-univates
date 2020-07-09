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
public class Alimentacao extends Despesa {

    public Alimentacao(double valor) {
        super(valor);
    }

    public String getDescricao() {
        return DespesaType.ALIMENTACAO.getDescription();
    }

    @Override
    public String geraSaidaCSV() {
       return getDescricao()+";"+ super.getValorDespesa()+";";
    }

}
