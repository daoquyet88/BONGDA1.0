package entities;
// Generated Jun 17, 2019 11:57:59 PM by Hibernate Tools 4.3.1



/**
 * Loaibanthang generated by hbm2java
 */
public class Loaibanthang  implements java.io.Serializable {


     private Integer maLoai;
     private String tenloai;

    public Loaibanthang() {
    }

    public Loaibanthang(String tenloai) {
       this.tenloai = tenloai;
    }
   
    public Integer getMaLoai() {
        return this.maLoai;
    }
    
    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }
    public String getTenloai() {
        return this.tenloai;
    }
    
    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }




}


