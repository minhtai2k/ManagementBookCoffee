/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiSach;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vomin
 */
public class CheckInputSach {
     protected boolean checkIDloaiSach(String id){
        var regex = "^s_\\d{3}$";
        if(id.matches(regex))
            return true;
        return false;
    }
     
     public boolean checkStringkhongSo(String name){
        var regex1 = "[^0-9]$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            return true;
        }
        return false;
    }
     
     public static void main(String[] args) {
         String name = "12341231";
         System.out.println(new CheckInputSach().checkStringkhongSo(name));
    }
}
