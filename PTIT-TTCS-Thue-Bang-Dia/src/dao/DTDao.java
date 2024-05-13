/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Helper.DateDBToString;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.TKDT;

/**
 *
 * @author vduct
 */
public class DTDao {
    private List<TKDT> dts = null;
    private final Connection con = JdbcConnection.getJdbcConnection();
    
    public List<TKDT> getAllDT(String mode){
        dts = new ArrayList<>();
        String sql = "{CALL sp_DOANHTHU(?)}";
        
        if("Ngày".equals(mode)){
            return this.getModNgay(sql);
        }else{
            return this.getMod(sql, mode);
        }
    }
    
    private List<TKDT> getModNgay(String sql){
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, "Ngày");       
            
            ResultSet rs = cs.executeQuery();
            
            while (rs.next()){
                TKDT dt;
                dt = new TKDT();
                
                dt.setTg(DateDBToString.DateToString(rs.getDate(1)));
                dt.setDt(rs.getString(2));
                
                dts.add(dt);
            }

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dts;
    }
    
    private List<TKDT> getMod(String sql, String mode){
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, mode);       

            boolean hasRs = cs.execute();

            if(hasRs){
                ResultSet rs = cs.getResultSet();

                while (rs.next()){
                    TKDT dt = new TKDT();

                    dt.setTg(Integer.toString(rs.getInt(1)));
                    dt.setDt(rs.getString(2));

                    dts.add(dt);
                }

                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return dts;
    }

}
