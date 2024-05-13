/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Helper.DateDBToString;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.TKBD;

/**
 *
 * @author vduct
 */
public class TKBDDao {
    private List<TKBD> bds = null;
    private final Connection con = JdbcConnection.getJdbcConnection();
    
    //Lấy ds băng đĩa và doanh thu của nó
    public List<TKBD> getAllBD(String mode){
        bds = new ArrayList<>();
        String sql = "{CALL SP_DSDIADT(?)}";
        
        if("Ngày".equals(mode)){
            return this.getModNgay(sql);
        }else{
            return this.getMod(sql, mode);
        }
    }
    
    private List<TKBD> getModNgay(String sql){
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, "Ngày");       
            
            ResultSet rs = cs.executeQuery();
            
            while (rs.next()){
                TKBD bd = new TKBD();
                
                bd.setMabd(rs.getString(1));
                bd.setTg(DateDBToString.DateToString(rs.getDate(2)));
                bd.setDt(rs.getString(3));
                
                bds.add(bd);
            }

            System.out.println("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(DiskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bds;
    }
    
    private List<TKBD> getMod(String sql, String mode){
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, mode);       

            boolean hasRs = cs.execute();

            if(hasRs){
                ResultSet rs = cs.getResultSet();

                while (rs.next()){
                    TKBD bd = new TKBD();

                    bd.setMabd(rs.getString(1));
                    bd.setTg(Integer.toString(rs.getInt(2)));
                    bd.setDt(rs.getString(3));

                    bds.add(bd);
                }

                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return bds;
    }
    
    //Lấy ds trạng thái tồn kho của đĩa
    public List<TKBD> getAllTTBD(){
        bds = new ArrayList<>();
        String sql = "{CALL SP_DSDIATT()}";
        
        CallableStatement cs;
        try {
            cs = con.prepareCall(sql);  

            boolean hasRs = cs.execute();

            if(hasRs){
                ResultSet rs = cs.getResultSet();

                while (rs.next()){
                    TKBD bd = new TKBD();

                    bd.setMabd(rs.getString(1));
                    bd.setSlt(rs.getInt(2));
                    bd.setSlth(rs.getInt(3));

                    bds.add(bd);
                }

                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return bds;
    }
}
