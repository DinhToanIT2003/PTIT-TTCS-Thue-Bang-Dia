/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Helper.StringToDateDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import java.sql.CallableStatement;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    
        public List<Customer> getCustByCCCD(String cccd){
        List<Customer> customers = new ArrayList<Customer>();

        Connection con = JdbcConnection.getJdbcConnection();

        String sql = "select * from dbo.KHACHHANG where KHACHHANG.TT = 'enable' and KHACHHANG.CCCD = ?";

        try {
            PreparedStatement prestat = con.prepareCall(sql);

            prestat.setString(1, cccd);

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

    public static void addNewCustomer (Customer customer, String manv) throws ParseException {
        Connection con = JdbcConnection.getJdbcConnection();
        String sql = "{CALL SP_THEMKH (?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);

            cs.setString(1, manv);
            cs.setString(2, customer.getMakh());
            cs.setString(3, customer.getCccd());
            cs.setString(4, customer.getHoten());
            cs.setString(5, customer.getGioitinh());
            cs.setDate(6, java.sql.Date.valueOf(StringToDateDB.convertToDateDB(customer.getNgaysinh())));
            cs.setString(7, customer.getSdt());
            cs.setString(8, customer.getEmail());
            cs.setString(9, customer.getDiachi());

            System.out.println(sql);
            System.out.println(cs);

            cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
