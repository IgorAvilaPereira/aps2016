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
public class Prefeito extends Incorporado {
    
    public Prefeito(Cargo prox) {
        super(prox);
        this.nome = "Prefeito";
        this.salario = 4000;
    }
    
    
}
