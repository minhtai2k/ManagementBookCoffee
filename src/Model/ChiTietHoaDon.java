/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vomin
 */
public class ChiTietHoaDon {
    private String mahd;
    private String matd;
    private int soluong;
    private float dongia;
    private float giamgia;
    private float thanhtien;

    public ChiTietHoaDon(String mahd, String matd, int soluong, float dongia, float giamgia, float thanhtien) {
        this.mahd = mahd;
        this.matd = matd;
        this.soluong = soluong;
        this.dongia = dongia;
        this.giamgia = giamgia;
        this.thanhtien = thanhtien;
    }
    
    public ChiTietHoaDon(){}

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMatd() {
        return matd;
    }

    public void setMatd(String matd) {
        this.matd = matd;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(float giamgia) {
        this.giamgia = giamgia;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "mahd=" + mahd + ", matd=" + matd + ", soluong=" + soluong + ", dongia=" + dongia + ", giamgia=" + giamgia + ", thanhtien=" + thanhtien + '}';
    }
    
    
}
