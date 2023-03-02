/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jonatas.controller;

import br.com.jonatas.view.FrmMenu;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

//import 
/**
 *
 * @author Jon
 */
public class ControllerMenu {
    private final FrmMenu view;
   
    
    /**
     *
     * @param view
     */
    public ControllerMenu (FrmMenu view){
        this.view = view;
    }

    
    public void Cliente(){
        System.out.println("Chamou ControllerMenu 'Cliente'.");

    }
    
    public void PesquisarCliente() throws PropertyVetoException{
        System.out.println("Chamou ControllerMenu 'PesquisarCliente'.");

    }
    
    public void Automovel(){
        System.out.println("Chamou ControllerMenu 'Automovel'.");


    }
    
    public void Ocorrencia(){
        System.out.println("Chamou ControllerMenu 'Ocorrencia'.");


    }
    
    public void Relatorio(){
        System.out.println("Chamou ControllerMenu 'Relatorio'.");

    }
    
    
    public void OpcaoMenuSobre(){
        JOptionPane.showMessageDialog(view, "Projeto feito no curso \n'Desenvolvimento JAVA', \npara o senai!");
    }
    
    public void OpcaoMenuAjuda(){
        JOptionPane.showMessageDialog(view, "Autor: Jônatas Meireles"
                                        + "\nE-mail: jonatas.mei@outlook.com");
    }
}
