/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

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
    
    public UpdateService(){
        diskDao = new DiskDao();
    }
    
    public List<Disk> getAllDisk(){
        return diskDao.getAllDisk();
    }
    
    public int UpdateDisk(Disk disk, CNModel cn){
        return diskDao.UpdateData(disk, cn);
    }
    
    public int addDisk(Disk disk,CNModel cn){
        return diskDao.addDisk(disk,cn);
    }
    
    public int deleteDisk(Disk disk){
        return diskDao.deleteDisk(disk);
    }
    
    public List<NhaCC> getAllNcc(){
        
        return nccDao.getAllNcc();
    }
}
