/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.MalaDireta;
import negocio.MalaDiretaXML;

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
        MalaDireta malaDireta =  new MalaDiretaXML("contatos.xml");
        malaDireta.enviarEmail("Enviando mensagem....");
    }
    
}
