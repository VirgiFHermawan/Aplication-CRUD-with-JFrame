/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author virgi
 */
public class Page_MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form Page_MainMenu
     */
    public Page_MainMenu() {
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_checkup = new javax.swing.JButton();
        btn_lab = new javax.swing.JButton();
        btn_rawatinap = new javax.swing.JButton();
        btn_datadoktor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_payment = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btn_apotek = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setText("Main Menu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Rumah Sakit Fakultas Teknik ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 47, -1, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Universitas Indoneisa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 85, -1, 25));

        jLabel9.setText("Gedung Enginering Center Lt. 1, FTUI Kampus Baru UI Depok, Jalan Prof. DR. Ir R. Roosseno, Kukusan, Kecamatan Beji, Kota Depok, Jawa Barat 16425");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 141, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon CCIT FTUI.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 13, 285, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Kemenkes (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 13, 290, -1));

        btn_checkup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Check Up.png"))); // NOI18N
        btn_checkup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkup, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 218, 121, -1));

        btn_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Lab.png"))); // NOI18N
        btn_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_labActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 218, 115, 115));

        btn_rawatinap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Pasien.png"))); // NOI18N
        btn_rawatinap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rawatinapActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rawatinap, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 396, 121, -1));

        btn_datadoktor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Doktor.png"))); // NOI18N
        btn_datadoktor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datadoktorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_datadoktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 396, 115, 115));

        jLabel10.setText("Medical Check Up");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 346, -1, -1));

        jLabel11.setText("Laboraturium");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 346, -1, -1));

        jLabel13.setText("Pendaftaran Rawat Inap");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel12.setText("Data Doktor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        btn_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Payment.png"))); // NOI18N
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 396, 120, 115));

        jLabel14.setText("Pembayaran ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        btn_apotek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Obat.png"))); // NOI18N
        btn_apotek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apotekActionPerformed(evt);
            }
        });
        getContentPane().add(btn_apotek, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 218, 120, -1));

        jLabel15.setText("Data Obat");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 342, -1, -1));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_checkupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkupActionPerformed
        // TODO add your handling code here:
         new Page_MedicalCheckUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_checkupActionPerformed

    private void btn_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_labActionPerformed
        // TODO add your handling code here:
         new Page_Laboraturium().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_labActionPerformed

    private void btn_rawatinapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rawatinapActionPerformed
        // TODO add your handling code here:
         new Page_RawatInap().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_rawatinapActionPerformed

    private void btn_datadoktorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datadoktorActionPerformed
        // TODO add your handling code here:
        new Page_Doktor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_datadoktorActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        // TODO add your handling code here:
        new Page_Payment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void btn_apotekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apotekActionPerformed
        // TODO add your handling code here:
        new Page_Obat().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_apotekActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        new Page_Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Page_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apotek;
    private javax.swing.JButton btn_checkup;
    private javax.swing.JButton btn_datadoktor;
    private javax.swing.JButton btn_lab;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_rawatinap;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
