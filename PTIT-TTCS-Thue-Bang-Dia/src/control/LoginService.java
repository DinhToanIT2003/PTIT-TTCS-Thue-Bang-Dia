/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.AccountDao;
import model.Acount;
/**
 *
 * @author vduct
 */
public class LoginService {
    private AccountDao accDao;
    private static String id;

    public static String getId() {
        return id;
    }
    
    
    
    public LoginService(){
        accDao = new AccountDao();
    }
    
    public int checkAccount(String id, String pass){
        Acount acc = accDao.getAcc(id);
        if(acc == null){
            return -1;
        }
        if(acc.getPass().equals(pass)){
            this.id = id;
            return acc.getRole();
        }
        return -1;
    }
    
}
