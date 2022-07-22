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
public class Sach {
   private String masach;
    private String tensach;
    private String theloai;
    private String ngonngu;
    private String tentacgia;
    private int namsx;
    private float dongianhap;

    public Sach(){ }

    public Sach(String masach, String tensach, String theloai, String ngonngu, String tentacgia, int namsx, int soluongnhap, int soluongtonkho, float dongianhap) {
        this.masach = masach;
        this.tensach = tensach;
        this.theloai = theloai;
        this.ngonngu = ngonngu;
        this.tentacgia = tentacgia;
        this.namsx = namsx;
        this.dongianhap = dongianhap;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }



    public float getDongianhap() {
        return dongianhap;
    }

    public void setDongianhap(float dongianhap) {
        this.dongianhap = dongianhap;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", theloai=" + theloai + ", ngonngu=" + ngonngu + ", tentacgia=" + tentacgia + ", namsx=" + namsx + ", dongianhap=" + dongianhap + '}';
    }

    
}
