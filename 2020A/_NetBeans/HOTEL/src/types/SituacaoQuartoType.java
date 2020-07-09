package types;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amaranth.rosa
 */
public enum SituacaoQuartoType {
     
    LIVRE("Livre"),
    OCUPADO("Ocupado"),
    AGUARDANDO_LIMPEZA("Aguardando limpeza"),
    DESATIVADO("Desativado");
 
    private String description;
    
    SituacaoQuartoType(String description) {
        setDescription(description);
    } 

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
