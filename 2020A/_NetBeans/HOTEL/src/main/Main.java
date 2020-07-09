/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Movimentacao;
import dao.QuartoDAO;
import model.Quarto;
import model.QuartoFamilia;
import model.QuartoSimples;
import model.QuartoTriplo;
import types.SituacaoQuartoType;
import view.Tela;

/**
 *
 * @author amaranth.rosa
 */
public class Main {

    public static void main(String[] args) {
        QuartoDAO dao = QuartoDAO.getInstance();
        Movimentacao mov = Movimentacao.getInstance();

//    invocaTela();
        criarQuartos();

        Quarto quarto = dao.findQuartoByNumero("01");
        quarto.ativaQuarto();
        mov.receberHospede(quarto);
        mov.saidaHospede(quarto);
        double valorEstadia = quarto.caclularEstadia();
        
        Quarto quarto2 = dao.findQuartoByNumero("02");
        quarto.ativaQuarto();
        mov.receberHospede(quarto);
        mov.saidaHospede(quarto);
        double valorEstadia2 = quarto2.caclularEstadia();
       
        Quarto quarto3 = dao.findQuartoByNumero("03");
        quarto.ativaQuarto();
        mov.receberHospede(quarto);
        mov.saidaHospede(quarto);
        double valorEstadia3 = quarto3.caclularEstadia();
                
        
        System.out.println("Número: "+quarto.getNumeroQuarto() + "; Estadia: R$ " +valorEstadia);
        System.out.println("Número: "+quarto2.getNumeroQuarto() + "; Estadia: R$ " +valorEstadia2);
        System.out.println("Número: "+quarto3.getNumeroQuarto() + "; Estadia: R$ " +valorEstadia3);

    }

    public static void criarQuartos() {
        QuartoDAO dao = QuartoDAO.getInstance();

        Quarto simples = new QuartoSimples("01", false, SituacaoQuartoType.LIVRE);
        Quarto triplo = new QuartoTriplo("02", false, SituacaoQuartoType.LIVRE);
        Quarto familia = new QuartoFamilia("03", false, SituacaoQuartoType.LIVRE);

        dao.addQuarto(simples);
        dao.addQuarto(triplo);
        dao.addQuarto(familia);
    }

    public static void invocaTela() {
        Tela tela = new Tela();

        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
