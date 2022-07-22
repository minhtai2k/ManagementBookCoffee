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
public class KhachHang {
    private String makhachhang;
    private String hoten;
    private String loaikhachhang;
    private String diachi;
    private String sdt;

    public KhachHang(){}
    
    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLoaikhachhang() {
        return loaikhachhang;
    }

    public void setLoaikhachhang(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public KhachHang(String makhachhang, String hoten, String loaikhachhang, String diachi, String sdt) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.loaikhachhang = loaikhachhang;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "makhachhang=" + makhachhang + ", hoten=" + hoten + ", loaikhachhang=" + loaikhachhang + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }

    
}
