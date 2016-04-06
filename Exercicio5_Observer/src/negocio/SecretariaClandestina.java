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
public class SecretariaClandestina implements IObservador{

    @Override
    public void avisarToque(boolean tocou) {
        System.out.println("SecretariaClandestina ficou sabendo do novo estado do telefone:"+tocou);
    }
    
}
