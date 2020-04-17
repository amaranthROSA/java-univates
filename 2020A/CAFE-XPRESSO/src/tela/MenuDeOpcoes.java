/**
 * 
 */
package tela;

import javax.swing.JOptionPane;

import classes.Receita;

/**
 * @author amaranth.rosa
 *
 */
public class MenuDeOpcoes {

	String menuOp;
	String tamanhoCafeOp;
	String acucarOp;

	String msgPronto = "Sua bebida est� pronta!";
	String msgErro = "Desculpe, n�o foi poss�vel preparar... :(";

	private boolean isAcucar;
	private boolean isGrande;

	public void exibir() {

		menuOp = JOptionPane.showInputDialog("Escolha a op��o desejada:\n\n" + "[1] Caf� curto\n" + "[2] Caf� longo\n"
				+ "[3] Caf� com leite\n" + "[4] Achocolatado\n" + "[5] Capuccino\n" + "[x] Encerrar\n\n");

		tamanhoCafeOp = JOptionPane
				.showInputDialog("Desja uma por��o grande ou pequena?\n\n" + "[1] Pequena\n" + "[2] Grande\n\n");

		acucarOp = JOptionPane
				.showInputDialog("Deseja utilizar a��car?\n\n" + "[1] Sem a��car\n" + "[2] Com a��car\n\n");

		setIsAcucar();
		setIsGrande();

		switch (menuOp) {
		case "1":
			prepararCafeCurto();
			break;
		case "2":
			prepararCafeLongo();
			break;
		case "3":
			prepararCafeComLeite();
			break;
		case "4":
			prepararAchocolatado();
			break;
		case "5":
			prepararCapuccino();
			break;
		default:
			break;
		}

	}

	public void prepararCafeCurto() {
		Receita bebida = new Receita(getIsAcucar(), getIsGrande());
		bebida.prepararCafeCurto();

		if (bebida.isCafePronto() == true)
			JOptionPane.showMessageDialog(null, msgPronto);
		else
			JOptionPane.showMessageDialog(null, msgErro);

	}

	public void prepararCafeLongo() {
		Receita bebida = new Receita(getIsAcucar(), getIsGrande());
		bebida.prepararCafeLongo();

		if (bebida.isCafePronto() == true)
			JOptionPane.showMessageDialog(null, msgPronto);
		else
			JOptionPane.showMessageDialog(null, msgErro);

	}

	public void prepararCafeComLeite() {
		Receita bebida = new Receita(getIsAcucar(), getIsGrande());
		bebida.prepararCafeComLeite();

		if (bebida.isCafePronto() == true)
			JOptionPane.showMessageDialog(null, msgPronto);
		else
			JOptionPane.showMessageDialog(null, msgErro);

	}

	public void prepararAchocolatado() {
		Receita bebida = new Receita(getIsAcucar(), getIsGrande());
		bebida.prepararAchocolatado();

		if (bebida.isCafePronto() == true)
			JOptionPane.showMessageDialog(null, msgPronto);
		else
			JOptionPane.showMessageDialog(null, msgErro);

	}

	public void prepararCapuccino() {
		Receita bebida = new Receita(getIsAcucar(), getIsGrande());
		bebida.prepararCapuccino();

		if (bebida.isCafePronto() == true)
			JOptionPane.showMessageDialog(null, msgPronto);
		else
			JOptionPane.showMessageDialog(null, msgErro);

	}

	public void setIsAcucar() {
		if (this.acucarOp.equals("1"))
			this.isAcucar = false;
		else
			this.isAcucar = true;
	}

	public boolean getIsAcucar() {
		return this.isAcucar;
	}

	public void setIsGrande() {
		if (this.tamanhoCafeOp.equals("1"))
			this.isGrande = false;
		else
			this.isGrande = true;
	}

	public boolean getIsGrande() {
		return this.isGrande;
	}

}
