package dao;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

/**
 * @author amaranth.rosa
 */
public class ContasDAO {

	private static List<Conta> contas = new ArrayList<Conta>();

	/* RETORNA CONTA PELO CÓD. DO CLIENTE */
	public Conta encontrarConta(Long codigoCliente) {
		Conta contaEncontrada = new Conta();

		for (Conta conta : listContas()) {

			if (conta.getCliente().getCodigo().equals(codigoCliente))
				contaEncontrada = conta;
		}

		return contaEncontrada;
	}

	public void createConta(Conta conta) {
		try {

			if (encontrarConta(conta.getCliente().getCodigo()) == null)
				throw new RuntimeException("Código cliente já cadastrado!");
			else
				contas.add(conta);

		} catch (RuntimeException rte) {
			rte.printStackTrace();
		}
	}

	public List<Conta> listContas() {
		return contas;
	}

}
