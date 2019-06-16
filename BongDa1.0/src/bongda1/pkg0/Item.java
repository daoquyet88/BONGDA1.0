/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda1.pkg0;

public class Item {
    int ma;
   String ten;
   int ho;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHo() {
        return ho;
    }

    public void setHo(int ho) {
        this.ho = ho;
    }

    public Item(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Item{" + "ma=" + ten + '}';
    }

    

    
}
