/**
 * 
 */
package classes;

import javax.swing.JOptionPane;

/**
 * @author amaranth.rosa
 *
 */
public class Receita {

	private static int PORC_ACUCAR = 7;

	/* Usado para dosar quantidade dos ingredientes (1 = 50ml, 2 = 100ml) */
	private int dosagemMultp = 1; /* Inicializado para evitar nullPointer */

	private boolean acucar;
	private boolean porcaoGrande;
	private boolean isCafePronto = false;

	private String msgBloqueio = "Desculpe, mas há um problema com o reservatório.";

	private Reservatorio reservatorio = new Reservatorio();

	public Receita(boolean acucar, boolean porcaoGrande) {
		setAcucar(acucar);
		setPorcaoGrande(porcaoGrande);

		if (isAcucar() && PORC_ACUCAR > reservatorio.getQtAcucar())
			JOptionPane.showMessageDialog(null, "Não há açúcar suficiente!");
		setAcucar(false);

		if (isPorcaoGrande())
			setDosagemMultp(2);
		else
			setDosagemMultp(1);

	}

	/*-------- PREPARO DAS RECEITAS --------*/

	public void prepararCafeCurto() {
		reservatorio.usarCafe(3 * dosagemMultp);

		if (acucar == true)
			reservatorio.usarAcucar(PORC_ACUCAR);

		if (!reservatorio.isBloqueada()) {
			setIsCafePronto(true);
		} else {
			JOptionPane.showMessageDialog(null, msgBloqueio);
		}
	}

	public void prepararCafeLongo() {
		reservatorio.usarCafe(2 * dosagemMultp);

		if (acucar == true)
			reservatorio.usarAcucar(PORC_ACUCAR);

		if (!reservatorio.isBloqueada()) {
			setIsCafePronto(true);
		} else {
			JOptionPane.showMessageDialog(null, msgBloqueio);
		}
	}

	public void prepararCafeComLeite() {
		reservatorio.usarCafe(2 * dosagemMultp);
		reservatorio.usarLeiteEmPo(10 * dosagemMultp);

		if (acucar == true) {
			reservatorio.usarAcucar(PORC_ACUCAR);
		}

		if (!reservatorio.isBloqueada()) {
			setIsCafePronto(true);
		} else {
			JOptionPane.showMessageDialog(null, msgBloqueio);
		}
	}

	public void prepararAchocolatado() {
		reservatorio.usarAchocolatado(8 * dosagemMultp);
		reservatorio.usarLeiteEmPo(20 * dosagemMultp);

		if (acucar == true)
			reservatorio.usarAcucar(PORC_ACUCAR);

		if (!reservatorio.isBloqueada()) {
			setIsCafePronto(true);
		} else {
			JOptionPane.showMessageDialog(null, msgBloqueio);
		}
	}

	public void prepararCapuccino() {
		reservatorio.usarCafe(3 * dosagemMultp);
		reservatorio.usarAchocolatado(5 * dosagemMultp);
		reservatorio.usarLeiteEmPo(15 * dosagemMultp);

		if (acucar == true)
			reservatorio.usarAcucar(PORC_ACUCAR);

		setIsCafePronto(true);
	}

	/*-------- GETTERS E SETTERS --------*/

	public int getDosagemMultp() {
		return dosagemMultp;
	}

	public void setDosagemMultp(int dosagemMultp) {
		this.dosagemMultp = dosagemMultp;
	}

	public boolean isAcucar() {
		return acucar;
	}

	public boolean isPorcaoGrande() {
		return porcaoGrande;
	}

	public void setAcucar(boolean acucar) {
		this.acucar = acucar;
	}

	public void setPorcaoGrande(boolean porcaoGrande) {
		this.porcaoGrande = porcaoGrande;
	}

	public boolean isCafePronto() {
		return isCafePronto;
	}

	public void setIsCafePronto(boolean cafePronto) {
		this.isCafePronto = cafePronto;
	}

}
