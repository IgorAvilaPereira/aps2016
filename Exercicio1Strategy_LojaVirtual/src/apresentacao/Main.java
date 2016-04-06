/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Boleto;
import negocio.CartaoCredito;
import negocio.Dvd;
import negocio.Liquidacao;
import negocio.Regular;

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
        Dvd dvd = new Dvd();
        dvd.setNome("Engenheiros do Hawaii");
        dvd.setPreco(10);
        dvd.setPromocao(new Regular());
        dvd.setFormaPagamento(new Boleto ());
        dvd.getFormaPagamento().modo();
        System.out.println("Preço do dvd com promoção regular:" + dvd.getPreco());
        
        dvd.setPromocao(new Liquidacao());
        dvd.setFormaPagamento(new CartaoCredito());
        dvd.getFormaPagamento().modo();
        System.out.println("Preço do dvd com promoção liquidacao:" + dvd.getPreco());
        
        
    }
    
}
