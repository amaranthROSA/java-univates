/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import types.SituacaoQuartoType;
import types.TipoQuartoType;

/**
 *
 * @author amaranth.rosa
 */
public class QuartoSimples extends Quarto {
    
    public QuartoSimples() {
        super();
    }

    public QuartoSimples(String numeroQuarto, boolean fumante, SituacaoQuartoType situacao) {
        super(numeroQuarto, fumante, situacao);
    }

    public QuartoSimples(String numeroQuarto, TipoQuartoType tipo) {
        super(numeroQuarto, tipo);
    }

    @Override
    public double caclularEstadia() {
        return super.getEstadiaBase() * 1;
    }

    @Override
    public String getDescription() {
        StringBuilder stb = new StringBuilder();
        stb.append("Número: " + super.getNumeroQuarto() + " | ");
        stb.append("Tipo: " + getTipo().getDescription() + " | ");
        stb.append("Situação: " + super.getSituacaoQuarto().getDescription());
        return stb.toString();
    }

    @Override
    public TipoQuartoType getTipo() {
        return TipoQuartoType.SIMPLES;
    }

}
