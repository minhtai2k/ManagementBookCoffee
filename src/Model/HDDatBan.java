/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author vomin
 */
public class HDDatBan {
    private String id;
    private String tenkh;
    private String sdt;
    private float tiencoc;
    private Date ngaydat;
    private Date ngaynhan;
    private String maban;
    private Float tongtien;

    public HDDatBan(String id, String tenkh, String sdt, float tiencoc, Date ngaydat, Date ngaynhan, String maban, Float tongtien) {
        this.id = id;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.tiencoc = tiencoc;
        this.ngaydat = ngaydat;
        this.ngaynhan = ngaynhan;
        this.maban = maban;
        this.tongtien = tongtien;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public Float getTongtien() {
        return tongtien;
    }

    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }

    

    public HDDatBan() {
    }

    @Override
    public String toString() {
        return "HDDatBan{" + "id=" + id + ", tenkh=" + tenkh + ", sdt=" + sdt + ", tiencoc=" + tiencoc + ", ngaydat=" + ngaydat + ", ngaynhan=" + ngaynhan + ", maban=" + maban + ", tongtien=" + tongtien + '}';
    }
    
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getTiencoc() {
        return tiencoc;
    }

    public void setTiencoc(float tiencoc) {
        this.tiencoc = tiencoc;
    }

    public Date getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(Date ngaydat) {
        this.ngaydat = ngaydat;
    }

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }
    
    
}
