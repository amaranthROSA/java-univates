/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ReservatorioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author amaranth.rosa
 */
public class MaquinaCompensado {

    private static ReservatorioDAO dao = ReservatorioDAO.getInstance();

    private static int chapasProduzidas = 0;

    public void produzirChapa() {
        if (!consumirCavaco() || !consumirCola()) {
            JOptionPane.showMessageDialog(null, "Verifique os tanques!\nNíveis dos reservatórios muito baixos.");
        } else {

            consumirCavaco();
            consumirCola();

            chapasProduzidas++;

            JOptionPane.showMessageDialog(null, "Chapa produzida com sucesso.");
        }
    }

    public boolean consumirCola() {
        if (!dao.getReservCola().consumir(0.935)) {
            JOptionPane.showMessageDialog(null, "Quantidade informada acima da capacidade.\nInforme valor mais baixo.");
        }

        return true;
    }

    public boolean consumirCavaco() {
        if (!dao.getReservCavaco().consumir(0.5)) {
            JOptionPane.showMessageDialog(null, "Valor informado além da disponibilidade.\n Informe valor mais baixo.");
        }

        return true;
    }

    public void abastecerCola(double volume) {
        if (!dao.getReservCola().abastecer(volume)) {
            JOptionPane.showMessageDialog(null, "Quantidade informada acima da capacidade.\nInforme valor mais baixo.");
        } else {
            JOptionPane.showMessageDialog(null, "Tanque de cola abasteceido com sucesso!");
        }

    }

    public void abastecerCavaco(double volume) {
        if (!dao.getReservCavaco().abastecer(volume)) {
            JOptionPane.showMessageDialog(null, "Quantidade informada acima da capacidade.\nInforme valor mais baixo.");
        } else {
            JOptionPane.showMessageDialog(null, "Tanque de cavacos abasteceido com sucesso!");
        }
    }
    
    public void zerarQuantidadeChapasProduzidas() {
        chapasProduzidas = 0;
    }
    
    public String getQuantidadeChapasProduzidas() {
        return String.valueOf(chapasProduzidas);
    }
    
    public String getQuantidadeReservatorioCola() {
        return String.valueOf(dao.getReservCola().getVolume());
    }
    
    public String getQuantidadeReservatorioCavacos() {
        return String.valueOf(dao.getReservCavaco().getVolume());
    }   

    public static void criarReservatorios() {

        ReservatorioCola reservCola = new ReservatorioCola();
        ReservatorioCavaco reservCavaco = new ReservatorioCavaco();

        dao.addReservatorioCavaco(reservCavaco);
        dao.addReservatorioCola(reservCola);
    }

}
