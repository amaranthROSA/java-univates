package model;

import java.util.LinkedList;

import javax.swing.JOptionPane;

/**
 * @author amaranth.rosa
 */

public class Conta {

	private double saldo;
	private double limite;
	private boolean isContaBloqueada;
	private LinkedList<Movimento> movimentos = new LinkedList<Movimento>();

	private Cliente cliente;

	/* BUILDER */
	public static class Builder {

		private double saldo; // opcional
		private double limite; // opcional
		private boolean isBloqueada; // opcional

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
			this.isBloqueada = isBloqueada;
			return this;
		}

		public Conta build() {
			return new Conta(this);
		}

	}

	// Construtor que "consome" Builder
	private Conta(Builder builder) {
		this.cliente = builder.cliente;
		this.saldo = builder.saldo;
		this.limite = builder.limite;

	}

	/* Só pode ser informado uma vez, via construtor */
	public Conta(final Cliente cliente, final Long codigo, Double limite) {
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

	public void depositar(Conta conta, double valor) {
		if (conta.isContaBloqueada) {
			JOptionPane.showMessageDialog(null, "A conta está bloqueada!");

		} else if (!(valor > 0)) {
			System.out.println("Operação abortada!\nNão pode depositar valor negativo ou nulo!");

		} else {
			this.saldo = (saldo + valor);

//			Data data = new Data();
//			data.setDataComoHoje();

//			Movimento movimento = new Movimento(conta, data);
//			movimentos.add(movimento);

			StringBuilder stb = new StringBuilder();
			stb.append("Efetuando deposito de R$ " + valor);
			stb.append(" para " + cliente.getNomeCliente());
			stb.append(" " + cliente.getSobrenomeCliente());

			JOptionPane.showMessageDialog(null, stb);
		}

	}

	public void sacar(Conta conta, double valor) {
		if (conta.isContaBloqueada) {
			JOptionPane.showMessageDialog(null, "A conta está bloqueada!");

		} else if (valor > (this.getSaldo() + getLimite())) {
			System.out.println("Operação abortada!\nNão pode sacar mais que o saldo disponível.");

		} else {
			this.saldo = (saldo - valor);

			StringBuilder build = new StringBuilder();
			build.append("Efetuando saque de R$ " + valor);
			build.append(" para " + cliente.getNomeCliente());
			build.append(" " + cliente.getSobrenomeCliente());
			JOptionPane.showMessageDialog(null, build);
		}

		/* Adiciona movimentação */
		Movimento mv = new Movimento(conta, new Data());
		movimentos.add(mv);
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Movimento getUtlimaMovimentacao() {

		return movimentos.getLast();

	}

	public void setUtlimaMovimentacao(Movimento movimento) {
		this.movimentos.add(movimento);
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

	/* Cadastra um movimento */
	public void addMovimento(Movimento movimento) {
		movimentos.add(movimento);
	}

}
