/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.ReservatorioCavaco;
import model.ReservatorioCola;

/**
 *
 * @author amaranth.rosa
 */
public class ReservatorioDAO {

    private static ReservatorioDAO INSTANCE;

    private ReservatorioCavaco reservCavaco;
    private ReservatorioCola reservCola;

    public void addReservatorioCavaco(ReservatorioCavaco reserv) {
        this.reservCavaco = reserv;
    }

    public void addReservatorioCola(ReservatorioCola reserv) {
        this.reservCola = reserv;
    }

    public ReservatorioCavaco getReservCavaco() {
        return reservCavaco;
    }

    public ReservatorioCola getReservCola() {
        return reservCola;
    }
    
    

    /*
     *SINGLETON
     */
    public static ReservatorioDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReservatorioDAO();
        }

        return INSTANCE;
    }
}
