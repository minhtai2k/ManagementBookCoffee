/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiBan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vomin
 */
public class CheckInputBan {
    
    public boolean checkChuoiKhongSo(String name){
        var regex1 = "[0-9]$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            return true;
        }
        return false;
    }
        
    public static void main(String[] args) {
        System.out.println(""+new CheckInputBan().checkChuoiKhongSo("123"));
    }
}
