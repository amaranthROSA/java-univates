package model;

/**
 * @author amaranth.rosa
 */
public class Livro {

	private String codigo;
	private String nome;
	private String autor;

	public Livro() {
	}

	public Livro(String codigo, String nome, String autor) {
		setCodigo(codigo);
		setNome(nome);
		setAutor(autor);
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
