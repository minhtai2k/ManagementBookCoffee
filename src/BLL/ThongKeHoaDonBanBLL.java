/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Model.ChiTietHoaDon;
import Model.HDDatBan;
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
public class ThongKeHoaDonBanBLL {
        public void writeFileExcel(ArrayList<HDDatBan> chiTietHoaDonsBan){                  
        
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
        HSSFSheet sheet = workbook.createSheet("Đặt bàn tháng "+monthNow);
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
        
//        defaultTableModel.addColumn("ID");
//        defaultTableModel.addColumn("Tên khách hàng");
//        defaultTableModel.addColumn("SDT");
//        defaultTableModel.addColumn("Tiền cọc");
//        defaultTableModel.addColumn("Ngày đặt");
//        defaultTableModel.addColumn("Ngày nhận");
//        defaultTableModel.addColumn("Mã bàn");
//        defaultTableModel.addColumn("Tổng tiền");
        
        for (HDDatBan item : chiTietHoaDonsBan) {          
            
            rowNumber++;
            row = sheet.createRow(rowNumber);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(item.getId());
            
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(item.getTenkh());
            
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(item.getSdt());
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(item.getTiencoc());
            
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(item.getSdt().toString());
            
            cell = row.createCell(5, CellType.STRING);
                     
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
}
