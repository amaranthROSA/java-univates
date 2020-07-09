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
public enum SimNaoType {
    
    SIM("Sim"),
    NAO("Não");
    
    private String description;
    
    SimNaoType(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
