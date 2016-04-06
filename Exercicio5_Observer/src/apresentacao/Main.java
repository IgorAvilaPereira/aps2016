/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Pessoa;
import negocio.SecretariaClandestina;
import negocio.Telefone;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telefone telefone =  new Telefone();
        telefone.addObservador(new Pessoa());
        telefone.addObservador(new SecretariaClandestina());
        telefone.changeState(true);
        
        System.out.println("--------------------------------");
        System.out.println("Mudando o estado novamente...");
        System.out.println("--------------------------------");
        telefone.changeState(false);
        
        
    }
    
}
