/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.subject;

import negocio.observadores.IParticipante;

/**
 *
 * @author iapereira
 */
public interface Leilao {
    public void adicionarParticipante(IParticipante observer);
    public void removerParticipante(int i);    
    public void avisarParticipantes();
    public void darLance(IParticipante novoParticipante);
    public IParticipante getVencedor();
    
}
