package dao;

import java.util.ArrayList;
import java.util.List;

import model.Emprestimo;

/**
 * @author amaranth.rosa
 */
public class EmprestimoDAO {

	private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public static List<Emprestimo> listEmprestimos() {
		return emprestimos;
	}

	public static void createEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
	}

}
