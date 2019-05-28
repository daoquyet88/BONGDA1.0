
package bongda1.pkg0;

import dao.CauThuDAO;
import entities.Cauthu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TopGhiBanWindow extends javax.swing.JPanel {
    String tenCauThu;
    int maCauThu;
    int maDoiBong;
    int soBanThang;
    CauThuDAO ctd=new CauThuDAO();
    
    public TopGhiBanWindow() {
        initComponents();
        LoadData();
    }
private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("SoTT");
        dtm.addColumn("TenCauThu");
        dtm.addColumn("MaCauThu");
        dtm.addColumn("MaDoiBOng");
        dtm.addColumn("SoBanThang");   
        String hql="from Cauthu C order by C.banThang DESC";
       int i=1;
        for(Cauthu ct : this.ctd.load_danhSachDK(hql))
        {
           // dtm.addRow(new Object[]{ct.getTenCauThu()});
            dtm.addRow(new Object[]{i,ct.getTenCauThu(),ct.getMaCauThu(),ct.getBanThang(),ct.getMaDoiBong()});
            i++;
        }
        this.tbCauThu.setModel(dtm);
        this.tbCauThu.repaint();
        this.tbCauThu.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("dbbongda2?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        cauthuQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cauthu c");
        cauthuList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cauthuQuery.getResultList();
        doibongQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Doibong d");
        doibongList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doibongQuery.getResultList();
        doibongQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Doibong d");
        doibongList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doibongQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCauThu = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();

        jLabel1.setText("images");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbCauThuMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCauThu);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnReport.setText("Report");

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
                        .addGap(56, 56, 56)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
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

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
      SuaBanThang sbt=new SuaBanThang(maCauThu, tenCauThu, maDoiBong, soBanThang);
      sbt.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbCauThuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCauThuMousePressed
        tenCauThu=tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(),1).toString();
         maCauThu=Integer.parseInt(tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(),0).toString());
          maDoiBong=Integer.parseInt(tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(),8).toString());
           soBanThang=Integer.parseInt(tbCauThu.getValueAt(this.tbCauThu.getSelectedRow(),5).toString());
    }//GEN-LAST:event_tbCauThuMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSua;
    private java.util.List<bongda1.pkg0.Cauthu> cauthuList;
    private javax.persistence.Query cauthuQuery;
    private java.util.List<bongda1.pkg0.Doibong> doibongList;
    private java.util.List<bongda1.pkg0.Doibong> doibongList1;
    private javax.persistence.Query doibongQuery;
    private javax.persistence.Query doibongQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCauThu;
    // End of variables declaration//GEN-END:variables
}
