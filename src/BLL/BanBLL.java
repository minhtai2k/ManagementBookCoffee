/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.BanDAO;

/**
 *
 * @author vomin
 */
public class BanBLL {
       public String autoIDBan(){
        try {               
            String idcuoicung = new BanDAO().tkcuoidanhsach();                                   
                String idnumberlast = "";
                for(int i=0; i < idcuoicung.length(); i++) {
                    Boolean flag = Character.isDigit(idcuoicung.charAt(i));
                    if(Character.toString(idcuoicung.charAt(idcuoicung.length()-2)).equals("0")) {
                        idnumberlast = ""+ idcuoicung.charAt(idcuoicung.length()-1);                         
                        }else if(Character.toString(idcuoicung.charAt(idcuoicung.length()-3)).equals("0")){
                              idnumberlast = ""+ idcuoicung.charAt(idcuoicung.length()-2) + idcuoicung.charAt(idcuoicung.length()-1);
                        }else{
                              idnumberlast = ""+ idcuoicung.charAt(idcuoicung.length()-2) + idcuoicung.charAt(idcuoicung.length()-1) + idcuoicung.charAt(idcuoicung.length());
                        }            
                    }
                    int chuoicuoi = Integer.parseInt(idnumberlast)+1;
                    if(chuoicuoi<9){
                        idnumberlast = "00"+chuoicuoi;
                    }else if(chuoicuoi>=9 && chuoicuoi <=99){
                        idnumberlast = "0"+chuoicuoi;
                    }else
                        idnumberlast = ""+chuoicuoi;
                     return "B"+idnumberlast;                
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
       }
       
}
