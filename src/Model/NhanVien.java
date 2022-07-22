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
public class NhanVien {
    private String tennv;
    private String diachi;
    private Date ngaysinh;
    private String gioitinh;
    private String sdt;
    private String manv;
    private String chucvu;
    private String idcanhan;
    private String anh;
    private String calv;
    
    public NhanVien(){}

    public NhanVien(String tennv, String diachi, Date ngaysinh, String gioitinh, String sdt, String manv, String chucvu, String idcanhan, String anh) {
        this.tennv = tennv;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.manv = manv;
        this.chucvu = chucvu;
        this.idcanhan = idcanhan;
        this.anh = anh;
    }

    public String getCalv() {
        return calv;
    }

    public void setCalv(String calv) {
        this.calv = calv;
    }

    

    @Override
    public String toString() {
        return "NhanVien{" + "tennv=" + tennv + ", diachi=" + diachi + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", manv=" + manv + ", chucvu=" + chucvu + ", idcanhan=" + idcanhan + '}';
    }


 
    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getIdcanhan() {
        return idcanhan;
    }

    public void setIdcanhan(String idcanhan) {
        this.idcanhan = idcanhan;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    
    
}
