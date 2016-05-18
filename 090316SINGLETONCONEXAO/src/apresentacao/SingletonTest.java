/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.Conexao;
import persistencia.ConexaoParametro;

/**
 *
 * @author aluno
 */
public class SingletonTest {
    public static void main(String[] args) throws SQLException {
        System.out.println("Criando conexao1...");
        System.out.println(Conexao.getInstance(new ConexaoParametro()).toString());
        
        System.out.println("Criando outra conexao2...");
        System.out.println(Conexao.getInstance(new ConexaoParametro()).toString());
        
        PreparedStatement selectSQL = Conexao.getInstance(new ConexaoParametro()).prepareStatement("SELECT * FROM teste");
        ResultSet result = selectSQL.executeQuery();
        while (result.next()){
            System.out.println("Nome:"+result.getString("nome"));
        }
    }
}
