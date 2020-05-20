package dao;

import java.util.ArrayList;
import java.util.List;

import model.Emprestimo;
import model.Leitor;
import model.Livro;

/**
 * @author amaranth.rosa
 */
public class LivroDAO {

	private static LivroDAO INSTANCE;

	private static List<Livro> livros = new ArrayList<Livro>();

	public LivroDAO() {
	}

	public List<Livro> listLivros() {
		return livros;
	}

	public void createLivro(Livro livro) {
		livros.add(livro);
	}

	/*
	 * Realiza a retirada do livro
	 */
	public boolean retirarLivro(Leitor leitor, Livro livro) {
		List<Livro> livros = listLivros();

		Livro livrTemp = findLivroByCodigo(livro.getCodigo());

		if (livrTemp != null) {
			for (Livro lvr : livros) {
				if (lvr.getCodigo().equals(livro.getCodigo())) {
					LivroDAO.livros.remove(lvr);

					EmprestimoDAO daoEmprestimo = EmprestimoDAO.getIntance();
					daoEmprestimo.createEmprestimo(new Emprestimo(leitor, livro));

					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Localiza um livro informando o código dele
	 */
	public Livro findLivroByCodigo(String codigo) {
		for (Livro livro : livros) {
			if (livro.getCodigo().equals(codigo))
				return livro;
		}

		return null;
	}

	public static LivroDAO getInstance() {
		if (INSTANCE == null)
			INSTANCE = new LivroDAO();

		return INSTANCE;
	}

}
