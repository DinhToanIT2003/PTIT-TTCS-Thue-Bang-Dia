/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.main;

import javax.swing.*;
import control.LoginService;
import model.Acount;

/**
 *
 * @author ACER
 */
public class UI_Login extends javax.swing.JFrame {
    LoginService login;
    Acount acc;
    /**
     * Creates new form UI_CentralPanel
     */
    public UI_Login() {
        initComponents(); 
        this.pack();
        login = new LoginService();
        acc = new Acount();
        disable.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLayout = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblCuahang = new javax.swing.JLabel();
        lblCopyRight = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        pnlLayout.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlLayout.setLayout(null);

        pnlLogo.setBackground(new java.awt.Color(102, 200, 255));
        pnlLogo.setPreferredSize(new java.awt.Dimension(400, 500));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoHD.png"))); // NOI18N

        lblCuahang.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblCuahang.setForeground(new java.awt.Color(255, 255, 255));
        lblCuahang.setText("CỬA HÀNG THUÊ CD");
        lblCuahang.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblCopyRight.setForeground(new java.awt.Color(255, 255, 255));
        lblCopyRight.setText("Copyright © Company name all rights reserved ");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCopyRight)
                            .addComponent(lblCuahang, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblLogo)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCuahang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(lblCopyRight)
                .addGap(59, 59, 59))
        );

        pnlLayout.add(pnlLogo);
        pnlLogo.setBounds(0, 0, 400, 530);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setPreferredSize(new java.awt.Dimension(400, 500));
        pnlLogin.setLayout(null);

        lblLogin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 200, 255));
        lblLogin.setText("LOGIN");
        pnlLogin.add(lblLogin);
        lblLogin.setBounds(156, 51, 120, 43);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsername.setText("Username:");
        pnlLogin.add(lblUsername);
        lblUsername.setBounds(44, 112, 90, 21);

        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        pnlLogin.add(txtUsername);
        txtUsername.setBounds(44, 145, 293, 45);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword.setText("Password:");
        pnlLogin.add(lblPassword);
        lblPassword.setBounds(44, 211, 80, 21);

        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlLogin.add(txtPassword);
        txtPassword.setBounds(44, 238, 293, 49);

        btnLogin.setBackground(new java.awt.Color(102, 200, 255));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin);
        btnLogin.setBounds(44, 350, 85, 43);

        lblWarning.setForeground(new java.awt.Color(255, 51, 51));
        pnlLogin.add(lblWarning);
        lblWarning.setBounds(44, 405, 333, 30);

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pictogrammers-Material-Light-Eye.48.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        pnlLogin.add(show);
        show.setBounds(340, 240, 48, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Custom-Icon-Design-Pretty-Office-8-User-blue.48.png"))); // NOI18N
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(343, 145, 48, 48);

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pictogrammers-Material-Light-Eye-off.48.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        pnlLogin.add(disable);
        disable.setBounds(340, 240, 45, 48);

        pnlLayout.add(pnlLogin);
        pnlLogin.setBounds(400, 0, 400, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        dangNhap();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        lblWarning.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        lblWarning.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        dangNhap();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        dangNhap();       
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtPassword.setEchoChar((char)0);
        disable.setVisible(true);
        //disable.setEnabled(true);
        show.setVisible(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtPassword.setEchoChar('*');
        disable.setVisible(false);
        //disable.setEnabled(false);
        show.setVisible(true);
    }//GEN-LAST:event_disableMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UI_Login().setVisible(true);
//            }
//        });
//        
//    }
    
    public void dangNhap(){
        try{
            int result = login.checkAccount(txtUsername.getText(), txtPassword.getText());
        
            if(result == 1){
                JOptionPane.showMessageDialog(rootPane, "Login success!");
                new UI_Staff().setVisible(true);
                this.dispose();
            }else if(result == 0){
                JOptionPane.showMessageDialog(rootPane, "Login success!");
                new UI_Manager().setVisible(true);
                this.dispose();
            }else{
                lblWarning.setText("Password or username is wrong. Please, try again!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error querying data", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCopyRight;
    private javax.swing.JLabel lblCuahang;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JPanel pnlLayout;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
