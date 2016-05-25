/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.BibliotecaMatematica;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BibliotecaMatematica  biblioteca = new BibliotecaMatematica();
        System.out.println("2x3="+biblioteca.multiplicacao(2, 3));

    }
    
}
