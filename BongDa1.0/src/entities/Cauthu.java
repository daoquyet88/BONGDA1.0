package entities;
// Generated Jun 17, 2019 9:36:03 AM by Hibernate Tools 4.3.1



/**
 * Cauthu generated by hbm2java
 */
public class Cauthu  implements java.io.Serializable {


     private Integer maCauThu;
     private String tenCauThu;
     private String viTri;
     private int soAo;
     private String ngaySinh;
     private int banThang;
     private int theVang;
     private int theDo;
     private int maDoiBong;

    public Cauthu() {
    }

    public Cauthu(String tenCauThu, String viTri, int soAo, String ngaySinh, int banThang, int theVang, int theDo, int maDoiBong) {
       this.tenCauThu = tenCauThu;
       this.viTri = viTri;
       this.soAo = soAo;
       this.ngaySinh = ngaySinh;
       this.banThang = banThang;
       this.theVang = theVang;
       this.theDo = theDo;
       this.maDoiBong = maDoiBong;
    }
   
    public Integer getMaCauThu() {
        return this.maCauThu;
    }
    
    public void setMaCauThu(Integer maCauThu) {
        this.maCauThu = maCauThu;
    }
    public String getTenCauThu() {
        return this.tenCauThu;
    }
    
    public void setTenCauThu(String tenCauThu) {
        this.tenCauThu = tenCauThu;
    }
    public String getViTri() {
        return this.viTri;
    }
    
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public int getSoAo() {
        return this.soAo;
    }
    
    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public int getBanThang() {
        return this.banThang;
    }
    
    public void setBanThang(int banThang) {
        this.banThang = banThang;
    }
    public int getTheVang() {
        return this.theVang;
    }
    
    public void setTheVang(int theVang) {
        this.theVang = theVang;
    }
    public int getTheDo() {
        return this.theDo;
    }
    
    public void setTheDo(int theDo) {
        this.theDo = theDo;
    }
    public int getMaDoiBong() {
        return this.maDoiBong;
    }
    
    public void setMaDoiBong(int maDoiBong) {
        this.maDoiBong = maDoiBong;
    }




}


