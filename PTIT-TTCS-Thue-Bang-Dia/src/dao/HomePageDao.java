/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import model.Staff;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class HomePageDao {
    public Staff getStaffById (String id){
        Staff staff = null;
        
        try {
            Connection con = JdbcConnection.getJdbcConnection();
        
            String sql = "{CALL Sp_laythongtinnhanvien (?)}";
            CallableStatement cs = con.prepareCall(sql);

            cs.setString(1, id);
            
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                staff = new Staff();
                staff.setCccd(rs.getString(2));
                staff.setHo(rs.getString(3));
                staff.setTen(rs.getString(4));
                staff.setGioiTinh(rs.getString(5));
                staff.setNgaySinh(rs.getDate(6));
            }

            System.out.println("Success!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HomePageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return staff;
    }
}
