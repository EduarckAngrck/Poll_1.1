package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//import java.awt.Toolkit;
//import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author  eduarckangr ck
 */
public class men_1 extends javax.swing.JFrame {

    public String c = "g";
    // fondo fondo1 = new fondo();
    private int dat;
    private int cron;
    private int min;
    private int indice;
    private List<JButton> botones;

    /**
     * Creates new form men_1
     */
    public men_1() {
        // this.setContentPane(fondo1);
        initComponents();
        setLocationRelativeTo(null);
        botones = new ArrayList<>();
        indice = 1;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panel = new fondo();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fechaa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/0.png"))); // NOI18N
        Boton.setBorder(null);
        Boton.setBorderPainted(false);
        Boton.setContentAreaFilled(false);
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        getContentPane().add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 135, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.GridLayout(0, 4));
        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 380));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ajustes.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ayuda.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Acerca de.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 120));

        fechaa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(fechaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 300, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pol0.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 986, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        mesa1 mesa = new mesa1();
        JButton boton = new JButton("" +indice);
        panel.add(boton);
        botones.add(boton);
        boton.setForeground(Color.black);
        Image imagen = new ImageIcon(getClass().getResource("/img/pol22.png")).getImage();
        int w = boton.getWidth() + 100;
        int h = boton.getHeight() + 100;
// jjjjj
//boton.setBorder(null);
//     ImageIcon imagen = new ImageIcon("m1.jpeg");
       boton.setIcon(new ImageIcon(imagen.getScaledInstance(w, h, Image.SCALE_SMOOTH)));
        boton.setFont(new Font("Tahoma", Font.BOLD, 30));
        boton.setBackground(Color.GREEN);
        indice++;
        panel.updateUI();
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesa.setVisible(true);
                
            }
        });
        mesa.setDato(boton.getText());
        tiempo();
        mesa.setFecha(fechaa.getText());
       if (botones.size()> 23 ) {
            Boton.setEnabled(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BotonActionPerformed

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
            java.util.logging.Logger.getLogger(men_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(men_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(men_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(men_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new men_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JLabel fechaa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
//    

    class fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/img/0111.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    public void getTiempo(int dato) {
        this.dat = dato;

    }

    public void getCrono(int dato) {
        this.cron = dato;

    }

    public void getMin(int dato) {
        this.min = dato;
    }

    public void tiempo() {
        Timer tim = new Timer();
        TimerTask ti = new TimerTask() {
            @Override
            public void run() {

                fechaa.setText("" + new Date());
            }
        };
        tim.schedule(ti, 0, 1000);
    }

}
