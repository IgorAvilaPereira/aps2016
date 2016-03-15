/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.subject;

import negocio.observadores.Cliente;
import java.util.ArrayList;
import negocio.observadores.ClientePreferencial;

/**
 *
 * @author iapereira
 */
public class Painel implements Subject{
    private double caixaLivre;    
    
    private ArrayList<Cliente> vet;
    private ArrayList<ClientePreferencial> vetPreferencial;
    
    public Painel(){
        this.vet = new ArrayList();
        this.vetPreferencial = new ArrayList();
    }
    
    public void changeState(int caixaLivre){
        this.caixaLivre = caixaLivre;
        notifyObservers();
    }
    

    @Override
    public void subscribeCliente(Cliente observer) {
        this.vet.add(observer);
    }

    @Override
    public void unscribeCliente(int i) {
        this.vet.remove(i);
    }

    @Override
    public void notifyObservers() {
        if (this.vetPreferencial.size() > 0){
            for (int i = 0; i < vetPreferencial.size(); i++) {
                ClientePreferencial preferencial = vetPreferencial.get(i);
                preferencial.update(caixaLivre);               
            }
        } else {
            for (int i = 0; i < vet.size(); i++) {
                Cliente cliente = vet.get(i);
                cliente.update(this.caixaLivre);
            }   
        }
    }

    @Override
    public void subscribeClientePreferencial(ClientePreferencial clientePreferencial) {
        this.vetPreferencial.add(clientePreferencial);
    }

    @Override
    public void unscribeClientePreferencial(int i) {
        this.vetPreferencial.remove(i);
    }
    
    
}
