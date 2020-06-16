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
public final class Lata {

    private boolean cheia = false;
    private double altura;
    private double raio;

    private double areaBase;
    private double volume;
    private double qtLixo = 0.0;

    /* CONSTRUTORES */
    public Lata() {

    }

    public Lata(double altura, double raio) {

        setAltura(altura);
        setRaio(raio);
    }

    /* GETTERS & SETTERS */
    public boolean isCheia() {
        return cheia;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    /* TRANSIENTS */
    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getQtLixo() {
        return qtLixo;
    }

    public void setQtLixo(double qtLixo) {
        this.qtLixo = qtLixo;
    }

    public double calcularAreaBase() {
        setAreaBase(Math.PI * Math.pow(raio, 2));
        return (double) areaBase;
    }

    public double calcularVolume() {
        setVolume(Math.PI * Math.pow(raio, 2) * altura);
        return (double) volume;
    }

    public void poeLixo() {
        if (!(getQtLixo() >= getVolume())) {
            qtLixo++;
        } else {
            setCheia(true);
        }
    }

    public void tiraLixo() {
        if (getQtLixo() > 0) {
            qtLixo--;
        }

        if (getQtLixo() < getVolume()) {
            setCheia(false);
        }
    }
    
    public void esvaziaLixo() {
        qtLixo = 0;
    }

    public String textoLixeiraCheia() {
        return isCheia() ? "Sim" : "Não";
    }
}
