/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Helper.StringToDateDB;
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
import model.Payment;
import model.RentDetails;


/**
 *
 * @author vduct
 */
public class PayDao {
    public int insertPay(Payment payMent, String manv){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL SP_TRA (?, ?, ?, ?, ?)}";
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, payMent.getMaPthue());
            cs.setString(2, payMent.getMaPtra());
            cs.setString(3, payMent.getMaHd());
            cs.setString(4, manv);
            cs.setInt(5, payMent.getPhuPhi());
            
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
    
    public List<Payment> getAllPay(){
        List<Payment> pays = new ArrayList<Payment>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select PHIEUTRA.IDTRA, PHIEUTRA.IDHD from PHIEUTRA";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                Payment pm = new Payment();
                
                pm.setMaPtra(rs.getString(1));
                pm.setMaHd(rs.getString(2));
                
                pays.add(pm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pays;
    }
}
