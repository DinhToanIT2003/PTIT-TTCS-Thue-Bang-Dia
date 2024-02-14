/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.main;

import java.awt.Color;

/**
 *
 * @author vduct
 */
public class UI_Staff extends javax.swing.JFrame {

    /**
     * Creates new form UI_Staff
     */
    public UI_Staff() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLayoutSize = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblCD = new javax.swing.JLabel();
        sprtCD = new javax.swing.JSeparator();
        tabThue = new javax.swing.JPanel();
        lblThue = new javax.swing.JLabel();
        tabTra = new javax.swing.JPanel();
        lblTra = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlThue = new javax.swing.JPanel();
        pnlTra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STAFF");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 500));

        pnlLayoutSize.setBackground(new java.awt.Color(204, 204, 255));

        pnlMenu.setBackground(new java.awt.Color(102, 102, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(270, 500));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCD.setFont(new java.awt.Font("Script MT Bold", 3, 48)); // NOI18N
        lblCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCD.setText("CD");
        pnlMenu.add(lblCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 60, 88, 82));

        sprtCD.setForeground(new java.awt.Color(0, 0, 0));
        pnlMenu.add(sprtCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 132, 88, 10));

        tabThue.setBackground(new java.awt.Color(204, 204, 255));
        tabThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabThueMouseClicked(evt);
            }
        });

        lblThue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblThue.setText("Thuê sản phẩm");

        javax.swing.GroupLayout tabThueLayout = new javax.swing.GroupLayout(tabThue);
        tabThue.setLayout(tabThueLayout);
        tabThueLayout.setHorizontalGroup(
            tabThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThueLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblThue, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        tabThueLayout.setVerticalGroup(
            tabThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThueLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblThue, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlMenu.add(tabThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        tabTra.setBackground(new java.awt.Color(204, 204, 255));
        tabTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTraMouseClicked(evt);
            }
        });

        lblTra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTra.setText("Trả sản phẩm");

        javax.swing.GroupLayout tabTraLayout = new javax.swing.GroupLayout(tabTra);
        tabTra.setLayout(tabTraLayout);
        tabTraLayout.setHorizontalGroup(
            tabTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTra, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        tabTraLayout.setVerticalGroup(
            tabTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlMenu.add(tabTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 270, -1));

        pnlContent.setBackground(new java.awt.Color(204, 204, 255));
        pnlContent.setLayout(new java.awt.CardLayout());

        pnlThue.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlThueLayout = new javax.swing.GroupLayout(pnlThue);
        pnlThue.setLayout(pnlThueLayout);
        pnlThueLayout.setHorizontalGroup(
            pnlThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        pnlThueLayout.setVerticalGroup(
            pnlThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlContent.add(pnlThue, "card2");

        pnlTra.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlTraLayout = new javax.swing.GroupLayout(pnlTra);
        pnlTra.setLayout(pnlTraLayout);
        pnlTraLayout.setHorizontalGroup(
            pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        pnlTraLayout.setVerticalGroup(
            pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pnlContent.add(pnlTra, "card3");

        javax.swing.GroupLayout pnlLayoutSizeLayout = new javax.swing.GroupLayout(pnlLayoutSize);
        pnlLayoutSize.setLayout(pnlLayoutSizeLayout);
        pnlLayoutSizeLayout.setHorizontalGroup(
            pnlLayoutSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayoutSizeLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLayoutSizeLayout.setVerticalGroup(
            pnlLayoutSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMenu.getAccessibleContext().setAccessibleName("Menu");

        getContentPane().add(pnlLayoutSize, java.awt.BorderLayout.CENTER);
        pnlLayoutSize.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabThueMouseClicked
        pnlThue.setVisible(true);
        pnlTra.setVisible(false);
        tabThue.setBackground(Color.white);
        tabTra.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabThueMouseClicked

    private void tabTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTraMouseClicked
        pnlTra.setVisible(true);
        pnlThue.setVisible(false);
        tabTra.setBackground(Color.white);
        tabThue.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabTraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblTra;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLayoutSize;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlThue;
    private javax.swing.JPanel pnlTra;
    private javax.swing.JSeparator sprtCD;
    private javax.swing.JPanel tabThue;
    private javax.swing.JPanel tabTra;
    // End of variables declaration//GEN-END:variables
}