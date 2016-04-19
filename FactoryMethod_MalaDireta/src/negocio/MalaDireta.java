package negocio;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iapereira
 */
public abstract class MalaDireta {
    public abstract Contatos criaContatos();
    
    public boolean enviarEmail(String mensagem){
        List<Contato> vetContato = this.criaContatos().todos();
        for (int i = 0; i < vetContato.size(); i++) {
            Contato contato = vetContato.get(i);
            System.out.printf("%s <%s>", contato.getNome(), contato.getEmail());            
        }
        return true;
    }
    
}
