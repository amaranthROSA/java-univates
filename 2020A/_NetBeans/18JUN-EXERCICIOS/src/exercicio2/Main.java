/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author amaranth.rosa
 */
public class Main {
    
    private static Imovel sobrado;
    private static Imovel chacara;
    
    public static void sobrado() {
        sobrado = new Imovel();
    }
    
    public static void chacara() {
        chacara = new Imovel();
    }
    
    public static void main(String[] args) {
        
        sobrado();
        chacara();
        
    }
}
