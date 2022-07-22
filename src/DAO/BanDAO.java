/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Ban;
import Model.KhachHang;
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
public class BanDAO implements Dao<Ban>{

    @Override
    public boolean checkIDValid(String idTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void them(Ban ban) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                Connection connection = MyConnection.getInstance().getConnection();
        //Cau lenh them sql
        var sql = "insert into ban(maban, khuvuc, succhua, giatien)"
                +"values(?, ?, ?, ?);";     
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            //ep kieu nguoi xuong nhan vien
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, ban.getMaban());
            prepare.setNString(2, ban.getKhuvuc());
            prepare.setInt(3, ban.getSucchua());
            prepare.setFloat(4, ban.getGiatien());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        }
    }

    @Override
    public boolean xoa(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        //Cau lenh them sql
        var sql = "delete from ban where maban = ?";
        try {
            var prepare = connection.prepareStatement(sql);       
            prepare.setString(1, id);
            var result =prepare.executeUpdate();
            if(result > 0)
                return true;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không thành công");
        }
        return false;
    }

    @Override
    public void sua(Ban ban) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update ban set  maban = ?, khuvuc = ?, succhua = ?, giatien = ? where maban = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, ban.getMaban());
            prepare.setString(2, ban.getKhuvuc());
            prepare.setInt(3, ban.getSucchua());     
            prepare.setFloat(4, ban.getGiatien());
            prepare.setString(5, ban.getMaban());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Ban timkiemtheoID(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from ban where maban = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                Ban ban = new Ban();
                ban.setMaban(resultSet.getString("maban"));
                ban.setKhuvuc(resultSet.getNString("khuvuc"));
                ban.setSucchua(resultSet.getInt("succhua"));
                ban.setGiatien(resultSet.getLong("giatien"));
                return ban;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;        
    }

    @Override
    public ArrayList<Ban> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Ban> list = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from ban";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                Ban ban = new Ban();
                ban.setMaban(resultSet.getString("maban"));
                ban.setKhuvuc(resultSet.getNString("khuvuc"));
                ban.setSucchua(resultSet.getInt("succhua"));
                ban.setGiatien(resultSet.getLong("giatien"));
                list.add(ban);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;          
    }
    
    public ArrayList<String> toanbokhuvuc() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<String> list = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select count(khuvuc) as sl from ban";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                String makv = resultSet.getString("sl");
                list.add(makv);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;          
    }
    
        public ArrayList<Ban> tkkhuvuctheoID(String tenkv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Ban> list = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection(); 
        String sql = "select * from ban where khuvuc = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, tenkv);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                Ban ban = new Ban();
                ban.setMaban(resultSet.getString("maban"));
                ban.setKhuvuc(resultSet.getNString("khuvuc"));
                ban.setSucchua(resultSet.getInt("succhua"));
                ban.setGiatien(resultSet.getLong("giatien"));
                list.add(ban);
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
            var sql = "SELECT TOP 1 maban FROM ban ORDER BY maban DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("maban");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }  
   
    public ArrayList<Ban> timkiemBans(String id){
        ArrayList<Ban> list = new ArrayList<>();
        String sql = "select * from ban where maban like '%"+id+"%' or khuvuc like '%"+id+"%' or succhua like '%"+id+"%'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                Ban ban = new Ban();
                ban.setMaban(resultSet.getString("maban"));
                ban.setKhuvuc(resultSet.getNString("khuvuc"));
                ban.setSucchua(resultSet.getInt("succhua"));
                ban.setGiatien(resultSet.getLong("giatien"));
                list.add(ban);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(""+new BanDAO().toanbokhuvuc().size());
        System.out.println(""+new BanDAO().tkcuoidanhsach());
        System.out.println(""+new BanDAO().tkkhuvuctheoID("KV1").size());
    }
}
