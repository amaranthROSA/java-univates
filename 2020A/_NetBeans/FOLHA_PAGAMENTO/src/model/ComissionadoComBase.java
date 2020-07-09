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

    /**
     * Atributo "salário base"
     */
    private double salarioBase;

    /**
     * Construtor
     * @param nome
     * @param numeroPis
     * @param percentualComissao
     * @param vendaBruta
     * @param salarioBase 
     */
    public ComissionadoComBase(String nome, String numeroPis,
                               double percentualComissao, double vendaBruta, double salarioBase) {
        super(nome, numeroPis, percentualComissao, vendaBruta);
        setSalarioBase(salarioBase);
    }
    
    /**
     * Retorna ganhos do Comissionado com Base
     * @return (Double)
     */
    @Override
    public double ganhos() {
        return getSalarioBase() + super.ganhos();
    }

    /**
     * Retorna "salário base"
     * @return (Double)
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Define "salário base"
     * @param salarioBase 
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Descreve objeto Comissionado com Base
     * @return (String)
     */
    @Override
    public String toString() {
        return "Funcionário Comissionado Com Base: " + super.toString() + '\n' +
                "Salario Base: " +getSalarioBase() + '\n';
    }

    
    
}
