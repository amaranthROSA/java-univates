/**
 * 
 */
package br.univates.samuel.pratica07.sis_banco.model;

import br.univates.samuel.pratica07.sis_banco.data.Data;

/**
 * @author amaranth.rosa
 *
 */
public class Movimento {

	private Conta conta;
	private Data dataMovimentacao;

	public Movimento(Conta conta, Data data) {
		this.conta = conta;
		this.dataMovimentacao = data;
	}

	public Conta getConta() {
		return conta;
	}

	public Data getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void setDataMovimentacao(Data dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

}
