package Vistas;

//import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JLabel;

import javax.swing.Timer;
import javax.swing.colorchooser.DefaultColorSelectionModel;

/**
 *
 * @author eduarckangrck el obo no ayudo
 */
public class mesa1 extends javax.swing.JFrame {

    public double total = 0;
    public double canti = 0;
    private Timer tie;
    private int cente = 0;
    private int seg = 0;
    public int min = 0;
    public int hor = 0;
    private String dato;
    private String fechaa;
    private String prod;
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    

    /**
     * Creates new form mesa1
     */
    public mesa1() {

        initComponents();
        setLocationRelativeTo(null);
        tie = new Timer(10, acciones);
        /*ImageIcon imagen = new ImageIcon(getClass().getResource("/img/pol0.jpeg"));
        Icon fon = new ImageIcon(imagen.getImage().getScaledInstance(WALLP.getWidth(), WALLP.getHeight(), Image.SCALE_DEFAULT));
        WALLP.setIcon(fon);
        ImageIcon image = new ImageIcon(getClass().getResource("/img/0.png"));
        Icon bott = new ImageIcon(image.getImage().getScaledInstance(agree.getWidth(), agree.getHeight(), Image.SCALE_DEFAULT));
        agree.setIcon(bott);
        ImageIcon imag = new ImageIcon(getClass().getResource("/img/cerrar.png"));
        Icon cerr = new ImageIcon(imag.getImage().getScaledInstance(cerra.getWidth(), cerra.getHeight(), Image.SCALE_DEFAULT));
        cerra.setIcon(cerr);*/
        this.repaint();
        tot.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fech = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productos = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        agree = new javax.swing.JButton();
        tot = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        extra = new javax.swing.JTextField();
        horas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mesaa = new javax.swing.JLabel();
        inic = new javax.swing.JButton();
        jbTotal = new javax.swing.JButton();
        cronometro = new javax.swing.JLabel();
        stopp = new javax.swing.JButton();
        fech1 = new javax.swing.JLabel();
        fech2 = new javax.swing.JLabel();
        minutt = new javax.swing.JTextField();
        prodMen = new javax.swing.JLabel();
        cerra = new javax.swing.JButton();
        ress = new javax.swing.JButton();
        WALLP = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 140, 30));

        fech.setBackground(new java.awt.Color(51, 255, 51));
        fech.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fech.setText("Tiempo");
        getContentPane().add(fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 60, 40));

        productos.setBackground(new java.awt.Color(102, 255, 102));
        productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productos.setModel(modeloCombo);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 200, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cantidad.setText("0");
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 80, 30));

        agree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        agree.setBorder(null);
        agree.setBorderPainted(false);
        agree.setContentAreaFilled(false);
        agree.setEnabled(false);
        agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeActionPerformed(evt);
            }
        });
        getContentPane().add(agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 90, 110));

        tot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });
        getContentPane().add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Extra (En dinero)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        extra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        extra.setText("00");
        extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraActionPerformed(evt);
            }
        });
        extra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                extraKeyReleased(evt);
            }
        });
        getContentPane().add(extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 90, 40));

        horas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        horas.setText("0");
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });
        horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                horasKeyReleased(evt);
            }
        });
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 100, 30));

        tiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Cronometro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        mesaa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(mesaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 140, 40));

        inic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Iniciar.png"))); // NOI18N
        inic.setContentAreaFilled(false);
        inic.setEnabled(false);
        inic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicActionPerformed(evt);
            }
        });
        getContentPane().add(inic, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 200, 50));

        jbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbTotal.setText("Total");
        jbTotal.setEnabled(false);
        jbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 80, -1));

        cronometro.setBackground(new java.awt.Color(255, 255, 255));
        cronometro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cronometro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cronometro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cronometroKeyReleased(evt);
            }
        });
        getContentPane().add(cronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, 40));

        stopp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stopp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Detener.png"))); // NOI18N
        stopp.setContentAreaFilled(false);
        stopp.setEnabled(false);
        stopp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoppActionPerformed(evt);
            }
        });
        getContentPane().add(stopp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 220, 50));

        fech1.setBackground(new java.awt.Color(51, 255, 51));
        fech1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fech1.setText("Minutos:");
        getContentPane().add(fech1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 30));

        fech2.setBackground(new java.awt.Color(51, 255, 51));
        fech2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fech2.setText("Horas:");
        getContentPane().add(fech2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, 30));

        minutt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minutt.setText("0");
        minutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuttActionPerformed(evt);
            }
        });
        minutt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minuttKeyReleased(evt);
            }
        });
        getContentPane().add(minutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, 30));

        prodMen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(prodMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 240, 20));

        cerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar.png"))); // NOI18N
        cerra.setBorder(null);
        cerra.setBorderPainted(false);
        cerra.setContentAreaFilled(false);
        cerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerraActionPerformed(evt);
            }
        });
        getContentPane().add(cerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, 60));

        ress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reiniciar.png"))); // NOI18N
        ress.setContentAreaFilled(false);
        ress.setEnabled(false);
        ress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ressActionPerformed(evt);
            }
        });
        getContentPane().add(ress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 180, 50));

        WALLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mesas.png"))); // NOI18N
        getContentPane().add(WALLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horasKeyReleased

        val(horas.getText());
        if (!horas.getText().isEmpty() && ver(horas.getText())) {

            inic.setEnabled(true);

        } else {
            inic.setEnabled(false);

        }
        if (horas.getText().length() > 2) {
            horas.setText("");
            inic.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_horasKeyReleased

    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasActionPerformed

    private void inicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicActionPerformed

        tie.start();

        stopp.setEnabled(true);
        minutt.setEnabled(false);
        horas.setEnabled(false);
        inic.setEnabled(false);
        jbTotal.setEnabled(true);
        valTex();

        // TODO add your handling code here:
    }//GEN-LAST:event_inicActionPerformed

    private void extraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extraKeyReleased

        resExtra(extra.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_extraKeyReleased

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        resCanti(cantidad.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadKeyReleased

    private void jbTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTotalActionPerformed
        double horr = Double.parseDouble(horas.getText());
        double minuu = Double.parseDouble(minutt.getText());
        double ext = Double.parseDouble(extra.getText());
        total = total + ext + (horr * 60) + minuu;
        String utot = String.valueOf(total);

        tot.setText(utot);
        extra.setText("00");
        jbTotal.setEnabled(false);
        // horas.setText("00");
        // minutt.setText("00");

// TODO add your handling code here:
    }//GEN-LAST:event_jbTotalActionPerformed

    private void agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeActionPerformed

        double canti = Double.parseDouble(cantidad.getText());
        String t;

        switch (productos.getSelectedItem().toString()) {
            case "PAPAS":
                total += (45 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "REFRESCO":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "HOT DOG":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "SOPA INSTANTANEA":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "PALOMITAS":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "JUGOS":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "CERVESA":
                total += (20 * canti);
                t = String.valueOf(total);
                prodMen.setText("se agrego " + cantidad.getText() + " " + productos.getSelectedItem().toString());
                tot.setText(t);
                break;
            case "OTROS":
                 JOptionPane.showMessageDialog(null, "Seleccionar opcion valida");
                break;

            default:
                        JOptionPane.showMessageDialog(null, "Seleccionar opcion valida");

        }
        agree.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_agreeActionPerformed

    private void cronometroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cronometroKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_cronometroKeyReleased

    private void stoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoppActionPerformed
        tie.stop();
       ress.setEnabled(true);
        horas.setEnabled(true);
        inic.setEnabled(true);
        stopp.setEnabled(false);
        minutt.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_stoppActionPerformed

    private void minuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuttActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_minuttActionPerformed

    private void minuttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minuttKeyReleased

        valMin(minutt.getText());

        if (!minutt.getText().isEmpty() && ver(minutt.getText())) {

            inic.setEnabled(true);

        } else {
            inic.setEnabled(false);

        }

        if (minutt.getText().length() > 2) {
            minutt.setText("");
            inic.setEnabled(false);

        }

// TODO add your handling code here:
    }//GEN-LAST:event_minuttKeyReleased

    private void extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_extraActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

    private void cerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerraActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cerraActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosActionPerformed

    private void ressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ressActionPerformed

   reIni();
        // TODO add your handling code here:
    }//GEN-LAST:event_ressActionPerformed

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
            java.util.logging.Logger.getLogger(mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mesa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WALLP;
    private javax.swing.JButton agree;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton cerra;
    private javax.swing.JLabel cronometro;
    private javax.swing.JTextField extra;
    private javax.swing.JLabel fech;
    private javax.swing.JLabel fech1;
    private javax.swing.JLabel fech2;
    private javax.swing.JTextField horas;
    private javax.swing.JButton inic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbTotal;
    private javax.swing.JLabel mesaa;
    private javax.swing.JTextField minutt;
    private javax.swing.JLabel prodMen;
    private javax.swing.JComboBox<String> productos;
    private javax.swing.JButton ress;
    private javax.swing.JButton stopp;
    private javax.swing.JLabel tiempo;
    private javax.swing.JTextField tot;
    // End of variables declaration//GEN-END:variables
// este metodo balida las horas    y el tiempo
    public void val(String num) {

        if (num.length() > 0) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c)) {
                    horas.setText("0");
                    //tiempo.setText("");

                }

            }

        } else {
            horas.setText("0");
        }

    }
// este metodo balida el campo de eXtra en dinero

    public void resExtra(String num) {

        if (num.length() > 0 && num.length() < 8) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c)) {
                    extra.setText("0");

                }
            }

        } else {
            extra.setText("0");
        }

    }
// este metodo valida el campo en cantidad

    public void resCanti(String num) {

        if (num.length() > 0) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c) || num.length() > 2) {
                    cantidad.setText("0");
                    agree.setEnabled(false);
                } else if (Character.isDigit(c)) {
                    //cantidad.setText(num);
                    agree.setEnabled(true);
                }
            }

        } else {
            cantidad.setText("0");
        }

    }
// metodo en proceso no mover

    public void resProduc(String prod) {
        // if(prod == ){}
    }

// metodo para acivar el cronometro
    private void actTiempo() {
        String text = (hor < 9 ? "0" : "") + hor + ":" + (min < 9 ? "0" : "") + min + ":" + (seg < 9 ? "0" : "") + seg + ":" + (cente < 9 ? "0" : "") + cente;
        String h = String.valueOf(hor);

        cronometro.setText(text);
        crono();
    }
// accion para el cronometro
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cente++;
            if (cente == 100) {
                seg++;
                cente = 0;

            }
            if (seg == 60) {
                min++;
                seg = 0;
            }
            if (min == 60) {
                hor++;
                min = 0;

            }
            if (hor == 24) {
                hor = 0;
            }
            actTiempo();

        }
    };

    public void setDato(String dato) {
        this.dato = dato;
        mesaa.setText("MESA - " + dato);

    }

    public void setFecha(String dato) {
        this.fechaa = dato;
        tiempo.setText(dato);

    }

    public static boolean ver(String num) {

        if (num.length() > 0) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    return true;
                }
            }

        }
        return false;

    }
// este bloque detiene el reloj automaticamente

    public void resPues() {
        men_1 mes = new men_1();

        mes.getCrono(hor);
        int h = Integer.parseInt(horas.getText());
        mes.getTiempo(h);
        String horaa = String.valueOf(hor);
        mes.getMin(min);

        if (horas.getText() == horaa) {
            tie.stop();

        }

    }

    public void valMin(String num) {

        if (num.length() > 0) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c)) {
                    minutt.setText("0");
                    //tiempo.setText("");

                } else if (Character.isDigit(c)) {
                    minutt.setText(num);
                }

            }

        } else {
            minutt.setText("0");
        }

    }

    public void valTex() {
        int horr = Integer.parseInt(horas.getText());
        int minn = Integer.parseInt(minutt.getText());
        if ((horr == 00 && minn == 00) || (horr == 0 && minn == 0) || horr > 24 || minn > 60) {
            JOptionPane.showMessageDialog(this, "rellenar bien los campos");

            horas.setText("0");
            minutt.setText("0");
            stopp.setEnabled(false);
            inic.setEnabled(false);
            tie.stop();
            horas.setEnabled(true);
            minutt.setEnabled(true);
            cente = 0;
            seg = 0;
            min = 0;
            hor = 0;
        }

    }

    public void crono() {

        if (hor == Integer.parseInt(horas.getText()) && min == Integer.parseInt(minutt.getText())) {

            tie.stop();
            JOptionPane.showMessageDialog(this, "se termini el tiempo " + mesaa.getText());
            stopp.setEnabled(false);
            ress.setEnabled(true);
        }

    }

    public void reIni() {
        horas.setText("0");
        minutt.setText("0");
        //stopp.setEnabled(false);
        inic.setEnabled(true);
        tie.stop();
        horas.setEnabled(true);
        minutt.setEnabled(true);
        cente = 0;
        seg = 0;
        min = 0;
        hor = 0;
        tot.setText("0");
        total = 0;
        ress.setEnabled(false);

    }
    public void agree(String il){
        prod = il;
        System.out.println(il);
       modeloCombo.addElement(prod);
    }
    // hola buenas noches
}
