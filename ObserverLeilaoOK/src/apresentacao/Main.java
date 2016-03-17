/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.observadores.Participante;
import negocio.subject.Leiloeiro;

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
        Leiloeiro leiloeiro = new Leiloeiro();
        
        Participante igor = new Participante();
        igor.setNome("Igor");
        Participante mauricio = new Participante();
        mauricio.setNome("Mauricio");
        
        leiloeiro.adicionarParticipante(igor);
        leiloeiro.adicionarParticipante(mauricio);
                
        
        
        System.out.println("Igor deu o seu lance....");
        igor.setLance(1000);
        leiloeiro.darLance(igor);
        System.out.println("--------------------------------");
        
        System.out.println("Mauricio deu seu lance. e esse lance eh o lance vencedor");
        mauricio.setLance(1600);        
        leiloeiro.darLance(mauricio);       
        
        
        System.out.println("--------------------");
        
        System.out.println("Leiloeiro dizendo: Vencedor:"+leiloeiro.getVencedor().getNome()+" devido ao lance de "+leiloeiro.getVencedor().getLance());
        
        
        
        
    }
    
}
