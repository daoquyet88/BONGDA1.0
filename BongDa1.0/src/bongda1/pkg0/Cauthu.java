/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda1.pkg0;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "cauthu", catalog = "dbbongda2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cauthu.findAll", query = "SELECT c FROM Cauthu c")
    , @NamedQuery(name = "Cauthu.findByMaCauThu", query = "SELECT c FROM Cauthu c WHERE c.maCauThu = :maCauThu")
    , @NamedQuery(name = "Cauthu.findByTenCauThu", query = "SELECT c FROM Cauthu c WHERE c.tenCauThu = :tenCauThu")
    , @NamedQuery(name = "Cauthu.findByViTri", query = "SELECT c FROM Cauthu c WHERE c.viTri = :viTri")
    , @NamedQuery(name = "Cauthu.findBySoAo", query = "SELECT c FROM Cauthu c WHERE c.soAo = :soAo")
    , @NamedQuery(name = "Cauthu.findByNgaySinh", query = "SELECT c FROM Cauthu c WHERE c.ngaySinh = :ngaySinh")
    , @NamedQuery(name = "Cauthu.findByBanThang", query = "SELECT c FROM Cauthu c WHERE c.banThang = :banThang")
    , @NamedQuery(name = "Cauthu.findByTheVang", query = "SELECT c FROM Cauthu c WHERE c.theVang = :theVang")
    , @NamedQuery(name = "Cauthu.findByTheDo", query = "SELECT c FROM Cauthu c WHERE c.theDo = :theDo")
    , @NamedQuery(name = "Cauthu.findByMaDoiBong", query = "SELECT c FROM Cauthu c WHERE c.maDoiBong = :maDoiBong")})
public class Cauthu implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaCauThu")
    private Integer maCauThu;
    @Basic(optional = false)
    @Column(name = "TenCauThu")
    private String tenCauThu;
    @Basic(optional = false)
    @Column(name = "ViTri")
    private String viTri;
    @Basic(optional = false)
    @Column(name = "SoAo")
    private int soAo;
    @Basic(optional = false)
    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Basic(optional = false)
    @Column(name = "BanThang")
    private int banThang;
    @Basic(optional = false)
    @Column(name = "TheVang")
    private int theVang;
    @Basic(optional = false)
    @Column(name = "TheDo")
    private int theDo;
    @Basic(optional = false)
    @Column(name = "MaDoiBong")
    private int maDoiBong;

    public Cauthu() {
    }

    public Cauthu(Integer maCauThu) {
        this.maCauThu = maCauThu;
    }

    public Cauthu(Integer maCauThu, String tenCauThu, String viTri, int soAo, String ngaySinh, int banThang, int theVang, int theDo, int maDoiBong) {
        this.maCauThu = maCauThu;
        this.tenCauThu = tenCauThu;
        this.viTri = viTri;
        this.soAo = soAo;
        this.ngaySinh = ngaySinh;
        this.banThang = banThang;
        this.theVang = theVang;
        this.theDo = theDo;
        this.maDoiBong = maDoiBong;
    }

    public Integer getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(Integer maCauThu) {
        Integer oldMaCauThu = this.maCauThu;
        this.maCauThu = maCauThu;
        changeSupport.firePropertyChange("maCauThu", oldMaCauThu, maCauThu);
    }

    public String getTenCauThu() {
        return tenCauThu;
    }

    public void setTenCauThu(String tenCauThu) {
        String oldTenCauThu = this.tenCauThu;
        this.tenCauThu = tenCauThu;
        changeSupport.firePropertyChange("tenCauThu", oldTenCauThu, tenCauThu);
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        String oldViTri = this.viTri;
        this.viTri = viTri;
        changeSupport.firePropertyChange("viTri", oldViTri, viTri);
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        int oldSoAo = this.soAo;
        this.soAo = soAo;
        changeSupport.firePropertyChange("soAo", oldSoAo, soAo);
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        String oldNgaySinh = this.ngaySinh;
        this.ngaySinh = ngaySinh;
        changeSupport.firePropertyChange("ngaySinh", oldNgaySinh, ngaySinh);
    }

    public int getBanThang() {
        return banThang;
    }

    public void setBanThang(int banThang) {
        int oldBanThang = this.banThang;
        this.banThang = banThang;
        changeSupport.firePropertyChange("banThang", oldBanThang, banThang);
    }

    public int getTheVang() {
        return theVang;
    }

    public void setTheVang(int theVang) {
        int oldTheVang = this.theVang;
        this.theVang = theVang;
        changeSupport.firePropertyChange("theVang", oldTheVang, theVang);
    }

    public int getTheDo() {
        return theDo;
    }

    public void setTheDo(int theDo) {
        int oldTheDo = this.theDo;
        this.theDo = theDo;
        changeSupport.firePropertyChange("theDo", oldTheDo, theDo);
    }

    public int getMaDoiBong() {
        return maDoiBong;
    }

    public void setMaDoiBong(int maDoiBong) {
        int oldMaDoiBong = this.maDoiBong;
        this.maDoiBong = maDoiBong;
        changeSupport.firePropertyChange("maDoiBong", oldMaDoiBong, maDoiBong);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCauThu != null ? maCauThu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cauthu)) {
            return false;
        }
        Cauthu other = (Cauthu) object;
        if ((this.maCauThu == null && other.maCauThu != null) || (this.maCauThu != null && !this.maCauThu.equals(other.maCauThu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bongda1.pkg0.Cauthu[ maCauThu=" + maCauThu + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
