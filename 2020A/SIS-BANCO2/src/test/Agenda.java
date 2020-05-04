package test;

import java.util.ArrayList;

public class Agenda {
	public static void main(String[] args) {

		ArrayList<String> agenda = new ArrayList<String>();

		agenda.add("Fulano");
		agenda.add("Beltrano");
		agenda.add("Sicrano");

		for (int i = 0; i < agenda.size(); i++) {
			System.out.println(agenda.get(i));
		}

		System.out.println("\n");

		for (String contato : agenda) {
			System.out.println(contato);
		}

	}
}
