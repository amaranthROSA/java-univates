package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Leitor;

/**
 * @author amaranth.rosa
 */
public class LeitorDAO {

	private static LeitorDAO INSTANCE;

	public LeitorDAO() {
	}

	private static List<Leitor> leitores = new ArrayList<Leitor>();

	public List<Leitor> getLeitores() {
		return leitores;
	}

	public void addLeitor(Leitor leitor) {
		leitores.add(leitor);
	}

	public void save() {
		try {
			FileWriter file = new FileWriter("C:\\temp\\leitorDAO.csv");

			StringBuilder stb = new StringBuilder();
			for (Leitor leitor : getLeitores()) {
				stb.append(leitor.getCodigo() + ";");
				stb.append(leitor.getNome() + ";");
				stb.append(leitor.getSobrenome() + ";");
				stb.append("\r\n");
			}

			file.append(stb.toString());
			file.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public void load() {
		LeitorDAO leitorDao = LeitorDAO.getInstance();

		StringBuilder content = new StringBuilder();
		try {
			Stream<String> file = Files.lines(Paths.get("C:\\temp\\leitorDao.csv"), StandardCharsets.UTF_8);

			file.forEach(line -> {
				content.append(line);
			});

			String decode = content.toString();

			String[] read = decode.split(";");
			for (int i = 0; i < read.length; i++) {
				Leitor leitor = new Leitor();
				leitor.setCodigo(read[0]);
				leitor.setNome(read[1]);
				leitor.setSobrenome(read[2]);

				leitorDao.addLeitor(leitor);
			}

			file.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public Leitor findLeitorByCodigo(String codigo) {
		for (Leitor leitor : getLeitores()) {
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
