/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author vomin
 */
public class ThucDon {
    private String matd;
    private String tentd;
    private String anh;
    private String mota;
    private String loaitd;
    private Float dongiaban;

    public ThucDon(String matd, String tentd, String anh, String mota, Float dongiaban, String loaitd) {
        this.matd = matd;
        this.tentd = tentd;
        
        this.anh = anh;
        this.mota = mota;
        this.dongiaban = dongiaban;
        
        this.loaitd = loaitd;
    }

    public ThucDon(){}

    
    public Float getDongiaban() {
        return dongiaban;
    }

    public void setDongiaban(Float dongiaban) {
        this.dongiaban = dongiaban;
    }

    public String getLoaitd() {
        return loaitd;
    }

    public void setLoaitd(String loaitd) {
        this.loaitd = loaitd;
    }

    
    
    public String getMatd() {
        return matd;
    }

    public void setMatd(String matd) {
        this.matd = matd;
    }

    public String getTentd() {
        return tentd;
    }

    public void setTentd(String tentd) {
        this.tentd = tentd;
    }


    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    
    
    @Override
    public String toString() {
        return "ThucDon{" + "matd=" + matd + ", tentd=" + tentd + ", anh=" + anh + ", mota=" + mota + ", dongiaban=" + dongiaban + '}';
    }
    
    
}
