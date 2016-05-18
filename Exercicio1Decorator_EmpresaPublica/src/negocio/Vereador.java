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
public class Vereador extends Incorporado {
    
    public Vereador(Cargo prox) {
        super(prox);
        this.nome = "Vereador";
        this.salario = 5000;
    }
    
}
