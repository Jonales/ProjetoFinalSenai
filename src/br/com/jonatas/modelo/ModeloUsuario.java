/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jonatas.modelo;

/**
 *
 * @author jonatas.meireles
 */
public class ModeloUsuario {
    
    private int id ;
    private String nome_usuario;
    private String senha_usuario;
    private String descricao_usuario;

    public ModeloUsuario(int id, String nome_usuario, String senha_usuario, String descricao_usuario) {
        this.id = id;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
        this.descricao_usuario = descricao_usuario;
    }

    public ModeloUsuario(int id, String nome_usuario, String senha_usuario) {
        this.id = id;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }
    
    public ModeloUsuario(String nome_usuario, String senha_usuario) {
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getDescricao_usuario() {
        return descricao_usuario;
    }

    public void setDescricao_usuario(String descricao_usuario) {
        this.descricao_usuario = descricao_usuario;
    }

    

    
}
