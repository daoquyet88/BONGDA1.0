
package bongda1.pkg0;
import javax.swing.*;
import dao.*;
import entities.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class SuaNhaTaiTro extends javax.swing.JFrame {

    public SuaNhaTaiTro() {
        initComponents();
       
    }
    public SuaNhaTaiTro(int maNhaTaiTro,String tenNhaTaiTro,String hinhThuc) {
        initComponents();
        lbMaNhaTaiTro.setText(String.valueOf(maNhaTaiTro));
        txtTenNhaTaiTro.setText(tenNhaTaiTro);
        txtHinhThuc.setText(hinhThuc);
    }
    Nhataitro ntt=new Nhataitro();
    int maNTT=ntt.getMaNhaTaiTro();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNhaTaiTro = new javax.swing.JTextField();
        txtHinhThuc = new javax.swing.JTextField();
        lbMaNhaTaiTro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Thêm Mới Trọng Tài :");

        jLabel1.setText("Mã Nhà Tài Trợ :");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnCapNhap.setText("Cap Nhap");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên Nhà Tài Trợ :");

        jLabel4.setText("Hình Thức Tài Trợ :");

        lbMaNhaTaiTro.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHinhThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtTenNhaTaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(lbMaNhaTaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(241, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lbMaNhaTaiTro)
                .addGap(35, 35, 35)
                .addComponent(txtTenNhaTaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhap)
                    .addComponent(btnThoat))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(jLabel1)
                    .addGap(40, 40, 40)
                    .addComponent(jLabel2)
                    .addGap(32, 32, 32)
                    .addComponent(jLabel4)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean kiemTraFile()
        {
            try {
                if(txtHinhThuc.getText().equals("")||txtTenNhaTaiTro.getText().equals(""))
                {
                      JOptionPane.showMessageDialog(rootPane,"chua nhap lieu");
                         return false;
                }
                           
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Nhap Sai");
                return false;
            }
        }
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // tat man hinh dang su dung
        // tat all system.exit()
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed

        if (kiemTraFile()) {
            NhaTaiTroDao nttDAO=new NhaTaiTroDao();
            Nhataitro ntt=new Nhataitro();
            ntt.setMaNhaTaiTro(Integer.parseInt(this.lbMaNhaTaiTro.getText().toString()));
            ntt.setTenNhaTaiTro(this.txtTenNhaTaiTro.getText());
            ntt.setHinhThuc(this.txtHinhThuc.getText());
            
            if (nttDAO.update(ntt)) {
                JOptionPane.showMessageDialog(rootPane, "update thanh cong");

            } else {
                JOptionPane.showMessageDialog(rootPane, "update khong thanh cong");
            }
            // JOptionPane.showMessageDialog(rootPane,"Them thanh cong");
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed
     
  
    public static void main(String args[]) throws java.lang.InstantiationException {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaNhaTaiTro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaNhaTaiTro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaNhaTaiTro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaNhaTaiTro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbMaNhaTaiTro;
    private javax.swing.JTextField txtHinhThuc;
    private javax.swing.JTextField txtTenNhaTaiTro;
    // End of variables declaration//GEN-END:variables
}
