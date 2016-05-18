/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.Conexao;

/**
 *
 * @author iapereira
 */
public class Cliente {
    private int id;
    private String nome;
    private List<Endereco> vetEndereco;
    
    public Cliente(){
        this.vetEndereco = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getVetEndereco() {
        return vetEndereco;
    }

    public void setVetEndereco(List<Endereco> vetEndereco) {
        this.vetEndereco = vetEndereco;
    }
    
    public static List<Cliente> listarTodos() throws SQLException{
        List<Cliente> vetCliente = new ArrayList();
        Connection connection =  new Conexao().getConexao();
        String sql = "SELECT * FROM cliente";
        PreparedStatement sqlSelect = connection.prepareStatement(sql);
        ResultSet rs =  sqlSelect.executeQuery();
        Cliente cliente;
        while (rs.next()){
            cliente =  new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            vetCliente.add(cliente);
        }
        sqlSelect.close();
        connection.close();
        return vetCliente;
    }
    
    public void carregar() throws SQLException {
        Connection connection =  new Conexao().getConexao();
        String sql = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement sqlSelect = connection.prepareStatement(sql);
        sqlSelect.setInt(1, this.id);
        ResultSet rs =  sqlSelect.executeQuery();        
        if(rs.next()){
            this.setId(rs.getInt("id"));
            this.setNome(rs.getString("nome"));
        }
        sqlSelect.close();
        connection.close();
    }
    
    
    
    public void salvar() throws SQLException{
        Connection connection =  new Conexao().getConexao();
        String sql = "INSERT INTO cliente (nome) VALUES (?) RETURNING id;";
        PreparedStatement sqlInsert = connection.prepareStatement(sql);
        sqlInsert.setString(1, this.nome);
        ResultSet rs = sqlInsert.executeQuery();
        if (rs.next()){
            this.id = rs.getInt("id");
        }
        sqlInsert.close();
        connection.close();
    } 
    
    
      public void excluir() throws SQLException{
        Connection connection =  new Conexao().getConexao();
        String sql = "DELETE FROM cliente WHERE id = ?;";
        PreparedStatement sqlDelete = connection.prepareStatement(sql);
        sqlDelete.setInt(1, this.id);
        sqlDelete.executeUpdate();   
        sqlDelete.close();
        connection.close();
    } 
    
    
    
    public void obterEnderecos() throws SQLException{
        List<Endereco> vetEndereco = new ArrayList();
        Connection connection =  new Conexao().getConexao();
        String sql = "SELECT * FROM endereco WHERE cliente_id = ?";
        PreparedStatement sqlSelect = connection.prepareStatement(sql);
        sqlSelect.setInt(1, this.id);
        ResultSet rs =  sqlSelect.executeQuery();
        Endereco endereco;
        while (rs.next()){
            endereco =  new Endereco();
            endereco.setId(rs.getInt("id"));
            endereco.setDescricao(rs.getString("descricao"));
            vetEndereco.add(endereco);
        }
        sqlSelect.close();
        connection.close();
        this.setVetEndereco(vetEndereco);    
    }

    
    
    
}
