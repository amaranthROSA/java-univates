package br.univates.samuel.pratica04;

/**
 * @author samuel.rockenbach
 */
public class Radio {
	// constantes
	final int mhz = 1000000;
	final int khz = 1000;
	final int vol = 10;

	// variáveis
	boolean ligado;
	int volume;
	String banda; // AM FM
	long sintonia; // em Hz -> AM 500 a 1600 KHz , FM 88 a 108 MHz

	public Radio(boolean ligado, String banda) {
		this.ligado = ligado;
		this.banda = banda;
	}

	public void ligarDesligar() {
		if (ligado = true) {
			ligado = false;
		} else {
			ligado = true;
		}
	}

	public void aumentarVolume() {
		if (!(volume > 100)) {
			volume += vol;
		}
	}

	public void diminuirVolume() {
		if (!(volume < 0)) {
			volume -= vol;
		}
	}

	public int getVolume() {
		return this.volume;
	}

	// apenas percorre entre as bandas disponíveis
	public void mudaBanda(String banda) {
		if (banda.equals("FM")) {
			banda = "AM";
		} else {
			banda = "FM";
		}
	}

	public String getBanda() {
		return this.banda;
	}

	// muda para sintonia-base da banda
	public void restaurarSintonia(String banda) {
		if (banda.equals("FM")) {
			sintonia = 88 * mhz;
		}
		if (banda.equals("AM")) {
			sintonia = 500 * khz;
		}
	}

	// & faz avaliação wise-case:todas as delarações precisam ser verdadeiras
	public void avancarEstacao(long sintonia) {
		if (banda.equals("FM") & !(sintonia > 108 * mhz) & !(sintonia < 88 * mhz)) {
			// incrementa 1MHz
			sintonia += mhz;

		} else if (banda.equals("AM") & !(sintonia > 1600 * khz) & !(sintonia < 500 * khz)) {
			// incrementa 1Khz
			sintonia += khz;
		}

	}

	// & faz avaliação wise-case: todas as delarações precisam ser verdadeiras
	public void retrocederEstacao() {
		if (banda.equals("FM") & !(sintonia > 108 * mhz) & !(sintonia < 88 * mhz)) {
			// decrementa 1MHz
			sintonia -= mhz;
		} else if (banda.equals("AM") & !(sintonia > 1600 * khz) & !(sintonia < 500 * khz)) {
			// decrementa 1KHz
			sintonia -= khz;
		}
	}

	public long getSintonia() {
		if (this.banda.equals("FM")) {
			return (sintonia / mhz);
		} else if (this.banda.equals("AM")) {
			return (sintonia / khz);
		}
		return this.sintonia;
	}

	// valor será considerado MHz para FM e KHz para AM
	public void defineEstacao(int valor) {
		if (banda.equals("FM") & !(valor < 88) & !(valor > 108)) {
			sintonia = valor * mhz;
		} else if (banda.equals("AM") & !(valor > 500) & !(valor < 1600)) {
			sintonia = valor * khz;
		}
	}
}
