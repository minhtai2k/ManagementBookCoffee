/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiThucDon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vomin
 */
public class CheckInputThucDon {
    public boolean checkIDthucdon(String id){
        var regexkh = "^td_\\d{3}$"; //Khách hàng thân quen
        Pattern patternkh = Pattern.compile(regexkh);
        Matcher matcherkh = patternkh.matcher(id);
        if(matcherkh.find())
            return true;
        return false;
    }
    
    public boolean checkChuoiKhongChu(String name){
        var regex1 = "[^a-zA-Z]$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            return true;
        }
        return false;
    }
}
