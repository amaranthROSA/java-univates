/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import model.Despesa;
import java.util.List;
import java.util.stream.Stream;
import model.Alimentacao;
import model.Educacao;
import model.Lazer;
import model.Transporte;
import model.Vestuario;
import types.DespesaType;
import view.Tela;

/**
 *
 * @author amaranth.rosa
 */
public class DespesaDAO {

    private static DespesaDAO INSTANCE;

    private static List<Despesa> despesas = new ArrayList<Despesa>();

    /*Adiciona nova despesa ao DAO*/
    public void addDesepsa(Despesa despesa) {
        despesas.add(despesa);
    }

    /*Retorna todas as despesas */
    public List<Despesa> getAllDespesas() {
        return despesas;
    }

    public double getTotalAllDespesas() {
        double value = 0;
        for (Despesa despesa : getAllDespesas()) {
            value += despesa.getValorDespesa();
        }

        return value;
    }

    public void limpar() {
        despesas = new ArrayList<Despesa>();
    }

    public double getTotalDespesaByTipo(Despesa tipoDespesa) {
        double value = 0;

        for (Despesa despesa : getAllDespesas()) {
            if (despesa.getClass() == tipoDespesa.getClass()) {
                value += despesa.getValorDespesa();
            }
        }

        return value;
    }

    public void save() {

        try {
            FileWriter file = new FileWriter("C:\\temp\\despesaDAO.csv");

            StringBuilder stb = new StringBuilder();
            for (Despesa despesa : getAllDespesas()) {
                stb.append(despesa.geraSaidaCSV());
                stb.append("\r\n");
            }

            file.append(stb.toString());
            file.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void load() {
        Despesa despesa = null;

        Tela tela = Tela.getInstance();

        try {
            Stream<String> file = Files.lines(Paths.get("C:\\temp\\despesaDAO.csv"), StandardCharsets.UTF_8);

            if (file != null) {
                String str = file.toString();

                String[] read = str.split(";");
                for (int i = 0; i < read.length; i++) {

                    if (read[0].equals(DespesaType.ALIMENTACAO.getDescription())) {
                        despesa = new Alimentacao(Double.parseDouble(read[1]));
                        addDesepsa(despesa);
                        tela.refreshFields(despesa, DespesaType.ALIMENTACAO);

                    } else if (read[0].equals(DespesaType.EDUCACAO.getDescription())) {
                        despesa = new Educacao(Double.parseDouble(read[1]));
                        addDesepsa(despesa);
                        tela.refreshFields(despesa, DespesaType.EDUCACAO);

                    } else if (read[0].equals(DespesaType.LAZER.getDescription())) {
                        despesa = new Lazer(Double.parseDouble(read[1]));
                        addDesepsa(despesa);
                        tela.refreshFields(despesa, DespesaType.LAZER);

                    } else if (read[0].equals(DespesaType.TRANSPORTE.getDescription())) {
                        despesa = new Transporte(Double.parseDouble(read[1]));
                        addDesepsa(despesa);
                        tela.refreshFields(despesa, DespesaType.TRANSPORTE);

                    } else if (read[0].equals(DespesaType.VESTUARIO.getDescription())) {
                        despesa = new Vestuario(Double.parseDouble(read[1]));
                        addDesepsa(despesa);
                        tela.refreshFields(despesa, DespesaType.VESTUARIO);

                    }

                }

            }
            file.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    /*SINGLETON*/
    public static DespesaDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DespesaDAO();
        }

        return INSTANCE;
    }
}
