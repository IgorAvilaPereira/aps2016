/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;

/**
 *
 * @author iapereira
 */
public class MalaDiretaCSV extends MalaDireta {
    private String nomeArquivo;

    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    

    @Override
    public Contatos criaContatos() {
        return new ContatoXML(nomeArquivo);
    }

   
    
}
