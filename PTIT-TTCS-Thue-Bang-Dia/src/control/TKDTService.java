/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DTDao;
import java.util.List;
import model.TKDT;

/**
 *
 * @author vduct
 */
public class TKDTService {
    private DTDao dtDao = null;

    public TKDTService() {
        this.dtDao = new DTDao();
    }
    
    public List<TKDT> getAllDT(String mode){
        return this.dtDao.getAllDT(mode);
    }
}
