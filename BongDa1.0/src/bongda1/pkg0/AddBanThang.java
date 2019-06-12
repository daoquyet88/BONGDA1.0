/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda1.pkg0;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Vuong Nguyen
 */
public class AddBanThang extends javax.swing.JFrame {

    /**
     * Creates new form AddBanThang
     */
    String ChuNha;
    String Khach;
    String MaTran;
    ThongTinWindow mContext;
    String mlc ="";
    public AddBanThang() {
        initComponents();   
    }
    public AddBanThang(String chuNha,String Khach,String MaTran, ThongTinWindow context,String lc) {
        initComponents();
        this.ChuNha = chuNha;
        this.Khach =Khach;
        this.MaTran = MaTran;
        mContext=context;
        mlc = lc;
        init();
    }
    private void init(){
        DefaultComboBoxModel Df = new DefaultComboBoxModel();
        Df.addElement(this.ChuNha);
        Df.addElement(this.Khach);
        cboDoiGhiBan.setModel(Df);
        cboLoaibanThang.setModel(GetModel("Select * from loaibanthang", "TenLoai"));
        cboCauThu.setModel(GetModel("Select * from cauthu where MaDoiBong = (Select MaDoiBong From doibong where TenDoiBong ='"+cboDoiGhiBan.getSelectedItem().toString()+"')","TenCauThu"));
        if(mlc.equals("Update")){
            String [] str = mContext.strdata.split(",");
            cboDoiGhiBan.setSelectedItem(str[1]);
            cboCauThu.setSelectedItem(str[0]);
            cboLoaibanThang.setSelectedItem(str[2]);
            jsghiban.setValue(Integer.parseInt(str[3]));
        }
    }
    
    public DefaultComboBoxModel GetModel(String Querry,String Columns) {
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
    public int Exec(String Querry) {
        try {
            Class.forName(className);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement st = connection.createStatement();
            int rs = st.executeUpdate(Querry);
            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
            return rs;
        } catch (Exception e) {
            return 0;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCauThu = new javax.swing.JComboBox();
        cboDoiGhiBan = new javax.swing.JComboBox();
        cboLoaibanThang = new javax.swing.JComboBox();
        dboSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jsghiban = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Đội ghi bàn");

        jLabel2.setText("Loại bàn thắng");

        jLabel3.setText("Phút ghi bàn");

        jLabel4.setText("Cầu thủ");

        cboDoiGhiBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDoiGhiBanActionPerformed(evt);
            }
        });

        dboSave.setText("Save");
        dboSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboSaveActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("THÊM CHI BÀN THẮNG CHO TRẬN ĐẤU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCauThu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLoaibanThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDoiGhiBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsghiban, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(dboSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDoiGhiBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboLoaibanThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsghiban, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(dboSave)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDoiGhiBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDoiGhiBanActionPerformed
        // TODO add your handling code here:
        cboCauThu.setModel(GetModel("Select * from cauthu where MaDoiBong = (Select MaDoiBong From doibong where TenDoiBong ='"+cboDoiGhiBan.getSelectedItem().toString()+"')","TenCauThu"));
    }//GEN-LAST:event_cboDoiGhiBanActionPerformed

    private void dboSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboSaveActionPerformed
        // TODO add your handling code here:
        String StrQuery="";
        String ghiban = jsghiban.getValue()+"";
        String [] str = mContext.strdata.split(",");
         if(mlc.equals("Update")){
             StrQuery+="Update chitiettrandau Set MaDoiBong=(select MaDoiBong from doibong where TenDoiBong ='"+cboDoiGhiBan.getSelectedItem().toString()+"')";
             StrQuery+=",MaCauThu=(select MaCauThu from cauthu where TenCauThu ='"+cboCauThu.getSelectedItem().toString()+"')";
             StrQuery+=",loaibanthang=(select MaLoai from loaibanthang where TenLoai ='"+cboLoaibanThang.getSelectedItem().toString()+"'),thoidiem='"+ghiban+"'";
             StrQuery+=" Where MaTran ="+MaTran+" AND MaCauThu=(select MaCauThu from cauthu where TenCauThu ='"+str[0]+"') AND thoidiem = "+str[3];
         }else{            
            StrQuery= "INSERT INTO chitiettrandau(MaTran,MaDoiBong,MaCauThu,loaibanthang,thoidiem)";
            StrQuery+=" Select '"+this.MaTran+"',(select MaDoiBong from doibong where TenDoiBong ='"+cboDoiGhiBan.getSelectedItem().toString()+"'),";
            StrQuery+=" (select MaCauThu from cauthu where TenCauThu ='"+cboCauThu.getSelectedItem().toString()+"'),";
            StrQuery+=" (select MaLoai from loaibanthang where TenLoai ='"+cboLoaibanThang.getSelectedItem().toString()+"'),'"+ghiban+"'";
         }
            int kq = Exec(StrQuery);
        if (kq == 1){
            JOptionPane.showMessageDialog(rootPane,"Thao tác thành công");
            //ThongTinWindow.LoadTableDetail(this.MaTran);
            mContext.addSuccessful();
        }
        else 
            JOptionPane.showMessageDialog(rootPane,"Thao tác thất bại");   
    }//GEN-LAST:event_dboSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBanThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBanThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBanThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBanThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBanThang().setVisible(true);
            }
        });
    }
    private final String className="com.mysql.jdbc.Driver";
    private final String url="jdbc:mysql://localhost:3306/dbbongdaNew";
    private final String user="root";
    private final String password="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboCauThu;
    private javax.swing.JComboBox cboDoiGhiBan;
    private javax.swing.JComboBox cboLoaibanThang;
    private javax.swing.JButton dboSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.components.JSpinField jsghiban;
    // End of variables declaration//GEN-END:variables

    
}
