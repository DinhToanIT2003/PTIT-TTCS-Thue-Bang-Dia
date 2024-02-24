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
    private RentDetails rentDt = null;
    
    public List<RentDetails> getAllRent(){
        List<RentDetails> rentDts = new ArrayList<RentDetails>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select * from dbo.CT_THUE where CT_THUE.IDTRA is null";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                rentDt = new RentDetails();
                
                rentDt.setId(rs.getString(1));
                rentDt.setMadia(rs.getString(2));
                rentDt.setCccdKh(rs.getString(3));
                rentDt.setCccdNv(rs.getString(4));
                rentDt.setSlThue(rs.getInt(6));
                rentDt.setNgayTra(rs.getString(8));
                
                rentDts.add(rentDt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rentDts;
    }
    //select * from dbo.CT_THUE where CT_THUE.IDTRA is not null
    
    public int insertRent(RentDetails rentDt, String idnv, String uuid){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL SP_Thue (?, ?, ?, ?, ?, ?)}";
        
        
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, Integer.parseInt(rentDt.getMadia()));
            cs.setString(2, rentDt.getCccdKh());
            cs.setInt(3, rentDt.getSlThue());
            cs.setDate(4, Date.valueOf(rentDt.getNgayTra()));
            cs.setString(5, rentDt.getCccdNv());
            cs.setString(6, rentDt.getId());
            
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
}
