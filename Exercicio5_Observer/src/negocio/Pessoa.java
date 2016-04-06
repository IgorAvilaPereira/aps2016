/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa implements IObservador {

    @Override
    public void avisarToque(boolean tocou) {
         System.out.println("Pessoa ficou sabendo que o telefone mudou de estado:"+tocou);
    }
    
}
