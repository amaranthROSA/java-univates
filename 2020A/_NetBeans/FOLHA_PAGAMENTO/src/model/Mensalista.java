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

    private double salarioMensal;

    public Mensalista(String nome, String numeroPis, double salarioMensal) {
        super(nome, numeroPis);
        setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double ganhos() {
        return this.getSalarioMensal();
    }

    @Override
    public String toString() {
        return "Fundionario mensalista: \n" + super.toString()
                + "Salário: " + "salarioMensal=" + salarioMensal + '\n';
    }

}
