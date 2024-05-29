/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PayDao;
import java.util.List;
import model.Payment;
import model.RentDetails;

/**
 *
 * @author vduct
 */
public class PayService {
    private PayDao payDao = null;

    public PayService() {
        payDao = new PayDao();
    }
    
    public int insertPay(Payment payMent, String manv){
        return payDao.insertPay(payMent, manv);
    }
    
    public boolean checkIdRent(String maPthue, List<RentDetails> rents){
        for(RentDetails rent : rents){
            if(rent.getId().equals("maPthue")){
                return true;
            }
        }
        
        return false;
    }
    
    public List<Payment> getAllPay(){
        return this.payDao.getAllPay();
    }
}
