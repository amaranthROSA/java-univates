/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author amaranth.rosa
 * @author samuel.rockenbach
 */
public abstract class Empregado {

    /**
     * Atributo do nome
     */
    private String nome;
    /**
     * Atributo do PIS
     */
    private String numeroPis;

    /**
     * Construtor
     * @param nome
     * @param numeroPis 
     */
    public Empregado(String nome, String numeroPis) {
        setNome(nome);
        setNumeroPis(numeroPis);
    }

    public abstract double ganhos();

    public abstract String geraSaidaCSV();

    /**
     * Retorna o nome do funcionário
     * @return (String)
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o número do PIS
     * @return (Stirng)
     */
    public String getNumeroPis() {
        return numeroPis;
    }

    /**
     * Define o PIS
     * @param numeroPis
     */
    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    /**
     * Descreve objeto Empregado
     * @return (String)
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "\n NumeroPIS: " + numeroPis + '\n';
    }

}
