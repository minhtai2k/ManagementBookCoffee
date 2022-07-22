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
public class Ban {
    private String maban;
    private String khuvuc;
    private int succhua;
    private float giatien;
    
    public Ban(){}

    public Ban(String maban, String khuvuc, int succhua, float giatien) {
        this.maban = maban;
        this.khuvuc = khuvuc;
        this.succhua = succhua;
        this.giatien = giatien;
    }

    @Override
    public String toString() {
        return "Ban{" + "maban=" + maban + ", khuvuc=" + khuvuc + ", succhua=" + succhua + ", giatien=" + giatien + '}';
    }

    

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public int getSucchua() {
        return succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }     
}
