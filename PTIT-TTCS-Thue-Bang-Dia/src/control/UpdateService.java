/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DiskDao;
import java.util.List;
import model.Disk;

/**
 *
 * @author vduct
 */
public class UpdateService {
    
    private DiskDao diskDao;
    
    public UpdateService(){
        diskDao = new DiskDao();
    }
    
    public List<Disk> getAllDisk(){
        return diskDao.getAllDisk();
    }
    
    public int UpdateDisk(Disk disk){
        return diskDao.UpdateData(disk);
    }
    
    public int addDisk(Disk disk){
        return diskDao.addDisk(disk);
    }
}
