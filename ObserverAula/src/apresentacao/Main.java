/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.observadores.ClienteFurioso;
import negocio.observadores.ClientePreferencial;
import negocio.observadores.Gestante;
import negocio.observadores.Idoso;
import negocio.subject.Painel;

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
        Painel painel = new Painel();
       
        painel.subscribeCliente(new ClienteFurioso());
        painel.subscribeClientePreferencial(new Idoso());        
        painel.subscribeClientePreferencial(new Gestante());        
        System.out.println("Tem preferencial...soh eles sao notificados....");
        painel.changeState(34);
        System.out.println("--------------------");
        painel.unscribeClientePreferencial(0);
        painel.unscribeClientePreferencial(0);
        System.out.println("Agora acabou os preferenciais. O furioso, agora sim, será notificado....");
        painel.changeState(67);
    }
    
}
