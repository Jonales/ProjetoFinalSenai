/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jonatas.controller.helper;

import br.com.jonatas.modelo.ModeloUsuario;
import br.com.jonatas.view.FrmLogin;

/**
 *
 * @author jonatas.meireles
 */
public class HelperUsuario {
    private final FrmLogin view;
    
    public HelperUsuario(FrmLogin viewer) {
        this.view = viewer;
    }
    
    public ModeloUsuario obterModelo(){
        String nome_usuario = view.getjTextLogin().getText();
        String senha_usuario = view.getjPasswordSenha().getText();
        ModeloUsuario modelo = new ModeloUsuario(0, nome_usuario, senha_usuario);
        return modelo; 
    }
    
    public void setarModelo(ModeloUsuario modelo){
        String login = modelo.getNome_usuario();
        String senha = modelo.getSenha_usuario();
        
        view.getjTextLogin().setText(login);
        view.getjPasswordSenha().setText(senha); 
    }
    
    public void limparTela(){
        view.getjTextLogin().setText("");
        view.getjPasswordSenha().setText(""); 
    } 
}
