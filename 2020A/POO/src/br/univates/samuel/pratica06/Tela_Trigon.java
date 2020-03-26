package br.univates.samuel.pratica06;

import br.univates.samuel.Entrada;
import br.univates.samuel.pratica06.triangulo.Triangulo;

/**
 *
 * @author Robert
 */
public class Tela_Trigon {

	Triangulo trig = new Triangulo();
	// Retangulo retang = new Retangulo();
	// Circunferencia circun = new Circunferencia();
	double l1;
	double l2;
	double l3;
	double raio;
	String saida;

	public void exibir() {
		char op = ' ';
		while (Character.toLowerCase(op) != 'x') {
			op = Entrada.leiaChar("M E N U\n\n" + "[1] Triangulo\n" + "[2] Retangulo\n" + "[3] Circunferência\n"
					+ "[x] Sair do sistema");

			if (op == '1') {
				l1 = Entrada.leiaDouble("informe Lado 1");
				l2 = Entrada.leiaDouble("informe Lado 2");
				l3 = Entrada.leiaDouble("informe Lado 3");
				trig.definirLados(l1, l2, l3);
				trig.calcularPerimetro();
				trig.calculaAreaTriangRet();
				saida = Entrada.leiaString("Perimetro do Triangulo:" + trig.retornarPerimetro() + "\nTipo Triangulo: "
						+ trig.tipoTriangulo() + "\nArea : " + trig.retornaAreaTriangRet() + "\n\nOK para continuar");
			}

			else if (op == '2') {
				l1 = Entrada.leiaDouble("informe Lado 1");
				l2 = Entrada.leiaDouble("informe Lado 2");

			}

			else if (op == '3') {

			}

			else {
				System.out.println("Opção não encontrada, digite uma das alternativas válidas");
			}

		}
	}

}
