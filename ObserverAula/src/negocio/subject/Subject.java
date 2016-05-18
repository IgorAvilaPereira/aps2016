/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.subject;

import negocio.observadores.Cliente;
import negocio.observadores.ClientePreferencial;

/**
 *
 * @author iapereira
 */
public interface Subject {
    public void subscribeCliente(Cliente observer);
    public void unscribeCliente(int i);
    
    public void subscribeClientePreferencial(ClientePreferencial clientePreferencial);
    public void unscribeClientePreferencial(int i);
    //public void notifyObservers();
    
    public void notifyObservers();
    
}
