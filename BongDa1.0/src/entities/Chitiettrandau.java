package entities;
// Generated May 2, 2019 7:38:22 AM by Hibernate Tools 4.3.1



/**
 * Chitiettrandau generated by hbm2java
 */
public class Chitiettrandau  implements java.io.Serializable {


     private ChitiettrandauId id;
     private int loaibanthang;
     private int thoidiem;

    public Chitiettrandau() {
    }

    public Chitiettrandau(ChitiettrandauId id, int loaibanthang, int thoidiem) {
       this.id = id;
       this.loaibanthang = loaibanthang;
       this.thoidiem = thoidiem;
    }
   
    public ChitiettrandauId getId() {
        return this.id;
    }
    
    public void setId(ChitiettrandauId id) {
        this.id = id;
    }
    public int getLoaibanthang() {
        return this.loaibanthang;
    }
    
    public void setLoaibanthang(int loaibanthang) {
        this.loaibanthang = loaibanthang;
    }
    public int getThoidiem() {
        return this.thoidiem;
    }
    
    public void setThoidiem(int thoidiem) {
        this.thoidiem = thoidiem;
    }




}


