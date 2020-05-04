package model;

import javax.swing.JOptionPane;

import view.MenuOpcoes;

/**
 * @author amaranth.rosa
 */
public class MaquinaDeLavar {

	private int sabaoLiquidoML;
	private int sabaoEmPoGR;
	private int roupasKG;

	Reservatorio tanqueLavagem = new Reservatorio("kg");
	Reservatorio tanqueSabaoEmPo = new Reservatorio("gr");
	Reservatorio tanqueSabaoLiquido = new Reservatorio("ml");

	public void lavagemCompleta() {
		String qtSabaoLq;
		String qtSabaoPo;
		String qtRoupa;

		qtSabaoLq = MenuOpcoes.selecionarQtSabaoLq();
		while (Integer.parseInt(qtSabaoLq) > 25 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido.");
			qtSabaoLq = MenuOpcoes.selecionarQtSabaoLq();
		}

		qtSabaoPo = MenuOpcoes.selecionarQtSabaoPo();
		while (Integer.parseInt(qtSabaoPo) > 50 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido.");
			qtSabaoPo = MenuOpcoes.selecionarQtSabaoPo();
		}

		qtRoupa = MenuOpcoes.selecioarQtRoupa();
		while (Integer.parseInt(qtRoupa) > 10 || Integer.parseInt(qtSabaoLq) < 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido.");
			qtRoupa = MenuOpcoes.selecioarQtRoupa();
		}

		setSabaoLiquidoML(Integer.parseInt(qtSabaoLq));
		setSabaoEmPoGR(Integer.parseInt(qtSabaoPo));
		setRoupasKG(Integer.parseInt(qtRoupa));

		/* MOSTRA PROCESSO DE LAVAGEM */
		System.out.println("Agurade enquanto o processo de lavagem está em andamento..." + "\n\n");
		for (int i = 80; i >= 0; i--) {
			try {
				System.out.println("Minutos restantes: " + i);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		JOptionPane.showMessageDialog(null, "Lavagem completa, suas roupas estão prontas para ser retiradas.");

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
