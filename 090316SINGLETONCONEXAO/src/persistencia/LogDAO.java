/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.*;

/**
 *
 * @author Enki
 */
public class LogDAO {

    public boolean inserir(Comanda comanda) throws SQLException {
        boolean resultado = false;
        Connection conexao = Conexao.getInstance(new ConexaoParametro());
        PreparedStatement insert = conexao.prepareStatement("INSERT INTO log(descricao, total, tem10porcento, desconto, datahora, garcom) VALUES (?, ?, ?, ?, now(), ?);");
        String descricao = "Prato principal: " + comanda.getPrato().getNome()
                + " / Sobremesa: " + comanda.getSobremesa().getNome() + " / Saladas: ";
        for (String s : comanda.getSalada().getNomeSaladas()) {
            descricao = descricao + s + ", ";
        }
        descricao = descricao + " / Bebidas: ";

        for (Bebida b : comanda.getVetBebida()) {
            descricao = descricao + b.getNome() + " * " + b.getQuantidade() + ", ";
        }
        insert.setString(1, descricao);
        insert.setDouble(2, comanda.getTotal());
        insert.setBoolean(3, comanda.isTem10Porcento());
        insert.setDouble(4, comanda.getDesconto());
        insert.setString(5, comanda.getGarcom());

        if (insert.executeUpdate() == 1) {
            resultado = true;
        }
        conexao.close();
        return resultado;
    }

    public String ultimaId() throws SQLException {
        Connection conexao = Conexao.getInstance(new ConexaoParametro());
        ResultSet resultSet = conexao.prepareStatement("select max(id) from log;").executeQuery();
        while (resultSet.next()) {
            return String.valueOf(resultSet.getInt(1) + 1);
        }
        return "Erro!";
    }
}
