/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Helper.DateDBToString;
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
import Helper.StringToDateDB;

/**
 *
 * @author vduct
 */
public class RentDao {
    private RentDetails rentDt = null;
    
    public List<RentDetails> getAllRent(){
        List<RentDetails> rentDts = new ArrayList<RentDetails>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select * from PHIEUTHUE, CT_PHIEUTHUE";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                rentDt = new RentDetails();
                
                rentDt.setId(rs.getString(1));
                rentDt.setMadia(rs.getString(2));
                rentDt.setMaKh(rs.getString(3));
                rentDt.setSlThue(rs.getInt(4));
                rentDt.setMaNv(rs.getString(8));                
                rentDt.setNgayTra(rs.getString(11));
                
                rentDts.add(rentDt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rentDts;
    }
    // -- lấy phiếu ds thuê chưa trả
    
    public List<RentDetails> getAllRentNotPay(){
        List<RentDetails> rentDts = new ArrayList<RentDetails>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select * from PHIEUTHUE inner join CT_PHIEUTHUE on PHIEUTHUE.IDPHIEUTHUE = CT_PHIEUTHUE.IDTHUE where PHIEUTHUE.TT = N'chưa trả'";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                rentDt = new RentDetails();
                
                rentDt.setId(rs.getString(1));
                rentDt.setMadia(rs.getString(2));
                rentDt.setMaKh(rs.getString(3));
                rentDt.setSlThue(rs.getInt(4));
                rentDt.setGia(rs.getInt(5)); 
                rentDt.setNgayThue(DateDBToString.DateToString(rs.getDate(10)));
                rentDt.setNgayTra(DateDBToString.DateToString(rs.getDate(11)));
                
                rentDts.add(rentDt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rentDts;
    }
    
    public int insertRent(RentDetails rentDt, String idnv, String uuid){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL SP_THUEDIA (?, ?, ?, ?, ?, ?)}";
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, uuid);
            cs.setString(2, rentDt.getMadia());
            cs.setString(3, idnv);
            cs.setString(4, rentDt.getMaKh());
            cs.setInt(5, rentDt.getSlThue());
            cs.setDate(6, Date.valueOf(StringToDateDB.convertToDateDB(rentDt.getNgayTra()))); 
            
            
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
}
