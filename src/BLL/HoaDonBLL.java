/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.KhachHangDAO;

/**
 *
 * @author vomin
 */
public class HoaDonBLL {
        public String autoIdKH(){
        try {               
                String idcuoicung = new KhachHangDAO().tkcuoidanhsach(); 
                    String idnumberlast = "";
                    for(int i=0; i < idcuoicung.length(); i++) {
                        Boolean flag = Character.isDigit(idcuoicung.charAt(i));
                        if(Character.toString(idcuoicung.charAt(idcuoicung.length()-2)).equals("0")) {
                            idnumberlast = ""+ idcuoicung.charAt(idcuoicung.length()-1);                         
                        }else if(Character.toString(idcuoicung.charAt(idcuoicung.length()-3)).equals("0")){
                              idnumberlast = ""+ idcuoicung.charAt(idcuoicung.length()-2) + idcuoicung.charAt(idcuoicung.length()-1);
                        }else if(Character.toString(idcuoicung.charAt(idcuoicung.length()-4)).equals("0")){
                              idnumberlast = ""+idcuoicung.charAt(idcuoicung.length()-3) + idcuoicung.charAt(idcuoicung.length()-2) 
                                      + idcuoicung.charAt(idcuoicung.length()-1);
                        }else if(Character.toString(idcuoicung.charAt(idcuoicung.length()-5)).equals("0")){
                              idnumberlast = ""+idcuoicung.charAt(idcuoicung.length()-4) + idcuoicung.charAt(idcuoicung.length()-3) 
                                      + idcuoicung.charAt(idcuoicung.length()-2) + idcuoicung.charAt(idcuoicung.length()-1);                        
                        }           
                    }
                    int chuoicuoi = Integer.parseInt(idnumberlast)+1;
                    if(chuoicuoi<9){
                        idnumberlast = "0000"+chuoicuoi;
                    }else if(chuoicuoi>=9 && chuoicuoi <=99){
                        idnumberlast = "000"+chuoicuoi;
                    }else if(chuoicuoi>=99 && chuoicuoi<=999){
                        idnumberlast = "00"+chuoicuoi;
                    }else if(chuoicuoi>=999 && chuoicuoi<=9999)
                        idnumberlast = "0"+chuoicuoi;
                    else
                        idnumberlast = ""+chuoicuoi;
                    
                    return "KH"+idnumberlast;               
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
