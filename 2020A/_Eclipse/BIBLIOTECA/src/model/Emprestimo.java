package model;

/**
 * @author amaranth.rosa
 */
public class Emprestimo {

	private static Integer sequencia = 0;
	private Leitor leitor;
	private Livro livro;
	private Data dataRetirada;
	private Data dataDevolucao;

	public Emprestimo() {
	}

	public Emprestimo(Leitor leitor, Livro livro) {
		setLeitor(leitor);
		setLivro(livro);
		incrementSequencia();
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Data getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Data dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Data getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Data dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Integer getSequencia() {
		return sequencia;
	}

	public void incrementSequencia() {
		sequencia++;
	}

	@Override
	public String toString() {
		return "Cód: " + sequencia + ", leitor: " + leitor + ", livro: " + livro;
	}

}