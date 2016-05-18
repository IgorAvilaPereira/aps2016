/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Relatorio;
import negocio.RelatorioLabs;
import negocio.RelatorioProfessores;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Relatorio de Professores....");
        Relatorio relatorioProfessores =  new RelatorioProfessores();
        relatorioProfessores.exibir();
        System.out.println("----------------------");
        
        System.out.println("Relatorio de Labs....");
        Relatorio relatorioLabs = new RelatorioLabs();
        relatorioLabs.exibir();
    }
    
}
