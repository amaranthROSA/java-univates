package view;

import javax.swing.JOptionPane;

import dao.EmprestimoDAO;
import dao.LeitorDAO;
import dao.LivroDAO;
import model.Emprestimo;
import model.Leitor;
import model.Livro;

/**
 * @author amaranth.rosa
 */
public class Menu {

	public static void menuPrincipal() {
		String op = null;
		op = JOptionPane.showInputDialog("Escolha uma opção:\n\n" + "[1] Retirar livro\n" + "[2] Devolver livro\n"
				+ "[3] Cadastrar leitor\n" + "[4] Listar leitores\n" + "[5] Cadastrar livro\n" + "[6]Listar livros\n"
				+ "[7] Listar empréstimos\n" + "[x] Sair" + "\n\n");

		switch (op) {
		case "1":
			retirarLivro();
		case "2":
			devolverLivro();
		case "3":
			cadastrarLeitor();
		case "4":
			listarLeitores();
		case "5":
			cadastrarLivro();
		case "6":
			listarLivros();
		case "7":
			listarEmprestimos();
		case "x":
			salvarEstadoDoSistema();
		default:
			opcaoInvalida();
		}
	}

	public static void retirarLivro() {
		LivroDAO daoLivro = LivroDAO.getInstance();
		LeitorDAO daoLeitor = LeitorDAO.getInstance();

		String codLivro = JOptionPane.showInputDialog(daoLivro.getLivros() + "\n\nInforme código do livro:\n");
		String codLeitor = JOptionPane.showInputDialog(daoLeitor.getLeitores() + "\n\nInforme o código do leitor:\n");

		Livro resultLivro = daoLivro.findLivroByCodigo(codLivro);
		Leitor resultLeitor = daoLeitor.findLeitorByCodigo(codLeitor);

		if (resultLivro != null && resultLeitor != null) {

			daoLivro.retirarLivro(resultLeitor, resultLivro);

			JOptionPane.showMessageDialog(null, "Livro retirado com sucesso.");
		}

		menuPrincipal();

	}

	public static void devolverLivro() {
		EmprestimoDAO daoEmprestimo = new EmprestimoDAO();

		String codigoEmprestimo = JOptionPane
				.showInputDialog(daoEmprestimo.getEmprestimos() + "\n\nInforme o número do empréstimo:\n");

		Emprestimo emprestimo = daoEmprestimo.findEmprestimoByCodigo(codigoEmprestimo);
		daoEmprestimo.getEmprestimos().remove(emprestimo);

		JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso.");

		menuPrincipal();

	}

	public static void cadastrarLeitor() {
		LeitorDAO dao = LeitorDAO.getInstance();

		String codigo = JOptionPane.showInputDialog("Informe o código: ");
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome; ");

		dao.addLeitor(new Leitor(codigo, nome, sobrenome));

		JOptionPane.showMessageDialog(null, "Leitor cadastrado com sucesso.");

		menuPrincipal();

	}

	public static void listarLeitores() {
		LeitorDAO dao = LeitorDAO.getInstance();

		JOptionPane.showMessageDialog(null, dao.getLeitores());

		menuPrincipal();
	}

	public static void cadastrarLivro() {
		LivroDAO dao = LivroDAO.getInstance();

		String codigo = JOptionPane.showInputDialog("Informe o código do livro: ");
		String nome = JOptionPane.showInputDialog("Informe o nome do livro: ");
		String autor = JOptionPane.showInputDialog("Informe o nome do autor: ");

		dao.addLivro(new Livro(codigo, nome, autor));

		JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");

		menuPrincipal();
	}

	public static void listarLivros() {
		LivroDAO dao = LivroDAO.getInstance();

		JOptionPane.showMessageDialog(null, dao.getLivros());

		menuPrincipal();
	}

	public static void listarEmprestimos() {
		EmprestimoDAO dao = EmprestimoDAO.getIntance();

		JOptionPane.showMessageDialog(null, dao.getEmprestimos());

		menuPrincipal();
	}

	public static void opcaoInvalida() {
		JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");

		menuPrincipal();
	}

	public static void salvarEstadoDoSistema() {
		LivroDAO livroDao = LivroDAO.getInstance();
		LeitorDAO leitorDao = LeitorDAO.getInstance();
		EmprestimoDAO emprestimoDao = EmprestimoDAO.getIntance();

		livroDao.save();
		leitorDao.save();
		emprestimoDao.save();

		System.exit(0);
	}

}
