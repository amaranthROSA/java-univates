package br.univates.samuel.pratica06;

import br.univates.samuel.Entrada;
import br.univates.samuel.pratica06.circulo.Circulo;
import br.univates.samuel.pratica06.retangulo.Retangulo;
import br.univates.samuel.pratica06.triangulo.Triangulo;

/**
 *
 * @author amaranth.rosa
 */
public class Tela_Trigon {

	String saida;

	public void exibir() {
		char op = ' ';
		while (Character.toLowerCase(op) != 'x') {
			op = Entrada.leiaChar("M E N U\n\n" + "[1] Triangulo\n" + "[2] Retangulo\n" + "[3] Circunferência\n"
					+ "[x] Sair do sistema");

			if (op == '1') {
				Triangulo trig = new Triangulo();

				double l1;
				double l2;
				double l3;

				l1 = Entrada.leiaDouble("informe Lado 1");
				l2 = Entrada.leiaDouble("informe Lado 2");
				l3 = Entrada.leiaDouble("informe Lado 3");
				trig.definirLados(l1, l2, l3);
				trig.calcularPerimetro();
				trig.calculaAreaTriangRet();
				saida = Entrada.leiaString("Perimetro do Triangulo:" + trig.retornarPerimetro() + "\nTipo Triângulo: "
						+ trig.tipoTriangulo() + "\nÁrea : " + trig.retornaAreaTriangRet() + "\n\nOK para continuar");
			}

			else if (op == '2') {
				Retangulo retang = new Retangulo();
				double l1 = Entrada.leiaDouble("informe Lado 1");
				double l2 = Entrada.leiaDouble("informe Lado 2");
				retang.defineLados(l1, l2);

				saida = Entrada.leiaString("Perímetro do retângulo: " + retang.calculaPerimetro()
						+ "\nÁrea do retângulo: " + retang.calculaArea());

			}

			else if (op == '3') {
				Circulo circ = new Circulo();
				double raio;
				double diametro;
				int opt = Entrada.leiaChar("1. Informe o raio \n2. Informe o diametro \nx. Cancelar");
				if (opt == '1') {
					raio = Entrada.leiaDouble("Informe o raio: ");
					circ.setRaio(raio);
					saida = Entrada.leiaString("Circunferência do círculo: " + circ.calculaCircunferenciaComRaio());
				} else if (opt == '2') {
					diametro = Entrada.leiaDouble("Informe o diâmetro: ");
					circ.setDiametro(diametro);
					saida = Entrada.leiaString("Circunferência do círculo: " + circ.calculaCircunferenciaComDiametro());

				} else if (opt == 'x') {

				}

			}

			else if (op == 'x') {

			}

			else {
				System.out.println("Opção não encontrada, informe uma das alternativas válidas");
			}

		}
	}

}
