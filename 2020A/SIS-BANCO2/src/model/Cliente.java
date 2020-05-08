package model;

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

	public Cliente() {

	}

	public Cliente(Long codigo, String nome, String sobrenome, String cpf, String endereco, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;

	}

	public Long getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;

	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
