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
import model.Customer;

/**
 *
 * @author vduct
 */
public class CustomerDao {
    private Customer cust = null;
    
    public List<Customer> getAllCust(){
        List<Customer> customers = new ArrayList<Customer>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "select * from dbo.KHACHHANG where KHACHHANG.TT = 'enable'";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                cust = new Customer();
                
                cust.setMakh(rs.getString(1));
                cust.setCccd(rs.getString(2));                
                cust.setHoten(rs.getString(3));
                cust.setGioitinh(rs.getString(4));
                cust.setNgaysinh(rs.getString(5));
                cust.setSdt(rs.getString(6));
                cust.setEmail(rs.getString(7));
                cust.setDiachi(rs.getString(8));
                
                customers.add(cust);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
}
