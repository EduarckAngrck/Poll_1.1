/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
/**
 *
 * @author eduarckangrck
 */
public class ajustes extends javax.swing.JFrame {

    /**
     * Creates new form ajustes
     */
    public ajustes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        Regresar.setContentAreaFilled(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mesa_principal.png"))); // NOI18N
        Fondo.addKeyListener(new java.awt.event.KeyAdapter() {
        });
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 1080, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // Boton para regresarse al menu principal
        
        men_1 newframe = new men_1();
        newframe.setVisible(Boolean.FALSE);
        this.setVisible(false);
        
    }//GEN-LAST:event_RegresarActionPerformed


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
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Regresar;
    // End of variables declaration//GEN-END:variables



}

/*  import javax.swing.JFrame;
    import javax.swing.JButton;
    import javax.swing.GroupLayout;
    import javax.swing.LayoutStyle.ComponentPlacement;
    import java.awt.Container;
    import java.awt.Dimension;
    import java.awt.Toolkit;

    public class VentanaAdaptable extends JFrame {
    
    public VentanaAdaptable() {
        super("Ventana Adaptable");
        
        // Crear los componentes de la ventana
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        
        // Crear el contenedor principal y asignarle el layout GroupLayout
        Container contenedor = getContentPane();
        GroupLayout layout = new GroupLayout(contenedor);
        contenedor.setLayout(layout);
        
        // Configurar el layout para que los componentes se ajusten automáticamente
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // Definir las restricciones de los componentes en el layout
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(boton1)
                .addComponent(boton2)
                .addComponent(boton3)
        );
        
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1)
                    .addComponent(boton2)
                    .addComponent(boton3))
        );
        
        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        
        // Definir el tamaño de la ventana como un porcentaje de la pantalla
        int windowWidth = (int) (width * 0.8);
        int windowHeight = (int) (height * 0.8);
        setSize(windowWidth, windowHeight);
        
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        
        // Hacer visible la ventana
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new VentanaAdaptable();
    }
}
*/
