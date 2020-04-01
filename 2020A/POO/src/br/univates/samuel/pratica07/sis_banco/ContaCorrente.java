package br.univates.samuel.pratica07.sis_banco;

import java.io.Serializable;

import br.univates.samuel.pratica07.sis_banco.data.Data;
import br.univates.samuel.pratica07.sis_banco.model.ContaInterface;

/**
 * @author amaranth.rosa
 */

public class ContaCorrente implements ContaInterface, Serializable {

	private static final long serialVersionUID = 1L;

	private boolean contaBloqueada;
	private Long codigoConta;
	private Double saldo;
	private Double limite;
	private Data utlimaMovimentacao;

	@Override
	public void isContaBloqueada(boolean bloqueada) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCodigoConta(Long codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long getCodigoConta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLimite() {
		// TODO Auto-generated method stub

	}

	@Override
	public Double getLimite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void consultaSaldoDevedor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transfereValor(ContaInterface conta, double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagarBeleto(ContaInterface conta, double valor) {
		// TODO Auto-generated method stub

	}

}
