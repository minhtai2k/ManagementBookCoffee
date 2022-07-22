/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.HoaDon;
import Model.NhanVien;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Month;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.Year;
import java.time.YearMonth;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vomin
 */
public class HoaDonDAO implements Dao<HoaDon>{

    @Override
    public boolean checkIDValid(String idTable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = MyConnection.getInstance().getConnection();
        var sql = "select mahd from hoadon where mahd = ? ";    
        try {
           PreparedStatement prepare = connection.prepareStatement(sql);
           prepare.setString(1, idTable);
           var result = prepare.executeQuery();
            //Kiem tra neu ma ton tai thi yeu cau nhap lai ma khac
            if (result.next()) { // tra ve ket qua true
                return false;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        //Neu chua ton tai thi tra ve la dung chap nhanreturn true;
        return true;
    }

    @Override
    public void them(HoaDon hoaDon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        //Cau lenh them sql
        var sql = "insert into hoadon(mahd ,manv, ngayban, makh, tongtien)"
                    +"values(?, ?, ?, ?, ?);";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, hoaDon.getMahd());
            prepare.setString(2, hoaDon.getManv());
            prepare.setDate(3, hoaDon.getNgayban());
            prepare.setString(4, hoaDon.getMakh());
            prepare.setFloat(5, hoaDon.getTongtien());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        } 
    }

    @Override
    public boolean xoa(String idhoadon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        //Cau lenh them sql
        var sql = "delete from hoadon where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);       
            prepare.setString(1, idhoadon);
            var result =prepare.executeUpdate();
            if(result > 0)
                return true;
        } catch (SQLException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        }
        return false;
    }

    @Override
    public void sua(HoaDon hoaDon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update hoadon set  mahd = ?, manv = ?, ngayban = ?, makh = ?, tongtien = ? where matd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, hoaDon.getMahd());
            prepare.setString(2, hoaDon.getManv());
            prepare.setDate(3, hoaDon.getNgayban());     
            prepare.setString(4, hoaDon.getMakh());
            prepare.setFloat(5, hoaDon.getTongtien());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    
//    public HoaDon timkiemtheoIDfix(int id) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        var connection = MyConnection.getInstance().getConnection();
//        var sql = "select * from hoadon where mahd = ?";
//        try {
//            var prepare = connection.prepareStatement(sql);
//            prepare.setInt(1, id);
//            var result = prepare.executeQuery();
//            while(result.next()){
//                HoaDon hoaDon = new HoaDon();
//                hoaDon.setMahd(result.getInt("mahd"));
//                hoaDon.setManv(result.getString("manv"));
//                hoaDon.setNgayban(result.getTimestamp("ngayban"));
//                hoaDon.setMakh(result.getString("makh"));
//                hoaDon.setTongtien(result.getFloat("tongtien"));
//                return hoaDon;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    @Override
    public ArrayList<HoaDon> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from hoadon";
        try {
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hoaDons.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return hoaDons;
    }
    
//    public int timmahdcuoicung() throws SQLException{
//        var connection = MyConnection.getInstance().getConnection();
//        var sql = "select top 1 mahd from hoadon order by mahd desc";
//        var prepare = connection.prepareStatement(sql);
//        var result = prepare.executeQuery();
//        if(result.next()){
//            int mahdcuoicung = result.getInt("mahd");
//            return mahdcuoicung+1;
//        }
//        return 0;
//    }
    
    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 mahd FROM hoadon ORDER BY mahd DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("makh");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }  
    
//    public HoaDon timkiemtheoIDCTHDfix(String id, String idtype) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        var connection = MyConnection.getInstance().getConnection();
//        var sql = "select * from chitiethoadon where "+idtype+" = ?";
//        try {
//            var prepare = connection.prepareStatement(sql);
//            prepare.setInt(1, Integer.parseInt(id));
//            var result = prepare.executeQuery();
//            while(result.next()){
//                HoaDon hoaDon = new HoaDon();
//                hoaDon.setMahd(result.getInt("mahd"));
//                hoaDon.setManv(result.getString("manv"));
//                hoaDon.setNgayban(result.getTimestamp("ngayban"));
//                hoaDon.setMakh(result.getString("makh"));
//                hoaDon.setTongtien(result.getFloat("tongtien"));
//                return hoaDon;
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//            //Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
    
     public ArrayList<HoaDon> timkiemtheoIDNV(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        var sql = "select * from hoadon where manv = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hoaDons.add(hoaDon);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            //Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hoaDons;
    }
     
     public ArrayList<HoaDon> timkiemtheoIDKH(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        var sql = "select * from hoadon where makh = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hoaDons.add(hoaDon);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            //Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hoaDons;
    }
     
    public ArrayList<HoaDon> timkiemtheoThang(Date thangbd, Date thangkt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        var sql = "select * from hoadon where ngayban between '"+thangbd+"' and '"+thangkt+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hoaDons.add(hoaDon);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            //Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hoaDons;
    }
    

    public ArrayList<HoaDon> timkiemtheoNgay(Date timedau, Date timecuoi) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        var sql = "select * from hoadon where ngayban >= '"+timedau+"' and ngayban <= '"+timecuoi+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hoaDons.add(hoaDon);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            //Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hoaDons;
    }    
    public static void main(String[] args) throws SQLException {
        Date date = Date.valueOf(LocalDate.of(Year.now().getValue(), YearMonth.now().getMonthValue(), 1));
        System.out.println(new HoaDonDAO().timkiemtheoThang(date, date));
        
    }

    public ArrayList<HoaDon> timkiemHoaDons(String id){
        ArrayList<HoaDon> list = new ArrayList<>();
//update nhanvien set manv = ?, tennv = ?, ngaysinh = ?, gioitinh = ?, diachi = ?, sdt = ?, chucvu = ?, idcanhan = ?, anh = ?        
        String sql = "select * from hoadon where manv like '%"+id+"%' or mahd like '%"+id+"%' or ngayban like '%"+id+"%' "
                + "or makh like '%"+id+"%' or tongtien like '%"+id+"%' " ;
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet result = prepare.executeQuery() ;
            while (result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                list.add(hoaDon);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }    
    
    @Override
    public HoaDon timkiemtheoID(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from hoadon where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1, Integer.parseInt(id));
            var result = prepare.executeQuery();
            while(result.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMahd(result.getString("mahd"));
                hoaDon.setManv(result.getString("manv"));
                hoaDon.setNgayban(result.getDate("ngayban"));
                hoaDon.setMakh(result.getString("makh"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                return hoaDon;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
