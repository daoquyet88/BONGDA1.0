package entities;
// Generated Jun 17, 2019 11:57:59 PM by Hibernate Tools 4.3.1



/**
 * Vong generated by hbm2java
 */
public class Vong  implements java.io.Serializable {


     private Integer vong;
     private String tenVong;

    public Vong() {
    }

    public Vong(String tenVong) {
       this.tenVong = tenVong;
    }
   
    public Integer getVong() {
        return this.vong;
    }
    
    public void setVong(Integer vong) {
        this.vong = vong;
    }
    public String getTenVong() {
        return this.tenVong;
    }
    
    public void setTenVong(String tenVong) {
        this.tenVong = tenVong;
    }




}


