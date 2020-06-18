/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author amaranth.rosa
 */
public class ReservatorioCola extends Reservatorio {

    private final double MAX_VOL = 600;

    @Override
    public boolean abastecer(double quantidade) {
        if (super.getVolume() + quantidade > MAX_VOL) {
            return false;
        } else {
            super.abastecer(quantidade);
            return true;
        }
    }

    @Override
    public boolean consumir(double quantidade) {
        if (super.getVolume() - quantidade < 0) {
            return false;
        } else {
            super.consumir(quantidade);
            return true;
        }
    }

    public void completar() {
        super.abastecer(super.getVolume() - MAX_VOL);
    }

}
