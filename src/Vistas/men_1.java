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
import javax.swing.Icon;
import javax.swing.JOptionPane;
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
        ImageIcon imgen = new ImageIcon(getClass().getResource("/img/0.png"));
        Icon fond = new ImageIcon(imgen.getImage().getScaledInstance(Boton.getWidth(), Boton.getHeight(), Image.SCALE_DEFAULT));
        Boton.setIcon(fond);
        ImageIcon imen = new ImageIcon(getClass().getResource("/img/Ajustes.png"));
        Icon ic = new ImageIcon(imen.getImage().getScaledInstance(Ajustes.getWidth(), Ajustes.getHeight(), Image.SCALE_DEFAULT));
        Ajustes.setIcon(ic);
        ImageIcon imgn = new ImageIcon(getClass().getResource("/img/Help.png"));
        Icon ay = new ImageIcon(imgn.getImage().getScaledInstance(hp.getWidth(), hp.getHeight(), Image.SCALE_DEFAULT));
        hp.setIcon(ay);
        ImageIcon im = new ImageIcon(getClass().getResource("/img/Acerca de.png"));
        Icon a = new ImageIcon(im.getImage().getScaledInstance(ac.getWidth(), ac.getHeight(), Image.SCALE_DEFAULT));
        ac.setIcon(a);
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

        Boton = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Ajustes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panel = new fondo();
        hp = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        fechaa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton.setBorder(null);
        Boton.setBorderPainted(false);
        Boton.setContentAreaFilled(false);
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        getContentPane().add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 120, 110));

        Cerrar.setContentAreaFilled(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 220, 60));

        Ajustes.setToolTipText("");
        Ajustes.setContentAreaFilled(false);
        Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesActionPerformed(evt);
            }
        });
        getContentPane().add(Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, 120));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 230, 170));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.GridLayout(0, 4));
        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 460));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 750, 480));

        hp.setBorder(null);
        hp.setBorderPainted(false);
        hp.setContentAreaFilled(false);
        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 110, 110));

        ac.setBorder(null);
        ac.setBorderPainted(false);
        ac.setContentAreaFilled(false);
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        getContentPane().add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 120, 130));

        fechaa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(fechaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 390, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1190, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        mesa1 mesa = new mesa1();
        JButton boton = new JButton("" +indice);
        panel.add(boton);
        botones.add(boton);
        boton.setForeground(Color.black);
        Image imagen = new ImageIcon(getClass().getResource("/img/bola.png")).getImage();
        int w = boton.getWidth() + 64;
        int h = boton.getHeight() + 64;
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

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        JOptionPane.showMessageDialog(null, "PollBall - WORKING PROGRESS \nEmpresa: FrogSoft \nCorreo electronico: FrogSoft2023@gmail.com \nNumero de contacto: 5971145270 \nDirección: Calle 5 de Mayo, Sin Número, 9C, Tlahuelilpan Centro");
        // TODO add your handling code here:
    }//GEN-LAST:event_acActionPerformed

    private void AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjustesActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
       Inicio_Pool inic = new Inicio_Pool();
        this.setVisible(false);
        // TODO add your handling code here:
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
    private javax.swing.JButton Ajustes;
    private javax.swing.JButton Boton;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton ac;
    private javax.swing.JLabel fechaa;
    private javax.swing.JButton hp;
    private javax.swing.JLabel jLabel1;
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

            imagen = new ImageIcon(getClass().getResource("/img/Green.png")).getImage();
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
