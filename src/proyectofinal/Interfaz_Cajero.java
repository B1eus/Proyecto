/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author beus2
 */
public class Interfaz_Cajero extends javax.swing.JFrame {

    /**
     * Creates new form Cajero
     */
    public Interfaz_Cajero() {
        initComponents();
        ValorDepo.setVisible(false);
        NumeroCueDepo.setVisible(false);
        CampoDeposito.setVisible(false);
        CampoNumDepo.setVisible(false);
        valorReti.setVisible(false);
        campoRetiro.setVisible(false);
        TexSaldo.setVisible(false);
        CampoSaldo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TexClave = new javax.swing.JLabel();
        TexSaldo = new javax.swing.JLabel();
        CampoClave = new javax.swing.JTextField();
        CampoSaldo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TexTipoTarj = new javax.swing.JLabel();
        TexNumTar = new javax.swing.JLabel();
        CampoTarjeta = new javax.swing.JTextField();
        ValorDepo = new javax.swing.JLabel();
        NumeroCueDepo = new javax.swing.JLabel();
        valorReti = new javax.swing.JLabel();
        CampoDeposito = new javax.swing.JTextField();
        CampoNumDepo = new javax.swing.JTextField();
        campoRetiro = new javax.swing.JTextField();
        gif1 = new javax.swing.JLabel();
        gif2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonConsultar = new javax.swing.JButton();
        BotonDepositar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BotonRetirar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Titulo.setText("Cajero Automatico");

        TexClave.setText("Ingrese Clave:");

        TexSaldo.setText("Saldo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Debito" }));

        TexTipoTarj.setText("Tipo de Tarjeta");

        TexNumTar.setText("Ingrese  Numero de tarjeta:");

        CampoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTarjetaActionPerformed(evt);
            }
        });

        ValorDepo.setText("Cuanto va a Depositar");

        NumeroCueDepo.setText("Numero de cuenta");

        valorReti.setText("Cuanto va a retirar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(CampoSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(TexSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valorReti)
                                .addGap(18, 18, 18)
                                .addComponent(campoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorDepo)
                                    .addComponent(NumeroCueDepo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoNumDepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TexClave)
                                .addGap(60, 60, 60)
                                .addComponent(CampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TexNumTar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CampoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TexTipoTarj)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TexNumTar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TexTipoTarj))
                        .addGap(18, 18, 18)
                        .addComponent(TexClave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexSaldo)
                    .addComponent(CampoSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorDepo)
                    .addComponent(CampoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroCueDepo)
                    .addComponent(CampoNumDepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valorReti)
                    .addComponent(campoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        gif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/ImagenCajero2.gif"))); // NOI18N

        gif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/ImagenCajero1.gif"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonConsultar.setText("Consultar ");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        BotonDepositar.setText("Depositar");
        BotonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonDepositar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(BotonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonDepositar)
                .addGap(57, 57, 57))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonRetirar.setText("Retirar");
        BotonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRetirarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRetirar)
                    .addComponent(Salir))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(BotonRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(gif2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(gif1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(581, 581, 581))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gif1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(gif2)))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        gif1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDepositarActionPerformed
        CuentaBancaria cuenta1 = new CuentaBancaria(null, 0);
        Transaccion transaccion = new Transaccion(0,0.0);
        double monto = Double.parseDouble(ValorDepo.getText());
        cuenta1.depositar(transaccion);
        TexNumTar.setVisible(false);
        CampoTarjeta.setVisible(false);
        ValorDepo.setVisible(true);
        NumeroCueDepo.setVisible(true);
        CampoDeposito.setVisible(true);
        CampoNumDepo.setVisible(true);
        TexSaldo.setVisible(false);
        CampoSaldo.setVisible(false);
    }//GEN-LAST:event_BotonDepositarActionPerformed

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
         
     try {
         double saldo = Double.parseDouble(CampoSaldo.getText());
        
        CuentaBancaria cuenta1 = new CuentaBancaria(null, 0);
        cuenta1.consultarsaldo();
        CampoSaldo.setText(String.format("%.2f", saldo));
        TexNumTar.setVisible(false);
        CampoTarjeta.setVisible(false);
        TexSaldo.setVisible(false);
        CampoSaldo.setVisible(false); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El saldo debe ser un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    }

        
    }//GEN-LAST:event_BotonConsultarActionPerformed

    private void CampoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTarjetaActionPerformed
        CuentaBancaria cuenta1 = new CuentaBancaria(null, 0);
        cuenta1.getNumeroCuenta();
        TexNumTar.setVisible(false);
        CampoTarjeta.setVisible(false);
    }//GEN-LAST:event_CampoTarjetaActionPerformed

    private void BotonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRetirarActionPerformed
       CuentaBancaria cuenta1 = new CuentaBancaria(null, 0);
       Transaccion transaccion = new Transaccion(0,0.0);
       double monto = Double.parseDouble(valorReti.getText());
        cuenta1.retirar(transaccion);
        TexNumTar.setVisible(false);
        CampoTarjeta.setVisible(false);
        valorReti.setVisible(true);
        campoRetiro.setVisible(true);
        TexSaldo.setVisible(false);
        CampoSaldo.setVisible(false);
    }//GEN-LAST:event_BotonRetirarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Cajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JButton BotonDepositar;
    private javax.swing.JButton BotonRetirar;
    private javax.swing.JTextField CampoClave;
    private javax.swing.JTextField CampoDeposito;
    private javax.swing.JTextField CampoNumDepo;
    private javax.swing.JLabel CampoSaldo;
    private javax.swing.JTextField CampoTarjeta;
    private javax.swing.JLabel NumeroCueDepo;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TexClave;
    private javax.swing.JLabel TexNumTar;
    private javax.swing.JLabel TexSaldo;
    private javax.swing.JLabel TexTipoTarj;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel ValorDepo;
    private javax.swing.JTextField campoRetiro;
    private javax.swing.JLabel gif1;
    private javax.swing.JLabel gif2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel valorReti;
    // End of variables declaration//GEN-END:variables
}
