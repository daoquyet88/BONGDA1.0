package entities;

public class Giaidau  implements java.io.Serializable {


     private Integer maGiai;

    @Override
    public String toString() {
        return  tenGiai;
    }

    public Giaidau(Integer maGiai, String tenGiai) {
        this.maGiai = maGiai;
        this.tenGiai = tenGiai;
    }
     private String tenGiai;
     private String thoiGian;

    public Giaidau() {
    }

    public Giaidau(String tenGiai, String thoiGian) {
       this.tenGiai = tenGiai;
       this.thoiGian = thoiGian;
    }
   
    public Integer getMaGiai() {
        return this.maGiai;
    }
    
    public void setMaGiai(Integer maGiai) {
        this.maGiai = maGiai;
    }
    public String getTenGiai() {
        return this.tenGiai;
    }
    
    public void setTenGiai(String tenGiai) {
        this.tenGiai = tenGiai;
    }
    public String getThoiGian() {
        return this.thoiGian;
    }
    
    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }




}


