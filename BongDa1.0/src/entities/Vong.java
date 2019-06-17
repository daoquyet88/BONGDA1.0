package entities;

public class Vong  implements java.io.Serializable {


     private Integer vong;
     private String tenVong;
   
    public Vong() {
    }

    public Vong(String tenVong) {
       this.tenVong = tenVong;
    }

    public Vong(Integer vong, String tenVong) {
        this.vong = vong;
        this.tenVong = tenVong;
    }

    @Override
    public String toString() {
        return tenVong ;
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


