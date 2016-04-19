/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iapereira
 */
public class ContatoXML implements Contatos{

   private String nomeArquivo;

    public ContatoXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
   
   
    
    @Override
    public List<Contato> todos() {
        System.out.println("Extraindo informações do XML.....");
        
        List<Contato> vetContato = new ArrayList();
        vetContato.add(new Contato("Igor","igor.pereira@riogrande.ifrs.edu.br"));        
        return vetContato;
    }
    
}
