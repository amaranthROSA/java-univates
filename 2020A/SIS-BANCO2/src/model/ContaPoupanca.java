package model;

/**
 * @author amaranth.rosa
 */
public class ContaPoupanca extends Conta {

	private Data diaAniversario;
	private Integer percentualReajuste;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public ContaPoupanca(Cliente cliente, double limite) {
		super(cliente, limite);
	}

	/* ----- REAJUSTE DE JUROS ----- */
	public void reajustarSaldo(Conta conta) {
		double reajuste = super.getSaldo() * (this.percentualReajuste / 100);
		super.depositar(conta, reajuste);
	}

	/* ----- GETTERS AND SETTERS ----- */
	public Data getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(Data diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public Integer getPercentualReajuste() {
		return percentualReajuste;
	}

	public void setPercentualReajuste(Integer percentualReajuste) {
		this.percentualReajuste = percentualReajuste;
	}

}
