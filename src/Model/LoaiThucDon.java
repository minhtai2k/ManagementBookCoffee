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
public class LoaiThucDon {
    private String id;
    private String tenloai;

    public LoaiThucDon(String id, String tenloai) {
        this.id = id;
        this.tenloai = tenloai;
    }

    public LoaiThucDon() {
    }

    @Override
    public String toString() {
        return "LoaiThucDon{" + "id=" + id + ", tenloai=" + tenloai + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    
    
}
