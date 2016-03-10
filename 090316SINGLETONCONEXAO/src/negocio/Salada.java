/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author Enki
 */
public class Salada {
    private ArrayList<String> nomeSaladas = new ArrayList<>(); 

    public ArrayList<String> getNomeSaladas() {
        return nomeSaladas;
    }

    public void setNomeSaladas(ArrayList<String> nomeSaladas) {
        this.nomeSaladas = nomeSaladas;
    }
    
    public void adicionarSalada(String s){
        nomeSaladas.add(s);
    }
}