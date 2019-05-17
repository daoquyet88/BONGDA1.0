
package bongda1.pkg0;
import javax.swing.*;
import dao.*;
import entities.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class SuaTrongTai extends javax.swing.JFrame {

    public SuaTrongTai() {
        initComponents();
        lbMaTrongTai.setText(maTT);
    }
    public SuaTrongTai(String maTrongTai,String tenTrongTai,String ngaySinh,int soTranBat) {
        initComponents();
        lbMaTrongTai.setText(maTrongTai);
        txtTenTrongTai.setText(tenTrongTai);
        txtNgaySinh.setText(ngaySinh);
        txt_SoTranBat.setText(String.valueOf(soTranBat));
    }
    Trongtai tt=new Trongtai();
    String maTT=tt.getMaTrongTai();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenTrongTai = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_SoTranBat = new javax.swing.JTextField();
        lbMaTrongTai = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Thêm Mới Trọng Tài :");

        jLabel1.setText("Mã Trọng Tài :");

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

        jLabel2.setText("Tên Trọng Tài :");

        jLabel4.setText("Ngày Sinh :");

        jLabel3.setText("Số Trận Bắt :");

        txt_SoTranBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoTranBatActionPerformed(evt);
            }
        });

        lbMaTrongTai.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_SoTranBat, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtTenTrongTai, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(lbMaTrongTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lbMaTrongTai)
                .addGap(35, 35, 35)
                .addComponent(txtTenTrongTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txt_SoTranBat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
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
                    .addGap(36, 36, 36)
                    .addComponent(jLabel3)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCapNhap)
                        .addComponent(btnThoat))
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean kiemTraFile()
        {
            try {
                if(txtNgaySinh.getText().equals("")||txtTenTrongTai.getText().equals("")||txt_SoTranBat.getText().equals(""))
                {
                      JOptionPane.showMessageDialog(rootPane,"chua nhap lieu");
                         return false;
                }
                Integer.parseInt(txt_SoTranBat.getText());            
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Nhap So Nguyen Vao o So Tran Bat");
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
            TrongTaiDAO ttd = new TrongTaiDAO();
            Trongtai tt = new Trongtai();
            tt.setMaTrongTai(this.lbMaTrongTai.getText());
            tt.setTenTrongTai(this.txtTenTrongTai.getText());
            tt.setNgaySinh(this.txtNgaySinh.getText());
            tt.setSoTranBat(Integer.parseInt(this.txt_SoTranBat.getText()));
            if (ttd.update_TT(tt)) {
                JOptionPane.showMessageDialog(rootPane, "update thanh cong");

            } else {
                JOptionPane.showMessageDialog(rootPane, "update khong thanh cong");
            }
            // JOptionPane.showMessageDialog(rootPane,"Them thanh cong");
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed
     
    private void txt_SoTranBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoTranBatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoTranBatActionPerformed

  
    public static void main(String args[]) throws java.lang.InstantiationException {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaTrongTai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaTrongTai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaTrongTai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaTrongTai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbMaTrongTai;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenTrongTai;
    private javax.swing.JTextField txt_SoTranBat;
    // End of variables declaration//GEN-END:variables
}
