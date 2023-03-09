/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jonatas.dao;

import br.com.jonatas.connection.ConnectionFactory;
import br.com.jonatas.modelo.ModeloUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @Está dao é para comunicação direto com a tabela de Usuario
 */
public class DaoUsuario {
    Connection conn;

    public ResultSet autenticacaoLogin(ModeloUsuario modeloLogin) {
        conn = new ConnectionFactory().getConnection();
        
        try {
            String sql = "SELECT * FROM inventarium.in_usuaruio where nome_usuario = ? and senha_usuario = ? ";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, modeloLogin.getNome_usuario());
            stmt.setString(2, modeloLogin.getSenha_usuario());
            
            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DAOLogin: " + e);
            return null;
        }
    }

    /**
     * Insere um usuario dentro do banco de dados
     *
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(ModeloUsuario usuario) {
        conn = new ConnectionFactory().getConnection();
       
        try {
            String sql = "insert into inventarium.in_usuaruio (nome_usuario, senha_usuario, descricao_usuario) VALUES(?,?,?)";
             
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome_usuario());
            stmt.setString(2, usuario.getSenha_usuario());
            stmt.setString(3, usuario.getDescricao_usuario());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException("DAOLogin: " + e);
        }
    }

    /**
     * Atualiza um Objeto no banco de dados
     *
     * @param usuario
     * @return
     */
    public boolean update(ModeloUsuario usuario) {
        /*
        for (int i = 0; i < banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }*/
        return false;
    }

    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     *
     * @param usuario
     * @return
     */
    public boolean delete(ModeloUsuario usuario) {
        /*
        for (ModeloLogin usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }*/
        return false;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     *
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(ModeloUsuario usuario, ModeloUsuario usuarioAPesquisar) {
        return usuario.getNome_usuario().equals(usuarioAPesquisar.getNome_usuario()) && usuario.getSenha_usuario().equals(usuarioAPesquisar.getSenha_usuario());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     *
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(ModeloUsuario usuario, ModeloUsuario usuarioAComparar) {
        return usuario.getId() == usuarioAComparar.getId();
    }

}
