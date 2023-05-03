/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author eduarckangrck
 */
public class Inicio_Pool extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_Pool
     */
    public Inicio_Pool() {
        
        initComponents();
        setLocationRelativeTo(null);
        inicia.setEnabled(false);
        ImageIcon imgen = new ImageIcon(getClass().getResource("/img/Mesa_principal.png"));
        Icon fond = new ImageIcon(imgen.getImage().getScaledInstance(wallp1.getWidth(), wallp1.getHeight(), Image.SCALE_DEFAULT));
        wallp1.setIcon(fond);
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inicia = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        wallp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar.png"))); // NOI18N
        Cerrar.setContentAreaFilled(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 70));

        pass.setBackground(new java.awt.Color(178, 236, 160));
        pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pass.setToolTipText("Contraseña");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 320, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 80, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lg.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 230, 150));

        inicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log1.png"))); // NOI18N
        inicia.setBorder(null);
        inicia.setContentAreaFilled(false);
        inicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciaActionPerformed(evt);
            }
        });
        getContentPane().add(inicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 90, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pass.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 80, 70));

        user.setBackground(new java.awt.Color(178, 236, 160));
        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setToolTipText("Usuario");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 320, 50));

        message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 390, 30));

        wallp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mesa_principal.png"))); // NOI18N
        getContentPane().add(wallp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
       //holaaaaaaaa
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void iniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciaActionPerformed
men_1 men = new men_1();
men.setVisible(true);
this.setVisible(false);
//hola carlos  
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciaActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased

        res();
        // TODO add your handling code here:
    }//GEN-LAST:event_userKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
  res();
        // TODO add your handling code here:
    }//GEN-LAST:event_passKeyReleased

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_Pool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Pool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Pool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Pool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Pool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton inicia;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    private javax.swing.JLabel wallp1;
    // End of variables declaration//GEN-END:variables
 public void  res(){
     if (user.getText().isEmpty()|| pass.getText().isEmpty()) {
         message.setText("FAVOR DE COMPLETAR LOS CAMPOS");
         
     }else if (!user.getText().isEmpty() && !pass.getText().isEmpty()){
     message.setText("");
      inicia.setEnabled(true);
     }
      
    } 

}
