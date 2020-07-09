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
public enum TipoQuartoType {
    
    SIMPLES("Simples"),
    TRIPLO("Triplo"),
    FAMILIA("Familia");
    
    private String description;
    
    TipoQuartoType(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
