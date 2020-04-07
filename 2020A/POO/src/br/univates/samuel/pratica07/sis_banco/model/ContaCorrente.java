package br.univates.samuel.pratica07.sis_banco.model;

import br.univates.samuel.pratica07.sis_banco.data.Data;

/**
 * @author amaranth.rosa
 */

public class ContaCorrente {

	private double saldo;
	private double limite;
	private boolean isContaBloqueada;
	private Data utlimaMovimentacao;

	private Cliente cliente;

	/* BUILDER */
	public static class Builder {

		private double saldo; // opcional
		private double limite; // opcional
		private boolean isContaBloqueada; // opcional

		private final Cliente cliente; // requerido

		public Builder(Cliente cliente) {
			this.cliente = cliente;
		}

		public Builder saldo(double saldo) {
			this.saldo = saldo;
			return this;
		}

		public Builder limite(double valor) {
			this.limite = valor;
			return this;
		}

		public Builder contaBloqueada(boolean isBloqueada) {
			this.isContaBloqueada = isBloqueada;
			return this;
		}

		public ContaCorrente build() {
			return new ContaCorrente(this);
		}

	}

	// Construtor que "consome" Builder
	private ContaCorrente(Builder builder) {
		this.cliente = builder.cliente;
		this.saldo = builder.saldo;
		this.limite = builder.limite;

	}

	/* Só pode ser informado uma vez, via construtor */
	public ContaCorrente(final Cliente cliente, final Long codigo, Double limite) {
		this.cliente = cliente;
		this.limite = limite;
	}

	/* ----------------------------------------- */
	/* Definições de identificação */
	public Cliente getCliente() {
		return cliente;
	}

	/* ----------------------------------------- */
	// Definições de bloqueio de conta
	public boolean isContaBloqueada() {
		return isContaBloqueada;
	}

	public void setContaBloqueada(boolean bloqueada) {
		this.isContaBloqueada = bloqueada;
	}

	/* ----------------------------------------- */
	// Operação de saque e deposito

	public void depositar(double valor) {
		if (!(valor > 0) && !isContaBloqueada()) {
			System.out.println("Operação abortada!\nNão pode depositar valor negativo ou nulo!");
		} else {
			this.saldo = (saldo + valor);

			Data data = new Data();
			data.setDataComoHoje();

			utlimaMovimentacao = data;

			StringBuilder build = new StringBuilder();
			build.append("Efetuando deposito de R$ " + valor);
			build.append(" para " + cliente.getNomeCliente());
			build.append(" " + cliente.getSobrenomeCliente());

			System.out.println(build);
		}

	}

	public void sacar(double valor) {
		if (valor > (this.getSaldo() + getLimite())) {
			System.out.println("Operação abortada!\nNão pode sacar mais que o saldo disponível.");
		} else {
			this.saldo = (saldo - valor);

			StringBuilder build = new StringBuilder();
			build.append("Efetuando saque de R$ " + valor);
			build.append(" para " + cliente.getNomeCliente());
			build.append(" " + cliente.getSobrenomeCliente());
			System.out.println(build);
		}
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Data getUtlimaMovimentacao() {
		return utlimaMovimentacao;
	}

	public void setUtlimaMovimentacao(Data utlimaMovimentacao) {
		this.utlimaMovimentacao = utlimaMovimentacao;
	}

	/* ----------------------------------------- */
	/* Definindo limites de operação da conta */

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public boolean isSaldoDevedor() {
		return saldo <= 0 ? true : false;
	}

	/* ----------------------------------------- */
	/* Tranferencia de valores para outras contas */

	public void transfereValor(ContaCorrente origem, ContaCorrente destino, double valor) {

	}

	public void pagarBeleto(ContaCorrente conta, double valor) {

	}

}
