package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

	public List<Livro> getLivros() {
		return livros;
	}

	public void addLivro(Livro livro) {
		livros.add(livro);
	}

	/*
	 * Salva livros do array em arquivo .CSV
	 */
	public void save() {
		try {
			FileWriter file = new FileWriter("C:\\temp\\livroDAO.csv");

			StringBuilder stb = new StringBuilder();
			for (Livro livro : getLivros()) {
				stb.append(livro.getCodigo() + ";");
				stb.append(livro.getNome() + ";");
				stb.append(livro.getAutor() + ";");
				stb.append("\r\n");
			}

			file.append(stb.toString());
			file.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/*
	 * Carrega livros para o array a partir de arquivo .CSV
	 */
	public void load() {
		LivroDAO livroDao = LivroDAO.getInstance();

		StringBuilder content = new StringBuilder();
		try {
			Stream<String> file = Files.lines(Paths.get("C:\\temp\\livroDAO.csv"), StandardCharsets.UTF_8);

			file.forEach(line -> {
				content.append(line);
			});

			String decode = content.toString();

			String[] read = decode.split(";");
			for (int i = 0; i < read.length; i++) {
				Livro livro = new Livro();
				livro.setCodigo(read[0]);
				livro.setNome(read[1]);
				livro.setAutor(read[2]);

				livroDao.addLivro(livro);
			}

			file.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	/*
	 * Realiza a retirada do livro
	 */
	public boolean retirarLivro(Leitor leitor, Livro livro) {
		List<Livro> livros = getLivros();

		Livro livrTemp = findLivroByCodigo(livro.getCodigo());

		if (livrTemp != null) {
			for (Livro lvr : livros) {
				if (lvr.getCodigo().equals(livro.getCodigo())) {
					LivroDAO.livros.remove(lvr);

					EmprestimoDAO daoEmprestimo = EmprestimoDAO.getIntance();
					daoEmprestimo.addEmprestimo(new Emprestimo(leitor, livro));

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

	/*
	 * Singleton
	 */
	public static LivroDAO getInstance() {
		if (INSTANCE == null)
			INSTANCE = new LivroDAO();

		return INSTANCE;
	}

}
