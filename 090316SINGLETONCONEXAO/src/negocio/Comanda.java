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
    private int id;
    private ArrayList<Bebida> vetBebida;
    private Prato prato;
    private boolean tem10Porcento;
    private Sobremesa sobremesa;
    private Salada salada;
    private double total;
    private double desconto;
    private double gorjeta;
    private String garcom;

    public Comanda(int id, ArrayList<Bebida> vetBebida, Prato prato, 
            boolean tem10Porcento, Sobremesa sobremesa, Salada salada, double desconto, String garcom) {
        this.id = id;
        this.vetBebida = vetBebida;
        this.prato = prato;
        this.tem10Porcento = tem10Porcento;
        this.sobremesa = sobremesa;
        this.salada = salada;
        this.desconto = desconto;
        this.garcom = garcom;
    }

    public String getGarcom() {
        return garcom;
    }

    public void setGarcom(String garcom) {
        this.garcom = garcom;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        double total = prato.getPreco() + sobremesa.getPreco() + salada.getNomeSaladas().size() - desconto;
        for (Bebida vetBebida1 : vetBebida) {
            total = total + vetBebida1.getPreco() * vetBebida1.getQuantidade();
        }
        
        if (tem10Porcento){
            gorjeta = total * 0.1;
            total = total * 1.1;
        }
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Bebida> getVetBebida() {
        return vetBebida;
    }

    public void setVetBebida(ArrayList<Bebida> vetBebida) {
        this.vetBebida = vetBebida;
    }

    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Sobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }

    public Salada getSalada() {
        return salada;
    }

    public void setSalada(Salada salada) {
        this.salada = salada;
    }
    
    public boolean isTem10Porcento() {
        return tem10Porcento;
    }

    public void setTem10Porcento(boolean tem10Porcento) {
        this.tem10Porcento = tem10Porcento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }

    
    
    
    
    
}
