package entities;
// Generated May 28, 2019 9:59:44 PM by Hibernate Tools 4.3.1



/**
 * Santhidau generated by hbm2java
 */
public class Santhidau  implements java.io.Serializable {


     private Integer id;
     private String tenSan;

    public Santhidau() {
    }

    public Santhidau(String tenSan) {
       this.tenSan = tenSan;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTenSan() {
        return this.tenSan;
    }
    
    public void setTenSan(String tenSan) {
        this.tenSan = tenSan;
    }




}

