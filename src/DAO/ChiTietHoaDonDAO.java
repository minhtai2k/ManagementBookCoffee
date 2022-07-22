/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TrangChinh.MyConnection;
import Model.ChiTietHoaDon;
import Model.HoaDon;
import Model.ThucDon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vomin
 */
public class ChiTietHoaDonDAO implements Dao<ChiTietHoaDon>{

    @Override
    public boolean checkIDValid(String idTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }
    
    public boolean checkIDValidXoaHD(int idHoaDon){
       var connection = MyConnection.getInstance().getConnection();
       var sql = "select * from chitiethoadon where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1,idHoaDon);
            var result = prepare.executeQuery();
            if(result.next())
                return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return true;
    }
    
    public boolean checkIDValidfixCTHD(int idTableHoaDon, String idTableThucDon) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       var connection = MyConnection.getInstance().getConnection();
       var sql = "select * from chitiethoadon where mahd = ? and matd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1, idTableHoaDon);
            prepare.setString(2, idTableThucDon);
            var result = prepare.executeQuery();
            if(result.next())
                return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return true;
    }

    @Override
    public void them(ChiTietHoaDon chiTietHoaDon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "insert into chitiethoadon(mahd , matd, soluong, dongia, giamgia, thanhtien) values(?, ?, ?, ?, ?, ?)";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, chiTietHoaDon.getMahd());
            prepare.setString(2, chiTietHoaDon.getMatd()); 
            prepare.setInt(3, chiTietHoaDon.getSoluong());
            prepare.setFloat(4, chiTietHoaDon.getDongia());
            prepare.setFloat(5, chiTietHoaDon.getGiamgia());
            prepare.setFloat(6, chiTietHoaDon.getThanhtien());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(ChiTietThucDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
    
    public void capnhatcotdulieu(ChiTietHoaDon chiTietHoaDon){
      var connection = MyConnection.getInstance().getConnection();
      var sql = "update chitiethoadon set soluong = ?, dongia = ?, giamgia = ?, thanhtien = ? where mahd = ? and matd = ?";
      try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1, chiTietHoaDon.getSoluong());
            prepare.setFloat(2, chiTietHoaDon.getDongia());
            prepare.setFloat(3, chiTietHoaDon.getGiamgia());
            prepare.setFloat(4, chiTietHoaDon.getThanhtien());
            prepare.setString(5, chiTietHoaDon.getMahd());
            prepare.setString(6, chiTietHoaDon.getMatd());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(ChiTietThucDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
       
    
    public ArrayList<ChiTietHoaDon> timtheoIDfix(String id){
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select mahd, matd, soluong, dongia, giamgia, thanhtien from chitiethoadon where mahd = ?";
        ArrayList<ChiTietHoaDon> chiTietHoaDons = new ArrayList<>();
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeQuery();
            while(result.next()){
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setMahd(result.getString("mahd"));
                chiTietHoaDon.setMatd(result.getString("matd"));
                chiTietHoaDon.setSoluong(result.getInt("soluong"));
                chiTietHoaDon.setDongia(result.getFloat("dongia"));
                chiTietHoaDon.setGiamgia(result.getFloat("giamgia"));
                chiTietHoaDon.setThanhtien(result.getFloat("thanhtien"));
                chiTietHoaDons.add(chiTietHoaDon);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chiTietHoaDons;
    }
    
    public ChiTietHoaDon timtheoID2ma(String addmahd, String addmatd) throws SQLException{
        var connection = MyConnection.getInstance().getConnection();
        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
        var sql = "select * from chitiethoadon where mahd = ? and matd = ?";
        var prepare = connection.prepareStatement(sql);
        prepare.setString(1, addmahd);
        prepare.setString(2, addmatd);
        var result = prepare.executeQuery();
        while(result.next()){
            chiTietHoaDon.setMahd(result.getString("mahd"));
            chiTietHoaDon.setMatd(result.getString("matd"));
            chiTietHoaDon.setSoluong(result.getInt("soluong"));
            chiTietHoaDon.setDongia(result.getFloat("dongia"));
            chiTietHoaDon.setGiamgia(result.getFloat("giamgia"));
            chiTietHoaDon.setThanhtien(result.getFloat("thanhtien"));
        }
        return chiTietHoaDon;
    }
    
    
    
    public void capnhattongtienhoadon(int id, float tongtien){
        var connection = MyConnection.getInstance().getConnection();
        var sql = "update hoadon set tongtien = ? where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setFloat(1, tongtien);
            prepare.setInt(2, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            
        }
    }
    
    public float tongtienhoadon(String mahd){
        var connection = MyConnection.getInstance().getConnection();
        var sql = "select SUM(thanhtien) as tongtien from chitiethoadon where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, mahd);
            var result = prepare.executeQuery();
            if(result.next()){
                float tthd = result.getFloat("tongtien");
                return tthd;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();            
        }
        return -1;
    }
    

    public boolean xoaFIX(String idhoadon, String idthucdon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "delete from chitiethoadon where mahd = ? and matd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,idhoadon);
            prepare.setString(2, idthucdon);
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
    
    public void xoaHoaDonALL(String idhoadon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "delete from chitiethoadon where mahd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1,idhoadon);
            var result = prepare.executeUpdate();
        } catch (SQLException exception) {
            System.out.println("Xóa không thành công");
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }
    }
    
        public void xoaCTHDtheoMatd(int idthucdon) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var connection = MyConnection.getInstance().getConnection();
        var sql = "delete from chitiethoadon where matd = ?";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setInt(1,idthucdon);
            var result = prepare.executeUpdate();
        } catch (SQLException exception) {
            System.out.println("Xóa không thành công");
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }
    }

    @Override
    public void sua(ChiTietHoaDon t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChiTietHoaDon timkiemtheoID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ChiTietHoaDon> toanbodanhsach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws SQLException {
        int hoadonid = 35;
        String thucdonid = "HD943865900"; 
        System.out.println(""+new ChiTietHoaDonDAO().tongtienhoadon(thucdonid));
    }
}
