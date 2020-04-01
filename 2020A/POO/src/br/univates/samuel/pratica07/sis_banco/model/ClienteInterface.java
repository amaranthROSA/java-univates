package br.univates.samuel.pratica07.sis_banco.model;

import java.io.Serializable;

/**
 * @author amaranth.rosa
 */

public interface ClienteInterface extends Serializable {

	public void setCodigoCliente(Long codigo);

	public Long getCodigoCliente();

	public void setNomeCliente(String nome);

	public String getNomeCliente();

	public void setSobrenomeCliente(String sobrenome);

	public String getSobrenomeCliente();

	public void setCpfCliente(String cpf);

	public String getCpfCliente();

	public void setTelefoneCliente(String telefone);

	public String getTelefoneCliente();

	public void setEnderecoCliente(String endereco);

	public String getEnderecoCliente();
}
