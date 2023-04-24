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
        ImageIcon imen = new ImageIcon(getClass().getResource("/img/Aj.png"));
        Icon ic = new ImageIcon(imen.getImage().getScaledInstance(aj.getWidth(), aj.getHeight(), Image.SCALE_DEFAULT));
        aj.setIcon(ic);
        ImageIcon imgn = new ImageIcon(getClass().getResource("/img/Ay.png"));
        Icon ay = new ImageIcon(imgn.getImage().getScaledInstance(hp.getWidth(), hp.getHeight(), Image.SCALE_DEFAULT));
        hp.setIcon(ay);
        ImageIcon im = new ImageIcon(getClass().getResource("/img/Ac.png"));
        Icon a = new ImageIcon(im.getImage().getScaledInstance(ac.getWidth(), ac.getHeight(), Image.SCALE_DEFAULT));
        ac.setIcon(a);
        ImageIcon imo = new ImageIcon(getClass().getResource("/img/lg.png"));
        Icon b = new ImageIcon(imo.getImage().getScaledInstance(pol.getWidth(), pol.getHeight(), Image.SCALE_DEFAULT));
        pol.setIcon(b);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panel = new fondo();
        aj = new javax.swing.JButton();
        hp = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        fechaa = new javax.swing.JLabel();
        pol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton.setBorder(null);
        Boton.setBorderPainted(false);
        Boton.setContentAreaFilled(false);
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        getContentPane().add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.GridLayout(0, 4));
        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 380));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        aj.setBorder(null);
        aj.setBorderPainted(false);
        aj.setContentAreaFilled(false);
        aj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajActionPerformed(evt);
            }
        });
        getContentPane().add(aj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, 80));

        hp.setBorder(null);
        hp.setBorderPainted(false);
        hp.setContentAreaFilled(false);
        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, 80));

        ac.setBorder(null);
        ac.setBorderPainted(false);
        ac.setContentAreaFilled(false);
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        getContentPane().add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 80));

        fechaa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(fechaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 300, 30));
        getContentPane().add(pol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pol0.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 986, 590));

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

    private void ajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajActionPerformed

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acActionPerformed

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
    private javax.swing.JButton ac;
    private javax.swing.JButton aj;
    private javax.swing.JLabel fechaa;
    private javax.swing.JButton hp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pol;
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
