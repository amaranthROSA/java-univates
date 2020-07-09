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

    /**
     * Atributo "valor hora"
     */
    private double valorHora;
    
    /**
     * Atributo "horas trabalhadas"
     */
    private double horasTrabalhadas;

    /**
     * Construtor
     * @param nome
     * @param numeroPis
     * @param valorHora
     * @param horasTrabalhadas 
     */
    public Horista(String nome, String numeroPis,
            double valorHora, double horasTrabalhadas) {
        super(nome, numeroPis);

        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }
    
    /**
     * Retorna ganhos do Horista
     * @return (Double)
     */
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

    /**
     * Retorna "valor hora"
     * @return (Double)
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * Define "valor hora"
     * @param valorHora 
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Retorna "horas trabalhadas"
     * @return (Double)
     */
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * Define "horas trabalhadas"
     * @param horasTrabalhadas 
     */
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * Descreve objeto Horista
     * @return (Stirng)
     */
    @Override
    public String toString() {
        return "Funcionário Horista: " + super.toString()
                + "Valor Hora: " + getValorHora() + "Horas Trabalhadas: " + getHorasTrabalhadas() + '}';
    }

  

}
