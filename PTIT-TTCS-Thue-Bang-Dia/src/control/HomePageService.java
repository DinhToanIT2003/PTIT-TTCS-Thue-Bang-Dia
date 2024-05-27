/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.HomePageDao;
import model.Staff;

/**
 *
 * @author ACER
 */
public class HomePageService {
    private HomePageDao homePageDao = null;

    public HomePageService() {
        homePageDao = new HomePageDao();
    }
    
    public Staff getStaffInfo(String manv){
        return homePageDao.getStaffById(manv);
    }
}
