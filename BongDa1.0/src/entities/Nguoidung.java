package entities;

public class Nguoidung  implements java.io.Serializable {


     private String maNguoiDung;
     private String tenNguoiDung;
     private String useName;
     private String passWord;
     private int quyen;
     private String ngayLap;

    public Nguoidung() {
    }

    public Nguoidung(String maNguoiDung, String tenNguoiDung, String useName, String passWord, int quyen, String ngayLap) {
       this.maNguoiDung = maNguoiDung;
       this.tenNguoiDung = tenNguoiDung;
       this.useName = useName;
       this.passWord = passWord;
       this.quyen = quyen;
       this.ngayLap = ngayLap;
    }
   
    public String getMaNguoiDung() {
        return this.maNguoiDung;
    }
    
    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }
    public String getTenNguoiDung() {
        return this.tenNguoiDung;
    }
    
    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }
    public String getUseName() {
        return this.useName;
    }
    
    public void setUseName(String useName) {
        this.useName = useName;
    }
    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public int getQuyen() {
        return this.quyen;
    }
    
    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }
    public String getNgayLap() {
        return this.ngayLap;
    }
    
    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }




}


