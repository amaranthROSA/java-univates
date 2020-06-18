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

    public boolean abastecer(double quantidade) {
        this.volume += quantidade;
        
        return true;
    }

    public boolean consumir(double quantidade) {
        this.volume -= quantidade;
        
        return true;
    }

    public double getVolume() {
        return volume;
    }

}
