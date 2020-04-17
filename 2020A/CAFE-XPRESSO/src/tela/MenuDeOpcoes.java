/**
 * 
 */
package tela;

import javax.swing.JOptionPane;

import classes.Receita;
import classes.Reservatorio;

/**
 * @author amaranth.rosa
 *
 */
public class MenuDeOpcoes {

	String menuOp;
	String menuOp2;
	String tamanhoCafeOp;
	String acucarOp;

	String msgPronto = "Sua bebida está pronta!";
	String msgErro = "Desculpe, não foi possível preparar... :(";

	private boolean isAcucar;
	private boolean isGrande;

	public void exibir() {
		menuOp = "";

		menuOp = JOptionPane.showInputDialog("Escolha a opção desejada:\n\n" + "[1] Café curto\n" + "[2] Café longo\n"
				+ "[3] Café com leite\n" + "[4] Achocolatado\n" + "[5] Capuccino\n\n");

		tamanhoCafeOp = JOptionPane
				.showInputDialog("Desja uma porção grande ou pequena?\n\n" + "[1] Pequena\n" + "[2] Grande\n\n");

		acucarOp = JOptionPane
				.showInputDialog("Deseja utilizar açúcar?\n\n" + "[1] Sem açúcar\n" + "[2] Com açúcar\n\n");

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
			JOptionPane.showMessageDialog(null, "Opção escolhida não é válida.");
			TelaDeExibicao.chamarMenu();
			break;
		}

	}

	public void manutencao() {
		String qt = "";
		Reservatorio rsvt = new Reservatorio();

		menuOp2 = JOptionPane.showInputDialog("Escolha a opção desejada:\n\n" + "[1] Repor café\n"
				+ "[2] Repor açúcar\n" + "[3] Repor leite em pó\n" + "[4] Repor achocolatado\n" + "[5] Voltar\n\n");

		switch (menuOp2) {
		case "1":
			qt = JOptionPane.showInputDialog("Informe a quantidade (em gramas) de café: ");
			rsvt.reporCafe(Integer.parseInt(qt));

			TelaDeExibicao.chamarManutencao();
			break;
		case "2":
			qt = JOptionPane.showInputDialog("Informe a quantidade (em gramas) de açúcar: ");
			rsvt.reporAcucar(Integer.parseInt(qt));

			TelaDeExibicao.chamarManutencao();
			break;
		case "3":
			qt = JOptionPane.showInputDialog("Informe a quantidade (em gramas) de leite em pó: ");
			rsvt.reporLeiteEmPo(Integer.parseInt(qt));

			TelaDeExibicao.chamarManutencao();
			break;
		case "4":
			qt = JOptionPane.showInputDialog("Informe a quantidade (em gramas) de achocolatado: ");
			rsvt.reporAchocolatado(Integer.parseInt(qt));

			TelaDeExibicao.chamarManutencao();
			break;
		case "5":
			TelaDeExibicao.principal();
		default:
			JOptionPane.showMessageDialog(null, "Opção escolhida não é válida.");
			TelaDeExibicao.chamarManutencao();
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
