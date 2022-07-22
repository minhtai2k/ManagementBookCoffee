/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.Sach;
import Model.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vomin
 */
public class TaiKhoanDAO implements Dao<TaiKhoan>{

    Connection connection = MyConnection.getInstance().getConnection();
    public boolean checkIDValidfix(String username, String password) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        var sql = "select * from taikhoan where username = ? and password = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, username);
            prepare.setString(2, password);
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
    public void them(TaiKhoan taiKhoan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "insert into taikhoan(username, password, manv)"+
                    "values(?, ?, ?);";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, taiKhoan.getUsername());
            prepare.setString(2, taiKhoan.getPassword());
            prepare.setNString(3, taiKhoan.getManv());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không hợp lệ");
            //exception.printStackTrace();
        }
    }

    @Override
    public boolean xoa(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "delete from taikhoan where username = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,id);
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
    public void sua(TaiKhoan taiKhoan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "update taikhoan set username = ?, password = ?, hoten = ? where username = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, taiKhoan.getUsername());
            prepare.setString(2, taiKhoan.getPassword());
            prepare.setString(3, taiKhoan.getManv());
            prepare.setString(4, taiKhoan.getUsername());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    public void doimatkhau(TaiKhoan taiKhoan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "update taikhoan set password = ?, where username = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, taiKhoan.getPassword());
            prepare.setString(2, taiKhoan.getUsername());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public TaiKhoan timkiemtheoID(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from taikhoan where username = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(resultSet.getString("username"));
                taiKhoan.setPassword(resultSet.getString("password"));
                taiKhoan.setManv(resultSet.getString("manv"));
                return taiKhoan;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }
    

    @Override
    public ArrayList<TaiKhoan> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<TaiKhoan> taiKhoans = new ArrayList<>();
        String sql = "select * from taikhoan";
        try { 
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(resultSet.getString("username"));
                taiKhoan.setManv(resultSet.getString("manv"));
                taiKhoans.add(taiKhoan);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return taiKhoans;
    }

    @Override
    public boolean checkIDValid(String idTable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "select username from taikhoan where username = ? ";
        try {
            var prepare = connection.prepareStatement(sql);
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

    public ArrayList<TaiKhoan> timkiemtheoTen(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<TaiKhoan> taiKhoans = new ArrayList<>();
        String sql = "select * from taikhoan where hoten like '%"+name+"'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(resultSet.getString("username"));
                taiKhoan.setPassword(resultSet.getString("password"));
                taiKhoan.setManv(resultSet.getString("manv"));
                taiKhoans.add(taiKhoan);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return taiKhoans;
    }

    public boolean checkMaNVValid(String idNhanvien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TaiKhoan taiKhoan = new TaiKhoan();
        String sql = "select * from taikhoan where manv = '"+idNhanvien+"'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            var resultSet =prepare.executeQuery();
            if(resultSet.next())
                return false;
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return true;
    }
    
    public ArrayList<Sach> timkiemTaikhoans(String id){
        ArrayList<Sach> list = new ArrayList<>();
//update nhanvien set manv = ?, tennv = ?, ngaysinh = ?, gioitinh = ?, diachi = ?, sdt = ?, chucvu = ?, idcanhan = ?, anh = ?        
        String sql = "select * from taikhoan where username like '%"+id+"%' or tensach like '%"+id+"%' or loaisach like '%"+id+"%' "
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
    
    public ArrayList<String> toanbochucvu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<String> list = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select tennn from chucvu";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                String tenloaisach = resultSet.getNString("tencv");
                list.add(tenloaisach);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }    
    
    public static void main(String[] args) {
              boolean taiKhoan = new TaiKhoanDAO().checkIDValidfix("admin", "fullfunction71");
              System.out.println(taiKhoan);
    }
}
