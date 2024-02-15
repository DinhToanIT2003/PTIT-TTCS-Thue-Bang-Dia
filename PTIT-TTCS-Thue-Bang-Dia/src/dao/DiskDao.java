/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Disk;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vduct
 */
public class DiskDao {
    public List<Disk> getAllDisk(){
        List<Disk> disks = new ArrayList<Disk>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "SELECT MADIA, TENDIA, lOAI, SOLUONG, GIA FROM DIA ";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                Disk disk = new Disk();
                
                disk.setMa(rs.getInt(1));
                disk.setTen(rs.getString(2));
                disk.setLoai(rs.getString(3));
                disk.setSoluong(rs.getInt(4));
                disk.setGia(rs.getInt(5));
                
                disks.add(disk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return disks;
    }
    
    public int UpdateData(Disk disk){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL UpdateDiskData(?,?,?)}";
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, disk.getMa());
            cs.setInt(2, disk.getSoluong());
            cs.setInt(3, disk.getGia());
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
    
    public int addDisk(Disk disk){
        Connection con = JdbcConnection.getJdbcConnection();
        int rs = 0;
        String sql = "{CALL InsertDisk(?,?,?,?,?)}";
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, disk.getMa());
            cs.setString(2, disk.getTen());
            cs.setString(3, disk.getLoai());
            cs.setInt(4, disk.getSoluong());
            cs.setInt(5, disk.getGia());
            rs = cs.executeUpdate();

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return rs;
    }
}
