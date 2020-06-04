package br.univates.samuel.pratica04;

public class DiscoRigido {
	public String fabricante;
	public double diametroPol;
	public double capacidadeGB;
	public int velocidadeRPM;
	public int trilhas;
	public int setores;
	public int cilindros;
	public boolean interfaceSATA;
	public boolean interfaceIDE;
	public boolean interfaceSCSI;
	public boolean interfaceSAS;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getDiametroPol() {
		return diametroPol;
	}
	public void setDiametroPol(double diametroPol) {
		this.diametroPol = diametroPol;
	}
	public double getCapacidadeGB() {
		return capacidadeGB;
	}
	public void setCapacidadeGB(double capacidadeGB) {
		this.capacidadeGB = capacidadeGB;
	}
	public int getVelocidadeRPM() {
		return velocidadeRPM;
	}
	public void setVelocidadeRPM(int velocidadeRPM) {
		this.velocidadeRPM = velocidadeRPM;
	}
	public int getTrilhas() {
		return trilhas;
	}
	public void setTrilhas(int trilhas) {
		this.trilhas = trilhas;
	}
	public int getSetores() {
		return setores;
	}
	public void setSetores(int setores) {
		this.setores = setores;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public boolean isInterfaceSATA() {
		return interfaceSATA;
	}
	public void setInterfaceSATA(boolean interfaceSATA) {
		this.interfaceSATA = interfaceSATA;
	}
	public boolean isInterfaceIDE() {
		return interfaceIDE;
	}
	public void setInterfaceIDE(boolean interfaceIDE) {
		this.interfaceIDE = interfaceIDE;
	}
	public boolean isInterfaceSCSI() {
		return interfaceSCSI;
	}
	public void setInterfaceSCSI(boolean interfaceSCSI) {
		this.interfaceSCSI = interfaceSCSI;
	}
	public boolean isInterfaceSAS() {
		return interfaceSAS;
	}
	public void setInterfaceSAS(boolean interfaceSAS) {
		this.interfaceSAS = interfaceSAS;
	}
	
}
