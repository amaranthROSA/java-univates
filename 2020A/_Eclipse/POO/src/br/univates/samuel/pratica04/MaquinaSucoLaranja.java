package br.univates.samuel.pratica04;

public class MaquinaSucoLaranja {
	public String fabricante;
	public int potenciaWatts;
	public boolean voltagem220;
	public int velocidadeRPM;
	public int capacidadeTanque;
	public int litrosPorMinuto;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getPotenciaWatts() {
		return potenciaWatts;
	}
	public void setPotenciaWatts(int potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}
	public boolean isVoltagem220() {
		return voltagem220;
	}
	public void setVoltagem220(boolean voltagem220) {
		this.voltagem220 = voltagem220;
	}
	public int getVelocidadeRPM() {
		return velocidadeRPM;
	}
	public void setVelocidadeRPM(int velocidadeRPM) {
		this.velocidadeRPM = velocidadeRPM;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public int getLitrosPorMinuto() {
		return litrosPorMinuto;
	}
	public void setLitrosPorMinuto(int litrosPorMinuto) {
		this.litrosPorMinuto = litrosPorMinuto;
	}

}
