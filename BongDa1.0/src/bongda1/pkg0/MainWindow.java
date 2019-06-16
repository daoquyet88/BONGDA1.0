
package bongda1.pkg0;

import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame {

     private JPanel childPanel;
    public MainWindow() {
        initComponents();
         showPanel(new ThongTinWindow());
    }
    public void showPanel(JPanel panel)
    {
        childPanel=panel;
        pnMain.removeAll();
        pnMain.add(childPanel);
        pnMain.validate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        btnLichThiDau = new javax.swing.JButton();
        btnDoiBong = new javax.swing.JButton();
        btnTopGhiBan = new javax.swing.JButton();
        btnTrongTai = new javax.swing.JButton();
        btnNhaTaiTro = new javax.swing.JButton();
        btnBanToChuc = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setName("jFrameMain"); // NOI18N

        pnMenu.setBackground(new java.awt.Color(204, 204, 255));
        pnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnMenu.setToolTipText("Menu Tool Box");
        pnMenu.setName(""); // NOI18N

        btnLichThiDau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLichThiDau.setText("Lịch Thì Đấu-Kết Quả_Bảng Xếp Hạng");
        btnLichThiDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichThiDauActionPerformed(evt);
            }
        });

        btnDoiBong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDoiBong.setText("Đội Bóng");
        btnDoiBong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiBongActionPerformed(evt);
            }
        });

        btnTopGhiBan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTopGhiBan.setText("Tốp Ghi Bàn ");
        btnTopGhiBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopGhiBanActionPerformed(evt);
            }
        });

        btnTrongTai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTrongTai.setText("Trọng Tài");
        btnTrongTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrongTaiActionPerformed(evt);
            }
        });

        btnNhaTaiTro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNhaTaiTro.setText("Nhà Tài Trợ");
        btnNhaTaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaTaiTroActionPerformed(evt);
            }
        });

        btnBanToChuc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBanToChuc.setText("Ban Tổ Chức");
        btnBanToChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanToChucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnLichThiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDoiBong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnTopGhiBan)
                .addGap(47, 47, 47)
                .addComponent(btnTrongTai, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnNhaTaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBanToChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoiBong)
                    .addComponent(btnTopGhiBan)
                    .addComponent(btnTrongTai)
                    .addComponent(btnNhaTaiTro)
                    .addComponent(btnBanToChuc)
                    .addComponent(btnLichThiDau))
                .addGap(25, 25, 25))
        );

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnMain.setLayout(new java.awt.BorderLayout());

        jMenuBar1.setMaximumSize(new java.awt.Dimension(123, 300));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cài Đặt");

        jMenuItem1.setText("Đăng Xuất");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Thoát");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLichThiDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichThiDauActionPerformed
        showPanel(new ThongTinWindow());
    }//GEN-LAST:event_btnLichThiDauActionPerformed

    private void btnDoiBongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiBongActionPerformed
         showPanel(new DoiBongWindow());
    }//GEN-LAST:event_btnDoiBongActionPerformed

    private void btnTopGhiBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopGhiBanActionPerformed
        showPanel(new TopGhiBanWindow());
    }//GEN-LAST:event_btnTopGhiBanActionPerformed

    private void btnTrongTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrongTaiActionPerformed
        showPanel(new TrongTaiWindow());
    }//GEN-LAST:event_btnTrongTaiActionPerformed

    private void btnNhaTaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaTaiTroActionPerformed
        showPanel(new NhaTaiTroWindow());
    }//GEN-LAST:event_btnNhaTaiTroActionPerformed

    private void btnBanToChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanToChucActionPerformed
       showPanel(new BanToChucWindow());
    }//GEN-LAST:event_btnBanToChucActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanToChuc;
    private javax.swing.JButton btnDoiBong;
    private javax.swing.JButton btnLichThiDau;
    private javax.swing.JButton btnNhaTaiTro;
    private javax.swing.JButton btnTopGhiBan;
    private javax.swing.JButton btnTrongTai;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables
}
