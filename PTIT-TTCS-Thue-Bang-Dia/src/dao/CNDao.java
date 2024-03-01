/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CNModel;
import model.Disk;

/**
 *
 * @author vduct
 */
public class CNDao {
    public List<CNModel> getAllCnList(){
        List<CNModel> cns = new ArrayList<CNModel>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select ID from dbo.CT_CAPNHAT";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                CNModel cn = new CNModel();
                
                cn.setId(rs.getInt(1));
                
                cns.add(cn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cns;
    }
}
