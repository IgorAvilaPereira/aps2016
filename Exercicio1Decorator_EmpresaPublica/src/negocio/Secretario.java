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
public class Secretario extends Incorporado {
    
    public Secretario(Cargo prox) {
        super(prox);
        this.nome = "Secretario";
        this.salario = 2000;
    }
    
}
