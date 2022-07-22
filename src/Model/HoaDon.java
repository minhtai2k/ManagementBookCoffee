/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
/**
 *
 * @author vomin
 */
public class HoaDon {
    private String mahd;
    private String manv;
    private Date ngayban;
    private String makh;
    private float tongtien;

    public HoaDon(String mahd, String manv, Date ngayban, String makh, float tongtien) {
        this.mahd = mahd;
        this.manv = manv;
        this.ngayban = ngayban;
        this.makh = makh;
        this.tongtien = tongtien;
    }

    public HoaDon() {
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
       this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }
    
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon();
        System.out.println(hoaDon.getMahd());
        HoaDon hoaDon1 = new HoaDon();
        System.out.println(hoaDon1.getMahd());
    }

    @Override
    public String toString() {
        return "HoaDon{" + "mahd=" + mahd + ", manv=" + manv + ", ngayban=" + ngayban + ", makh=" + makh + ", tongtien=" + tongtien + '}';
    }
    
    
}
