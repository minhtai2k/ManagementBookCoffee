/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.KhachHang;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author vomin
 */
public class NhanVienDAO implements Dao<NhanVien>{

    @Override
    public boolean checkIDValid(String idTable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //check quan trong id = maloai
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select manv from nhanvien where manv = ? ";
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

    @Override
    public void them(NhanVien nhanVien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Tao cong ket noi connection
        var connection = MyConnection.getInstance().getConnection();
        //Cau lenh them sql
        var sql = "insert into nhanvien(manv, tennv, ngaysinh, gioitinh, diachi, sdt, chucvu, idcanhan, anh)"
                    +"values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,nhanVien.getManv());
            prepare.setNString(2, nhanVien.getTennv());
            prepare.setDate(3, (Date) nhanVien.getNgaysinh());
            prepare.setNString(4, nhanVien.getGioitinh());
            prepare.setNString(5, nhanVien.getDiachi());
            prepare.setString(6, nhanVien.getSdt());
            prepare.setString(7,nhanVien.getChucvu());
            prepare.setString(8, nhanVien.getIdcanhan());
            prepare.setString(9, nhanVien.getAnh());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        }
    }

    @Override
    public boolean xoa(String idnhanvien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        Connection connection = MyConnection.getInstance().getConnection(); 
        var sql = "delete from nhanvien where manv = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);  
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, idnhanvien);
            prepare.executeUpdate();
            return true;
        } catch (SQLException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Override
    public void sua(NhanVien nhanVien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         Connection connection = MyConnection.getInstance().getConnection();  
                //manv, tennv, ngaysinh, gioitinh, diachi, sdt, chucvu, idcanhan, anh
        var sql = "update nhanvien set manv = ?, tennv = ?, ngaysinh = ?, gioitinh = ?, diachi = ?, sdt = ?, chucvu = ?, idcanhan = ?, anh = ? where manv = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare.setString(1,nhanVien.getManv());
            prepare.setNString(2, nhanVien.getTennv());
            prepare.setDate(3, (Date) nhanVien.getNgaysinh());
            prepare.setNString(4, nhanVien.getGioitinh());
            prepare.setNString(5, nhanVien.getDiachi());
            prepare.setString(6, nhanVien.getSdt());
            prepare.setString(7,nhanVien.getChucvu());
            prepare.setString(8, nhanVien.getIdcanhan());
            prepare.setString(9, nhanVien.getAnh());
            prepare.setString(10, nhanVien.getManv());
            prepare.executeUpdate();
            System.out.println(prepare.executeUpdate());
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public NhanVien timkiemtheoID(String idnhanvien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from nhanvien where manv = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1,idnhanvien);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setManv(resultSet.getString("manv"));
                nhanVien.setTennv(resultSet.getNString("tennv"));
                nhanVien.setNgaysinh(resultSet.getDate("ngaysinh"));
                nhanVien.setGioitinh(resultSet.getNString("gioitinh"));
                nhanVien.setDiachi(resultSet.getNString("diachi"));
                nhanVien.setSdt(resultSet.getString("sdt"));
                nhanVien.setChucvu(resultSet.getNString("chucvu"));
                nhanVien.setIdcanhan(resultSet.getString("idcanhan"));
                nhanVien.setAnh(resultSet.getString("anh"));
                return nhanVien;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public ArrayList<NhanVien> timkiemtheoTen(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select * from nhanvien where tennv like '%"+name+"'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setManv(resultSet.getString("manv"));
                nhanVien.setTennv(resultSet.getNString("tennv"));
                nhanVien.setNgaysinh(resultSet.getDate("ngaysinh"));
                nhanVien.setGioitinh(resultSet.getNString("gioitinh"));
                nhanVien.setDiachi(resultSet.getNString("diachi"));
                nhanVien.setSdt(resultSet.getString("sdt"));
                nhanVien.setChucvu(resultSet.getNString("chucvu"));
                nhanVien.setIdcanhan(resultSet.getString("idcanhan"));
                list.add(nhanVien);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }

    //@Override
    public ArrayList<NhanVien> timkiemtheoLoai(String type) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select * from nhanvien where chucvu = ?";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare.setNString(1,type);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setManv(resultSet.getString("manv"));
                nhanVien.setTennv(resultSet.getNString("tennv"));
                nhanVien.setNgaysinh(resultSet.getDate("ngaysinh"));
                nhanVien.setGioitinh(resultSet.getNString("gioitinh"));
                nhanVien.setDiachi(resultSet.getNString("diachi"));
                nhanVien.setSdt(resultSet.getString("sdt"));
                nhanVien.setChucvu(resultSet.getNString("chucvu"));
                nhanVien.setIdcanhan(resultSet.getString("idcanhan"));
                list.add(nhanVien);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<NhanVien> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select * from nhanvien";
        try{
            Connection connection = MyConnection.getInstance().getConnection();
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setManv(resultSet.getString("manv"));
                nhanVien.setTennv(resultSet.getNString("tennv"));
                nhanVien.setNgaysinh(resultSet.getDate("ngaysinh"));
                nhanVien.setGioitinh(resultSet.getNString("gioitinh"));
                nhanVien.setDiachi(resultSet.getNString("diachi"));
                nhanVien.setSdt(resultSet.getString("sdt"));
                nhanVien.setChucvu(resultSet.getNString("chucvu"));
                nhanVien.setIdcanhan(resultSet.getString("idcanhan"));
                list.add(nhanVien);
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
            var sql = "SELECT TOP 1 manv FROM nhanvien ORDER BY manv DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("manv");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public int demtoanbonv(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT count(manv) as sl FROM nhanvien";        
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
    
    public ArrayList<NhanVien> timkiemNhanViens(String id){
        ArrayList<NhanVien> list = new ArrayList<>();
//update nhanvien set manv = ?, tennv = ?, ngaysinh = ?, gioitinh = ?, diachi = ?, sdt = ?, chucvu = ?, idcanhan = ?, anh = ?        
        String sql = "select * from nhanvien where manv like '%"+id+"%' or tennv like '%"+id+"%' or gioitinh like '%"+id+"%' "
                + "or diachi like '%"+id+"%' or sdt like '%"+id+"%' or chucvu like '%"+id+"%' or idcanhan like '%"+id+"%'" ;
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setManv(resultSet.getString("manv"));
                nhanVien.setTennv(resultSet.getNString("tennv"));
                nhanVien.setGioitinh(resultSet.getNString("gioitinh"));
                nhanVien.setDiachi(resultSet.getNString("diachi"));
                nhanVien.setSdt(resultSet.getString("sdt"));
                nhanVien.setChucvu(resultSet.getNString("chucvu"));
                nhanVien.setIdcanhan(resultSet.getString("idcanhan"));
                list.add(nhanVien);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }
    
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVien nv = nhanVienDAO.timkiemtheoID("NVQL001");
        System.out.println(""+nhanVienDAO.timkiemNhanViens("Minh"));
    }
    
}
