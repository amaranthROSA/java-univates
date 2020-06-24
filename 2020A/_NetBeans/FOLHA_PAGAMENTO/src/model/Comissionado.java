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

    private double percentualComissao;
    private double vendaBruta;

    public Comissionado(String nome, String numeroPis,
            double percentualComissao, double vendaBruta) {
        super(nome, numeroPis);
    }

    @Override
    public double ganhos() {
        return getPercentualComissao() * getVendaBruta() / 100;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao > 0.0 && percentualComissao <= 100.0) {
            this.percentualComissao = percentualComissao;
        } else {
            this.percentualComissao = 0.0;
        }
    }

    public double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(double vendaBruta) {
        this.vendaBruta = vendaBruta < 0.0 ? 0.0 : vendaBruta;
    }

    @Override
    public String toString() {
        return "Funcionário Comissionado: " + super.toString() + '\n' +
                "Percentual Comissão: " +getPercentualComissao() + '\n'+ 
                "venda Bruta: " + vendaBruta + '\n';
    }

    
}
