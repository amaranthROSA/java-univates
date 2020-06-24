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
public class Horista extends Empregado {

    private double valorHora;
    private double horasTrabalhadas;

    public Horista(String nome, String numeroPis,
            double valorHora, double horasTrabalhadas) {
        super(nome, numeroPis);

        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }
    
      @Override
    public double ganhos() {
        double salario;
        if(getHorasTrabalhadas() <= 180) {
            salario = this.getHorasTrabalhadas() * this.getValorHora();
        } else {
            salario = 180 * this.getValorHora() + ((getHorasTrabalhadas() - 180) * getValorHora() * 1.5);
        }
        
        return salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionário Horista: " + super.toString()
                + "Valor Hora: " + getValorHora() + "Horas Trabalhadas: " + getHorasTrabalhadas() + '}';
    }

  

}
