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
public class ComissionadoComBase extends Comissionado {

    private double salarioBase;

    public ComissionadoComBase(String nome, String numeroPis,
                               double percentualComissao, double vendaBruta, double salarioBase) {
        super(nome, numeroPis, percentualComissao, vendaBruta);
        setSalarioBase(salarioBase);
    }
    
    @Override
    public double ganhos() {
        return getSalarioBase() + super.ganhos();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionário Comissionado Com Base: " + super.toString() + '\n' +
                "Salario Base: " +getSalarioBase() + '\n';
    }

    
    
}
