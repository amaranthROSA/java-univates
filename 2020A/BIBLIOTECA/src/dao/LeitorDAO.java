package dao;

import java.util.ArrayList;
import java.util.List;

import model.Leitor;

/**
 * @author amaranth.rosa
 */
public class LeitorDAO {

	private static LeitorDAO INSTANCE;

	public LeitorDAO() {
	}

	private static List<Leitor> leitores = new ArrayList<Leitor>();

	public List<Leitor> listLeitores() {
		return leitores;
	}

	public void createLeitor(Leitor leitor) {
		leitores.add(leitor);
	}

	public Leitor findLeitorByCodigo(String codigo) {
		for (Leitor leitor : listLeitores()) {
			if (leitor.getCodigo().equals(codigo))
				return leitor;
		}

		return null;
	}

	public static LeitorDAO getInstance() {
		if (INSTANCE == null)
			INSTANCE = new LeitorDAO();

		return INSTANCE;
	}

}
