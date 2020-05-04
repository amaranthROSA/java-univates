package model;

/**
 * @author amaranth.rosa
 */

public final class Cliente {

	private String codigoCliente;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	private String telefone;

	public static class Builder {
		private String codigoCliente;
		private String nome;
		private String sobrenome;
		private String cpf;
		private String endereco;
		private String telefone;

		public Builder(String codigoCliente, String nome, String sobrenome, String cpf) {
			this.codigoCliente = codigoCliente;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.cpf = cpf;
		}

		public Builder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public Cliente build() {
			return new Cliente(this);
		}

	}

	// Construtor que "consome" Builder
	private Cliente(Builder builder) {
		this.codigoCliente = builder.codigoCliente;
		this.nome = builder.nome;
		this.sobrenome = builder.sobrenome;
		this.cpf = builder.cpf;
		this.endereco = builder.endereco;
		this.telefone = builder.telefone;
	}

	public Cliente(String codigoCliente, String nome, String sobrenome, String cpf) {
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;

	}

	public String getCodigoCliente() {
		return codigoCliente;
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
