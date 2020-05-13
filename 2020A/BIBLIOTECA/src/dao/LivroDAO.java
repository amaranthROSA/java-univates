package dao;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

/**
 * @author amaranth.rosa
 */
public class LivroDAO {

	private static List<Livro> livros = new ArrayList<Livro>();

	public static List<Livro> listLivros() {
		return livros;
	}

	public static void createLivro(Livro livro) {
		livros.add(livro);
	}

}
