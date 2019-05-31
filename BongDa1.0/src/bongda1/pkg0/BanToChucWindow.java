
package bongda1.pkg0;
import entities.*;
import dao.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class BanToChucWindow extends javax.swing.JPanel {
    private String maNguoiDung;
     private String tenNguoiDung;
     private String useName;
     private String passWord;
     private int quyen;
     private String ngayLap;    
    BanToChucDao btcDao=new BanToChucDao();
    public BanToChucWindow() {
        initComponents();
       LoadData();
    }
    private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("Mã");
        dtm.addColumn("Tên");
        dtm.addColumn("useName");
        dtm.addColumn("passWord");
        dtm.addColumn("admin");
        dtm.addColumn("Ngày lập");
        int i=0;
        for(Nguoidung nd : this.btcDao.load_danhSachND())
        {
            dtm.addRow(new Object[]{i,nd.getMaNguoiDung(),nd.getTenNguoiDung(),nd.getUseName(),nd.getPassWord(),nd.getQuyen(),nd.getNgayLap()});
            i++;
        }
        this.tb_BanTocChuc.setModel(dtm);
        this.tb_BanTocChuc.repaint();
        this.tb_BanTocChuc.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_taoTaioKhoan = new javax.swing.JButton();
        txt_tenNhanVien = new javax.swing.JTextField();
        txt_useName = new javax.swing.JTextField();
        txt_passWord = new javax.swing.JTextField();
        txt_ngayLap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_maNguoiDung = new javax.swing.JTextField();
        txt_quyenHan = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_BanTocChuc = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_xoaTaiKhoan = new javax.swing.JButton();
        btn_xoaHet = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Quản Lý Người Dùng");

        btn_taoTaioKhoan.setText("Tạo Tài Khoản");
        btn_taoTaioKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoTaioKhoanActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên Nhân Viên :");

        jLabel4.setText("UseName :");

        jLabel5.setText("PassWord :");

        jLabel6.setText("Quyền :");

        jLabel7.setText("Ngày Lập :");

        jLabel8.setText("Mã Người Dùng :");

        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_useName)
                                .addComponent(txt_passWord)
                                .addComponent(txt_tenNhanVien)
                                .addComponent(txt_maNguoiDung)
                                .addComponent(txt_quyenHan, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(txt_ngayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_taoTaioKhoan)
                        .addGap(91, 91, 91)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_useName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_quyenHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_taoTaioKhoan)
                    .addComponent(jButton3))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Danh Sách Người Dùng");

        tb_BanTocChuc.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_BanTocChuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_BanTocChucMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_BanTocChuc);

        jButton2.setText("Report");

        jButton1.setText("Cập Nhập ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_xoaTaiKhoan.setText("Xóa Tài Khoản");
        btn_xoaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTaiKhoanActionPerformed(evt);
            }
        });

        btn_xoaHet.setText("Xóa Hết");
        btn_xoaHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaHetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_xoaTaiKhoan)
                        .addGap(47, 47, 47)
                        .addComponent(btn_xoaHet)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaTaiKhoan)
                    .addComponent(btn_xoaHet))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_BanTocChucMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_BanTocChucMousePressed
       // txt_STT.setText(this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),0).toString());
       maNguoiDung=this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),1).toString();
        tenNguoiDung=this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),2).toString();
        useName=this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),3).toString();
        passWord=this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),4).toString();
        quyen=Integer.parseInt(this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),5).toString());
        ngayLap=this.tb_BanTocChuc.getValueAt(tb_BanTocChuc.getSelectedRow(),6).toString();
    }//GEN-LAST:event_tb_BanTocChucMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SuaNguoiDung snd=new SuaNguoiDung(maNguoiDung, tenNguoiDung,useName,passWord,quyen,ngayLap);
        snd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_taoTaioKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoTaioKhoanActionPerformed
       Nguoidung nd=new Nguoidung();
       nd.setMaNguoiDung(txt_maNguoiDung.getText().toString());
       nd.setTenNguoiDung(txt_tenNhanVien.getText().toString());
       nd.setUseName(txt_useName.getText().toString());
       nd.setPassWord(txt_passWord.getText().toString());
       nd.setQuyen(Integer.parseInt(txt_quyenHan.getText().toString()));
       nd.setNgayLap(txt_ngayLap.getText().toString());
       if(btcDao.add_BTC(nd))
       {
           JOptionPane.showConfirmDialog(btn_xoaHet,"thanh cong");
       }
       else
       {
           JOptionPane.showConfirmDialog(btn_xoaHet,"that bai");
       }
        txt_maNguoiDung.setText("");
        txt_tenNhanVien.setText("");
        txt_useName.setText("");
        txt_passWord.setText("");
        txt_quyenHan.setText("");
        txt_ngayLap.setText("");
       LoadData();
       
    }//GEN-LAST:event_btn_taoTaioKhoanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_xoaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTaiKhoanActionPerformed
        int cf=JOptionPane.showConfirmDialog(null,"co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
           String name=this.tb_BanTocChuc.getValueAt(this.tb_BanTocChuc.getSelectedRow(),1).toString();
           Nguoidung nd=btcDao.load_ND(name);
           
            if(this.btcDao.delete_btc(nd))
            {
                JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog( null,"xoa khong thanh cong");
            }
        }
    }//GEN-LAST:event_btn_xoaTaiKhoanActionPerformed

    private void btn_xoaHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaHetActionPerformed
         int cf=JOptionPane.showConfirmDialog(null,"co chac xoa het nhan vien","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
          
            if(this.btcDao.deleteAll())
            {
                JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog( null,"xoa khong thanh cong");
            }
        }
    }//GEN-LAST:event_btn_xoaHetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_taoTaioKhoan;
    private javax.swing.JButton btn_xoaHet;
    private javax.swing.JButton btn_xoaTaiKhoan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_BanTocChuc;
    private javax.swing.JTextField txt_maNguoiDung;
    private javax.swing.JTextField txt_ngayLap;
    private javax.swing.JTextField txt_passWord;
    private javax.swing.JTextField txt_quyenHan;
    private javax.swing.JTextField txt_tenNhanVien;
    private javax.swing.JTextField txt_useName;
    // End of variables declaration//GEN-END:variables
}
