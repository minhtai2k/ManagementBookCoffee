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
public class TaiKhoan {
    private String username;
    private String password;
    private String manv;
    
    public TaiKhoan(){}

    public TaiKhoan(String username, String password, String manv) {
        this.username = username;
        this.password = password;
        this.manv = manv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }


    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "username=" + username + ", password=" + password + ", manv=" + manv + '}';
    }

    
    
}
