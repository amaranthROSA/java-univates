/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author amaranth.rosa
 */
public enum DespesaType {

    ALIMENTACAO("Alimentacao"),
    EDUCACAO("Educacao"),
    LAZER("Lazer"),
    TRANSPORTE("Transporte"),
    VESTUARIO("Vestuario");

    private String description;

    DespesaType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
