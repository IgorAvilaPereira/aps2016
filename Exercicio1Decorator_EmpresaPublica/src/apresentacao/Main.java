/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Auxiliar;
import negocio.Cargo;
import negocio.Vereador;

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
        
        Cargo auxiliar = new Auxiliar("Igor");
        auxiliar = new Vereador(auxiliar);
        System.out.println(auxiliar.getNome() + " R$ "+auxiliar.getSalario());
        
    }
    
}
