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
public interface IParticipante {
    public double getLance();
    public void setLance(double lance);
    public String getNome();
    public void setNome(String nome);
    public void update(IParticipante vencedor);
    
}
