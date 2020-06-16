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
public class ReservatorioCavaco extends Reservatorio {

    private final double MAX_VOL = 300;

    @Override
    public void abastecer(double quantidade) {
        if (super.getVolume() + quantidade > MAX_VOL) {
            JOptionPane.showMessageDialog(null, "Quantidade informada acima da capacidade.\nInforme valor mais baixo.");
        } else {
            super.abastecer(quantidade);
        }
    }

    @Override
    public void consumir(double quantidade) {
        if (super.getVolume() - quantidade < 0) {
            JOptionPane.showMessageDialog(null, "Valor informado além da disponibilidade.\n Informe valor mais baixo.");
        } else {
            super.consumir(quantidade);
        }
    }

    public void completar() {
        super.abastecer(super.getVolume() - MAX_VOL);
    }

}
