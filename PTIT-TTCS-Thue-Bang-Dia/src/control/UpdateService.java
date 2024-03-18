/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.CNDao;
import dao.DiskDao;
import dao.JdbcConnection;
import dao.NhaCCDao;
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
import model.NhaCC;

/**
 *
 * @author vduct
 */
public class UpdateService {
    
    private DiskDao diskDao;
    private NhaCCDao nccDao;
    private CNDao cnDao;
    
    public UpdateService(){
        diskDao = new DiskDao();
        nccDao = new NhaCCDao();
        cnDao = new CNDao();
    }
    
    public List<Disk> getAllDisk(){
        return diskDao.getAllDisk();
    }
    
    public int UpdateDisk(Disk disk, String manv){
        return diskDao.UpdateData(disk, manv);
    }
    
    public int addDisk(Disk disk,String manv, NhaCC ncc){
        return diskDao.addDisk(disk,manv, ncc);
    }
    
    public int deleteDisk(Disk disk){
        return diskDao.deleteDisk(disk);
    }
    
    public List<NhaCC> getAllNcc(){
        
        return NhaCCDao.getAllNcc();
    }
    
    public List<CNModel> getAllCnList(){
        
        return cnDao.getAllCnList();
    }
    
}
