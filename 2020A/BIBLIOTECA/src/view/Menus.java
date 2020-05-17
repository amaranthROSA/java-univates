package view;

import javax.swing.JOptionPane;

import dao.EmprestimoDAO;
import dao.LeitorDAO;
import dao.LivroDAO;
import enums.MenuPrincipalType;
import model.Emprestimo;
import model.Leitor;
import model.Livro;

/**
 * @author amaranth.rosa
 */
public class Menus {

	public static MenuPrincipalType menuPrincipal() {
		String op = JOptionPane.showInputDialog("Escolha uma opção:\n\n" + "[1] Retirar livro\n"
				+ "[2] Devolver livro\n" + "[3] Cadastrar leitor\n" + "[4] Cadastrar livro" + "\n\n");

		switch (op) {
		case "1":
			op = "";
			return MenuPrincipalType.RETIRAR_LIVRO;
		case "2":
			op = "";
			return MenuPrincipalType.DEVOLVER_LIVRO;
		case "3":
			op = "";
			return MenuPrincipalType.CADASTRAR_LEITOR;
		case "4":
			op = "";
			return MenuPrincipalType.CADASTRAR_LIVRO;
		default:
			op = "";
			return MenuPrincipalType.OPCAO_INVALIDA;
		}
	}

	public static void retirarLivro() {
		EmprestimoDAO daoEmprestimo = EmprestimoDAO.getIntance();
		LivroDAO daoBiblioteca = LivroDAO.getInstance();
		LeitorDAO daoLeitor = LeitorDAO.getInstance();

		String codLivro = JOptionPane.showInputDialog("Informe código do livro: ");
		String codLeitor = JOptionPane.showInputDialog("Informe o código do leitor: ");

		Livro resultLivro = daoBiblioteca.findLivroByCodigo(codLivro);
		Leitor resultLeitor = daoLeitor.findLeitorByCodigo(codLeitor);

		if (resultLivro != null) {
			daoBiblioteca.retirarLivro(resultLeitor, resultLivro);
			daoEmprestimo.createEmprestimo(new Emprestimo());

			JOptionPane.showMessageDialog(null, "Livro retirado com sucesso.");
		}

	}

	public static void devolverLivro() {
		LivroDAO daoBiblitoeca = new LivroDAO();
		EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
	}

	public static void cadastrarLeitor() {
		LeitorDAO dao = LeitorDAO.getInstance();

		String codigo = JOptionPane.showInputDialog("Informe o código: ");
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome; ");

		dao.createLeitor(new Leitor(codigo, nome, sobrenome));

		JOptionPane.showMessageDialog(null, "Leitor cadastrado com sucesso.");

		menuPrincipal();

	}

	public static void cadastrarLivro() {
		LivroDAO dao = LivroDAO.getInstance();

		String codigo = JOptionPane.showInputDialog("Informe o código do livro: ");
		String nome = JOptionPane.showInputDialog("Informe o nome do livro: ");
		String autor = JOptionPane.showInputDialog("Informe o nome do autor: ");

		dao.createLivro(new Livro(codigo, nome, autor));

		JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");

		menuPrincipal();
	}

	public static void opcaoInvalida() {
		JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");
	}

}
