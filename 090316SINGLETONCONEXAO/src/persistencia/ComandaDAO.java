/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Enki
 */
public class ComandaDAO {
    
    public String pesquisa(String tabela, String pesquisa) throws SQLException {
         Connection conexao = Conexao.getInstance(new ConexaoParametro());
         ResultSet resultSet = conexao.prepareStatement("SELECT preco FROM "+tabela+" where nome = '"+pesquisa+"'; ").executeQuery();
         while (resultSet.next()) {
             return resultSet.getString("preco");
         }
        return "Erro!";
    }
}
