package br.univates.samuel.pratica05.ex02;

public class Balanca {

	public static void main(String[] args) {
		Balanca bl = new Balanca();

		Caminhao c1 = new Caminhao("AAA-1111", 40000);
		Caminhao c2 = new Caminhao("BBB-2222", 20000);
		Caminhao c3 = new Caminhao("CCC-3333", 50000);

		bl.pesar(c1);
		bl.pesar(c2);
		bl.pesar(c3);

	}

	public void pesar(Caminhao caminhao) {
		if (caminhao.getPesoKG() > 40000) {
			System.out.println(caminhao.getPlaca() + ", você está multado!");
		} else {
			System.out.println(caminhao.getPlaca() + ", tenha uma boa viagem!\n");
		}
	}

}
