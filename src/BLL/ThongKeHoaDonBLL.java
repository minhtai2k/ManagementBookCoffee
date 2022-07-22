/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import Model.HoaDon;
import Model.KhachHang;
import Model.NhanVien;
import java.io.File;
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
public class ThongKeHoaDonBLL {
    public void writeFileExcel(ArrayList<HoaDon> cthds){
        HSSFWorkbook workbook = new HSSFWorkbook();
        int monthNow = LocalDate.now().getMonthValue();
        HSSFSheet sheet = workbook.createSheet("Thống kê Tháng "+monthNow);
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        
        int rowNumber = 0;
        Cell cell;
        Row row;
        
        row = sheet.createRow(rowNumber);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã hóa đơn");
        cell.setCellStyle(style);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Mã nhân viên");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Tên nhân viên");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Ngày bán");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Mã khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Tên khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Tổng tiền");
        cell.setCellStyle(style);
        
        for (HoaDon hoaDon : cthds) {
            
            KhachHang tenKhachHang = new KhachHangDAO().timkiemtheoID(hoaDon.getMakh());
            NhanVien tenNhanVien = new NhanVienDAO().timkiemtheoID(hoaDon.getManv());
            
            rowNumber++;
            row = sheet.createRow(rowNumber);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(hoaDon.getMahd());
            
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(hoaDon.getManv());
            
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(tenNhanVien.getTennv());
            
            cell = row.createCell(3, CellType.STRING);
            String date = hoaDon.getNgayban().toString();
            cell.setCellValue(date);
            
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(hoaDon.getMakh());
            
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(tenKhachHang.getHoten());
            
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue(hoaDon.getTongtien());           
        }
        
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("D:\\"));
            jFileChooser.setFileFilter(new FileNameExtensionFilter("Supported extension", "xlsx", "xls"));
            jFileChooser.showSaveDialog(null);
            File file = jFileChooser.getSelectedFile();
            file.getParentFile().mkdirs();
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
