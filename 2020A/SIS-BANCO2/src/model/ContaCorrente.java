package model;

/**
 * @author amaranth.rosa
 */
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public ContaCorrente(Cliente clinete, Double limite) {
		super(clinete, limite);
	}

}
