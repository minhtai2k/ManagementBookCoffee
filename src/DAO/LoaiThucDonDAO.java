/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.LoaiThucDon;
import Model.TaiKhoan;
import TrangChinh.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vomin
 */
public class LoaiThucDonDAO implements Dao<LoaiThucDon>{

    Connection connection = MyConnection.getInstance().getConnection();
    @Override
    public boolean checkIDValid(String idTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void them(LoaiThucDon loaiThucDon) {
        var sql = "insert into loaithucdon(id, tenloai)"+
                    "values(?, ?);";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, loaiThucDon.getId());
            prepare.setString(2, loaiThucDon.getTenloai());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không hợp lệ");
            //exception.printStackTrace();
        }
    }

    @Override
    public boolean xoa(String id) {
        var sql = "delete from loaithucdon where id = ?";
        try {
            var prepare = connection.prepareStatement(sql);           
            prepare.setString(1, id);
            var result = prepare.executeUpdate();
            if(result > 0){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Thêm vào bảng không hợp lệ");
        }
        return false;
    }

    @Override
    public void sua(LoaiThucDon t) {
        var sql = "update loaithucdon set id = ?, tenloai = ? where id = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, t.getId());
            prepare.setString(2, t.getTenloai());
            prepare.setString(3, t.getId());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public LoaiThucDon timkiemtheoID(String id) {
        String sql = "select * from loaithucdon where id = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                LoaiThucDon loaiThucDon = new LoaiThucDon();
                loaiThucDon.setId(resultSet.getString("id"));
                loaiThucDon.setTenloai(resultSet.getString("tenloai"));
                return loaiThucDon;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;        
    }

    @Override
    public ArrayList<LoaiThucDon> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<LoaiThucDon> loaiThucDons = new ArrayList<>();
        String sql = "select * from loaithucdon";
        try { 
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                LoaiThucDon loaiThucDon = new LoaiThucDon();
                loaiThucDon.setId(resultSet.getString("id"));
                loaiThucDon.setTenloai(resultSet.getString("tenloai"));
                loaiThucDons.add(loaiThucDon);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return loaiThucDons;        
    }
    
    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 id FROM loaithucdon ORDER BY id DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("id");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }    
 
    public static void main(String[] args) {
        System.out.println(""+new LoaiThucDonDAO().toanbodanhsach().size());
        System.out.println(""+new LoaiThucDonDAO().tkcuoidanhsach());
    }
}
