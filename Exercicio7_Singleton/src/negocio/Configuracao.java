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
public class Configuracao {
    private static Configuracao configuracao;
    
    private String nome;
    
    private Configuracao(){
        
    }
        
    public synchronized static Configuracao getInstance(){
        if (configuracao == null){
            configuracao = new Configuracao();
        }
        return configuracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
}
