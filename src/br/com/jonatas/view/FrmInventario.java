/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.jonatas.view;

import br.com.jonatas.controller.ControllerMenu;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonatas.meireles
 */
public class FrmInventario extends javax.swing.JFrame {
    //private final ControllerMenu controller;

    /**
     * Creates new form Tela02
     */
    public FrmInventario() {
        initComponents();
        //controller =  new ControllerMenu(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        jBAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INVENTARIUM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(380, 380));
        setName("frmContagem"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("CÓDIGO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setText("DESCRIÇÃO DO CÓDIGO LIDO!!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 20));

        jTQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTQtd.setText("1");
        jTQtd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTQtd.setNextFocusableComponent(jBAdicionar);
        getContentPane().add(jTQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 50));
        jTQtd.getAccessibleContext().setAccessibleName("");
        jTQtd.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setText("QTD:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jTCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCodigo.setNextFocusableComponent(jTQtd);
        getContentPane().add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 300, 50));
        jTCodigo.getAccessibleContext().setAccessibleDescription("");

        jBVoltar.setText("VOLTAR");
        getContentPane().add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 350, 50));

        jBAdicionar.setText("ADICIONAR");
        getContentPane().add(jBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 350, 50));
        jBAdicionar.getAccessibleContext().setAccessibleDescription("");
        jBAdicionar.getAccessibleContext().setAccessibleParent(jTCodigo);

        getAccessibleContext().setAccessibleParent(jTCodigo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTQtd;
    // End of variables declaration//GEN-END:variables
  
}
