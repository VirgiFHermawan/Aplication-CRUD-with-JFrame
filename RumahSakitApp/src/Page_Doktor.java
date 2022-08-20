/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author virgi
 */
public class Page_Doktor extends javax.swing.JFrame {

    /**
     * Creates new form Page_Doktor
     */
    DefaultTableModel model;
     
    public Page_Doktor() {
        initComponents();
        String[] judul = {"ID Dokter", "Nama Dokter", "Umur Doktor", "Jenis Kelamin", "No Handphone", "Spesialis", "Waktu Kunjungan","Alamat Dokter"};
        model = new DefaultTableModel(judul, 0);
        tbl_datadoktor.setModel(model);
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Umur_Doktor = new javax.swing.JTextField();
        Phone_Doktor = new javax.swing.JTextField();
        JK_Doktor = new javax.swing.JComboBox<>();
        btn_tambah = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datadoktor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_find = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ID_Doktor = new javax.swing.JTextField();
        Nama_Doktor = new javax.swing.JTextField();
        Spesialis_Doktor = new javax.swing.JTextField();
        Time_Doktor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Alamat_Doktor = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Umur_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 330, -1));
        getContentPane().add(Phone_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 330, -1));

        JK_Doktor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose :", "Laki Laki", "Perempuan" }));
        getContentPane().add(JK_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 132, -1));

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        tbl_datadoktor.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_datadoktor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datadoktorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_datadoktor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Pengisian Data Doktor Baru");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 40));

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 750, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Rumah Sakit Fakultas Teknik Universitas Indonesia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("ID Doktor                    :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel10.setText("Waktu Kunjungan        :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 141, 218, -1));

        btn_find.setText("Cari");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        getContentPane().add(btn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jLabel5.setText("Alamat Doktor             :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel7.setText("Jenis Kelamin              :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setText("Nomor Handphone       :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel9.setText("Spesialis                     :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        getContentPane().add(ID_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 257, -1));
        getContentPane().add(Nama_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 330, -1));
        getContentPane().add(Spesialis_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 330, -1));

        Time_Doktor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time_DoktorActionPerformed(evt);
            }
        });
        getContentPane().add(Time_Doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 330, -1));

        Alamat_Doktor.setColumns(20);
        Alamat_Doktor.setRows(5);
        jScrollPane2.setViewportView(Alamat_Doktor);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 330, 127));

        jLabel11.setText("Umur Doktor               :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel12.setText("Nama Doktor               :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source Icon/Icon Doktor.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 110, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit", "root", "");
            String sql = "insert into data_doktor values(?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement statement = cn.prepareStatement(sql);

            statement.setString(1, ID_Doktor.getText());
            statement.setString(2, Nama_Doktor.getText());
            statement.setString(3, Umur_Doktor.getText());
            statement.setString(4, (String) JK_Doktor.getSelectedItem());
            statement.setString(5, Phone_Doktor.getText());
            statement.setString(6, Spesialis_Doktor.getText());
            statement.setString(7, Time_Doktor.getText());
            statement.setString(8, Alamat_Doktor.getText());

            statement.executeUpdate();
            tampilData();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN", "informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN" + e);
        }   
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit", "root", "");
            String sql = "update data_doktor set Nama_Doktor=?, Umur_Doktor=?, Jenis_Kelamin=?, Nomor_Handphone=?, Spesialis=?, Waktu_Kunjungan=?, Alamat_Doktor where ID_Doktor=?";
            java.sql.PreparedStatement statement = cn.prepareStatement(sql);

            statement.setString(1, ID_Doktor.getText());
            statement.setString(2, Nama_Doktor.getText());
            statement.setString(3, Umur_Doktor.getText());
            statement.setString(4, (String) JK_Doktor.getSelectedItem());
            statement.setString(5, Phone_Doktor.getText());
            statement.setString(6, Spesialis_Doktor.getText());
            statement.setString(7, Time_Doktor.getText());
            statement.setString(8, Alamat_Doktor.getText());

            statement.executeUpdate();
            tampilData();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUBAH", "informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DIUBAH" + e);
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        new Page_MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit", "root", "");
            String sql = "SELECT * FROM data_dokter WHERE ID_Doktor";
            java.sql.PreparedStatement statement = cn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                Nama_Doktor.setText(rs.getString(2));
                Umur_Doktor.setText(rs.getString(3));
                JK_Doktor.setSelectedItem(rs.getString(4));
                Phone_Doktor.setText(rs.getString(5));
                Spesialis_Doktor.setText(rs.getString(6));
                Time_Doktor.setText(rs.getString(7));
                Alamat_Doktor.setText(rs.getString(8));
                JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            statement.close();
        }
        catch( SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int baris = tbl_datadoktor.getSelectedRow();
        String ID_Doktor = model.getValueAt(baris, 0).toString();
        int Data = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengapus data kode dokter : " + ID_Doktor + "?", "konfirmasi", JOptionPane.YES_NO_OPTION);

        if (Data == 0) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit", "root", "");
                String sql = "delete from data_doktor where ID_Doktor='" + ID_Doktor + "'";
                java.sql.PreparedStatement statement = cn.prepareStatement(sql);

                statement.executeUpdate();
                tampilData();
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS", "informasi", JOptionPane.INFORMATION_MESSAGE);
                reset();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "DATA GAGAL DIHAPUS" + e);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tbl_datadoktorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datadoktorMouseClicked
        // TODO add your handling code here:
        int i = tbl_datadoktor.getSelectedRow();

        if (i > -1) {
            ID_Doktor.setText(model.getValueAt(i, 0).toString());
            Nama_Doktor.setText(model.getValueAt(i, 1).toString());
            Umur_Doktor.setText(model.getValueAt(i, 3).toString());
            JK_Doktor.setSelectedItem(model.getValueAt(i, 4).toString());
            Phone_Doktor.setText(model.getValueAt(i, 5).toString());
            Spesialis_Doktor.setText(model.getValueAt(i, 6).toString());
            Time_Doktor.setText(model.getValueAt(i, 7).toString());
            Alamat_Doktor.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_tbl_datadoktorMouseClicked

    private void Time_DoktorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time_DoktorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time_DoktorActionPerformed
   
    private void reset(){
       ID_Doktor.setText("");
       Nama_Doktor.setText("");
       Umur_Doktor.setText("");
       JK_Doktor.setSelectedItem("-PILIH-");
       Phone_Doktor.setText("");
       Spesialis_Doktor.setText("");
       Time_Doktor.setText("");
       Alamat_Doktor.setText("");
    }
    
    private void tampilData() {
        int row = tbl_datadoktor.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM data_doktor");
            while (rs.next()) {
                String data[] = {rs.getString("ID_Dokter"), rs.getString("Nama_Doktor"),rs.getString("Umur_Doktor"), rs.getString("Jenis_Kelamin"), rs.getString("Nomor_Handphone"), rs.getString("Spesialis"), rs.getString("Waktu_Kunjungan"), rs.getString("Alamat_Doktor")};
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan Data GAGAL" + e);
        }
    }
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
            java.util.logging.Logger.getLogger(Page_Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Doktor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat_Doktor;
    private javax.swing.JTextField ID_Doktor;
    private javax.swing.JComboBox<String> JK_Doktor;
    private javax.swing.JTextField Nama_Doktor;
    private javax.swing.JTextField Phone_Doktor;
    private javax.swing.JTextField Spesialis_Doktor;
    private javax.swing.JTextField Time_Doktor;
    private javax.swing.JTextField Umur_Doktor;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_datadoktor;
    // End of variables declaration//GEN-END:variables
}