/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.NhanVien;
import Model.Sach;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author vomin
 */
public class SachDAO implements Dao<Sach>{

    @Override
    public boolean checkIDValid(String idTable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select masach from sach where masach = ? ";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, idTable);
            var result = prepare.executeQuery();
            //Kiem tra neu ma ton tai thi yeu cau nhap lai ma khac
            if (result.next()) { // tra ve ket qua true
                return false;
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }
        //Neu chua ton tai thi tra ve la dung chap nhanreturn true;
        return true;
    }

    @Override
    public void them(Sach sach) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "insert into sach(masach, tensach, loaisach, tentacgia, ngonngu, namsx, dongianhap)"+
                    "values(?, ?, ?, ?, ?, ?, ?);";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,sach.getMasach());
            prepare.setNString(2, sach.getTensach());
            prepare.setNString(3, sach.getTheloai());
            prepare.setNString(4, sach.getTentacgia());
            prepare.setNString(5, sach.getNgonngu());
            prepare.setInt(6, sach.getNamsx());
            prepare.setFloat(7, sach.getDongianhap());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không hợp lệ");
            //exception.printStackTrace();
        }
    }

    @Override
    public boolean xoa(String idsach) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "delete from sach where masach = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,idsach);
            var result = prepare.executeUpdate();
            if(result > 0){
                //Số các dòng truy vấn khác 0 câu truy vấn thành công
                return true;
            }
        } catch (SQLException exception) {
            System.out.println("Xóa không thành công");
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void sua(Sach sach) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update sach set masach = ?, tensach = ?, loaisach = ?, tentacgia = ?, ngonngu = ?, namsx = ?, dongianhap = ? where masach = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, sach.getMasach());
            prepare.setNString(2, sach.getTensach());
            prepare.setNString(3, sach.getTheloai());
            prepare.setNString(4, sach.getTentacgia());
            prepare.setString(5, sach.getNgonngu());
            prepare.setInt(6, sach.getNamsx());
            prepare.setFloat(7, sach.getDongianhap());
            prepare.setString(8, sach.getMasach());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    public void capnhatsoluong(int soluong, int soluongtonkho, String idsach) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update sach set soluongnhap = ?, "
                + "soluongtonkho = ? where masach = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1, soluong);
            prepare.setInt(2, soluongtonkho);
            prepare.setString(3, idsach);
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Sach timkiemtheoID(String idsach) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       java.sql.Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from sach where masach = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, idsach);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                return sach;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public ArrayList<Sach> timkiemtheoTenSach(String tensach) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Sach> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from sach where tensach like '%"+tensach+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                list.add(sach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }
    
     public ArrayList<Sach> timkiemtheoTenTacGia(String tentacgia) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Sach> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from sach where tentacgia like '%"+tentacgia+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                list.add(sach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    //@Override
    public ArrayList<Sach> timkiemtheoLoai(String type) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          ArrayList<Sach> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from sach where loaisach like '%"+type+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                list.add(sach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    @Override
    public ArrayList<Sach> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Sach> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from sach";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getNString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                list.add(sach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }
    
    public ArrayList<String> toanbotheloai() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<String> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select tenls from loaisach";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                String tenloaisach = resultSet.getNString("tenls");
                list.add(tenloaisach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }    
    
    public ArrayList<String> toanbongonngu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<String> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select tennn from ngonngu";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                String tenloaisach = resultSet.getNString("tennn");
                list.add(tenloaisach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    public ArrayList<Sach> timkiemSachs(String id){
        ArrayList<Sach> list = new ArrayList<>();
//update nhanvien set manv = ?, tennv = ?, ngaysinh = ?, gioitinh = ?, diachi = ?, sdt = ?, chucvu = ?, idcanhan = ?, anh = ?        
        String sql = "select * from sach where masach like '%"+id+"%' or tensach like '%"+id+"%' or loaisach like '%"+id+"%' "
                + "or tentacgia like '%"+id+"%' or ngonngu like '%"+id+"%' or namsx like '%"+id+"%' or dongianhap like '%"+id+"%'" ;
        try {
            java.sql.Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                Sach sach = new Sach();
                sach.setMasach(resultSet.getString("masach"));
                sach.setTensach(resultSet.getNString("tensach"));
                sach.setTheloai(resultSet.getNString("loaisach"));
                sach.setTentacgia(resultSet.getNString("tentacgia"));
                sach.setNgonngu(resultSet.getNString("ngonngu"));
                sach.setNamsx(resultSet.getInt("namsx"));
                sach.setDongianhap(resultSet.getFloat("dongianhap"));
                list.add(sach);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }
    
    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 masach FROM sach ORDER BY masach DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("masach");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }    
   
    public static void main(String[] args) {
    }
    
}
