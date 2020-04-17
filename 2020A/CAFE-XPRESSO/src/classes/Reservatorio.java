/**
 * 
 */
package classes;

import javax.swing.JOptionPane;

/**
 * @author amaranth.rosa
 *
 */
public class Reservatorio {
	public final int RESERV_MAX = 500;
	public final int RESERV_MIN = 0;

	/* Tanques estão HARDCODED para facilitar uso do programa */
	private static int qtCafe = 500;
	private static int qtAcucar = 500;
	private static int qtLeiteEmPo = 500;
	private static int qtAchocolatado = 500;

	private static boolean isBloqueado = false;

	/*-------- REPOSIÇÃO DE INGREDIENTES --------*/
	public void reporCafe(int cafe) {
		if (cafe + getQtCafe() > RESERV_MAX) {
			JOptionPane.showMessageDialog(null, "Tanque cheio!");
		} else {
			reporCafe(cafe);
			desbloquear();
		}
	}

	public void reporAcucar(int acucar) {
		if (acucar + getQtAcucar() > RESERV_MAX) {
			JOptionPane.showMessageDialog(null, "Tanque cheio!");
		} else {
			reporAcucar(acucar);
			desbloquear();
		}
	}

	public void reporLeiteEmPo(int leiteEmPo) {
		if (leiteEmPo + getQtLeiteEmPo() > RESERV_MAX) {
			JOptionPane.showMessageDialog(null, "Tanque cheio!");
		} else {
			reporLeiteEmPo(leiteEmPo);
			desbloquear();
		}
	}

	public void reporAchocolatado(int achocolatado) {
		if (achocolatado + getQtAchocolatado() > RESERV_MAX) {
			JOptionPane.showMessageDialog(null, "Tanque cheio!");
		} else {
			reporAchocolatado(achocolatado);
			desbloquear();
		}
	}

	/*-------- CONSUMO DE INGREDIENTES --------*/
	public void usarCafe(int cafe) {
		if (cafe + getQtCafe() < RESERV_MIN) {
			JOptionPane.showMessageDialog(null, "Não há café suficiente!\nComplete o refil...");
			bloquear();
		} else {
			consumirCafe(cafe);
		}
	}

	public void usarAcucar(int acucar) {
		if (acucar + getQtAcucar() < RESERV_MIN) {
			JOptionPane.showMessageDialog(null, "Não há açúcar suficiente!\nComplete o refil.");
			bloquear();
		} else {
			consumirAcucar(acucar);
		}
	}

	public void usarLeiteEmPo(int leiteEmPo) {
		if (leiteEmPo + getQtLeiteEmPo() < RESERV_MIN) {
			JOptionPane.showMessageDialog(null, "Não há leite em pó suficiente!\nComplete o refil.");
			bloquear();
		} else {
			consumirLeiteEmPo(leiteEmPo);
		}
	}

	public void usarAchocolatado(int achocolatado) {
		if (achocolatado + getQtAchocolatado() < RESERV_MIN) {
			JOptionPane.showMessageDialog(null, "Não há achocolatado suficiente!\nComplete o refil.");
			bloquear();
		} else {
			consumirAchocolatado(achocolatado);
		}
	}

	/*--------CONTROLE DE CONSUMO --------*/
	public void consumirCafe(int qtCafe) {
		setQtCafe(getQtCafe() - qtCafe);
	}

	public void consumirAcucar(int qtAcucar) {
		setQtAcucar(getQtAcucar() - qtAcucar);
	}

	public void consumirLeiteEmPo(int qtLeiteEmPo) {
		setQtLeiteEmPo(getQtLeiteEmPo() - qtLeiteEmPo);
	}

	public void consumirAchocolatado(int qtAchocolatado) {
		setQtAchocolatado(getQtAchocolatado() - qtAchocolatado);
	}

	/*-------- GETTERS E SETTERS --------*/
	public int getQtCafe() {
		return qtCafe;
	}

	public int getQtAcucar() {
		return qtAcucar;
	}

	public int getQtLeiteEmPo() {
		return qtLeiteEmPo;
	}

	public int getQtAchocolatado() {
		return qtAchocolatado;
	}

	public void setQtCafe(int qtCafe) {
		Reservatorio.qtCafe = qtCafe;
	}

	public void setQtAcucar(int qtAcucar) {
		Reservatorio.qtAcucar = qtAcucar;
	}

	public void setQtLeiteEmPo(int qtLeiteEmPo) {
		Reservatorio.qtLeiteEmPo = qtLeiteEmPo;
	}

	public void setQtAchocolatado(int qtAchocolatado) {
		Reservatorio.qtAchocolatado = qtAchocolatado;
	}

	/* FUNCOES DE BLOQUEIO (caso não haja ingredientes) */
	public boolean isBloqueada() {
		return Reservatorio.isBloqueado;
	}

	public void bloquear() {
		Reservatorio.isBloqueado = true;
	}

	public void desbloquear() {
		Reservatorio.isBloqueado = false;
	}

}
