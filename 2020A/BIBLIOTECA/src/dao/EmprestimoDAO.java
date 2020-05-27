package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Emprestimo;

/**
 * @author amaranth.rosa
 */
public class EmprestimoDAO {

	private static EmprestimoDAO INSTANCE;

	private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public EmprestimoDAO() {
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void save() {
		try {
			FileWriter file = new FileWriter("C:\\temp\\emprestimoDAO.csv");

			StringBuilder stb = new StringBuilder();
			for (Emprestimo emprestimo : getEmprestimos()) {
				// emprestimo
				stb.append(emprestimo.getDataRetirada() + ";");
				stb.append(emprestimo.getDataDevolucao() + ";");
				// livro
				stb.append(emprestimo.getLivro().getCodigo() + ";");
				stb.append(emprestimo.getLivro().getNome() + ";");
				stb.append(emprestimo.getLivro().getAutor() + ";");
				// leitor
				stb.append(emprestimo.getLeitor().getCodigo() + ";");
				stb.append(emprestimo.getLeitor().getNome() + ";");
				stb.append(emprestimo.getLeitor().getSobrenome() + ";");
				stb.append("\r\n");
			}

			file.append(stb.toString());
			file.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public void load() {

	}

	/*
	 * Cria um novo empréstimo
	 */
	public void addEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
	}

	/*
	 * Encontra o empréstimo pelo seu código (sequência)
	 */
	public Emprestimo findEmprestimoByCodigo(String codigoEmprestimo) {
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getSequencia().equals(Integer.valueOf(codigoEmprestimo)))
				return emprestimo;
		}

		return null;
	}

	/*
	 * Retorna o emprestimo informando o código do livro
	 */
	public Emprestimo findEmprestimoByLivro(String codigo) {
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getLivro().getCodigo().equals(codigo))
				return emprestimo;
		}

		return null;
	}

	/*
	 * Retorna todos os empréstimos do leitor informando o código dele
	 */
	public List<Emprestimo> findEmprestimosByLeitor(String codigo) {
		List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getLeitor().getCodigo().equals(codigo))
				emprestimos.add(emprestimo);
		}

		return emprestimos;
	}

	/*
	 * Singleton
	 */
	public static EmprestimoDAO getIntance() {
		if (INSTANCE == null)
			INSTANCE = new EmprestimoDAO();

		return INSTANCE;
	}

}
