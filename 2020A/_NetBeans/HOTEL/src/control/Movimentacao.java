/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Quarto;
import types.SituacaoQuartoType;

/**
 *
 * @author amaranth.rosa
 */
public class Movimentacao {

    private static Movimentacao INSTANCE;

    public Quarto receberHospede(Quarto quarto) {
        quarto.ocupaQuarto();
        return quarto;
    }

    public Quarto saidaHospede(Quarto quarto) {
        quarto.desocupaQuarto();
        quarto.limparQuarto();
        return quarto;
    }

    public Quarto limparQuarto(Quarto quarto) {
        quarto.limparQuarto();
        return quarto;
    }

    public static Movimentacao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Movimentacao();
        }

        return INSTANCE;
    }

}
