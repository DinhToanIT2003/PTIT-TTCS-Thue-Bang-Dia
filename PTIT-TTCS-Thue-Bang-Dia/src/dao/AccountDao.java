/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Acount;
/**
 *
 * @author vduct
 */
public class AccountDao {
    public Acount getAcc(String id){
        Acount acc =null;
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "SELECT * FROM TAIKHOAN WHERE TAIKHOAN.TENDANGNHAP = '"+id+"'";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while(rs.next()){
                acc = new Acount();
                acc.setId(rs.getString(2));
                acc.setPass(rs.getString(3));
                acc.setRole(rs.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }
}
