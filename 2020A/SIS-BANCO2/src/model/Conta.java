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

	protected Cliente cliente;

	private LinkedList<Movimento> movimentos = new LinkedList<Movimento>();

	public Conta() {

	}

	public Conta(Cliente cliente) {
		setCliente(cliente);
	}

	public Conta(final Cliente cliente, double limite) {
		setCliente(cliente);
		setLimite(limite);
	}

	/* ----- OPERAÇÃO DE DEPÓSITO ----- */
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
			stb.append(" para " + cliente.getNome());
			stb.append(" " + cliente.getSobrenome());

			JOptionPane.showMessageDialog(null, stb);
		}
	}

	/* ----- OPERAÇÃO DE SAQUE ----- */
	public void sacar(Conta conta, double valor) {
		if (conta.isContaBloqueada) {
			JOptionPane.showMessageDialog(null, "A conta está bloqueada!");

		} else if (valor > (this.getSaldo() + getLimite())) {
			System.out.println("Operação abortada!\nNão pode sacar mais que o saldo disponível.");

		} else {
			this.saldo = (saldo - valor);

			StringBuilder stb = new StringBuilder();
			stb.append("Efetuando saque de R$ " + valor);
			stb.append(" para " + cliente.getNome());
			stb.append(" " + cliente.getSobrenome());
			JOptionPane.showMessageDialog(null, stb);
		}

		/* ----- ADICIONA MOVIMENTAÇÃO ----- */
		Movimento mv = new Movimento(conta, new Data());
		addMovimento(mv);
	}

	/* ----- GETTERS & SETTERS ----- */
	public void addMovimento(Movimento movimento) {
		movimentos.add(movimento);
	}

	public Movimento getUtlimaMovimentacao() {
		return movimentos.getLast();
	}

	public void setUtlimaMovimentacao(Movimento movimento) {
		this.movimentos.add(movimento);
	}

	public boolean isContaBloqueada() {
		return isContaBloqueada;
	}

	public void setContaBloqueada(boolean bloqueada) {
		this.isContaBloqueada = bloqueada;
	}

	public boolean isSaldoDevedor() {
		return saldo <= 0 ? true : false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
