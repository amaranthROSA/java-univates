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
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import model.Quarto;
import model.QuartoFamilia;
import model.QuartoSimples;
import model.QuartoTriplo;
import types.SituacaoQuartoType;
import types.TipoQuartoType;

/**
 *
 * @author amaranth.rosa
 */
public class QuartoDAO {

    private static QuartoDAO INSTANCE;

    private static List<Quarto> quartos = new ArrayList<Quarto>();

    /* Encontra quartos pelo número */
    public Quarto findQuartoByNumero(String numero) {
        List<Quarto> found = new ArrayList<Quarto>();
        quartos.forEach(quarto -> {
            if (quarto.getNumeroQuarto().equals(numero)) {
                found.add(quarto);
            }
        });

        return found.get(0);
    }

    /* Encontra quartos pela situação */
    public List<Quarto> findQuartoBySituacao(SituacaoQuartoType situacao) {
        List<Quarto> quartoReturn = new ArrayList<Quarto>();

        quartos.forEach(quarto -> {
            if (quarto.getSituacaoQuarto() == situacao) {
                quartoReturn.add(quarto);
            }
        });

        if (quartoReturn.isEmpty()) {
            return null;
        }

        return quartoReturn;
    }

    public void addQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removeQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public List<Quarto> listQuartos() {
        return quartos;
    }

    public void save() {
        try {
            FileWriter file = new FileWriter("C:\\temp\\hotelDAO.csv");

            StringBuilder stb = new StringBuilder();
            for (Quarto quarto : listQuartos()) {
                stb.append(quarto.geraSaidaCSV());
            }

            file.append(stb.toString());
            file.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void load() {
        List<Quarto> quartosLoad = new ArrayList<Quarto>();

        try {
            Stream<String> file = Files.lines(Paths.get("C:\\temp\\hotelDAO.csv"), StandardCharsets.UTF_8);

            if (file != null) {
                String str = file.toString();

                String[] read = str.split(";");
                for (int i = 0; i < read.length; i++) {

                    String numero = read[0];
                    String fumante = read[1];
                    String tipoQuarto = read[2];
                    String situacaoQuarto = read[3];

                    Quarto quarto = null;
                    if (tipoQuarto.equals(TipoQuartoType.SIMPLES)) {
                        quarto = new QuartoSimples();
                    } else if (tipoQuarto.equals(TipoQuartoType.TRIPLO)) {
                        quarto = new QuartoTriplo();
                    } else if (tipoQuarto.equals(TipoQuartoType.FAMILIA)) {
                        quarto = new QuartoFamilia();
                    }

                    if (quarto != null) {
                        if (fumante.equals("true")) {
                            quarto.setFumante(true);
                        } else {
                            quarto.setFumante(false);
                        }

                        if (situacaoQuarto.equals(SituacaoQuartoType.LIVRE)) {
                            quarto.setSituacaoQuarto(SituacaoQuartoType.LIVRE);
                        } else if (situacaoQuarto.equals(SituacaoQuartoType.OCUPADO)) {
                            quarto.setSituacaoQuarto(SituacaoQuartoType.OCUPADO);
                        } else if (situacaoQuarto.equals(SituacaoQuartoType.AGUARDANDO_LIMPEZA)) {
                            quarto.setSituacaoQuarto(SituacaoQuartoType.AGUARDANDO_LIMPEZA);
                        } else if (situacaoQuarto.equals(SituacaoQuartoType.DESATIVADO)) {
                            quarto.setSituacaoQuarto(SituacaoQuartoType.DESATIVADO);
                        }
                    }
                    
                   quartosLoad.add(quarto);

                }

            }
            file.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    /* Singleton */
    public static QuartoDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new QuartoDAO();
        }

        return INSTANCE;
    }

}
