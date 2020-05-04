package model;

/**
 * @author amaranth.rosa
 */
public class ContaPoupanca extends Conta {

	private Data diaAniversario;
	private int percentualReajuste;

	public ContaPoupanca(Cliente cliente, Long codigo, Double limite) {
		super(cliente, codigo, limite);
	}

	/* Faz reajuste de juros */
	public void reajustarSaldo(Conta conta) {
		double reajuste = super.getSaldo() * (this.percentualReajuste / 100);
		super.depositar(conta, reajuste);
	}

	/* Verifica aniversário da conta para ajustar juros */
	public Data getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(Data diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public int getPercentualReajuste() {
		return percentualReajuste;
	}

	public void setPercentualReajuste(int percentualReajuste) {
		this.percentualReajuste = percentualReajuste;
	}

}
