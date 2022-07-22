/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.ThucDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author vomin
 */
public class ThucDonDAO implements Dao<ThucDon>{
    
    public ThucDonDAO(){}

    @Override
    public boolean checkIDValid(String idTable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select matd from thucdon where matd = ? ";
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
    public void them(ThucDon thucDon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "insert into thucdon(matd, tentd, mota, giatien, anhthucdon, loaitd)"+
                    "values(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare.setString(1, thucDon.getMatd());
            prepare.setString(2, thucDon.getTentd());
            prepare.setString(3, thucDon.getMota()); 
            prepare.setFloat(4, thucDon.getDongiaban());
            prepare.setString(5, thucDon.getAnh());
            prepare.setString(6, thucDon.getLoaitd());
            prepare.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Thêm vào bảng không hợp lệ");
            
        }
    }
    
    @Override
    public boolean xoa(String idthucdon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "delete from thucdon where matd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,idthucdon);
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
    public void sua(ThucDon thucDon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update thucdon set  matd = ?, tentd = ?, mota = ?, giatien = ?, anhthucdon = ? where matd = ?"+";";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, thucDon.getMatd());
            prepare.setString(2, thucDon.getTentd());
            prepare.setString(3, thucDon.getMota()); 
            prepare.setFloat(4, thucDon.getDongiaban());
            prepare.setNString(5, thucDon.getAnh());
            prepare.setString(6, thucDon.getMatd());
            prepare.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ThucDon timkiemtheoID(String idthucdon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        String sql = "select * from thucdon where matd = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql); 
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, idthucdon);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()){
                ThucDon thucDon = new ThucDon();
                thucDon.setMatd(resultSet.getString("matd"));
                thucDon.setTentd(resultSet.getNString("tentd"));
                thucDon.setMota(resultSet.getNString("mota"));
                thucDon.setDongiaban(resultSet.getFloat("giatien"));
                thucDon.setAnh(resultSet.getString("anhthucdon"));
                thucDon.setLoaitd(resultSet.getString("loaitd"));
                return thucDon;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }
    
    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 matd FROM thucdon ORDER BY matd DESC ";
           
            var prepare = connection.prepareStatement(sql);
            var result = prepare.executeQuery();
            if(result.next()){
                String mahdcuoicung = result.getString("matd");
                return mahdcuoicung;
            }
        } catch (Exception e) {
            
        }
        return null;
    }

    public ArrayList<ThucDon> timkiemtheoTen(String tenthucdon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<ThucDon> thucDons = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from thucdon where tenthucdon = '"+tenthucdon+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                ThucDon thucDon = new ThucDon();
                thucDon.setMatd(resultSet.getString("matd"));
                thucDon.setTentd(resultSet.getNString("tenthucdon"));
                thucDon.setMota(resultSet.getNString("mota"));
                thucDon.setDongiaban(resultSet.getFloat("giatien"));
                thucDon.setAnh(resultSet.getString("anhthucdon"));
                thucDon.setLoaitd(resultSet.getString("loaitd"));
                thucDons.add(thucDon);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return thucDons;
    }
    
    public ArrayList<ThucDon> timkiemtheoGiatien(float giatien) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ArrayList<ThucDon> thucDons = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from thucdon where tensach like '%"+giatien+"'";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                ThucDon thucDon = new ThucDon();
                thucDon.setMatd(resultSet.getString("matd"));
                thucDon.setTentd(resultSet.getNString("tenthucdon"));
                thucDon.setMota(resultSet.getNString("mota"));
                thucDon.setDongiaban(resultSet.getFloat("giatien"));
                thucDon.setAnh(resultSet.getString("anhthucdon"));
                thucDon.setLoaitd(resultSet.getString("loaitd"));
                thucDons.add(thucDon);
            } 
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return thucDons;
    }

    @Override
    public ArrayList<ThucDon> toanbodanhsach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<ThucDon> thucDons = new ArrayList<>();
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select * from thucdon";
        try {
            var prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while (resultSet.next()) {                
                ThucDon thucDon = new ThucDon();
                thucDon.setMatd(resultSet.getString("matd"));
                thucDon.setTentd(resultSet.getNString("tentd"));
                thucDon.setMota(resultSet.getNString("mota"));
                thucDon.setDongiaban(resultSet.getFloat("giatien"));
                thucDon.setAnh(resultSet.getString("anhthucdon"));
                thucDon.setLoaitd(resultSet.getString("loaitd"));
                thucDons.add(thucDon);
            }           
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return thucDons;
    }
    
        public ArrayList<ThucDon> timkiemThucDons(String id){
        ArrayList<ThucDon> list = new ArrayList<>();
        String sql = "select * from thucdon where tentd like N'%"+id+"%' or matd like '%"+id+"%' or mota like N'%"+id+"%' or loaitd like N'%"+id+"%' or giatien like '%"+id+"%'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery() ;
            while (resultSet.next()){
                ThucDon thucDon = new ThucDon();
                thucDon.setMatd(resultSet.getString("matd"));
                thucDon.setTentd(resultSet.getNString("tentd"));
                thucDon.setMota(resultSet.getNString("mota"));
                thucDon.setDongiaban(resultSet.getFloat("giatien"));
                thucDon.setAnh(resultSet.getString("anhthucdon"));
                thucDon.setLoaitd(resultSet.getString("loaitd"));
                list.add(thucDon);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }
    
    public static void main(String[] args) {
        ThucDonDAO tddao = new ThucDonDAO();
        System.out.println(""+tddao.timkiemThucDons("19000"));
    }
}
