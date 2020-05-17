package dao;

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

	public static List<Emprestimo> listEmprestimos() {
		return emprestimos;
	}

	/*
	 * Cria um novo empr�stimo
	 */
	public void createEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
	}

	/*
	 * Retorna o emprestimo informando o c�digo do livro
	 */
	public Emprestimo findEmprestimoByLivro(String codigo) {
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getLivro().getCodigo().equals(codigo))
				return emprestimo;
		}

		return null;
	}

	/*
	 * Retorna todos os empr�stimos do leitor informando o c�digo dele
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
