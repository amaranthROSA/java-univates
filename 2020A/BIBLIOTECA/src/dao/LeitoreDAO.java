package dao;

import java.util.ArrayList;
import java.util.List;

import model.Leitor;

/**
 * @author amaranth.rosa
 */
public class LeitoreDAO {

	private static List<Leitor> leitores = new ArrayList<Leitor>();

	public static List<Leitor> listLeitores() {
		return leitores;
	}

	public static void createLeitor(Leitor leitor) {
		leitores.add(leitor);
	}

}
