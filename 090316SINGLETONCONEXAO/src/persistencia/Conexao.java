/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class Conexao {
    private static Connection connection;

    private Conexao() {
    }

    public static synchronized Connection getInstance(ConexaoParametro parametro) {
        if (connection == null) {
            String url = "jdbc:postgresql://" + parametro.getHost() + ":" + parametro.getPorta() + "/" + parametro.getBanco();
            try {
                connection = DriverManager.getConnection(url, parametro.getUsuario(), parametro.getSenha());
            } catch (SQLException ex) {
                System.out.println("Deu xabum....na conexao");
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return connection;
    }

}
