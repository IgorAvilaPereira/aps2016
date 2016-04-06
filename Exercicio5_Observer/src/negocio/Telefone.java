package negocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iapereira
 */
public class Telefone {
    protected boolean tocou;
    protected ArrayList<IObservador> vetObservadores;

    public Telefone(){
        this.tocou = false;
        this.vetObservadores =  new ArrayList();
    }
    
    public boolean isTocou() {
        return tocou;
    }

    public void changeState(boolean tocou) {
        this.tocou = tocou;
        this.notificaObservadores();
    }

    public void addObservador(IObservador iObservador){
        this.vetObservadores.add(iObservador);
    }
    
    public void removeObservador(int i){
        this.vetObservadores.remove(i);
    }
    
    
    private void notificaObservadores(){
        for (int i = 0; i < vetObservadores.size(); i++) {
            IObservador observador = vetObservadores.get(i);
            observador.avisarToque(this.tocou);
            
        }
    }
    
    
    
    
    
    
    
    
    
}
