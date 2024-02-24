/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Disk;
import model.RentDetails;

/**
 *
 * @author vduct
 */
public class RentDao {
    public List<Disk> getAllDisk(){
        List<Disk> disks = new ArrayList<Disk>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "SELECT MADIA, TENDIA, lOAI, SOLUONG, GIA FROM DIA WHERE DIA.TT = N'Hiện'";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                Disk disk = new Disk();
                
                disk.setMa(rs.getInt(1));
                disk.setTen(rs.getString(2));
                disk.setLoai(rs.getString(3));
                disk.setSoluong(rs.getInt(4));
                disk.setGia(rs.getInt(5));                
                
                disks.add(disk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return disks;
    }
    //select * from dbo.CT_THUE where CT_THUE.IDTRA is not null
    
    public int insertRent(RentDetails rentDt, String idnv){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL SP_Thue (?, ?, ?, ?, ?)}";
        
        
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, Integer.parseInt(rentDt.getMadia()));
            cs.setString(2, rentDt.getCccdKh());
            cs.setInt(3, rentDt.getSlThue());
            cs.setDate(4, Date.valueOf(rentDt.getNgayTra()));
            cs.setString(5, rentDt.getCccdNv());
            
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
}
