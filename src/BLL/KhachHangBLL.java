/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.KhachHangDAO;
import Model.KhachHang;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author vomin
 */
public class KhachHangBLL {
    
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
    
    public void writeFileExcel(ArrayList<KhachHang> khachHangs){                  
        
    try {              
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("D:\\"));
        jFileChooser.setFileFilter(new FileNameExtensionFilter("Supported extension", "xlsx", "xls"));
        jFileChooser.showSaveDialog(null);
        File file = jFileChooser.getSelectedFile();
        file.getParentFile().mkdirs();
        
        FileInputStream fis = new FileInputStream(file);
            
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        int monthNow = LocalDate.now().getMonthValue();
        HSSFSheet sheet = workbook.createSheet("Khách hàng tháng "+monthNow);
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        
        int rowNumber = 0;
        Cell cell;
        Row row;
        
        row = sheet.createRow(rowNumber);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Loại khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Địa chỉ");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Số điện thoại");
        cell.setCellStyle(style);
        
        
        for (KhachHang item : khachHangs) {          
            
            rowNumber++;
            row = sheet.createRow(rowNumber);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(item.getMakhachhang());
            
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(item.getHoten());
            
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(item.getLoaikhachhang());
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(item.getDiachi());
            
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(item.getSdt());
                     
        }
            if(file == null){
                JOptionPane.showMessageDialog(null, "Ghi file Excel không thành công");
            }else{
                System.out.println(""+file);
                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
                JOptionPane.showMessageDialog(null, "Ghi file Excel thành công");
            }
                
        } catch (Exception e) {
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(""+new KhachHangBLL().autoIdKH());
    }
}
