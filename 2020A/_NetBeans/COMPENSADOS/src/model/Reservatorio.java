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
public abstract class Reservatorio {

    private double volume;

    public void limpar() {
        this.volume = 0.0;
    }

    public void abastecer(double quantidade) {
        this.volume += quantidade;
    }

    public void consumir(double quantidade) {
        this.volume -= quantidade;
    }

    public double getVolume() {
        return volume;
    }

}
