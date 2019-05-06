package bongda1.pkg0;
import java.util.*;
import dao.*;
import entities.*;
import org.hibernate.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TrongTaiWindow extends javax.swing.JPanel {

   public TrongTaiDAO ttd=new TrongTaiDAO();
    public String maTrongTai;
    public String tenTrongTai;
    public String ngaySinh;
    public int soTranBat;
    
    
    public TrongTaiWindow() {
        initComponents();
        LoadData();
    }
    private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("MaTrongTai");
        dtm.addColumn("TenTrongTai");
        dtm.addColumn("NgaySinh");
        dtm.addColumn("SoTranBat");
        for(Trongtai tt : this.ttd.load_danhSachTT())
        {
            dtm.addRow(new Object[]{tt.getMaTrongTai(),tt.getTenTrongTai(),tt.getNgaySinh(),tt.getSoTranBat()});
            
        }
        this.tbTrongTai.setModel(dtm);
        this.tbTrongTai.repaint();
        this.tbTrongTai.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTrongTai = new javax.swing.JTable();
        btnThemTrongTai = new javax.swing.JButton();
        btnSuaTT = new javax.swing.JButton();
        btnXoaTrongTai = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("images");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("images");

        tbTrongTai.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTrongTai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrongTaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTrongTaiMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbTrongTai);

        btnThemTrongTai.setText("Thêm");
        btnThemTrongTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTrongTaiActionPerformed(evt);
            }
        });

        btnSuaTT.setText("Sửa");
        btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTTActionPerformed(evt);
            }
        });

        btnXoaTrongTai.setText("Xóa");
        btnXoaTrongTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrongTaiActionPerformed(evt);
            }
        });

        jButton4.setText("Cập Nhập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnThemTrongTai)
                        .addGap(67, 67, 67)
                        .addComponent(btnSuaTT)
                        .addGap(69, 69, 69)
                        .addComponent(btnXoaTrongTai)
                        .addGap(73, 73, 73)
                        .addComponent(jButton4)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTrongTai)
                    .addComponent(btnSuaTT)
                    .addComponent(btnXoaTrongTai)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemTrongTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTrongTaiActionPerformed
        ThemTrongTai tt=new ThemTrongTai();
        tt.setLocation(250,250);
        tt.setVisible(true);
    }//GEN-LAST:event_btnThemTrongTaiActionPerformed
    // su kien click chuot trong table
    private void tbTrongTaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrongTaiMouseClicked
         maTrongTai = this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 0).toString();
         tenTrongTai= this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 1).toString();
        ngaySinh = this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 2).toString();
        soTranBat =Integer.parseInt(this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 3).toString());        

    }//GEN-LAST:event_tbTrongTaiMouseClicked

    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
     
//        Trongtai tt=new Trongtai(maTrongTai,tenTrongTai,ngaySinh,soTranBat);
        SuaTrongTai stt=new SuaTrongTai(maTrongTai,tenTrongTai,ngaySinh,soTranBat);
        stt.setVisible(true);
        
    }//GEN-LAST:event_btnSuaTTActionPerformed

    private void tbTrongTaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrongTaiMousePressed
          maTrongTai = this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 0).toString();
         tenTrongTai= this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 1).toString();
        ngaySinh = this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 2).toString();
        soTranBat =Integer.parseInt(this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(), 3).toString());        

    }//GEN-LAST:event_tbTrongTaiMousePressed

    private void btnXoaTrongTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrongTaiActionPerformed

        int cf=JOptionPane.showConfirmDialog(null,"co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
           String name=this.tbTrongTai.getValueAt(this.tbTrongTai.getSelectedRow(),0).toString();
           Trongtai tt=ttd.load_TT(name);
           
            if(this.ttd.delete_TT(tt))
            {
                JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog( null,"xoa khong thanh cong");
            }
        }
       
    }//GEN-LAST:event_btnXoaTrongTaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaTT;
    private javax.swing.JButton btnThemTrongTai;
    private javax.swing.JButton btnXoaTrongTai;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTrongTai;
    // End of variables declaration//GEN-END:variables
}
