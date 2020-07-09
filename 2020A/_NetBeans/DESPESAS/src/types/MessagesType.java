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
public enum MessagesType {

    DESPESA_CADASTRO_SUCESSO("Despesa cadastrada com sucesso!"),
    DESPESA_CADASTRO_ERRO("Ocorreu um erro ao cadastrar a despesa."),
    SALVO_SUCESSO("Informações salvas com sucesso!");

    private String description;

    MessagesType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
