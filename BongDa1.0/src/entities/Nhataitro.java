package entities;
// Generated Apr 30, 2019 9:34:11 AM by Hibernate Tools 4.3.1



/**
 * Nhataitro generated by hbm2java
 */
public class Nhataitro  implements java.io.Serializable {


     private int maNhaTaiTro;
     private String tenNhaTaiTro;
     private String hinhThuc;

    public Nhataitro() {
    }

    public Nhataitro(int maNhaTaiTro, String tenNhaTaiTro, String hinhThuc) {
       this.maNhaTaiTro = maNhaTaiTro;
       this.tenNhaTaiTro = tenNhaTaiTro;
       this.hinhThuc = hinhThuc;
    }
   
    public int getMaNhaTaiTro() {
        return this.maNhaTaiTro;
    }
    
    public void setMaNhaTaiTro(int maNhaTaiTro) {
        this.maNhaTaiTro = maNhaTaiTro;
    }
    public String getTenNhaTaiTro() {
        return this.tenNhaTaiTro;
    }
    
    public void setTenNhaTaiTro(String tenNhaTaiTro) {
        this.tenNhaTaiTro = tenNhaTaiTro;
    }
    public String getHinhThuc() {
        return this.hinhThuc;
    }
    
    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }




}


