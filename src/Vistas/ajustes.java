/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

//import java.awt.Graphics;
//import java.awt.Image;
//import javax.swing.ImageIcon;
//import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduarckangrck
 */
public class ajustes extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form ajustes
     */
    public ajustes() {
        initComponents();
        String[] titulo = new String[]{"id", "Precio", "Producto"};
        dtm.setColumnIdentifiers(titulo);
        tbDatos.setModel(dtm);
    }

    void agregar() {
        dtm.addRow(new Object[]{
            txtId.getText(), txtPres.getText(), txtProd.getText()
        });

    }

    void eliminar() {
        int fila = tbDatos.getSelectedRow();
        dtm.removeRow(fila);

    }

    void actualizar() {
        int fila = tbDatos.getSelectedRow();
        dtm.setValueAt(txtId.getText(), fila, 0);
        dtm.setValueAt(txtPres.getText(), fila, 1);
        dtm.setValueAt(txtProd.getText(), fila, 2);
    }

    void limpiar() {
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        agrega = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        elimina = new javax.swing.JButton();
        txtPres = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 50));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 130, 40));

        agrega.setText("agregar");
        agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaActionPerformed(evt);
            }
        });
        getContentPane().add(agrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 40));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 130, 40));

        elimina.setText("Eliminar");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });
        getContentPane().add(elimina, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 130, 40));

        txtPres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPresKeyReleased(evt);
            }
        });
        getContentPane().add(txtPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 130, 50));
        getContentPane().add(txtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 130, 50));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 600, 250));

        jLabel1.setText("id Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, 30));

        jLabel2.setText("Precio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 120, 30));

        jLabel3.setText("Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 30));

        jButton1.setText("salir");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 80));
        getContentPane().add(jLabel_fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 980, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        actualizar();

        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaActionPerformed
        agregar();        // TODO add your handling code here:
    }//GEN-LAST:event_agregaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        eliminar();        // TODO add your handling code here:
    }//GEN-LAST:event_eliminaActionPerformed

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        val(txtId.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtPresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresKeyReleased

        valPres(txtPres.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        men_1 mes = new men_1();
        mes.setVisible(true);
        this.setVisible(false );        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajustes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agrega;
    private javax.swing.JButton elimina;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_fond;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPres;
    private javax.swing.JTextField txtProd;
    // End of variables declaration//GEN-END:variables

    public void val(String num) {

        if (num.length() > 0 && num.length() < 8) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c)) {
                    txtId.setText("0");

                }

            }

        } else {
            txtId.setText("0");
        }

    }

    public void valPres(String num) {

        if (num.length() > 0 && num.length() < 8) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (Character.isDigit(c) || c == '.') {
                    txtPres.setText(num);

                } else {
                    txtPres.setText("0");
                }

            }

        } else {
            txtPres.setText("0");
        }

    }
}
