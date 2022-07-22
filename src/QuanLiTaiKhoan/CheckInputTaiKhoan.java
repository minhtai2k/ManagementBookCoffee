/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTaiKhoan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vomin
 */
public class CheckInputTaiKhoan {
    public boolean checkUsername(String username){
        var regexid = "/S[^A-Z]$";
        Pattern patternkh = Pattern.compile(regexid);
        Matcher matcherkh = patternkh.matcher(username);
        if(matcherkh.find())
            return true;
        return false;
    }
    
    public boolean checkPassword(String password){
        var regexpass = "[^!@#$%^&*()-+]$";
        if(password.length()<6)
            return false;
        Pattern patternkh = Pattern.compile(regexpass);
        Matcher matcherkh = patternkh.matcher(String.valueOf(password));
        if(matcherkh.find())
            return true;
        return false;
    }
    
    public boolean checkChuoiKhongSo(String name){
        var regex1 = "[^0-9]$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        System.out.println(new CheckInputTaiKhoan().checkPassword("!@#$%^&*()-+"));
        System.out.println(new CheckInputTaiKhoan().checkChuoiKhongSo("mmmm"));
    }
}
