package model;

/**
 * @author amaranth.rosa
 */
public class Reservatorio {

	private final int SABAO_ML_MAX = 25;
	private final int SABAO_GR_MAX = 50;
	private final int ROUPA_KG_MAX = 10;

	private String unidadeMedia;
	private int capacidadeMaxima;
	private int nivelAtual;

	public Reservatorio(String unidadeMedida) {
		setUnidadeMedia(unidadeMedida);
	}

	public String getUnidadeMedia() {
		return unidadeMedia;
	}

	public void setUnidadeMedia(String unidadeMedia) {
		this.unidadeMedia = unidadeMedia;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getNivelAtual() {
		return nivelAtual;
	}

	public void setNivelAtual(int nivelAtual) {
		this.nivelAtual = nivelAtual;
	}

}
