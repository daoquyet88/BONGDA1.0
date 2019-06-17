package entities;

public class Doibong  implements java.io.Serializable {


     private Integer maDoiBong;
     private String tenDoiBong;
     private String hinhAnh;
     private String huanLuanVien;
     private String ngaySinh;
     private String sanNha;

    public Doibong() {
    }

    public Doibong(String tenDoiBong, String hinhAnh, String huanLuanVien, String ngaySinh, String sanNha) {
       this.tenDoiBong = tenDoiBong;
       this.hinhAnh = hinhAnh;
       this.huanLuanVien = huanLuanVien;
       this.ngaySinh = ngaySinh;
       this.sanNha = sanNha;
    }    
    public Integer getMaDoiBong() {
        return this.maDoiBong;
    }
    
    public void setMaDoiBong(Integer maDoiBong) {
        this.maDoiBong = maDoiBong;
    }
    public String getTenDoiBong() {
        return this.tenDoiBong;
    }
    
    public void setTenDoiBong(String tenDoiBong) {
        this.tenDoiBong = tenDoiBong;
    }
    public String getHinhAnh() {
        return this.hinhAnh;
    }
    
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public String getHuanLuanVien() {
        return this.huanLuanVien;
    }
    
    public void setHuanLuanVien(String huanLuanVien) {
        this.huanLuanVien = huanLuanVien;
    }
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getSanNha() {
        return this.sanNha;
    }
    
    public void setSanNha(String sanNha) {
        this.sanNha = sanNha;
    }

    public Doibong(Integer maDoiBong, String tenDoiBong) {
        this.maDoiBong = maDoiBong;
        this.tenDoiBong = tenDoiBong;
    }

    @Override
    public String toString() {
        return  tenDoiBong ;
    }




}


