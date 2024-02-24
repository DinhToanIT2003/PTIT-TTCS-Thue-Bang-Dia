/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

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

/**
 *
 * @author vduct
 */
public class RentService {
    private RentDao rentDao;
    
    public List<Disk> getAllDisk(){
        return rentDao.getAllDisk();
    }
    
    public int insertRent(RentDetails rentDt, String idnv){
        return rentDao.insertRent(rentDt, idnv);
    }
}
