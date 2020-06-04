package view;

import model.MaquinaDeLavar;

/**
 * @author amaranth.rosa
 */
public class Painel {
	public static void main(String[] args) {
		iniciar();
	}

	public static void iniciar() {
		MaquinaDeLavar maquina = new MaquinaDeLavar();
		maquina.lavagemCompleta();
	}

}
