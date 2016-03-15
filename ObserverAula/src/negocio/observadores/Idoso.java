/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.observadores;

/**
 *
 * @author iapereira
 */
public class Idoso implements ClientePreferencial{

    @Override
    public void update(double caixaLivre) {
        System.out.println("Sou idoso. E daí?!!?!? a caixa livre eh minha");
    }
    
}
