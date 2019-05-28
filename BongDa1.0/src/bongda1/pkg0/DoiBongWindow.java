
package bongda1.pkg0;

import dao.CauThuDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DoiBongWindow extends javax.swing.JPanel {

    public DoiBongWindow() {
        initComponents();
        LoadData();
    }
CauThuDAO ctd=new CauThuDAO();
    public int maCauThu;
    public String tenCauThu;
    public int Vitri;
    public int soAo;
    public String NgaySinh;
    public int BanThang;
    public int TheVang;
    public int TheDo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("MaCauThu");
        dtm.addColumn("TenCauThu");
        dtm.addColumn("ViTri");
        dtm.addColumn("SoAo");
        dtm.addColumn("NgaySinh");
        dtm.addColumn("BanThang");
        dtm.addColumn("TheVang");
        dtm.addColumn("TheDO");
        dtm.addColumn("MaDoiBong");
        for(entities.Cauthu ct : this.ctd.load_danhSach())
        {
            dtm.addRow(new Object[]{ct.getMaCauThu(),ct.getTenCauThu(),ct.getViTri(),ct.getNgaySinh(),ct.getBanThang(),ct.getTheVang(),ct.getTheDo(),ct.getMaDoiBong()});
            
        }
        this.tbcauthu.setModel(dtm);
        this.tbcauthu.repaint();
        this.tbcauthu.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcauthu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        jLabel2.setText("jLabel2");

        tbcauthu.setModel(new javax.swing.table.DefaultTableModel(
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
        tbcauthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcauthuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcauthu);

        jButton1.setText("Thêm");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jLabel3.setText("Huấn Luận Viên");

        label1.setText("label1");

        jLabel4.setText("Danh Sách Cầu Thủ");

        jLabel5.setText("Đội Bóng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Ngày Sinh");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton1)
                        .addGap(84, 84, 84)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(btnXoa)
                        .addGap(317, 317, 317))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addGap(188, 188, 188)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(jButton6)
                                .addGap(53, 53, 53)
                                .addComponent(jButton7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int cf=JOptionPane.showConfirmDialog(null,"Co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
         int name= Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 0).toString());
              entities.Cauthu ct=ctd.load(name);
           
            if(this.ctd.delete(ct))
            {
               JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog(null," xoa khong thanh cong");
                
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       
        SuaCauThu sct=new SuaCauThu(maCauThu);
        sct.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbcauthuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcauthuMouseClicked
        maCauThu = Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 0).toString());
        tenCauThu= this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 1).toString();
        Vitri = Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 2).toString());
        soAo =Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 3).toString());  
        NgaySinh= this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 4).toString();
        BanThang =Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 5).toString());  
        TheVang =Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(), 6).toString());  
        TheDo =Integer.parseInt(this.tbcauthu.getValueAt(this.tbcauthu.getSelectedRow(),7).toString()); 
    }//GEN-LAST:event_tbcauthuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tbcauthu;
    // End of variables declaration//GEN-END:variables
}
