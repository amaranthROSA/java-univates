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
public abstract class Quarto {

    private final double VL_ESTADIA = 100.0;

    private String numeroQuarto;
    private boolean fumante;
    private SituacaoQuartoType situacaoQuarto;
    private TipoQuartoType tipoQuarto;
    protected double estadia;

    public Quarto() {

    }

    public Quarto(String numeroQuarto, TipoQuartoType tipoQuarto) {
        setNumeroQuarto(numeroQuarto);
        setTipoQuarto(tipoQuarto);
    }

    public Quarto(String numeroQuarto, boolean fumante, SituacaoQuartoType situacao) {
        setNumeroQuarto(numeroQuarto);
        setFumante(fumante);
        setSituacaoQuarto(situacao);
    }

    public double getEstadiaBase() {
        return VL_ESTADIA;
    }

    public abstract double caclularEstadia();

    public abstract String getDescription();

    public abstract TipoQuartoType getTipo();

    public String geraSaidaCSV() {
        StringBuilder stb = new StringBuilder();
        stb.append(numeroQuarto + ";" + fumante + ";" + tipoQuarto + ";" + situacaoQuarto);
        stb.append("\r\n");
        return stb.toString();
    }

    public void ocupaQuarto() {
        this.situacaoQuarto = SituacaoQuartoType.OCUPADO;
    }

    public void desocupaQuarto() {
        this.situacaoQuarto = SituacaoQuartoType.LIVRE;
    }

    public void desativaQuarto() {
        this.situacaoQuarto = SituacaoQuartoType.DESATIVADO;
    }

    public void ativaQuarto() {
        this.situacaoQuarto = SituacaoQuartoType.LIVRE;
    }

    public void limparQuarto() {
        this.situacaoQuarto = SituacaoQuartoType.AGUARDANDO_LIMPEZA;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public SituacaoQuartoType getSituacaoQuarto() {
        return situacaoQuarto;
    }

    public void setSituacaoQuarto(SituacaoQuartoType situacaoQuarto) {
        this.situacaoQuarto = situacaoQuarto;
    }

    public TipoQuartoType getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuartoType tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

}
