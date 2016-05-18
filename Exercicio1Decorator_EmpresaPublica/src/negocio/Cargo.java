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
public abstract class Cargo {
    protected String nome;
    protected double salario;
    protected double inicial;
    
    public Cargo(){
        this.inicial =  1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario + inicial;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
    
    
    
    
    
}
