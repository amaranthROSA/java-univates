package view;

import dao.EmprestimoDAO;
import dao.LeitorDAO;
import dao.LivroDAO;

/**
 * @author amaranth.rosa
 */
public class Biblioteca {

	public static void main(String[] args) {
		LivroDAO livroDao = LivroDAO.getInstance();
		LeitorDAO leitorDao = LeitorDAO.getInstance();
		EmprestimoDAO emprestimoDao = EmprestimoDAO.getIntance();

		livroDao.load();
		leitorDao.load();
		emprestimoDao.load();

		Menu.menuPrincipal();
	}
}
