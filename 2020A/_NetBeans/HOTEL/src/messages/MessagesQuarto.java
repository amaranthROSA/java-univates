/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author amaranth.rosa
 */
public enum MessagesQuarto {
    SUCESSO("Sucesso!"),
    FALHA("Falha!"),
    SUCESSO_CADASTRO("Quarto cadastrado com sucesso!"),
    ERRO_CAMPOS_VAZIOS("Por favor confira, um dos campos está vazio."),
    ERRO_CAMPO_NUMERO_VAZIO("Campo número está vazio!"),
    ERRO_COMPLETAR_CADASTRO("Erro ao compltar cadastro, tente novamente.");

    MessagesQuarto(String message) {
        setMessage(message);
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String mesage) {
        this.message = message;
    }

}
