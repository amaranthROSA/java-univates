package br.univates.samuel.pratica04;

public class Fotocopiadora {
	public String fabricante;
	public int voltagem;
	public int densidadeDPI;
	public long resolucaoVerticalPX;
	public long resolucaoHorizontalPX;
	public String modeloTonner;
	public int copiasPorMinuto;
	public int capacidadeDeFolhas;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getDensidadeDPI() {
		return densidadeDPI;
	}
	public void setDensidadeDPI(int densidadeDPI) {
		this.densidadeDPI = densidadeDPI;
	}
	public long getResolucaoVerticalPX() {
		return resolucaoVerticalPX;
	}
	public void setResolucaoVerticalPX(long resolucaoVerticalPX) {
		this.resolucaoVerticalPX = resolucaoVerticalPX;
	}
	public long getResolucaoHorizontalPX() {
		return resolucaoHorizontalPX;
	}
	public void setResolucaoHorizontalPX(long resolucaoHorizontalPX) {
		this.resolucaoHorizontalPX = resolucaoHorizontalPX;
	}
	public String getModeloTonner() {
		return modeloTonner;
	}
	public void setModeloTonner(String modeloTonner) {
		this.modeloTonner = modeloTonner;
	}
	public int getCopiasPorMinuto() {
		return copiasPorMinuto;
	}
	public void setCopiasPorMinuto(int copiasPorMinuto) {
		this.copiasPorMinuto = copiasPorMinuto;
	}
	public int getCapacidadeDeFolhas() {
		return capacidadeDeFolhas;
	}
	public void setCapacidadeDeFolhas(int capacidadeDeFolhas) {
		this.capacidadeDeFolhas = capacidadeDeFolhas;
	}
	

}
