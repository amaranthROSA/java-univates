package br.univates.samuel.pratica05.ex02.correcao;

public class Fiscalizacao {
	private Rodovia rod;
	private Caminhao cam;

	public Fiscalizacao(Rodovia rod, Caminhao cam) {
		this.rod = rod;
		this.cam = cam;
	}

	public String mensagem() {
		if (!this.levaMulta()) {
			return "Tenha uma boa viagem!";
		} else {
			return "Pare, você está multado!";
		}
	}

	public boolean levaMulta() {
		if (cam.getPesoKG() > rod.getLimite()) {
			return true;
		} else {
			return false;
		}
	}

}
