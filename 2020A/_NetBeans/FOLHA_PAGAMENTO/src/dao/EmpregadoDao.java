/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Arquivo;
import model.Comissionado;
import model.ComissionadoComBase;
import model.Empregado;
import model.Horista;
import model.Mensalista;

/**
 *
 * @author amaranth.rosa
 */
public class EmpregadoDao {

    /**
     * Array de empregados
     */
    private static ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    /**
     * Adiciona novo empregado ao array
     * @param empregado
     * @return (Boolean)
     */
    public static boolean addEmpregado(Empregado e) {
        if (e != null) {
            empregados.add(e);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o array de empregados
     * @return (ArrayList)
     */
    public static ArrayList<Empregado> listEmpregados() {
        return empregados;
    }

    /**
     * Salva lista de empregados em arquivo
     */
    public static void save() {
        String linha = "";
        Arquivo arquivoSaida = new Arquivo("C:\\temp\\empregadosDAO.csv");
        arquivoSaida.abrirEscrita();
       
        for (Empregado empregado : listEmpregados()) {
            linha = empregado.geraSaidaCSV();
            arquivoSaida.escreverLinha(linha);
        }

    }

    /**
     * Carrega lista de empregados no programa
     */
    public static void load() {
        empregados.clear();

        String linha;
        String dados[] = new String[10];

        Empregado empregado = null;
        Arquivo arquivoEntrada = new Arquivo("C:\\temp\\empregados.csv");
        arquivoEntrada.abrirLeitura();

        linha = arquivoEntrada.lerLinha();
        while (linha != null) {
            dados = linha.split(";");

            switch (dados[0]) {
                case "mensalista":
                    empregado = new Mensalista(dados[1], dados[2], Double.parseDouble(dados[3]));
                    break;

                case "horista":
                    empregado = new Horista(dados[1], dados[2], Double.parseDouble(dados[3]), Double.parseDouble(dados[4]));
                    break;

                case "comissionado":
                    empregado = new Comissionado(dados[1], dados[2], Double.parseDouble(dados[3]), Double.parseDouble(dados[4]));
                    break;

                case "comissionadoComBase":
                    empregado = new ComissionadoComBase(dados[1], dados[2], Double.parseDouble(dados[3]), Double.parseDouble(dados[4]), Double.parseDouble(dados[5]));
                    break;

            }
            if (empregado != null) {
                EmpregadoDao.addEmpregado(empregado);
            }
            linha = arquivoEntrada.lerLinha();
        }

        arquivoEntrada.fecharArquivo();
    }

}
