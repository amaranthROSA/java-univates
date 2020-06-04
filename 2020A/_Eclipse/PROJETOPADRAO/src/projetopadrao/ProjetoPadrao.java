/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao;


import projetopadrao.negocio.Cliente;
import projetopadrao.persistencia.ClienteDao;



/**
 *
 * @author Robert
 */
public class ProjetoPadrao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDao.Recupera();
        
                        
        Cliente cli1 = new Cliente("Zeninguem","rua das flores","1232345","Jardim bonito");
        Cliente cli2 = new Cliente("Mariabolacha","rua das dores","543345532","Murisoca");
        
                
        ClienteDao.create(cli1);
        ClienteDao.create(cli2);        
        
        
        ClienteDao.Salva();
        
        
        
         System.exit(0);
         
        /*
        
        String texto = "";
        String linha = "";
                
        Arquivo arqsaida = new Arquivo("c:\\temp\\teste-saida.txt");
        arqsaida.abrirEscrita();
        
        Arquivo arq = new Arquivo("c:\\temp\\teste.txt");
        arq.abrirLeitura();
        linha = arq.lerLinha();
        while (linha != null)
        {
            //texto = texto + linha + "\n";
            arqsaida.escreverLinha(linha);
            linha = arq.lerLinha();
        }
        
        arq.fecharArquivo();
        arqsaida.fecharArquivo();
        
//        System.out.println(texto);
        
        System.exit(0);
        
        */
   
        
    }

}
