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
public class CartaoCredito implements FormaPagamento{

    @Override
    public void modo() {
        System.out.println("Selecionado forma de pagamento, cartão de crédito.");
    }
    
}
