package Vistas;

//import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JLabel;

import javax.swing.Timer;

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

    /**
     * Creates new form mesa1
     */
    public mesa1() {

        initComponents();
        setLocationRelativeTo(null);
        tie = new Timer(10, acciones);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/img/pol0.jpeg"));
        Icon fon = new ImageIcon(imagen.getImage().getScaledInstance(WALLP.getWidth(), WALLP.getHeight(), Image.SCALE_DEFAULT));
        WALLP.setIcon(fon);
        ImageIcon image = new ImageIcon(getClass().getResource("/img/0.png"));
        Icon bott = new ImageIcon(image.getImage().getScaledInstance(agree.getWidth(), agree.getHeight(), Image.SCALE_DEFAULT));
        agree.setIcon(bott);
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
        jLabel6 = new javax.swing.JLabel();
        horas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        mesaa = new javax.swing.JLabel();
        inic = new javax.swing.JButton();
        jbTotal = new javax.swing.JButton();
        cronometro = new javax.swing.JLabel();
        stopp = new javax.swing.JButton();
        fech1 = new javax.swing.JLabel();
        minutt = new javax.swing.JTextField();
        prodMen = new javax.swing.JLabel();
        WALLP = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, 20));

        fech.setBackground(new java.awt.Color(51, 255, 51));
        fech.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fech.setText("TIEMPO (HORAS)");
        getContentPane().add(fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, 30));

        productos.setBackground(new java.awt.Color(102, 255, 102));
        productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPAS", "REFRESCO", "SOPA INSTANTANEA ", "PALOMITAS ", "JUGOS", "CERVESA ", "HOT DOG ", "PITO", " " }));
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 80, 30));

        agree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agree.setBorder(null);
        agree.setBorderPainted(false);
        agree.setContentAreaFilled(false);
        agree.setEnabled(false);
        agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeActionPerformed(evt);
            }
        });
        getContentPane().add(agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 80, 80));

        tot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });
        getContentPane().add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EXTRA (EN DINERO)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

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
        getContentPane().add(extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CANTIDAD ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

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
        getContentPane().add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CRONOMETRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        tiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 240, 30));

        mesaa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(mesaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 180, 40));

        inic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pol22.png"))); // NOI18N
        inic.setText("iniciar");
        inic.setEnabled(false);
        inic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicActionPerformed(evt);
            }
        });
        getContentPane().add(inic, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 190, 40));

        jbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbTotal.setText("Total");
        jbTotal.setEnabled(false);
        jbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        cronometro.setBackground(new java.awt.Color(255, 255, 255));
        cronometro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cronometro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cronometro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cronometroKeyReleased(evt);
            }
        });
        getContentPane().add(cronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 40));

        stopp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stopp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pol22.png"))); // NOI18N
        stopp.setText("DETENER");
        stopp.setEnabled(false);
        stopp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoppActionPerformed(evt);
            }
        });
        getContentPane().add(stopp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 220, 40));

        fech1.setBackground(new java.awt.Color(51, 255, 51));
        fech1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fech1.setText("TIEMPO (MINUTOS)");
        getContentPane().add(fech1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

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
        getContentPane().add(minutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 30));

        prodMen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(prodMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 170, 20));
        getContentPane().add(WALLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

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
          String t ;
        
        switch (productos.getSelectedItem().toString()) {
            case "PAPAS":
                total += (45 * canti) ;
                  t = String.valueOf(total);
                prodMen.setText("se agrego " +  cantidad.getText() + " " + productos.getSelectedItem().toString()   );
                tot.setText(t);
                break; 
            default:
                throw new AssertionError();
        }
        agree.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_agreeActionPerformed

    private void cronometroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cronometroKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_cronometroKeyReleased

    private void stoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoppActionPerformed
        tie.stop();

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
    private javax.swing.JLabel cronometro;
    private javax.swing.JTextField extra;
    private javax.swing.JLabel fech;
    private javax.swing.JLabel fech1;
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

        }else{
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

        }else{
        extra.setText("0");
        }

    }
// este metodo valida el campo en cantidad

    public void resCanti(String num) {

        if (num.length() > 0) {

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (!Character.isDigit(c) || num.length()> 2 ) {
                    cantidad.setText("0");
                    agree.setEnabled(false);
                } else if (Character.isDigit(c)) {
                    //cantidad.setText(num);
                     agree.setEnabled(true);
                }
            }

        }else{
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

        }else{
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
    // hola buenas noches
}
