/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author amaranth.rosa
 */
public class CamaroteSuperior extends Camarote {

    public CamaroteSuperior(Ingresso ingresso) {
        super(ingresso);
    }    
    
    public double valorIngresso() {
        return super.getIngresso().valorIngresso()* (1.5);
    }
    
}
