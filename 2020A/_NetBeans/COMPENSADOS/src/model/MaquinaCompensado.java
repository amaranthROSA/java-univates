/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ReservatorioDAO;

/**
 *
 * @author amaranth.rosa
 */
public class MaquinaCompensado {
    
    public static void main(String[] args) {
    
               
    }
    
    public static void criarReservatorios() {
        ReservatorioDAO dao = ReservatorioDAO.getInstance(); 
        
        ReservatorioCola reservCola = new ReservatorioCola();     
        ReservatorioCavaco reservCavaco = new ReservatorioCavaco();
    }
    
}
