package br.univates.samuel.pratica06.data;

public class TesteData {
	public static void main(String[] args) {
		// usar debug para verificar valores das variáveis

		// instancia automaticamente com a data de hoje porque construtor não foi
		// parametrizado
		Data dt = new Data();

		// instancia com data de hoje porque dia informado não existe
		Data dt2 = new Data("29/02/2018");

		// 2020 é ano bissexto, portanto funciona normalmente
		Data dt3 = new Data("29/02/2020");

		//
		// Realizando comparativos de datas
		// Informando data de nascimento
		String data_nasc = "17/11/1997";
		System.out.println("Data de nascimeto: " + data_nasc);

		Data dt_aniver = new Data(data_nasc);

		System.out.println("Dias desde a data de nascimento: " + dt.compareTo(dt_aniver));

	}
}
