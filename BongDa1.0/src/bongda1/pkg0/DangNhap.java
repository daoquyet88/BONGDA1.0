/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda1.pkg0;

import dao.DangKyDAO;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.*;
import entities.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.hibernate.*;

/**
 *
 * @author Vuong Nguyen
 */
public class DangNhap extends javax.swing.JFrame {

    NguoiDungDAO ndDAO=new NguoiDungDAO();
    public DangNhap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnLoggin = new javax.swing.JButton();
        txtDangKy = new javax.swing.JButton();
        btnchangepass = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("LOGGIN NOW");

        jLabel3.setText("UserName");

        jLabel4.setText("PassWord");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnLoggin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLoggin.setText("Loggin");
        btnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogginActionPerformed(evt);
            }
        });

        txtDangKy.setText("Registration ?");
        txtDangKy.setBorder(null);
        txtDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDangKyActionPerformed(evt);
            }
        });

        btnchangepass.setText("Change PassWord ?");
        btnchangepass.setBorder(null);
        btnchangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangepassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpass)
                    .addComponent(txtUserName))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoggin)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnchangepass))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoggin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchangepass)
                    .addComponent(txtDangKy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private final String className="com.mysql.jdbc.Driver";
//    private final String url="jdbc:mysql://localhost:3306/dbbongda2";
//    private final String user="root";
//    private final String password="";
//    private Connection connection;
    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
    public  String mahoaMD5(String srcText) throws NoSuchAlgorithmException, UnsupportedEncodingException 
     {
         String enrText ;
         MessageDigest msd = MessageDigest.getInstance("MD5");
         byte[] srcTextBytes = srcText.getBytes("UTF-8");
         byte[] enrTexyBytes = msd.digest(srcTextBytes);
         BigInteger bigInt = new BigInteger(1,enrTexyBytes);
         enrText = bigInt.toString(16);
         return  enrText;
     }
    private void btnLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogginActionPerformed
        //Nguoidung nd=new Nguoidung();
        String text=txtpass.getText();
        String chuoi="";
         try {
             chuoi= mahoaMD5(text);
         } catch (NoSuchAlgorithmException ex) {
             Logger.getLogger(BanToChucWindow.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(BanToChucWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
        String useName=txtUserName.getText();
        //String passWord=txtpass.getText();
        //JOptionPane.showMessageDialog(this, passWord+"kq");
        //String maNguoiDung=txtUserName.getText();
        try {
            for(Nguoidung nd : this.ndDAO.load_danhSachND(useName,chuoi))
            {            
                int quyen=nd.getQuyen();
                JOptionPane.showMessageDialog(this,"Dang Nhap thanh cong");
                this.setVisible(false);
                MainWindow m=new MainWindow(quyen);
                m.setVisible(rootPaneCheckingEnabled);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Dang nhap that bai");
        }
        
       
//        // TODO add your handling code here:
//         try {
//            int flag=1;
//            Class.forName(className);
//            connection=DriverManager.getConnection(url,user,password);
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery("select * from nguoidung");
//            String user = txtUserName.getText() ;
//            String pass = txtpass.getText() ;
//            DangKyDAO dkd=new DangKyDAO();
//            int Quyen =0;
//           try {
//               String end =  dkd.mahoaMD5(txtpass.getText());
//               while(rs.next())
//            {
//                if(rs.getString(3).equals(txtUserName.getText()) && rs.getString(4).equals(end))
//                {
//                    flag=0;
//                    if(rs.getString(5).equals("0")){
//                       Quyen = 1; 
//                    }
//                    break;
//                }
//            }
//           } catch (NoSuchAlgorithmException ex) {
//               Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
//           } catch (UnsupportedEncodingException ex) {
//               Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
//           }
//            
//            
//            if(flag ==0 ){
//                if(Quyen == 1){
//                     JOptionPane.showMessageDialog(null, "Admin , Đăng nhập thành công"); 
//                     //JFrameGiaoVu d = new JFrameGiaoVu();
//                     //d.show();
//                      this.dispose();
//                }
//                else {
//                    JOptionPane.showMessageDialog(null, "Người dùng "+user+" đăng nhập thành công"); 
//                    this.dispose();
//                }
//
//            }
//            else
//            JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu , vui lòng kiểm tra lại");
//        }catch (SQLException ex) {
//            System.out.println("Error");
//        }
//        catch (ClassNotFoundException ex) {
//            System.out.println("Class fail");
//        }      
    }//GEN-LAST:event_btnLogginActionPerformed

    private void txtDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDangKyActionPerformed
        // TODO add your handling code here:
        Dangky c = new Dangky();
        c.setLocation(400, 200);
        c.setVisible(true);
        c.show();
    }//GEN-LAST:event_txtDangKyActionPerformed

    private void btnchangepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangepassActionPerformed
        // TODO add your handling code here:
        DoiMatKhau c = new DoiMatKhau();
        c.setLocation(400, 200);
        c.setVisible(true);
        c.show();
    }//GEN-LAST:event_btnchangepassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws java.lang.InstantiationException {
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggin;
    private javax.swing.JButton btnchangepass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton txtDangKy;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
