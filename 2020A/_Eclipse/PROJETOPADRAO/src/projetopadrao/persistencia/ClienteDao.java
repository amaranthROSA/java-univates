/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.persistencia;

import java.util.ArrayList;
import projetopadrao.apresentacao.Arquivo;
import projetopadrao.negocio.Cliente;

/**
 *
 * @author Robert
 */
public class ClienteDao {

private static ArrayList<Cliente> a_clientes = new ArrayList();
    
    public static void create(Cliente cliente) 
    {        
        //corrent.setCodigo(a_correntistas.size()); 
        a_clientes.add(cliente);
              
    }
    
    public static Cliente getCliente(int i)
    {
        return a_clientes.get(i);        
    }
    
    public static int tamanho()
    {
        return a_clientes.size();
    }
    
    public static ArrayList<Cliente> readAll()
    {
        return a_clientes;
    }    
    
    public static void Salva()
    {
        String linha = "";
                
        Arquivo arqsaida = new Arquivo("c:\\temp\\clientes.txt");
        arqsaida.abrirEscrita();
        for (Cliente cli: a_clientes) {
             linha = cli.getNome() + ";" + cli.getEndereco() + ";" + cli.getTelefone() + ";" + cli.getCidade();
             arqsaida.escreverLinha(linha);
                }
        arqsaida.fecharArquivo();                
    }
    public static void Recupera()
    {
        a_clientes.clear();
        String linha ;
        String dados[] = new String[4];       
        Cliente cli;
        Arquivo arq = new Arquivo("c:\\temp\\clientes.txt");
        arq.abrirLeitura();
        linha = arq.lerLinha();
        while (linha != null)
        {
            dados = linha.split(";");
            cli = new Cliente(dados[0],dados[1],dados[2],dados[3]);
            ClienteDao.create(cli);
            
            linha = arq.lerLinha();
        }
        arq.fecharArquivo();
        
    }
    
    
    
    
}
