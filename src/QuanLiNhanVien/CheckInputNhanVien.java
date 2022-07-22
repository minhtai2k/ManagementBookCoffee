/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiNhanVien;

import TrangChinh.MyConnection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vomin
 */
public class CheckInputNhanVien {
     public boolean checkIDnhanvien(String id){
        var regexkh = "^nv_\\d{3}$"; //Khách hàng thân quen
        Pattern patternkh = Pattern.compile(regexkh);
        Matcher matcherkh = patternkh.matcher(id);
        if(matcherkh.find())
            return true;
        return false;
    }

     
    public boolean checkChuoiSDT(String sdt){
        /*
        vd: 0912.336.278 Đầu số Vinaphone
        vd: 0903.305.474 Đầu số Mobiphone
        vd: 0366.500.555 Đầu số Viettel
        * */
        var regex = "^\\d{4}\\.\\d{3}\\.\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sdt);
        if(matcher.find() || sdt.equals("")==true)
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
    
    public boolean checkCMNDvaCCCD(String idnhanvien){
        if(idnhanvien.length()==9 || idnhanvien.length()==12)
            return true;
        return false;
    }
}
