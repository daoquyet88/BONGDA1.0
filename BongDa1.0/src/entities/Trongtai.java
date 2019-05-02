package entities;

public class Trongtai  implements java.io.Serializable {


     private String maTrongTai;
     private String tenTrongTai;
     private String ngaySinh;
     private int soTranBat;

    public Trongtai() {
    }

    public Trongtai(String maTrongTai, String tenTrongTai, String ngaySinh, int soTranBat) {
       this.maTrongTai = maTrongTai;
       this.tenTrongTai = tenTrongTai;
       this.ngaySinh = ngaySinh;
       this.soTranBat = soTranBat;
    }
   
    public String getMaTrongTai() {
        return this.maTrongTai;
    }
    
    public void setMaTrongTai(String maTrongTai) {
        this.maTrongTai = maTrongTai;
    }
    public String getTenTrongTai() {
        return this.tenTrongTai;
    }
    
    public void setTenTrongTai(String tenTrongTai) {
        this.tenTrongTai = tenTrongTai;
    }
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public int getSoTranBat() {
        return this.soTranBat;
    }
    
    public void setSoTranBat(int soTranBat) {
        this.soTranBat = soTranBat;
    }




}


