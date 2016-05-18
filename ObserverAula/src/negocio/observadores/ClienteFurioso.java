/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.observadores;

import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class ClienteFurioso implements Cliente {

    @Override
    public void update(double caixaLivre) {
        System.out.println("Cliente furioso ficou sabendo que a caixa:"+caixaLivre+" esta liberada...");
    }
    
    
}
