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
public class Onibus extends Veiculo {
      private int assentos;
    
    public Onibus(int assentos, String placa, int ano) {
       super(placa, ano);
        setAssentos(assentos);
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
}
