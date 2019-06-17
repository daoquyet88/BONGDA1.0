package bongda1.pkg0;

import dao.TranDauDAO;
import entities.Trandau;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import dao.*;
import entities.*;
import org.hibernate.*;
/**
 *
 * @author Vuong Nguyen
 */

public class Themlichthidau extends javax.swing.JFrame {
    ThongTinWindow mContaxt;
    String lc ="";
    String mMaTran ="";
        /**
     * Creates new form Themlichthidau
     */
     TranDauDAO tdDAO=new TranDauDAO();
    public Themlichthidau() {
            initComponents();
            //init();
        }


    //    public Themlichthidau(ThongTinWindow Contaxt,String lc,String MaTran) {
    //        initComponents();
    //        init();
    //        mContaxt=Contaxt;
    //        mMaTran = MaTran;
    //        this.lc = lc;
    //        if(lc.equals("Update")){
    //            lbBig.setText("Cập Nhật Lịch Thi Đấu");
    //            SetValueDoiBong(MaTran);
    //        }else{
    //            lbBig.setText("Thêm Lịch Thi Đấu");
    //        }
    //    }
    //    private void init(){
    //        loadDoiBong();
    //        loadGiaiDau();
    //        loadvongdau();
    //        loadSandau();
    //        loadTT();
    //    }
    //    public class combodoibong{
    //    int MaDoiBong;
    //    String TenDoiBong;
    //        public combodoibong(int MaDoi,String TenDoi){
    //            MaDoiBong = MaDoi;
    //            TenDoiBong = TenDoi;
    //        }
    //        public int getMaDoiBong()
    //        {
    //            return MaDoiBong;
    //        }
    //        public String getTenDoiBong()
    //        {
    //            return TenDoiBong;
    //        }
    //        public String toString()
    //        {
    //            return TenDoiBong;
    //        }
    //    }
    //    public class combotrongtai{
    //    String MaTT;
    //    String TenTT;
    //        public combotrongtai(String MaTrongtai,String TenTrongTai){
    //            MaTT = MaTrongtai;
    //            TenTT = TenTrongTai;
    //        }
    //        public String getMaTT()
    //        {
    //            return MaTT;
    //        }
    //        public String getTenTT()
    //        {
    //            return TenTT;
    //        }
    //        public String toString()
    //        {
    //            return TenTT;
    //        }
    //    }
    //    public class comboGiaiDau{
    //    int IDGiai;
    //    String TenGiai;
    //        public comboGiaiDau(int IDGiaiDau,String TenGiaiDau){
    //            IDGiai = IDGiaiDau;
    //            TenGiai = TenGiaiDau;
    //        }
    //        public int getIdGiai()
    //        {
    //            return IDGiai;
    //        }
    //        public String getTenGiai()
    //        {
    //            return TenGiai;
    //        }
    //        public String toString()
    //        {
    //            return TenGiai;
    //        }
    //    }
    //    public class comboVongDau{
    //    int Idvongdau;
    //    String Tenvongdau;
    //        public comboVongDau(int Idvong,String Tenvong){
    //            Idvongdau = Idvong;
    //            Tenvongdau = Tenvong;
    //        }
    //        public int getIDVongDau()
    //        {
    //            return Idvongdau;
    //        }
    //        public String getvongdau()
    //        {
    //            return Tenvongdau;
    //        }
    //        public String toString()
    //        {
    //            return Tenvongdau;
    //        }
    //    }
    //    public class comboSandau{
    //    int IdSan;
    //    String TenSan;
    //        public comboSandau(int IdSandau,String TenSandau){
    //            IdSan = IdSandau;
    //            TenSan = TenSandau;
    //        }
    //        public int getIdSan()
    //        {
    //            return IdSan;
    //        }
    //        public String getTenSan()
    //        {
    //            return TenSan;
    //        }
    //        public String toString()
    //        {
    //            return TenSan;
    //        }
    //    }
    //    ArrayList<combodoibong> List = new ArrayList<combodoibong>();
    //    ArrayList<comboGiaiDau> ListGD = new ArrayList<comboGiaiDau>();
    //    ArrayList<comboVongDau> ListVD = new ArrayList<comboVongDau>();
    //    ArrayList<comboSandau> ListSTD = new ArrayList<comboSandau>();
    //    ArrayList<combotrongtai> ListTT = new ArrayList<combotrongtai>();
    //    public boolean checkinfomation(){
    //        try {
    //                if(cboDoi1.getSelectedItem().toString().equals("")|| CboDoi2.getSelectedItem().toString().equals("")||
    //                   cboGiaiDau.getSelectedItem().toString().equals("") || cboVongDau.getSelectedItem().toString().equals("") ||
    //                   cboSan.getSelectedItem().toString().equals(""))
    //                {
    //                      JOptionPane.showMessageDialog(rootPane,"Vui lòng nhập đầy đủ thông tin");
    //                         return false;
    //                }
    //                else if(cboDoi1.getSelectedItem().toString().equals(CboDoi2.getSelectedItem().toString()) == true){
    //                    JOptionPane.showMessageDialog(rootPane,"Đội 1 phải khác đội 2");
    //                         return false;
    //                }
    //                return true;
    //            } catch (Exception e) {
    //                JOptionPane.showMessageDialog(rootPane,"Gặp lỗi");
    //                return false;
    //            }
    //    }
    //    private void SetValueDoiBong(String MaTran){
    //        try {
    //            Class.forName(className);
    //            Connection connection = DriverManager.getConnection(url,user,password);
    //            Statement st = connection.createStatement();
    //            String Query = "Select td.MaTran,td.ThoiGian,TenVong,TenTrongTai,TenSan,TenGiai,db1.TenDoiBong TenDoiBong1,db2.TenDoiBong TenDoiBong2 from (Select * from trandau where MaTran ="+MaTran+") td ";
    //            Query+=" join doibong as db1 on td.ChuNha = db1.MaDoiBong join doibong as db2 on db2.MaDoiBong = td.Khach ";
    //            Query+=" join giaidau gd on td.MaGiai = gd.MaGiai join vong as v on v.Vong = td.Vong join trongtai tt on tt.MaTrongTai=td.MaTrongTai";
    //            Query+=" join santhidau as s on s.ID = td.San";
    //            ResultSet rs = st.executeQuery(Query);
    //            while (rs.next()) {
    //                cboGiaiDau.setSelectedItem(rs.getString("TenGiai"));
    //                cboVongDau.setSelectedItem(rs.getString("TenVong"));
    //                cboDoi1.setSelectedItem(rs.getString("TenDoiBong1"));
    //                CboDoi2.setSelectedItem(rs.getString("TenDoiBong2"));
    //                cboTT.setSelectedItem(rs.getString("TenTrongTai"));
    //                cboSan.setSelectedItem(rs.getString("TenSan"));
    ////                Calendar cal = Calendar.getInstance();
    ////                Date date = JDDate.getDate();//cal.getTime(); 
    ////                SimpleDateFormat fr=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    ////                String NgayGio = fr.format(date).toString();
    //                try {
    //                    JDDate.setDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(rs.getString("ThoiGian")));
    //                } catch (Exception e) {
    //                }
    //            }
    //            rs.close();
    //        } catch (ClassNotFoundException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        } catch (SQLException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        }      
    //    }
    //    public int GetIDCombodoiBong(String Name){
    //        for(int i =0 ;i< List.size() ;i++){
    //            if(List.get(i).getTenDoiBong() == Name)
    //                return List.get(i).getMaDoiBong();
    //        }
    //        return -1;
    //    }
    //    public int GetIDComboGiaiDau(String Name){
    //        for(int i =0 ;i< ListGD.size() ;i++){
    //            if(ListGD.get(i).getTenGiai()== Name)
    //                return ListGD.get(i).getIdGiai();
    //        }
    //        return -1;
    //    }
    //    public int GetIDComboVongdau(String Name){
    //        for(int i =0 ;i< ListVD.size() ;i++){
    //            if(ListVD.get(i).getvongdau()== Name)
    //                return ListVD.get(i).getIDVongDau();
    //        }
    //        return -1;
    //    }
    //    public int GetIDCombodoiSanDau(String Name){
    //        for(int i =0 ;i< ListSTD.size() ;i++){
    //            if(ListSTD.get(i).getTenSan()== Name)
    //                return ListSTD.get(i).getIdSan();
    //        }
    //        return -1;
    //    }
    //    public String GetIDTT(String Name){
    //        for(int i =0 ;i< ListTT.size() ;i++){
    //            if(ListTT.get(i).getTenTT()== Name)
    //                return ListTT.get(i).getMaTT();
    //        }
    //        return "-1";
    //    }
    //    public void loadDoiBong(){
    //        //load đội bóng
    //        try {
    //            Class.forName(className);
    //            Connection connection = DriverManager.getConnection(url,user,password);
    //            Statement st = connection.createStatement();
    //            ResultSet rs = st.executeQuery("select MaDoiBong,TenDoiBong from doibong");
    //            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
    //            DefaultComboBoxModel Model2= new DefaultComboBoxModel(); 
    //            while (rs.next()) {
    //                // users = new stock_data(rs.getString("name"));
    //                // usersList.add(users); 
    //                String NameDB =  rs.getString("TenDoiBong");
    //                String IdDB = rs.getString("MaDoiBong");
    //                //add list
    //                List.add(new combodoibong(parseInt(IdDB), NameDB));
    //                Model.addElement(NameDB);
    //                Model2.addElement(NameDB);
    //            }
    //            cboDoi1.setModel(Model);
    //            CboDoi2.setModel(Model2);
    //            rs.close();
    //        } catch (ClassNotFoundException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        } catch (SQLException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        }      
    //    }
    //    public void loadGiaiDau(){
    //        try {
    //            Class.forName(className);
    //            Connection connection = DriverManager.getConnection(url,user,password);
    //            Statement st = connection.createStatement();
    //            ResultSet rs = st.executeQuery("select MaGiai,TenGiai from giaidau");
    //            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
    //            while (rs.next()) {
    //                // users = new stock_data(rs.getString("name"));
    //                // usersList.add(users); 
    //                String MaGiai =  rs.getString("MaGiai");
    //                String TenGiai = rs.getString("TenGiai");
    //                //add list
    //                comboGiaiDau a =new comboGiaiDau(parseInt(MaGiai), TenGiai);
    //                ListGD.add(new comboGiaiDau(parseInt(MaGiai), TenGiai));
    //                Model.addElement(TenGiai);
    //            }
    //            cboGiaiDau.setModel(Model);
    //            rs.close();
    //        } catch (ClassNotFoundException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        } catch (SQLException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        }
    //    }
    //    public void loadvongdau(){
    //        try {
    //            Class.forName(className);
    //            Connection connection = DriverManager.getConnection(url,user,password);
    //            Statement st = connection.createStatement();
    //            ResultSet rs = st.executeQuery("select TenVong ,Vong from vong");
    //            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
    //            while (rs.next()) {
    //                // users = new stock_data(rs.getString("name"));
    //                // usersList.add(users); 
    //                String TenVong = rs.getString("TenVong");
    //                String Vong =  rs.getString("Vong");
    //                //add list
    //                ListVD.add(new comboVongDau(parseInt(Vong), TenVong));
    //                Model.addElement(TenVong);
    //            }
    //            cboVongDau.setModel(Model);
    //            rs.close();
    //        } catch (ClassNotFoundException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        } catch (SQLException ex) {
    //            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
    //        }
    //    }
    //    public void loadSandau(){
    //        //load tran dau
    //        try {
    //            Class.forName(className);
    //            Connection connection = DriverManager.getConnection(url,user,password);
    //            Statement st = connection.createStatement();
    //            ResultSet rs = st.executeQuery("select ID,TenSan from santhidau");
    //            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
    //            while (rs.next()) {
    //                // users = new stock_data(rs.getString("name"));
    //                // usersList.add(users); 
    //                String ID =  rs.getString("ID");
    //                String TenSan = rs.getString("TenSan");
    //                //add list
    //                ListSTD.add(new comboSandau(parseInt(ID), TenSan));
    //                Model.addElement(TenSan);
    //            }
    //            cboSan.setModel(Model);
//            rs.close();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void loadTT(){
        //load tran dau
//        try {
//            Class.forName(className);
//            Connection connection = DriverManager.getConnection(url,user,password);
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery("select MaTrongTai,TenTrongTai from trongtai");
//            DefaultComboBoxModel Model= new DefaultComboBoxModel(); 
//            while (rs.next()) {
//                // users = new stock_data(rs.getString("name"));
//                // usersList.add(users); 
//                String ID =  rs.getString("MaTrongTai");
//                String Ten = rs.getString("TenTrongTai");
//                //add list
//                ListTT.add(new combotrongtai(ID, Ten));
//                Model.addElement(Ten);
//            }
//            cboTT.setModel(Model);
//            rs.close();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Themlichthidau.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBig = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddTD = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_GD = new javax.swing.JTextField();
        txt_NG = new javax.swing.JTextField();
        txt_VD = new javax.swing.JTextField();
        txt_MDN = new javax.swing.JTextField();
        txt_tenDN = new javax.swing.JTextField();
        txt_btN = new javax.swing.JTextField();
        txt_maDK = new javax.swing.JTextField();
        txt_tenDK = new javax.swing.JTextField();
        txt_btK = new javax.swing.JTextField();
        txt_san = new javax.swing.JTextField();
        txt_maTT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbBig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBig.setText("THÊM LỊCH THI ĐẤU");

        jLabel2.setText("Tên Dội Nhà");

        jLabel3.setText("Mã Đội Khách");

        jLabel4.setText("Ngày-Giờ");

        jLabel5.setText("Sân");

        btnAddTD.setText("Save");
        btnAddTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTDActionPerformed(evt);
            }
        });

        jLabel6.setText("Vòng đấu");

        jLabel7.setText("Giải Đấu");

        jLabel8.setText("Trọng Tài");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Đội Nhà");

        jLabel9.setText("Tên Đội Khách");

        jLabel10.setText("BT Khách");

        jLabel11.setText("BT Nhà");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBig, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_GD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_VD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(txt_MDN, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txt_NG, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_btN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tenDK, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt_san)
                    .addComponent(txt_maDK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maTT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_btK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(btnAddTD)
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbBig, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(txt_GD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txt_NG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txt_VD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_btK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txt_MDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_san, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_tenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_btN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTD)
                    .addComponent(jButton1))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private final String className="com.mysql.jdbc.Driver";
//    private final String url="jdbc:mysql://localhost:3306/dbbongdaNew";
//    private final String user="root";
//    private final String password="";
    private void btnAddTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTDActionPerformed

        Trandau td=new Trandau();
            td.setMaGiai(Integer.parseInt(this.txt_GD.getText()));
            td.setThoiGian(this.txt_NG.getText());
            td.setVong(Integer.parseInt(this.txt_VD.getText()));
            td.setMaChuNha(Integer.parseInt(this.txt_MDN.getText()));
            td.setTenChuNha(this.txt_tenDN.getText());
            td.setTschuNha(this.txt_btN.getText());
            td.setTskhach(Integer.parseInt(this.txt_btK.getText()));
            td.setMaKhach(Integer.parseInt(this.txt_btK.getText()));
            td.setTenDoiKhach(this.txt_tenDK.getText());
            td.setSan(Integer.parseInt(this.txt_san.getText()));
            td.setMaTrongTai(Integer.parseInt(this.txt_maTT.getText()));
            
           if(tdDAO.add(td))
           {
               JOptionPane.showMessageDialog(rootPane,"Them thanh cong");

           }
           else
           {
               JOptionPane.showMessageDialog(rootPane,"Them khong thanh cong");
           }
//        if(checkinfomation())
//       {
//            Calendar cal = Calendar.getInstance();
//            Date date = JDDate.getDate();//cal.getTime(); 
//            SimpleDateFormat fr=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//            String NgayGio = fr.format(date).toString();
//            int San =GetIDCombodoiSanDau(cboSan.getSelectedItem().toString());
//            int Doi1 =GetIDCombodoiBong(cboDoi1.getSelectedItem().toString());
//            int Doi2 =GetIDCombodoiBong(CboDoi2.getSelectedItem().toString());
//            int Giai =GetIDComboGiaiDau(cboGiaiDau.getSelectedItem().toString());
//            int Vong =GetIDComboVongdau(cboVongDau.getSelectedItem().toString());
//            String TT =GetIDTT(cboTT.getSelectedItem().toString());
//            if(Doi1 == -1 || Doi2 == -1){
//                JOptionPane.showMessageDialog(rootPane,"Gặp lỗi lấy thông tin đội bóng");
//                return;
//            }
//            TranDauDAO tdd=new TranDauDAO();
//            Trandau  tt=new Trandau();
//            tt.setChuNha(Doi1);
//            tt.setKhach(Doi2);
//            tt.setMaGiai(Giai);
//            tt.setMaTrongTai(TT);
//            tt.setSan(San);
//            tt.setTySo(-1);
//            tt.setVong(Vong);
//            tt.setThoiGian(NgayGio);
//             if(lc.equals("Update")){tt.setMaTran(Integer.parseInt(mMaTran));} 
//            if( lc.equals("Insert")?tdd.AddTranDau(tt):tdd.UpdateTranDau(tt))
//            {
//                JOptionPane.showMessageDialog(rootPane,"Thao tác thành công");
//                mContaxt.addSuccessful1();
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(rootPane,"Thao tác thất bại");
//            }
//           }
//           else{
//               //JOptionPane.showMessageDialog(rootPane,"UserName da ton tai. Vui long thu mot username khac");
//            }
    }//GEN-LAST:event_btnAddTDActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Themlichthidau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Themlichthidau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Themlichthidau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Themlichthidau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbBig;
    private javax.swing.JTextField txt_GD;
    private javax.swing.JTextField txt_MDN;
    private javax.swing.JTextField txt_NG;
    private javax.swing.JTextField txt_VD;
    private javax.swing.JTextField txt_btK;
    private javax.swing.JTextField txt_btN;
    private javax.swing.JTextField txt_maDK;
    private javax.swing.JTextField txt_maTT;
    private javax.swing.JTextField txt_san;
    private javax.swing.JTextField txt_tenDK;
    private javax.swing.JTextField txt_tenDN;
    // End of variables declaration//GEN-END:variables
}
