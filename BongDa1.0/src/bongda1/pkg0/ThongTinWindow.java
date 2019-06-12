/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ThongTinWindow extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinWindow
     */
    
    public ThongTinWindow(){
        initComponents();
        init();
    }
    public void init(){
        cboGiaDau.setModel(GetModel("Select * From giaidau","TenGiai"));
        cboVongDau.setModel(GetModel("Select * From vong","TenVong"));
        SetupTable(cboGiaDau.getSelectedItem().toString(),cboVongDau.getSelectedItem().toString());
    }
//    public class Lichthidau{
//        
//    }
    protected DefaultTableModel TModel;
    protected ArrayList<String> ListID = new  ArrayList<String>();
    private void SetupTable(String Giai,String Vong ){
        TModel = new DefaultTableModel();
        Vector column = new Vector();
        column.add("Đội 1");
        column.add("Đội 2");
        column.add("Ngày-Giờ");
        column.add("Sân");
        TModel.setColumnIdentifiers(column);
        try {
            Class.forName(className);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement st = connection.createStatement();
            String Script = "select db1.TenDoiBong doi1,db2.TenDoiBong doi2,td.ThoiGian,std.TenSan,td.MaTran from trandau AS td join santhidau AS std ON td.San = std.ID";
                   Script+= " Join doibong db1 ON td.ChuNha = db1.MaDoiBong Join doibong db2 ON td.Khach = db2.MaDoiBong";
                   Script+= " Where (select MaGiai from giaidau where TenGiai ='"+Giai+"') = td.MaGiai";
                   Script+= " AND  (select Vong from vong where TenVong ='"+Vong+"') = td.Vong";
            ResultSet rs = st.executeQuery(Script);
            ListID.clear();
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString("doi1"));
                row.add(rs.getString("doi2"));
                row.add(rs.getString("ThoiGian"));
                row.add(rs.getString("TenSan"));
                ListID.add(rs.getString("MaTran"));
                TModel.addRow(row);
            }
            rs.close();
            jtLichThiDau.setModel(TModel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
    private void reset(){
        txtChunha.setText("");
        txtKhach.setText("");
        txtSan.setText("");
        txtTySo.setText("");
        txtThoiGian.setText("");
        btnAddbt.setEnabled(false);
        btnEditLichTD.setEnabled(false);
        btndeleteTD.setEnabled(false);
        btnCapNhapdetail.setEnabled(false);
        DefaultTableModel TModel1 = new DefaultTableModel();
        Vector column = new Vector();
        column.add("Cầu thủ");
        column.add("Đội");
        column.add("Loai bàn thắng");
        column.add("Thời điểm");
        TModel1.setColumnIdentifiers(column);
        jtDetail.setModel(TModel1);
    }
    private DefaultComboBoxModel GetModel(String Querry,String Columns){
        try {
             Class.forName(className);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Querry);
            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
            while (rs.next()) {
                String Name =  rs.getString(Columns);
                Model.addElement(Name);
            }
            rs.close();
            return Model;
        } catch (Exception e) {
            return null;
        }
           
    }
    protected  void LoadTableDetail(String MaTran){
        DefaultTableModel TModel1 = new DefaultTableModel();
        Vector column = new Vector();
        column.add("Cầu thủ");
        column.add("Đội");
        column.add("Loai bàn thắng");
        column.add("Thời điểm phút thứ");
        TModel1.setColumnIdentifiers(column);
        try {
            Class.forName(className);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement st = connection.createStatement();
            String Script = "Select cttd.MaTran,TenDoiBong,TenCauThu,TenLoai,cttd.thoidiem From (Select * from chitiettrandau where MaTran = "+MaTran;
            Script += ") As cttd Join doibong db on cttd.MaDoiBong = db.MaDoiBong Join cauthu ct on cttd.MaCauThu = ct.MaCauThu join loaibanthang lbt On lbt.MaLoai = cttd.loaibanthang";
                   
            ResultSet rs = st.executeQuery(Script);
            
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString("TenCauThu"));
                row.add(rs.getString("TenDoiBong"));
                row.add(rs.getString("TenLoai"));
                row.add(rs.getString("thoidiem"));
                TModel1.addRow(row);
            }
            rs.close();
            jtDetail.setModel(TModel1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtLichThiDau = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetail = new javax.swing.JTable();
        btnThemlichthidau = new javax.swing.JButton();
        btnEditLichTD = new javax.swing.JButton();
        btndeleteTD = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnCapNhapdetail = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboVongDau = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtChunha = new javax.swing.JTextField();
        txtTySo = new javax.swing.JTextField();
        txtThoiGian = new javax.swing.JTextField();
        txtKhach = new javax.swing.JTextField();
        txtSan = new javax.swing.JTextField();
        btnAddbt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cboGiaDau = new javax.swing.JComboBox();

        setName("pnThongTin"); // NOI18N

        jtLichThiDau.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtLichThiDau.setModel(new javax.swing.table.DefaultTableModel(
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
        jtLichThiDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLichThiDauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtLichThiDau);

        jtDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jtDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtDetail);

        btnThemlichthidau.setText("Thêm lịch thi đấu");
        btnThemlichthidau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnThemlichthidau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemlichthidauActionPerformed(evt);
            }
        });

        btnEditLichTD.setText("Sửa");
        btnEditLichTD.setEnabled(false);
        btnEditLichTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLichTDActionPerformed(evt);
            }
        });

        btndeleteTD.setText("Xóa");
        btndeleteTD.setEnabled(false);
        btndeleteTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteTDActionPerformed(evt);
            }
        });

        jButton4.setText("Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnCapNhapdetail.setText("Cập Nhập");
        btnCapNhapdetail.setEnabled(false);
        btnCapNhapdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapdetailActionPerformed(evt);
            }
        });

        jButton6.setText("Report");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LỊCH THI ĐẤU VÀ KẾT QUẢ TRẬN ĐẤU");

        jLabel2.setText("Vòng Đấu");

        cboVongDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVongDauActionPerformed(evt);
            }
        });

        jLabel4.setText("Đội 1");

        jLabel6.setText("Tỷ số");

        jLabel8.setText("Thời gian");

        jLabel5.setText("Đội 2");

        jLabel7.setText("Sân");

        txtChunha.setEnabled(false);
        txtChunha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChunhaActionPerformed(evt);
            }
        });

        txtTySo.setEnabled(false);
        txtTySo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTySoActionPerformed(evt);
            }
        });

        txtThoiGian.setEnabled(false);

        txtKhach.setEnabled(false);

        txtSan.setEnabled(false);

        btnAddbt.setText("Thêm bàn thắng");
        btnAddbt.setEnabled(false);
        btnAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddbtActionPerformed(evt);
            }
        });

        jLabel9.setText("Giải Đấu");

        cboGiaDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGiaDauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThemlichthidau)
                            .addGap(41, 41, 41)
                            .addComponent(btnEditLichTD)
                            .addGap(65, 65, 65)
                            .addComponent(btndeleteTD)
                            .addGap(55, 55, 55)
                            .addComponent(jButton4)
                            .addGap(296, 296, 296)
                            .addComponent(btnAddbt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCapNhapdetail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboGiaDau, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboVongDau, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(30, 30, 30))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(29, 29, 29)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(30, 30, 30)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtChunha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTySo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtKhach, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addComponent(txtSan, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboVongDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(cboGiaDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtChunha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTySo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemlichthidau)
                        .addComponent(btndeleteTD)
                        .addComponent(jButton4)
                        .addComponent(jButton6)
                        .addComponent(btnCapNhapdetail)
                        .addComponent(btnAddbt))
                    .addComponent(btnEditLichTD)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhapdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapdetailActionPerformed
        
          AddBanThang ABT = new AddBanThang(txtChunha.getText().toString(),txtKhach.getText().toString(),MaTran,this,"Update");
          ABT.setLocation(300, 300);
          ABT.setVisible(true);
      
    }//GEN-LAST:event_btnCapNhapdetailActionPerformed

    private void btnThemlichthidauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemlichthidauActionPerformed
        // TODO add your handling code here:
        Themlichthidau LTD = new Themlichthidau(this,"Insert","");
          LTD.setLocation(400, 300);
          LTD.setVisible(true);
    }//GEN-LAST:event_btnThemlichthidauActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtChunhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChunhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChunhaActionPerformed

    private void txtTySoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTySoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTySoActionPerformed

    private void btnEditLichTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLichTDActionPerformed
        // TODO add your handling code here:
        Themlichthidau LTD = new Themlichthidau(this,"Update",MaTran);
          LTD.setLocation(400, 300);
          LTD.setVisible(true);
    }//GEN-LAST:event_btnEditLichTDActionPerformed
    String MaTran ="";
    private void jtLichThiDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLichThiDauMouseClicked
        // TODO add your handling code here:
        int index =jtLichThiDau.getSelectedRow();
        TableModel SubTModel  = jtLichThiDau.getModel();
        String ChuNha = SubTModel.getValueAt(index, 0).toString();
        String DoiKhach = SubTModel.getValueAt(index, 1).toString();
        String San = SubTModel.getValueAt(index, 3).toString();
        String Ngay = SubTModel.getValueAt(index, 2).toString();
        MaTran = ListID.get(index);
        txtChunha.setText(ChuNha);
        txtKhach.setText(DoiKhach);
        txtSan.setText(San);
        txtThoiGian.setText(Ngay);
        btnAddbt.setEnabled(true);
        btnEditLichTD.setEnabled(true);
        btndeleteTD.setEnabled(true);
        LoadTableDetail(MaTran);
        //JOptionPane.showMessageDialog(null,ChuNha);
    }//GEN-LAST:event_jtLichThiDauMouseClicked

    private void btnAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddbtActionPerformed
        // TODO add your handling code here:
         AddBanThang ABT = new AddBanThang(txtChunha.getText().toString(),txtKhach.getText().toString(),MaTran,this,"Insert");
          ABT.setLocation(300, 300);
          ABT.setVisible(true);
          LoadTableDetail(MaTran);
    }//GEN-LAST:event_btnAddbtActionPerformed

    private void cboGiaDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGiaDauActionPerformed
        SetupTable(cboGiaDau.getSelectedItem().toString(),cboVongDau.getSelectedItem().toString());
        reset();
    }//GEN-LAST:event_cboGiaDauActionPerformed

    private void cboVongDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVongDauActionPerformed
        // TODO add your handling code here:
        SetupTable(cboGiaDau.getSelectedItem().toString(),cboVongDau.getSelectedItem().toString());
        reset();
    }//GEN-LAST:event_cboVongDauActionPerformed
    public String strdata="";
    private void jtDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetailMouseClicked
        // TODO add your handling code here:
        btnCapNhapdetail.setEnabled(true);
        int index =jtDetail.getSelectedRow();
        TableModel SubTModel2  = jtDetail.getModel();
        strdata = SubTModel2.getValueAt(index, 0).toString();
        strdata +=","+ SubTModel2.getValueAt(index, 1).toString();
        strdata +=","+ SubTModel2.getValueAt(index, 2).toString();
        strdata +=","+ SubTModel2.getValueAt(index, 3).toString();
        AddBanThang ABT = new AddBanThang(txtChunha.getText().toString(),txtKhach.getText().toString(),MaTran,this,"Update");
        ABT.setLocation(300, 300);
        ABT.setVisible(true);
    }//GEN-LAST:event_jtDetailMouseClicked

    private void btndeleteTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteTDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btndeleteTDActionPerformed

    private final String className="com.mysql.jdbc.Driver";
    private final String url="jdbc:mysql://localhost:3306/dbbongdaNew";
    private final String user="root";
    private final String password="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddbt;
    private javax.swing.JButton btnCapNhapdetail;
    private javax.swing.JButton btnEditLichTD;
    private javax.swing.JButton btnThemlichthidau;
    private javax.swing.JButton btndeleteTD;
    private javax.swing.JComboBox cboGiaDau;
    private javax.swing.JComboBox<String> cboVongDau;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDetail;
    private javax.swing.JTable jtLichThiDau;
    private javax.swing.JTextField txtChunha;
    private javax.swing.JTextField txtKhach;
    private javax.swing.JTextField txtSan;
    private javax.swing.JTextField txtThoiGian;
    private javax.swing.JTextField txtTySo;
    // End of variables declaration//GEN-END:variables

    public void addSuccessful1() {
        SetupTable(cboGiaDau.getSelectedItem().toString(),cboVongDau.getSelectedItem().toString());  
    }
    public void addSuccessful() {
        LoadTableDetail(MaTran);
        Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, "SUCCESS");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
