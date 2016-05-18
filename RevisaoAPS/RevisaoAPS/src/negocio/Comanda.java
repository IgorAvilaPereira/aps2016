/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Comanda {
    private int numero;
    private Cliente cliente;
    private Garcom garcom;
    private ArrayList<Bebida> vetBebida;
    private ArrayList<Prato> vetPrato;
    private boolean tem10Porcento;

    public Comanda() {
        this.tem10Porcento = true;
        this.vetBebida =  new ArrayList();
        this.vetPrato = new ArrayList();
    }

    public boolean isTem10Porcento() {
        return tem10Porcento;
    }

    public void setTem10Porcento(boolean tem10Porcento) {
        this.tem10Porcento = tem10Porcento;
    }

    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public ArrayList<Bebida> getVetBebida() {
        return vetBebida;
    }

    public void setVetBebida(ArrayList<Bebida> vetBebida) {
        this.vetBebida = vetBebida;
    }

    public ArrayList<Prato> getVetPrato() {
        return vetPrato;
    }

    public void setVetPrato(ArrayList<Prato> vetPrato) {
        this.vetPrato = vetPrato;
    }

    public double obtemTotal() {
        double total = 0;
        for (int i = 0; i < vetBebida.size(); i++) {
            Bebida bebida = vetBebida.get(i);
            total+= bebida.getPreco();
            
        }
        
        for (int i = 0; i < vetPrato.size(); i++) {
            Prato prato = vetPrato.get(i);
            total+= prato.getValor();
            
        }
        
        if (tem10Porcento) return total*1.10;
        
        return total;
    }
    
    
    
    
}
