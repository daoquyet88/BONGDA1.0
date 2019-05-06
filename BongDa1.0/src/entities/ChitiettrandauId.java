package entities;
// Generated May 2, 2019 7:38:22 AM by Hibernate Tools 4.3.1



/**
 * ChitiettrandauId generated by hbm2java
 */
public class ChitiettrandauId  implements java.io.Serializable {


     private int maTran;
     private int maDoiBong;
     private int maCauThu;

    public ChitiettrandauId() {
    }

    public ChitiettrandauId(int maTran, int maDoiBong, int maCauThu) {
       this.maTran = maTran;
       this.maDoiBong = maDoiBong;
       this.maCauThu = maCauThu;
    }
   
    public int getMaTran() {
        return this.maTran;
    }
    
    public void setMaTran(int maTran) {
        this.maTran = maTran;
    }
    public int getMaDoiBong() {
        return this.maDoiBong;
    }
    
    public void setMaDoiBong(int maDoiBong) {
        this.maDoiBong = maDoiBong;
    }
    public int getMaCauThu() {
        return this.maCauThu;
    }
    
    public void setMaCauThu(int maCauThu) {
        this.maCauThu = maCauThu;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ChitiettrandauId) ) return false;
		 ChitiettrandauId castOther = ( ChitiettrandauId ) other; 
         
		 return (this.getMaTran()==castOther.getMaTran())
 && (this.getMaDoiBong()==castOther.getMaDoiBong())
 && (this.getMaCauThu()==castOther.getMaCauThu());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMaTran();
         result = 37 * result + this.getMaDoiBong();
         result = 37 * result + this.getMaCauThu();
         return result;
   }   


}

