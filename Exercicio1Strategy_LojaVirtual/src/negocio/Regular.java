/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author iapereira
 */
public class Regular implements Promocao{

    @Override
    public double descontar() {
        Calendar calendar = Calendar.getInstance();
        // se for abril....
        if (calendar.get(Calendar.MONTH) == 3 ){
            return 0.8;
        }
        return 0.9;
    }
    
    
}
