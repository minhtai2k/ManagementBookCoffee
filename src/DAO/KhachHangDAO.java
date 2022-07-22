/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.KhachHang;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



/**
 *
 * @author vomin
 */
public class KhachHangDAO implements Dao<KhachHang>{
    
    
    public boolean checkIDValid(String idTable) {
        Connection connection = MyConnection.getInstance().getConnection();
        //check quan trong id = maloai    
        var sql = "select makh from khachhang where makh = ? ";    
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
    public void them(KhachHang khachhang) {
        Connection connection = MyConnection.getInstance().getConnection();
        var sql = "insert into khachhang(makh, tenkh, loaikh, diachi, sdt)"
                +"values(?, ?, ?, ?, ?);";     
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            //ep kieu nguoi xuong nhan vien
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, khachhang.getMakhachhang());
            prepare.setNString(2,khachhang.getHoten());
            prepare.setNString(3, khachhang.getLoaikhachhang());
            prepare.setNString(4, khachhang.getDiachi());
//            prepare.setString(3, nguoi.getId());
            prepare.setString(5, khachhang.getSdt());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        }
    }

    @Override
    public boolean xoa(String idnguoi) {
        Connection connection = MyConnection.getInstance().getConnection(); 
        var sql = "delete from khachhang where makh = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);  
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, idnguoi);
            prepare.executeUpdate();
            System.out.println(prepare.executeUpdate());
            return true;
        } catch (SQLException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Override
    public void sua(KhachHang khachhang) { 
        Connection connection = MyConnection.getInstance().getConnection();      
        var sql = "update khachhang set makh = ?, tenkh = ?, loaikh = ?, diachi = ?, sdt = ? where makh = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, khachhang.getMakhachhang());
            prepare.setString(2, khachhang.getHoten());
            prepare.setString(3, khachhang.getLoaikhachhang());
            prepare.setString(4,khachhang.getDiachi());
            prepare.setString(5, khachhang.getSdt());
            prepare.setString(6, khachhang.getMakhachhang());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }
    
    public int demsoluonghoadonKhachHang(String makh) { 
        Connection connection = MyConnection.getInstance().getConnection();      
        var sql = "select count(makh) from hoadon where makh = ?";
        int countmakh = 0;
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare.setString(1, makh);
            var result = prepare.executeQuery();
            result.next();
            countmakh = result.getInt(1);
            System.out.println(countmakh);
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return countmakh;
    }
    
    public void suaLoaiKhachHang(String makh) { 
        Connection connection = MyConnection.getInstance().getConnection();      
        var sql = "update khachhang set loaikh = 'Khách hàng thân quen' where makh = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, makh);
            prepare.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public KhachHang timkiemtheoID(String id) {
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from khachhang where makh = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getString("makh"));
                khachHang.setHoten(resultSet.getNString("tenkh"));
                khachHang.setLoaikhachhang(resultSet.getNString("loaikh"));
                khachHang.setDiachi(resultSet.getNString("diachi"));
                khachHang.setSdt(resultSet.getString("sdt"));
                return khachHang;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public ArrayList<KhachHang> timkiemtheoTen(String name) {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang where tenkh like '%"+name+"'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getString("makh"));
                khachHang.setHoten(resultSet.getNString("tenkh"));
                khachHang.setLoaikhachhang(resultSet.getNString("loaikh"));
                khachHang.setDiachi(resultSet.getString("diachi"));
                khachHang.setSdt(resultSet.getString("sdt"));
                list.add(khachHang);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }

    //@Override
    public ArrayList<KhachHang> timkiemtheoLoai(String type) {      
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang where loaikh = ?";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare.setNString(1,type);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getString("makh"));
                khachHang.setHoten(resultSet.getNString("tenkh"));
                khachHang.setLoaikhachhang(resultSet.getNString("loaikh"));
                khachHang.setDiachi(resultSet.getString("diachi"));
                khachHang.setSdt(resultSet.getString("sdt"));
                list.add(khachHang);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<KhachHang> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang";
        try{
            Connection connection = MyConnection.getInstance().getConnection();
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getString("makh"));
                khachHang.setHoten(resultSet.getNString("tenkh"));
                khachHang.setLoaikhachhang(resultSet.getNString("loaikh"));
                khachHang.setDiachi(resultSet.getString("diachi"));
                khachHang.setSdt(resultSet.getString("sdt"));
                list.add(khachHang);
            }
        }catch(Exception exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }

    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 makh FROM khachhang ORDER BY makh DESC ";
           
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
    
    public ArrayList<KhachHang> timkiemKhachHangs(String id){
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang where tenkh like '%"+id+"%' or makh like '%"+id+"%' or loaikh like '%"+id+"%' or diachi like '%"+id+"%' or sdt like '%"+id+"%'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            //Prepared Statement dùng để thực hiện truy vấn các tham số (tenkh, makh)
            PreparedStatement prepare = connection.prepareStatement(sql);
            //duy trì một con trỏ trỏ đến một hàng của một bảng 
            ResultSet resultSet = prepare.executeQuery() ;
            //resultSet.next được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getString("makh"));
                khachHang.setHoten(resultSet.getNString("tenkh"));
                khachHang.setLoaikhachhang(resultSet.getNString("loaikh"));
                khachHang.setDiachi(resultSet.getString("diachi"));
                khachHang.setSdt(resultSet.getString("sdt"));
                list.add(khachHang);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }
    
    public int demtoanbokh(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT count(makh) as sl FROM khachhang";        
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                int mahdcuoicung = result.getInt("sl");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return -1;
    }    

    public static void main(String[] args) {
        KhachHangDAO khachHangDAO = new KhachHangDAO();
        System.out.println(""+khachHangDAO.timkiemKhachHangs("KH000"));
    }
}
