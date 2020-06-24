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
public abstract class Empregado {

    private String nome;
    private String numeroPis;

    public Empregado(String nome, String numeroPis) {
        setNome(nome);
        setNumeroPis(numeroPis);
    }
    
    public abstract double ganhos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroPis() {
        return numeroPis;
    }

    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n NumeroPIS: " + numeroPis + '\n';
    }

}
