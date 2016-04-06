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
public abstract class Incorporado extends Cargo {
    protected Cargo prox;
    protected double base;

    public Incorporado(Cargo prox){
        this.prox = prox;
        this.base = 1000;
    }
    
    public Cargo getProx() {
        return prox;
    }

    public void setProx(Cargo prox) {
        this.prox = prox;
    }
    
    
    @Override
    public double getSalario(){
        return super.getSalario() + this.prox.salario + base;
    }
    
    
    @Override
    public String getNome(){
        return super.getNome() + " " + this.prox.getNome();
    }
    
    
}
