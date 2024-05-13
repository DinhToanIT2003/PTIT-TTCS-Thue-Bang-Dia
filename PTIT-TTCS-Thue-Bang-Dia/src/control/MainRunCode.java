package control;

import javax.swing.JOptionPane;
import views.main.UI_Login;
import views.main.WelcomeFrm;

public class MainRunCode {
    
    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WelcomeFrm().setVisible(true);          
//            }
//        });
        WelcomeFrm wc =new WelcomeFrm();
        
        wc.setVisible(true);
        
        for(int i=0; i<=100; i++){
            try {
                Thread.sleep(100);
                wc.getProgressBar().setValue(i);
                if(i==10) wc.getLblLoading().setText("Turning on modules...");
                if(i==20) wc.getLblLoading().setText("Loading modules...");  
                if(i==50) wc.getLblLoading().setText("Connecting to database..."); 
                if(i==70) wc.getLblLoading().setText("Connection complete..."); 
                if(i==80) wc.getLblLoading().setText("Lauching Application..."); 
                if(i==100){
                    wc.dispose();
                }
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
        new UI_Login().setVisible(true);
    }
    
}
