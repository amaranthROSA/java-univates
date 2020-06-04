package br.univates.samuel.pratica05.ex02.correcao.testes;

import br.univates.samuel.Entrada;
import br.univates.samuel.pratica05.ex02.correcao.Caminhao;
import br.univates.samuel.pratica05.ex02.correcao.Fiscalizacao;
import br.univates.samuel.pratica05.ex02.correcao.Rodovia;

public class Teste {
	public static void main(String[] args) {

		Caminhao cam = new Caminhao();
		int peso = Entrada.leiaInt("Informe o peso do caminhão: ");
		cam.setPesoKG(peso);

		Rodovia rod = new Rodovia();
		rod.setLimite(40 * 1000);

		Fiscalizacao fisc = new Fiscalizacao(rod, cam);
		System.out.println(fisc.mensagem());

	}

}
