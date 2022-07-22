/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.NhanVienDAO;
import TrangChinh.MyConnection;
import javax.swing.JComboBox;

/**
 *
 * @author vomin
 */
public class NhanVienBLL {
    
    public String autoIdNV(JComboBox cbbChucvu){
        try {               
                String idcuoicung = new NhanVienDAO().tkcuoidanhsach();
                if(cbbChucvu.getSelectedIndex()!=-1){
                    //cbbChucvu.getSelectedIndex();
                    String data = "";
                    data = (String) cbbChucvu.getItemAt(cbbChucvu.getSelectedIndex());
                    String[] idsplit = data.split(" "); 
                    char tk2 = Character.toUpperCase(idsplit[2].charAt(0));
                    char tk3 = Character.toUpperCase(idsplit[3].charAt(0));
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
                    return "NV"+tk2+tk3+idnumberlast;
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void fillCombobox(JComboBox cbbChucvu){
        try {
            var connection = MyConnection.getInstance().getConnection();
            String sql = "select * from chucvu";
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            while (result.next()) {                
                String tencv = result.getNString("tencv");
                int idcv = result.getInt("macv");
                cbbChucvu.addItem(tencv);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
