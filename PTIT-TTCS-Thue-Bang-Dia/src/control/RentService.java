/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Helper.DateDBToString;
import dao.CustomerDao;
import dao.DiskDao;
import dao.JdbcConnection;
import dao.RentDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Disk;
import model.RentDetails;
import java.sql.Date;
import model.Customer;

/**
 *
 * @author vduct
 */
public class RentService {
    private RentDao rentDao;
    private DiskDao diskDao;
    private CustomerDao custDao;
    
    public RentService(){
        diskDao = new DiskDao();
        rentDao = new RentDao();
        custDao = new CustomerDao();
    }
    
    public List<Disk> getAllDisk(){
        return this.diskDao.getAllDisk();
    }
    
    public List<RentDetails> getAllRent(){
        
        return this.rentDao.getAllRent();
    }
    
    public int insertRent(RentDetails rentDt, String idnv, String uuid){
        return rentDao.insertRent(rentDt, idnv, uuid);
    }
    
    public List<Customer> getAllCust(){       
        return this.custDao.getAllCust();
    }
    
    public List<RentDetails> getAllRentNotPay(){
        return this.rentDao.getAllRentNotPay();
    }
    
    public boolean chkIDCustomer(String makh, List<Customer> customers){
        for(Customer cust : customers){
            if(cust.getMakh().trim().equals(makh)){
                return true;
            }
        }
        return false;
    }
}
