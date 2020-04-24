package model;

import javax.swing.JOptionPane;

import view.MenuOpcoes;

/**
 * @author amaranth.rosa
 */
public class MaquinaDeLavar {

	private final int TEMPO_MIN_TOTAL = 80;

	private int sabaoLiquidoML;
	private int sabaoEmPoGR;
	private int roupasKG;

	Reservatorio tanqueLavagem = new Reservatorio("kg");
	Reservatorio tanqueSabaoEmPo = new Reservatorio("gr");
	Reservatorio tanqueSabaoLiquido = new Reservatorio("ml");

	public void lavagemCompleta() {

		String qtSabaoLq = MenuOpcoes.selecionarQtSabaoLq();
		if (Integer.parseInt(qtSabaoLq) > 25 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido (min 0, max 25)");

		} else {
			setSabaoLiquidoML(Integer.parseInt(qtSabaoLq));
		}

		String qtSabaoPo = MenuOpcoes.selecionarQtSabaoPo();
		if (Integer.parseInt(qtSabaoPo) > 50 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido (min 0, max 50)");

		} else {
			setSabaoEmPoGR(Integer.parseInt(qtSabaoPo));
		}

		String qtRoupa = MenuOpcoes.selecioarQtRoupa();
		if (Integer.parseInt(qtRoupa) > 10 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido (min 0, max 10)");
		} else {
			setRoupasKG(Integer.parseInt(qtRoupa));
		}
	}

	public int getRoupasKG() {
		return roupasKG;
	}

	public void setRoupasKG(int roupasKG) {
		this.roupasKG = roupasKG;
	}

	public int getSabaoLiquidoML() {
		return sabaoLiquidoML;
	}

	public void setSabaoLiquidoML(int sabaoLiquidoML) {
		this.sabaoLiquidoML = sabaoLiquidoML;
	}

	public int getSabaoEmPoGR() {
		return sabaoEmPoGR;
	}

	public void setSabaoEmPoGR(int sabaoEmPoGR) {
		this.sabaoEmPoGR = sabaoEmPoGR;
	}

}
