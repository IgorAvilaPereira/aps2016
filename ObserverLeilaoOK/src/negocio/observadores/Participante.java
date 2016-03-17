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
public class Participante implements IParticipante{
    private String nome;
    private double lance;

    public Participante(){
        this.lance = 0;
    }
    
    @Override
    public double getLance() {
        return this.lance;
    }

    @Override
    public void setLance(double lance) {
        this.lance = lance;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(IParticipante vencedor) {
        System.out.println(this.nome+": ficou sabendo que "+vencedor.getNome()+" eh o vencedor no momento porque deu o seguinte lance:"+vencedor.getLance());
    }

   
    
}
