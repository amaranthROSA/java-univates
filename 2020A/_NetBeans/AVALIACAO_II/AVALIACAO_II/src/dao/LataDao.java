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
import model.Lata;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author amaranth.rosa
 */
public class LataDao {

    private static LataDao INSTANCE;

    public void save(Lata lata) {
        try {
            FileWriter file = new FileWriter("C:\\temp\\lataDAO.csv");

            StringBuilder stb = new StringBuilder();

            stb.append(lata.isCheia() + ";");
            stb.append(lata.getAltura() + ";");
            stb.append(lata.getRaio() + ";");
            stb.append(lata.getAreaBase() + ";");
            stb.append(lata.getVolume() + ";");
            stb.append(lata.getQtLixo() + ";");

            file.append(stb.toString());
            file.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public Lata load() {
        StringBuilder content = new StringBuilder();

        try {
            Stream<String> file = Files.lines(Paths.get("C:\\temp\\lataDAO.csv"), StandardCharsets.UTF_8);

            file.forEach(line -> {
                content.append(line);
            });

            String decode = content.toString();

            String[] read = decode.split(";");
            Lata lata = new Lata();

            if (read[0].equalsIgnoreCase("true")) {
                lata.setCheia(true);
            } else {
                lata.setCheia(false);
            }
            lata.setAltura(Double.valueOf(read[1]));
            lata.setRaio(Double.valueOf(read[2]));
            lata.setAreaBase(Double.valueOf(read[3]));
            lata.setVolume(Double.valueOf(read[4]));
            lata.setQtLixo(Double.valueOf(read[5]));
            
            file.close();
            
            return lata;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
         return null; 
    }

    /* SINGLETON */
    public static LataDao getInstance() {
        if (LataDao.INSTANCE == null) {
            LataDao.INSTANCE = new LataDao();
        }

        return LataDao.INSTANCE;
    }

}
