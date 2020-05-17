package model;

/**
 * @author amaranth.rosa
 */
public class Leitor {

	private String codigo;
	private String nome;
	private String sobrenome;

	public Leitor() {
	}

	public Leitor(String codigo, String nome, String sobrenome) {
		setCodigo(codigo);
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
