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
import model.Disk;
import model.NhaCC;

/**
 *
 * @author vduct
 */
public class NhaCCDao {
    public static List<NhaCC> getAllNcc(){
        List<NhaCC> nhaCCs = new ArrayList<NhaCC>();
        
        Connection con = JdbcConnection.getJdbcConnection();
        
        String sql = "SELECT NHACUNGCAP.MANCC FROM NHACUNGCAP ";
        
        try {
            PreparedStatement prestat = con.prepareCall(sql);
            
            ResultSet rs = prestat.executeQuery();
            
            while (rs.next()){
                NhaCC nhaCC = new NhaCC();
                
                nhaCC.setId(rs.getString(1));
                
                nhaCCs.add(nhaCC);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhaCCs;
    }
    
//    public static void main(String[] args) {
//        List<NhaCC> nhaCCs = NhaCCDao.getAllNcc();
//        for(NhaCC ncc : nhaCCs){
//            System.out.println(ncc.getId());
//        }
//          System.out.println("\n\nhello");
//    }
}
