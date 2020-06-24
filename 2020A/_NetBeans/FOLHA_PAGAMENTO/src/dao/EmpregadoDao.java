/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Empregado;

/**
 *
 * @author amaranth.rosa
 */
public class EmpregadoDao {

    private static ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    public static boolean addEmpregado(Empregado e) {
        if (e != null) {
            empregados.add(e);
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Empregado> listEmpregados() {
        return empregados;
    }

}
