/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author amaranth.rosa
 */
public class TryCatch {
    public static void main(String[] args) {
    
    int x = 0;
    int y = 10;
    
    try  {
        
        System.out.println(y/x);
        
    } catch(ArithmeticException art) {
       art.printStackTrace();
    
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }
}
