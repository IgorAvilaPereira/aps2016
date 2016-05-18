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
public abstract class Bebida {

    protected String descricao;
    protected double quantidade;

    public double getQuantidade() {
        return quantidade;
    }

    public double custoTotal() {
        if (this.quantidade == 2) {
            return (this.custo()) * 0.6;
        }
        if (this.quantidade == 3) {
            return (this.custo()) * 0.4;
        }
        if (this.quantidade > 3) {
            return (this.custo()) * 0.5;
        }
        return custo();
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public abstract double custo();

}
