/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author amaranth.rosa
 */
public class Comissionado extends Empregado {

    /**
     * Atributo "percentual comissão"
     */
    private double percentualComissao;
    /**
     * Atirbuto "venda bruta"
    */
    private double vendaBruta;

    /**
     * Construtor
     * @param nome
     * @param numeroPis
     * @param percentualComissao
     * @param vendaBruta 
     */
    public Comissionado(String nome, String numeroPis,
            double percentualComissao, double vendaBruta) {
        super(nome, numeroPis);
    }

    /**
     * Retorna ganhos do Comissionado
     * @return (Double)
     */
    @Override
    public double ganhos() {
        return getPercentualComissao() * getVendaBruta() / 100;
    }

    /**
     * Retorna "percentual comissão"
     * @return (Double)
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * Define "percentual comissão"
     * @param percentualComissao 
     */
    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao > 0.0 && percentualComissao <= 100.0) {
            this.percentualComissao = percentualComissao;
        } else {
            this.percentualComissao = 0.0;
        }
    }

    /**
     * Retorna "venda bruta"
     * @return (Double)
     */
    public double getVendaBruta() {
        return vendaBruta;
    }

    /**
     * Define "venda bruta"
     * @param vendaBruta
     */
    public void setVendaBruta(double vendaBruta) {
        this.vendaBruta = vendaBruta < 0.0 ? 0.0 : vendaBruta;
    }

    /**
     * Descreve objeto Comissionado
     * @return (String)
     */
    @Override
    public String toString() {
        return "Funcionário Comissionado: " + super.toString() + '\n' +
                "Percentual Comissão: " +getPercentualComissao() + '\n'+ 
                "venda Bruta: " + vendaBruta + '\n';
    }

    
}
