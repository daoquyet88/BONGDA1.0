package entities;
// Generated Jun 17, 2019 9:36:03 AM by Hibernate Tools 4.3.1



/**
 * Trandau generated by hbm2java
 */
public class Trandau  implements java.io.Serializable {


     private Integer maTran;
     private int maGiai;
     private String thoiGian;
     private int vong;
     private int maChuNha;
     private String tenChuNha;
     private String tschuNha;
     private int tskhach;
     private int maKhach;
     private String tenDoiKhach;
     private int san;
     private int maTrongTai;

    public Trandau() {
    }

    public Trandau(int maGiai, String thoiGian, int vong, int maChuNha, String tenChuNha, String tschuNha, int tskhach, int maKhach, String tenDoiKhach, int san, int maTrongTai) {
       this.maGiai = maGiai;
       this.thoiGian = thoiGian;
       this.vong = vong;
       this.maChuNha = maChuNha;
       this.tenChuNha = tenChuNha;
       this.tschuNha = tschuNha;
       this.tskhach = tskhach;
       this.maKhach = maKhach;
       this.tenDoiKhach = tenDoiKhach;
       this.san = san;
       this.maTrongTai = maTrongTai;
    }
   
    public Integer getMaTran() {
        return this.maTran;
    }
    
    public void setMaTran(Integer maTran) {
        this.maTran = maTran;
    }
    public int getMaGiai() {
        return this.maGiai;
    }
    
    public void setMaGiai(int maGiai) {
        this.maGiai = maGiai;
    }
    public String getThoiGian() {
        return this.thoiGian;
    }
    
    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    public int getVong() {
        return this.vong;
    }
    
    public void setVong(int vong) {
        this.vong = vong;
    }
    public int getMaChuNha() {
        return this.maChuNha;
    }
    
    public void setMaChuNha(int maChuNha) {
        this.maChuNha = maChuNha;
    }
    public String getTenChuNha() {
        return this.tenChuNha;
    }
    
    public void setTenChuNha(String tenChuNha) {
        this.tenChuNha = tenChuNha;
    }
    public String getTschuNha() {
        return this.tschuNha;
    }
    
    public void setTschuNha(String tschuNha) {
        this.tschuNha = tschuNha;
    }
    public int getTskhach() {
        return this.tskhach;
    }
    
    public void setTskhach(int tskhach) {
        this.tskhach = tskhach;
    }
    public int getMaKhach() {
        return this.maKhach;
    }
    
    public void setMaKhach(int maKhach) {
        this.maKhach = maKhach;
    }
    public String getTenDoiKhach() {
        return this.tenDoiKhach;
    }
    
    public void setTenDoiKhach(String tenDoiKhach) {
        this.tenDoiKhach = tenDoiKhach;
    }
    public int getSan() {
        return this.san;
    }
    
    public void setSan(int san) {
        this.san = san;
    }
    public int getMaTrongTai() {
        return this.maTrongTai;
    }
    
    public void setMaTrongTai(int maTrongTai) {
        this.maTrongTai = maTrongTai;
    }




}


