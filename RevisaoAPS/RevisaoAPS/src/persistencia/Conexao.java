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

    private String host;
    private String porta;
    private String usuario;
    private String senha;
    private String banco;

    public Conexao() {
        this.banco = "restaurante";
        this.host = "localhost";
        this.porta = "5432";
        this.usuario = "postgres";
        this.senha = "postgres";
    }

    public Connection getConexao() {
        String url = "jdbc:postgresql://" + this.host + ":" + this.porta + "/" + this.banco;
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Deu xabum....na conexao");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
