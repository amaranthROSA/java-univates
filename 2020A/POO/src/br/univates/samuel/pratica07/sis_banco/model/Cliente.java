package br.univates.samuel.pratica07.sis_banco.model;

/**
 * @author amaranth.rosa
 */

public final class Cliente {

	private Long codigo;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	private String telefone;

	public Cliente(Long codigo, String nome, String sobrenome, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public void setCodigoCliente(Long codigo) {
		this.codigo = codigo;

	}

	public Long getCodigoCliente() {
		return codigo;
	}

	public void setNomeCliente(String nome) {
		this.nome = nome;

	}

	public String getNomeCliente() {
		return nome;
	}

	public void setSobrenomeCliente(String sobrenome) {
		this.sobrenome = sobrenome;

	}

	public String getSobrenomeCliente() {
		return sobrenome;
	}

	public void setCpfCliente(String cpf) {
		this.cpf = cpf;
	}

	public String getCpfCliente() {
		return cpf;
	}

	public void setTelefoneCliente(String telefone) {
		this.telefone = telefone;

	}

	public String getTelefoneCliente() {
		return telefone;
	}

	public void setEnderecoCliente(String endereco) {
		this.endereco = endereco;
	}

	public String getEnderecoCliente() {
		return endereco;
	}

}
