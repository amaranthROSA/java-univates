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
public class QuartoFamilia extends Quarto {

    public QuartoFamilia() {
        super();
    }

    public QuartoFamilia(String numeroQuarto, TipoQuartoType tipoQuarto) {
        super(numeroQuarto, tipoQuarto);
    }

    public QuartoFamilia(String numeroQuarto, boolean fumante, SituacaoQuartoType situacao) {
        super(numeroQuarto, fumante, situacao);
    }

    @Override
    public double caclularEstadia() {
        return super.getEstadiaBase() * 3;
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
        return TipoQuartoType.FAMILIA;
    }
}
