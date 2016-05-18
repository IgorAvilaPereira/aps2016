/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.subject;

import negocio.observadores.IParticipante;
import java.util.ArrayList;
import negocio.observadores.Participante;

/**
 *
 * @author iapereira
 */
public class Leiloeiro implements Leilao {

    private IParticipante vencedor;
    private ArrayList<IParticipante> vet;

    public Leiloeiro() {
        this.vet = new ArrayList();
        this.vencedor = new Participante();
    }

    public void darLance(IParticipante novoParticipante) {
        if (novoParticipante.getLance() > vencedor.getLance()) {
            this.vencedor = novoParticipante;
            avisarParticipantes();
        }
    }

    @Override
    public void adicionarParticipante(IParticipante observer) {
        this.vet.add(observer);
    }

    @Override
    public void removerParticipante(int i) {
        this.vet.remove(i);
    }

    @Override
    public void avisarParticipantes() {

        for (int i = 0; i < vet.size(); i++) {
            IParticipante participante = vet.get(i);
            participante.update(this.vencedor);
        }

    }

    @Override
    public IParticipante getVencedor() {
        return this.vencedor;
    }

}
