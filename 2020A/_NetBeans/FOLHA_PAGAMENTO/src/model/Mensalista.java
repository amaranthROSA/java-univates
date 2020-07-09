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
public class Mensalista extends Empregado {

    /**
     * Atributo "salario mensal"
     */
    private double salarioMensal;

    /**
     * Construtor
     * @param nome
     * @param numeroPis
     * @param salarioMensal 
     */
    public Mensalista(String nome, String numeroPis, double salarioMensal) {
        super(nome, numeroPis);
        setSalarioMensal(salarioMensal);
    }

    /**
     * Retorna "salário mensal"
     * @return (Double)
     */
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * Define atributo "salário mensal"
     * @param salarioMensal 
     */
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    /** 
     * Retorna ganhos do Mensalista
     * @return (Double)
     */
    @Override
    public double ganhos() {
        return this.getSalarioMensal();
    }

    /**
     * Descreve objeto Mensalista
     * @return (String)
     */
    @Override
    public String toString() {
        return "Fundionario mensalista: \n" + super.toString()
                + "Salário: " + "salarioMensal=" + salarioMensal + '\n';
    }

}
