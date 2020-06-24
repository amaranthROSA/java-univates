/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.EmpregadoDao;
import java.time.Clock;
import java.util.ArrayList;
import model.Comissionado;
import model.ComissionadoComBase;
import model.Empregado;
import model.Horista;
import model.Mensalista;

/**
 *
 * @author amaranth.rosa
 */
public class FolhaPagamento {

    public static void main(String[] args) {

        Mensalista empregado1 = new Mensalista("Mensalista", "001", 1000.0);
        EmpregadoDao.addEmpregado(empregado1);
        Horista empregado2 = new Horista("Horista", "002", 30.0, 200.0);
        EmpregadoDao.addEmpregado(empregado2);
        Comissionado empregado3 = new Comissionado("Comissionado", "003", 5.0, 30000.0);
        EmpregadoDao.addEmpregado(empregado3);
        ComissionadoComBase empregado4 = new ComissionadoComBase("ComissionadoComBase", "004", 5.0, 30000.0, 1.000);
        EmpregadoDao.addEmpregado(empregado4);

        System.out.println("Processamento da folha: ");

        double totalFolha = 0.0;
        ArrayList<Empregado> colaboradores;
        colaboradores = EmpregadoDao.listEmpregados();

        for (Empregado empregado : colaboradores) {
            if (empregado instanceof Mensalista) {
                System.out.println("É um mensalista!\n");
            }

            System.out.println(empregado);
            System.out.println("Valor do salário: " + empregado.ganhos());
            totalFolha += empregado.ganhos();
        }

        System.out.println("Valor Total da Folha: " + totalFolha);
    }
}
