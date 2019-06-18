
package bongda1.pkg0;

import entities.*;
import javax.swing.table.DefaultTableModel;
import dao.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class NhaTaiTroWindow extends javax.swing.JPanel {

    NhaTaiTroDao   nttDAO=new NhaTaiTroDao();
    int maNTT;
    String tenNTT;
    String hinhThuc;
    public NhaTaiTroWindow() {
        initComponents();
        LoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhaTaiTro = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSuaNhaTaiTro = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("Danh  Sách Nhà Tài Trợ");

        tbNhaTaiTro.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNhaTaiTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhaTaiTroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbNhaTaiTroMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhaTaiTro);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSuaNhaTaiTro.setText("Sửa");
        btnSuaNhaTaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNhaTaiTroActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGap(171, 171, 171)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addComponent(btnSuaNhaTaiTro)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSuaNhaTaiTro)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\anh\\anhle.jpg")); // NOI18N
        jLabel3.setText("Images");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("Ma Nha Tai Tro");
        dtm.addColumn("Ten Nha Tai Tro");
        dtm.addColumn("Hinh Thuc");
        
        for(Nhataitro tt : this.nttDAO.load_danhSach())
        {
            dtm.addRow(new Object[]{tt.getMaNhaTaiTro(),tt.getTenNhaTaiTro(),tt.getHinhThuc()});
            
        }
        this.tbNhaTaiTro.setModel(dtm);
        this.tbNhaTaiTro.repaint();
        this.tbNhaTaiTro.revalidate();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ThemNhaTaiTro jt=new  ThemNhaTaiTro();
        jt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSuaNhaTaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNhaTaiTroActionPerformed
        SuaNhaTaiTro suaNTT=new SuaNhaTaiTro(maNTT, tenNTT, hinhThuc);
        suaNTT.setVisible(true);
    }//GEN-LAST:event_btnSuaNhaTaiTroActionPerformed

    private void tbNhaTaiTroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhaTaiTroMouseClicked
        maNTT=Integer.parseInt(this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 0).toString());
        tenNTT = this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 1).toString();
        hinhThuc = this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 2).toString(); 
        
    }//GEN-LAST:event_tbNhaTaiTroMouseClicked

    private void tbNhaTaiTroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhaTaiTroMousePressed
//         maNTT=Integer.parseInt(this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 0).toString());
//        tenNTT = this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 1).toString();
//        hinhThuc = this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(), 2).toString();
    }//GEN-LAST:event_tbNhaTaiTroMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int cf=JOptionPane.showConfirmDialog(null,"co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
           int maNTT=Integer.parseInt(this.tbNhaTaiTro.getValueAt(this.tbNhaTaiTro.getSelectedRow(),0).toString());
           Nhataitro ntt=nttDAO.load(maNTT);
           
            if(this.nttDAO.delete(ntt))
            {
                JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog( null,"xoa khong thanh cong");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNhaTaiTro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNhaTaiTro;
    // End of variables declaration//GEN-END:variables
}
