
package bongda1.pkg0;

import dao.CauThuDAO;
import entities.Cauthu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TopGhiBanWindow extends javax.swing.JPanel {

    CauThuDAO ctd=new CauThuDAO();
    public int maCauThu;
    public String tenCauThu;
    public String Vitri;
    public int soAo;
    public String NgaySinh;
    public int BanThang;
    public int TheVang;
    public int TheDo;
    
    
    
    
    public TopGhiBanWindow() {
        initComponents();
        LoadData();
    }
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
        for(Cauthu ct : this.ctd.load_danhSach())
        {
            dtm.addRow(new Object[]{ct.getMaCauThu(),ct.getTenCauThu(),ct.getViTri(),ct.getNgaySinh(),ct.getBanThang(),ct.getTheVang(),ct.getTheDo(),ct.getMaDoiBong()});
            
        }
        this.tbCauThu.setModel(dtm);
        this.tbCauThu.repaint();
        this.tbCauThu.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("dbbongda2?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        cauthuQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cauthu c");
        cauthuList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cauthuQuery.getResultList();
        doibongQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Doibong d");
        doibongList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doibongQuery.getResultList();
        doibongQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Doibong d");
        doibongList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doibongQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCauThu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();

        jLabel1.setText("images");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, doibongList1, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel3.setText("Chọn Đội Bóng :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("images");

        tbCauThu.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCauThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCauThuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCauThu);

        jButton1.setText("Sửa");

        jButton2.setText("Report");

        jButton3.setText("Thêm ");

        BtnXoa.setText("Xóa");
        BtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(BtnXoa)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(BtnXoa))
                .addContainerGap())
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

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCauThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCauThuMouseClicked
       maCauThu = Integer.parseInt(this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 0).toString());
       tenCauThu= this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 1).toString();
       Vitri = this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 2).toString();
        soAo =Integer.parseInt(this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 3).toString());  
        NgaySinh= this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 4).toString();
        BanThang =Integer.parseInt(this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 5).toString());  
        TheVang =Integer.parseInt(this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 6).toString());  
         TheDo =Integer.parseInt(this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(),7).toString());  
    }//GEN-LAST:event_tbCauThuMouseClicked

    private void BtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaActionPerformed
          int cf=JOptionPane.showConfirmDialog(null,"Co chac xoa trong tai ko","xac nhan",JOptionPane.YES_NO_OPTION);
        if(cf==JOptionPane.YES_OPTION)
        {
            
         String name= this.tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(), 1).toString();
           Cauthu ct=ctd.load(name);
           
            if(this.ctd.delete(ct))
            {
               JOptionPane.showMessageDialog(null," xoa thanh cong");
                LoadData();
            } else {
                JOptionPane.showMessageDialog(null," xoa khong thanh cong");
                
            }
        }
    }//GEN-LAST:event_BtnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnXoa;
    private java.util.List<bongda1.pkg0.Cauthu> cauthuList;
    private javax.persistence.Query cauthuQuery;
    private java.util.List<bongda1.pkg0.Doibong> doibongList;
    private java.util.List<bongda1.pkg0.Doibong> doibongList1;
    private javax.persistence.Query doibongQuery;
    private javax.persistence.Query doibongQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCauThu;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
