package br.univates.samuel.pratica07.sis_banco;

import br.univates.samuel.pratica07.sis_banco.model.ClienteInterface;

/**
 * @author amaranth.rosa
 */

public class Cliente implements ClienteInterface {

	private static final long serialVersionUID = 1L;
	private Long codigo;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	private String telefone;

	@Override
	public void setCodigoCliente(Long codigo) {
		this.codigo = codigo;

	}

	@Override
	public Long getCodigoCliente() {
		return codigo;
	}

	@Override
	public void setNomeCliente(String nome) {
		this.nome = nome;

	}

	@Override
	public String getNomeCliente() {
		return nome;
	}

	@Override
	public void setSobrenomeCliente(String sobrenome) {
		this.sobrenome = sobrenome;

	}

	@Override
	public String getSobrenomeCliente() {
		return sobrenome;
	}

	@Override
	public void setCpfCliente(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getCpfCliente() {
		return cpf;
	}

	@Override
	public void setTelefoneCliente(String telefone) {
		this.telefone = telefone;

	}

	@Override
	public String getTelefoneCliente() {
		return telefone;
	}

	@Override
	public void setEnderecoCliente(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getEnderecoCliente() {
		return endereco;
	}

}
