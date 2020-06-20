/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author amaranth.rosa
 */
public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    

}
