/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.HDDatBan;
import Model.HoaDon;
import Model.KhachHang;
import TrangChinh.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author vomin
 */
public class HoaDonBanDAO implements Dao<HDDatBan>{

    Connection connection = MyConnection.getInstance().getConnection();
    @Override
    public boolean checkIDValid(String idTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void them(HDDatBan hd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var sql = "insert into hoadondatban(id , tenkh, sdt, ngaydat, ngaynhan, tiencoc, maban, tongtien) values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            var prepare = connection.prepareStatement(sql);
            prepare.setString(1, hd.getId());
            prepare.setNString(2, hd.getTenkh()); 
            prepare.setString(3, hd.getSdt());
            prepare.setDate(4, (Date) hd.getNgaydat());
            prepare.setDate(5, (Date) hd.getNgaynhan());
            prepare.setFloat(6, hd.getTiencoc());
            prepare.setString(7, hd.getMaban());
            prepare.setFloat(8, hd.getTongtien());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(ChiTietThucDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }        
    }

    @Override
    public boolean xoa(String id) {
         Connection connection = MyConnection.getInstance().getConnection(); 
        var sql = "delete from hoadondatban where mahd = ?";
        try {
            PreparedStatement prepare = connection.prepareStatement(sql);  
            prepare = connection.prepareStatement(sql);
            prepare.setString(1, id);
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
    public void sua(HDDatBan t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HDDatBan timkiemtheoID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String tkcuoidanhsach(){
        try {
            var connection = MyConnection.getInstance().getConnection();
            var sql = "SELECT TOP 1 id FROM hoadondatban ORDER BY id DESC ";
           
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

    @Override
    public ArrayList<HDDatBan> toanbodanhsach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<HDDatBan> toanbodanhsachtrongngay(){
        ArrayList<HDDatBan> hDDatBans = new ArrayList<>();
        var sql = "select * from hoadondatban where ngaynhan = ?";
        
        try {
            var prepare = connection.prepareStatement(sql);
        Date date = Date.valueOf(LocalDate.now());
        
        prepare.setDate(1, date);
        var result = prepare.executeQuery();
        while(result.next()){
                HDDatBan hoaDon = new HDDatBan();
                hoaDon.setId(result.getString("id"));
                hoaDon.setTenkh(result.getString("tenkh"));
                hoaDon.setSdt(result.getString("sdt"));
                hoaDon.setTiencoc(result.getFloat("tiencoc"));
                hoaDon.setNgaydat(result.getDate("ngaydat"));
                hoaDon.setNgaynhan(result.getDate("ngaynhan"));
                hoaDon.setMaban(result.getString("maban"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                hDDatBans.add(hoaDon);
            }
        
        } catch (Exception e) {
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return hDDatBans;
    }
    
    public ArrayList<HDDatBan> timkiemHoaDonBans(String id){
        ArrayList<HDDatBan> list = new ArrayList<>();
        String sql = "select * from hoadondatban where id like '%"+id+"%' or tenkh like '%"+id+"%' or sdt like '%"+id+"%' or tiencoc like '%"+id+"%' or maban like '%"+id+"%' or tongtien like '%"+id+"%'";
        try {
            Connection connection = MyConnection.getInstance().getConnection(); 
            PreparedStatement prepare = connection.prepareStatement(sql);
            ResultSet result = prepare.executeQuery() ;
            while (result.next()){
                HDDatBan hoaDon = new HDDatBan();
                hoaDon.setId(result.getString("id"));
                hoaDon.setTenkh(result.getString("tenkh"));
                hoaDon.setSdt(result.getString("sdt"));
                hoaDon.setTiencoc(result.getFloat("tiencoc"));
                hoaDon.setNgaydat(result.getDate("ngaydat"));
                hoaDon.setNgaynhan(result.getDate("ngaynhan"));
                hoaDon.setMaban(result.getString("maban"));
                hoaDon.setTongtien(result.getFloat("tongtien"));
                list.add(hoaDon);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return list;
    }    
    
    public float tongtienHDtrongngay(){
        var sql = "select sum(tongtien) as tt from hoadondatban where ngaynhan = ?";
        
        try {
            var prepare = connection.prepareStatement(sql);
        Date date = Date.valueOf(LocalDate.now());       
        prepare.setDate(1, date);
        var result = prepare.executeQuery();
        if(result.next()){
            float tt = result.getFloat("tt");
            return tt;
        }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return -1;        
    }
    
    public static void main(String[] args) {
        HoaDonBanDAO hdbdao = new HoaDonBanDAO();
        System.out.println(""+hdbdao.toanbodanhsachtrongngay().size());
        System.out.println(""+hdbdao.tongtienHDtrongngay());
    }
}
