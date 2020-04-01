package br.univates.samuel.pratica07.sis_banco.model;

import java.io.Serializable;

/**
 * @author amaranth.rosa
 */

public interface ContaInterface extends Serializable {
	public void isContaBloqueada(boolean bloqueada);

	public void setCodigoConta(Long codigo);

	public Long getCodigoConta();

	public void sacar();

	public void depositar();

	public void setLimite();

	public Double getLimite();

	public void consultaSaldoDevedor();

	public void transfereValor(ContaInterface conta, double valor);

	public void pagarBeleto(ContaInterface conta, double valor);
}
