package entities;
// Generated May 2, 2019 7:38:22 AM by Hibernate Tools 4.3.1



/**
 * Vong generated by hbm2java
 */
public class Vong  implements java.io.Serializable {


     private int vong;
     private String tenVong;

    public Vong() {
    }

    public Vong(int vong, String tenVong) {
       this.vong = vong;
       this.tenVong = tenVong;
    }
   
    public int getVong() {
        return this.vong;
    }
    
    public void setVong(int vong) {
        this.vong = vong;
    }
    public String getTenVong() {
        return this.tenVong;
    }
    
    public void setTenVong(String tenVong) {
        this.tenVong = tenVong;
    }




}

