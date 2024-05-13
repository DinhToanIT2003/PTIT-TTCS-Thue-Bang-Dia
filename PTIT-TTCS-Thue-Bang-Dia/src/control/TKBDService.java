/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.TKBDDao;
import java.util.List;
import model.TKBD;

/**
 *
 * @author vduct
 */
public class TKBDService {
    private TKBDDao tkbdDao = null;

    public TKBDService() {
        this.tkbdDao = new TKBDDao();
    }
    
    public List<TKBD> getAllBD(String mode){
        return this.tkbdDao.getAllBD(mode);
    }
    
    public List<TKBD> getAllTTBD(){
        return this.tkbdDao.getAllTTBD();
    }
}
