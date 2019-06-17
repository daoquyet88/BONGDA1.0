
package bongda1.pkg0;

import javax.swing.DefaultComboBoxModel;
import dao.*;
import entities.*;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.*;
/**
 *
 * @author Admin
 */
public class ThongTinWindow extends javax.swing.JPanel {

    GiaiDauDAO gdDAO=new GiaiDauDAO();
    VongDAO vDAO=new VongDAO();
    TranDauDAO tdDAO=new  TranDauDAO();
    XepHangDao xhDAO=new XepHangDao();
    LichThiDauDAO ltdDao=new LichThiDauDAO();
    int maDoi,tt,th,tb,bt,bb,hs,diem;
    public ThongTinWindow() {
        initComponents();
        LoadData();
        LoadCB_vong();
        LoadCB();
        LoadDataXepHang();
    }
    public void LoadCB()
    {
        DefaultComboBoxModel model=new DefaultComboBoxModel();
        model.addElement(new Giaidau(0,"--Chon Giai Dau-"));
        for(entities.Giaidau gd : this.gdDAO.load_danhSach())
        {
            
            model.addElement(new Giaidau(gd.getMaGiai(),gd.getTenGiai()));
            //cb_doiBong.addItem(db.getTenDoiBong());
        }     

        cb_giaiDau.setModel(model);
    }
    public void LoadCB_vong()
    {
        DefaultComboBoxModel model=new DefaultComboBoxModel();
        model.addElement(new Giaidau(0,"--Chon Vong-"));
        for(entities.Vong gd : this.vDAO.load_danhSach())
        {
            
            model.addElement(new Giaidau(gd.getVong(),gd.getTenVong()));
            //cb_doiBong.addItem(db.getTenDoiBong());
        }     

        cb_vong.setModel(model);
    }
     private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        //dtm.addColumn("MaGiai");
        dtm.addColumn("MaTran");
        dtm.addColumn("Vong");
        dtm.addColumn("ThoiGian");
        dtm.addColumn("ChuNha");
        dtm.addColumn("TSChuNha");
        dtm.addColumn("TSKhach");
        dtm.addColumn("Khach");
        dtm.addColumn("San");
        
        for(entities.Trandau td : this.tdDAO.load_danhSach())
        {
            
            dtm.addRow(new Object[]{td.getMaTran(),td.getVong(),td.getThoiGian(),
                td.getTenChuNha(),td.getTschuNha(),td.getTskhach(),td.getTenDoiKhach(),td.getSan(),td.getMaChuNha()});
            
        }
        this.tb_lichThiDau.setModel(dtm);
        this.tb_lichThiDau.repaint();
        this.tb_lichThiDau.revalidate();
    }
       private void LoadDataXepHang()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        //dtm.addColumn("MaGiai");
        dtm.addColumn("MaDoiBong");
        dtm.addColumn("TranThang");
        dtm.addColumn("TranHoa");
        dtm.addColumn("TranBai");
        dtm.addColumn("BanThang");
        dtm.addColumn("BanBai");
        dtm.addColumn("HieuSO");
        dtm.addColumn("Diem");
        
        for(entities.Xemhang xh : this.xhDAO.load_danhSach())
        {
            
            dtm.addRow(new Object[]{xh.getMaDoiBong(),xh.getTranThang(),xh.getTranHoa(),
                xh.getTranBai(),xh.getBanThang(),xh.getBanBai(),xh.getHieuSo(),xh.getDiem()});
            
        }
        this.tb_xepHang.setModel(dtm);
        this.tb_xepHang.repaint();
        this.tb_xepHang.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThemlichthidau = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lichThiDau = new javax.swing.JTable();
        cb_giaiDau = new javax.swing.JComboBox<>();
        cb_vong = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_xepHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        btnThemlichthidau.setText("Thêm lịch thi đấu");
        btnThemlichthidau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnThemlichthidau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemlichthidauActionPerformed(evt);
            }
        });

        tb_lichThiDau.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_lichThiDau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Đội 1", "Đội 2", "Ngày-Giờ", "Sân"
            }
        ));
        tb_lichThiDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_lichThiDauMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_lichThiDauMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_lichThiDau);

        cb_vong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_vongActionPerformed(evt);
            }
        });

        jLabel8.setText("Bảng Xếp Hạng");

        tb_xepHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cầu thủ", "Đội", "Loại bàn thắng", "Thời điểm"
            }
        ));
        tb_xepHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_xepHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_xepHangMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb_xepHang);

        jLabel1.setText("Giai Dau");

        jLabel2.setText("Vong");

        jLabel3.setText("Lịch Thi Đấu Và Kết Quả");

        jButton1.setText("Cập Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Report");

        btnCapNhap.setText("Cập Nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        jButton5.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(295, 295, 295))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(cb_giaiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(btnCapNhap)
                .addGap(82, 82, 82)
                .addComponent(jButton5)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThemlichthidau)
                            .addGap(937, 937, 937))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb_vong, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cb_giaiDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnCapNhap)
                    .addComponent(jButton5))
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(cb_vong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnThemlichthidau)
                    .addGap(70, 70, 70)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemlichthidauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemlichthidauActionPerformed
        //  TODO add your handling code here:
        Themlichthidau LTD = new Themlichthidau();
        LTD.setLocation(400, 300);
        LTD.setVisible(true);
    }//GEN-LAST:event_btnThemlichthidauActionPerformed

    private void tb_lichThiDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_lichThiDauMouseClicked
       
    }//GEN-LAST:event_tb_lichThiDauMouseClicked

    private void cb_vongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_vongActionPerformed
        
    }//GEN-LAST:event_cb_vongActionPerformed

    private void tb_xepHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_xepHangMouseClicked

        maDoi=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),0).toString());
         tt=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),1).toString());
        th=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),2).toString());
        tb=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),3).toString());
        bt=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),4).toString());
         bb=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),5).toString());
         hs=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),6).toString());
         diem=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),7).toString());
    }//GEN-LAST:event_tb_xepHangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ma=Integer.parseInt(this.tb_lichThiDau.getValueAt(this.tb_lichThiDau.getSelectedRow(),0).toString());
        SuaLichThiDau std=new SuaLichThiDau(ma);
        std.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb_lichThiDauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_lichThiDauMousePressed
//         String name=this.tb_lichThiDau.getValueAt(this.tb_lichThiDau.getSelectedRow(),8).toString();
//       JOptionPane.showMessageDialog(this,"chuoi"+name);
    }//GEN-LAST:event_tb_lichThiDauMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int cf=JOptionPane.showConfirmDialog(null,"co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
           int maNTT=Integer.parseInt(this.tb_lichThiDau.getValueAt(this.tb_lichThiDau.getSelectedRow(),0).toString());
           Trandau ntt=ltdDao.load(maNTT);
           
            if(this.ltdDao.delete(ntt))
            {
                JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog( null,"xoa khong thanh cong");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
       
        SuaXepHang xh=new SuaXepHang(maDoi,tt,th,tb,bt,bb,hs,diem);
        xh.setVisible(true);
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void tb_xepHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_xepHangMousePressed
          maDoi=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),0).toString());
         tt=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),1).toString());
        th=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),2).toString());
        tb=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),3).toString());
        bt=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),4).toString());
         bb=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),5).toString());
         hs=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),6).toString());
         diem=Integer.parseInt(this.tb_xepHang.getValueAt(this.tb_xepHang.getSelectedRow(),7).toString());
    }//GEN-LAST:event_tb_xepHangMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnThemlichthidau;
    private javax.swing.JComboBox<String> cb_giaiDau;
    private javax.swing.JComboBox<String> cb_vong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_lichThiDau;
    private javax.swing.JTable tb_xepHang;
    // End of variables declaration//GEN-END:variables
}
