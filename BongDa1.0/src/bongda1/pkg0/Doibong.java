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
@Table(name = "doibong", catalog = "dbbongda2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Doibong.findAll", query = "SELECT d FROM Doibong d")
    , @NamedQuery(name = "Doibong.findByMaDoiBong", query = "SELECT d FROM Doibong d WHERE d.maDoiBong = :maDoiBong")
    , @NamedQuery(name = "Doibong.findByTenDoiBong", query = "SELECT d FROM Doibong d WHERE d.tenDoiBong = :tenDoiBong")
    , @NamedQuery(name = "Doibong.findByHinhAnh", query = "SELECT d FROM Doibong d WHERE d.hinhAnh = :hinhAnh")
    , @NamedQuery(name = "Doibong.findByHuanLuanVien", query = "SELECT d FROM Doibong d WHERE d.huanLuanVien = :huanLuanVien")
    , @NamedQuery(name = "Doibong.findByNgaySinh", query = "SELECT d FROM Doibong d WHERE d.ngaySinh = :ngaySinh")
    , @NamedQuery(name = "Doibong.findBySanNha", query = "SELECT d FROM Doibong d WHERE d.sanNha = :sanNha")})
public class Doibong implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaDoiBong")
    private Integer maDoiBong;
    @Basic(optional = false)
    @Column(name = "TenDoiBong")
    private String tenDoiBong;
    @Basic(optional = false)
    @Column(name = "HinhAnh")
    private String hinhAnh;
    @Basic(optional = false)
    @Column(name = "HuanLuanVien")
    private String huanLuanVien;
    @Basic(optional = false)
    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Basic(optional = false)
    @Column(name = "SanNha")
    private String sanNha;

    public Doibong() {
    }

    public Doibong(Integer maDoiBong) {
        this.maDoiBong = maDoiBong;
    }

    public Doibong(Integer maDoiBong, String tenDoiBong, String hinhAnh, String huanLuanVien, String ngaySinh, String sanNha) {
        this.maDoiBong = maDoiBong;
        this.tenDoiBong = tenDoiBong;
        this.hinhAnh = hinhAnh;
        this.huanLuanVien = huanLuanVien;
        this.ngaySinh = ngaySinh;
        this.sanNha = sanNha;
    }

    public Integer getMaDoiBong() {
        return maDoiBong;
    }

    public void setMaDoiBong(Integer maDoiBong) {
        Integer oldMaDoiBong = this.maDoiBong;
        this.maDoiBong = maDoiBong;
        changeSupport.firePropertyChange("maDoiBong", oldMaDoiBong, maDoiBong);
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public void setTenDoiBong(String tenDoiBong) {
        String oldTenDoiBong = this.tenDoiBong;
        this.tenDoiBong = tenDoiBong;
        changeSupport.firePropertyChange("tenDoiBong", oldTenDoiBong, tenDoiBong);
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        String oldHinhAnh = this.hinhAnh;
        this.hinhAnh = hinhAnh;
        changeSupport.firePropertyChange("hinhAnh", oldHinhAnh, hinhAnh);
    }

    public String getHuanLuanVien() {
        return huanLuanVien;
    }

    public void setHuanLuanVien(String huanLuanVien) {
        String oldHuanLuanVien = this.huanLuanVien;
        this.huanLuanVien = huanLuanVien;
        changeSupport.firePropertyChange("huanLuanVien", oldHuanLuanVien, huanLuanVien);
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        String oldNgaySinh = this.ngaySinh;
        this.ngaySinh = ngaySinh;
        changeSupport.firePropertyChange("ngaySinh", oldNgaySinh, ngaySinh);
    }

    public String getSanNha() {
        return sanNha;
    }

    public void setSanNha(String sanNha) {
        String oldSanNha = this.sanNha;
        this.sanNha = sanNha;
        changeSupport.firePropertyChange("sanNha", oldSanNha, sanNha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDoiBong != null ? maDoiBong.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doibong)) {
            return false;
        }
        Doibong other = (Doibong) object;
        if ((this.maDoiBong == null && other.maDoiBong != null) || (this.maDoiBong != null && !this.maDoiBong.equals(other.maDoiBong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bongda1.pkg0.Doibong[ maDoiBong=" + maDoiBong + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
