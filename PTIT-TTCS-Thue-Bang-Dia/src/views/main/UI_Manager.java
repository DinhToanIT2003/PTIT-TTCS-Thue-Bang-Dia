/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.main;

import Helper.RandomCodeGenerator;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.Disk;
import control.UpdateService;
import dao.DiskDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import control.BlankValueException;
import control.InvalidIDException;
import control.LoginService;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CNModel;
import model.NhaCC;
import model.Payment;
import model.RentDetails;
import Helper.CheckValueHelper;

/**
 *
 * @author vduct
 */
public class UI_Manager extends javax.swing.JFrame {

    /**
     * Creates new form UI_Staff
     */
    private UpdateService upService;
    private int btn;
    private DefaultTableModel defTabMod;
    private List<Disk> disks;
    private LoginService login;
    private CNModel cn =null;
    private NhaCC nhaCC = null;
    private List<NhaCC> nCCs;
    private List<CNModel> cns;
    private RandomCodeGenerator uID; 
    private String idCn;
    
    
    
    
    public UI_Manager() {
        initComponents();
        txtFieldState(); 
        createTab();
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
        tabUpdate = new javax.swing.JPanel();
        lblThue = new javax.swing.JLabel();
        tabNV = new javax.swing.JPanel();
        lblTra = new javax.swing.JLabel();
        tabHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlUpdate = new javax.swing.JPanel();
        scpDia = new javax.swing.JScrollPane();
        tblDia = new javax.swing.JTable();
        pnlProcess = new javax.swing.JPanel();
        pnlText = new javax.swing.JPanel();
        lblMa = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        lblSl = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        txtSl = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        lblNcc = new javax.swing.JLabel();
        txtNcc = new javax.swing.JTextField();
        lblPhanHoi = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        pnlNV = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGER");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLayoutSize.setBackground(new java.awt.Color(102, 102, 255));

        pnlMenu.setBackground(new java.awt.Color(102, 102, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(270, 500));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCD.setFont(new java.awt.Font("Script MT Bold", 3, 48)); // NOI18N
        lblCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCD.setText("CD");
        pnlMenu.add(lblCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 88, 82));

        sprtCD.setForeground(new java.awt.Color(0, 0, 0));
        pnlMenu.add(sprtCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 88, 10));

        tabUpdate.setBackground(new java.awt.Color(204, 204, 255));
        tabUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUpdateMouseClicked(evt);
            }
        });

        lblThue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblThue.setText("Cập nhật sản phẩm");

        javax.swing.GroupLayout tabUpdateLayout = new javax.swing.GroupLayout(tabUpdate);
        tabUpdate.setLayout(tabUpdateLayout);
        tabUpdateLayout.setHorizontalGroup(
            tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUpdateLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblThue)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        tabUpdateLayout.setVerticalGroup(
            tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabUpdateLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblThue, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pnlMenu.add(tabUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        tabNV.setBackground(new java.awt.Color(204, 204, 255));
        tabNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNVMouseClicked(evt);
            }
        });

        lblTra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTra.setText("Danh sách nhân viên");

        javax.swing.GroupLayout tabNVLayout = new javax.swing.GroupLayout(tabNV);
        tabNV.setLayout(tabNVLayout);
        tabNVLayout.setHorizontalGroup(
            tabNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNVLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTra, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabNVLayout.setVerticalGroup(
            tabNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabNVLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblTra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pnlMenu.add(tabNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, -1));

        tabHome.setBackground(new java.awt.Color(204, 204, 255));
        tabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHomeMouseClicked(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Trang chủ");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlMenu.add(tabHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 110, 280, -1));

        pnlContent.setBackground(new java.awt.Color(204, 204, 255));
        pnlContent.setLayout(new java.awt.CardLayout());

        pnlUpdate.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpdate.setPreferredSize(new java.awt.Dimension(536, 350));
        pnlUpdate.setLayout(new javax.swing.BoxLayout(pnlUpdate, javax.swing.BoxLayout.Y_AXIS));

        tblDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã đĩa", "Tên đĩa", "Loại", "Số lượng", "Giá thuê"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpDia.setViewportView(tblDia);

        pnlUpdate.add(scpDia);

        pnlProcess.setPreferredSize(new java.awt.Dimension(542, 300));

        lblMa.setText("Mã Đĩa:");

        lblTen.setText("Tên Đĩa:");

        lblLoai.setText("Loại:");

        lblSl.setText("Số lượng:");

        lblGia.setText("Giá:");

        lblNcc.setText("Mã nhà cung cấp:");

        lblPhanHoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanHoi.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlTextLayout = new javax.swing.GroupLayout(pnlText);
        pnlText.setLayout(pnlTextLayout);
        pnlTextLayout.setHorizontalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhanHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTextLayout.createSequentialGroup()
                        .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa)
                            .addComponent(txtTen)
                            .addComponent(txtLoai)
                            .addComponent(txtSl)
                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtNcc))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTextLayout.setVerticalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoai)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSl)
                    .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNcc)
                    .addComponent(txtNcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPhanHoi)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        btnThem.setText("Thêm sản phẩm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addGap(12, 12, 12)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnLuu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlProcessLayout = new javax.swing.GroupLayout(pnlProcess);
        pnlProcess.setLayout(pnlProcessLayout);
        pnlProcessLayout.setHorizontalGroup(
            pnlProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcessLayout.createSequentialGroup()
                .addComponent(pnlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        pnlProcessLayout.setVerticalGroup(
            pnlProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlUpdate.add(pnlProcess);

        pnlContent.add(pnlUpdate, "card2");

        pnlNV.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlNVLayout = new javax.swing.GroupLayout(pnlNV);
        pnlNV.setLayout(pnlNVLayout);
        pnlNVLayout.setHorizontalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        pnlNVLayout.setVerticalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        pnlContent.add(pnlNV, "card3");

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
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLayoutSizeLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlMenu.getAccessibleContext().setAccessibleName("Menu");

        getContentPane().add(pnlLayoutSize, java.awt.BorderLayout.CENTER);
        pnlLayoutSize.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Methods 
     private void setDefaultTextField(){
         txtMa.setText("");
         txtTen.setText("");
         txtLoai.setText("");
         txtSl.setText("");
         txtGia.setText("");
         txtNcc.setText("");
     }
    
    private void setTableData(List<Disk> disks){
        this.defTabMod.setRowCount(0);
        
        disks = upService.getAllDisk();
        
        for(Disk disk : disks){
            defTabMod.addRow(new Object[] {disk.getMa(), disk.getTen(), disk.getLoai(), disk.getSoluong(), disk.getGia()});
        }
    }
    
    public void createTab(){
        upService = new UpdateService();
        
        defTabMod = new DefaultTableModel();
        tblDia.setModel(defTabMod);
        
        defTabMod.addColumn("Mã đĩa");
        defTabMod.addColumn("Tên đĩa");
        defTabMod.addColumn("Loại");
        defTabMod.addColumn("Số lượng");
        defTabMod.addColumn("Giá thuê");
        
        disks = upService.getAllDisk();
        
        for(Disk disk : disks){
            defTabMod.addRow(new Object[] {disk.getMa(), disk.getTen(), disk.getLoai(), disk.getSoluong(), disk.getGia()});            
        }
    }
    
    public void txtFieldState(){
        txtMa.setEnabled(false);
        txtTen.setEnabled(false);
        txtLoai.setEnabled(false);
        txtSl.setEnabled(false);
        txtGia.setEnabled(false);
        txtNcc.setEnabled(false);
    }
    
    public void setBtnSua(){
        txtMa.setEnabled(true);
        txtTen.setEnabled(false);
        txtLoai.setEnabled(false);
        txtSl.setEnabled(false);
        txtGia.setEnabled(true);
        txtNcc.setEnabled(false);
    }
    
    public void setBtnThem(){
        txtMa.setEnabled(false);
        txtTen.setEnabled(true);
        txtLoai.setEnabled(true);
        txtSl.setEnabled(true);
        txtGia.setEnabled(true);
        txtNcc.setEnabled(true);
    }
    
    public void setBtnXoa(){
        txtMa.setEnabled(true);
        txtTen.setEnabled(false);
        txtLoai.setEnabled(false);
        txtSl.setEnabled(false);
        txtGia.setEnabled(false);
        txtNcc.setEnabled(false);
    }
    
       
    //ActionEvent 
    private void tabUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUpdateMouseClicked
        pnlUpdate.setVisible(true);
        pnlNV.setVisible(false);
        tabUpdate.setBackground(Color.white);
        tabNV.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabUpdateMouseClicked

    private void tabNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNVMouseClicked
        pnlNV.setVisible(true);
        pnlUpdate.setVisible(false);
        tabNV.setBackground(Color.white);
        tabUpdate.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabNVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        setBtnThem();
        btn = 1;
        
        this.txtTen.requestFocus();
        btnThem.setForeground(Color.red);
        btnSua.setForeground(Color.BLACK);
        btnLuu.setForeground(Color.BLACK);
        btnXoa.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        setDefaultTextField();
        setBtnSua();
        txtMa.requestFocus();
        btn = 2;
        btnThem.setForeground(Color.BLACK);
        btnSua.setForeground(Color.red);
        btnLuu.setForeground(Color.BLACK);
        btnXoa.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        btnThem.setForeground(Color.BLACK);
        btnSua.setForeground(Color.BLACK);
        btnXoa.setForeground(Color.BLACK);
        btnLuu.setForeground(Color.red);
        
        switch (btn){
            case 1 -> cnThem();
            
            case 2 -> cnSua();
            
            case 3 -> cnXoa();
                
            default -> setDefaultTextField();
        }
       
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHomeMouseClicked
        new UI_CentralPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tabHomeMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        setDefaultTextField();
        setBtnXoa();
        txtMa.requestFocus();
        btn = 3;
        btnThem.setForeground(Color.BLACK);
        btnSua.setForeground(Color.BLACK);
        btnLuu.setForeground(Color.BLACK);
        btnXoa.setForeground(Color.red);
    }//GEN-LAST:event_btnXoaMouseClicked

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
            java.util.logging.Logger.getLogger(UI_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Manager().setVisible(true);
            }
        });
        
        
    }
    
    
    public void cnSua(){
        boolean flag = false;
        int countAffCol = 0;
        upService = new UpdateService();
        cn =new CNModel();
        Disk disk = new Disk();
        
        try{
            //kiểm tra thiếu thông tin
            if(txtMa.getText().equals("") || txtGia.getText().equals("")){
                throw new BlankValueException("Thiếu Thông tin!");
            }            
            
            //kiểm tra mã đĩa có tồn tại không
            for(Disk disk2 : this.disks){
                if(disk2.getMa().trim().equals(txtMa.getText().trim())){
                    disk.setMa(txtMa.getText());
                    flag = true;
                    }
                }
                    
            if(flag == false){
                throw new InvalidIDException("Sai mã đĩa!");
            }
            
            //Kiểm giá trị của Giá
            if(CheckValueHelper.isInteger(Double.parseDouble(txtGia.getText()))){
                disk.setGia(Integer.parseInt(txtGia.getText()));
            }else{
                flag = false;
                this.lblPhanHoi.setText("Số lượng đĩa và Giá đĩa phải là số nguyên!");
            }
        }catch(BlankValueException e){
            JOptionPane.showMessageDialog(this, e, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
        } catch (InvalidIDException ex) {
            JOptionPane.showMessageDialog(this, ex, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
        }   
        
        if(txtMa.getText().equals("") || txtGia.getText().equals("")){
            lblPhanHoi.setText("");
                    
        }else{
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this change?");
            if(x == JOptionPane.YES_OPTION){
                setTableData(this.disks);
                setDefaultTextField();
                countAffCol = this.upService.UpdateDisk(disk, LoginService.getId());
                lblPhanHoi.setText("Số dòng bị ảnh hưởng là "+ countAffCol +" dòng!");
            }
        }
    }

    public void cnThem(){
        boolean flag = false;
        int countAffCol = 0;
        upService = new UpdateService();
        cn =new CNModel();
        this.nhaCC = new NhaCC();

        try{
            //kiểm tra dữ liệu trống
            if(txtNcc.getText().equals("") || txtTen.getText().equals("") || txtLoai.getText().equals("") || txtSl.getText().equals("") || txtGia.getText().equals("")){
                throw new BlankValueException("Thiếu thông tin!");
            }
                    
            //Kiểm tra xem có tồn tại nhà cung cấp này không
            this.nCCs = this.upService.getAllNcc();
            for(NhaCC ncc : this.nCCs){
                if(ncc.getId().trim().equals(txtNcc.getText().toUpperCase())){
                    this.nhaCC.setId(txtNcc.getText().toUpperCase());
                    flag = true;                         
                }
            }
            if (flag == false) throw new InvalidIDException("Không tồn tại nhà cung cấp!");

            //Kiểm tra có bị trùng mã đĩa nhập không
            for(Disk disk : this.disks){
                if(disk.getMa().trim().equals(this.txtMa.getText().trim())){
                    throw new InvalidIDException("Trùng mã đĩa nhập!");
                }
            }

            //thêm thông tin vào disk 
            
            Disk disk = new Disk();
            
            //Tạo tự động mã đĩa
            this.disks = this.upService.getAllDisk();
            do{
               disk.setMa(RandomCodeGenerator.generateCode()); 
                
                for(Disk disk2 : this.disks){
                    if(disk2.getMa().trim().equals(disk.getMa())){
                        flag = false;
                    }else{
                        flag = true;
                    }
                }
 
            }while(flag == false);

            //tiếp tục thêm thông tin vào đĩa
            disk.setTen(txtTen.getText());
            disk.setLoai(txtLoai.getText().toUpperCase());
            
            if(CheckValueHelper.isInteger(Double.parseDouble(txtSl.getText())) && CheckValueHelper.isInteger(Double.parseDouble(txtGia.getText()))){
                disk.setSoluong(Integer.parseInt(txtSl.getText()));
                disk.setGia(Integer.parseInt(txtGia.getText()));
            }else{
                flag = false;
                this.lblPhanHoi.setText("Số lượng đĩa và Giá đĩa phải là số nguyên!");
            }
            
            countAffCol = this.upService.addDisk(disk, LoginService.getId(), nhaCC);

        }catch(BlankValueException e){
            JOptionPane.showMessageDialog(this, e, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
        } catch (InvalidIDException ex) {
            JOptionPane.showMessageDialog(this, ex, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
         }   
        
        if(flag == false || txtNcc.getText().equals("") || txtTen.getText().equals("") || txtLoai.getText().equals("") || txtSl.getText().equals("") || txtGia.getText().equals("")){
            lblPhanHoi.setText("");                    
        }else{
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this change?");
            if(x == JOptionPane.YES_OPTION){
                setTableData(this.disks);
                setDefaultTextField();
                lblPhanHoi.setText("Số dòng bị ảnh hưởng là "+ countAffCol +" dòng!");
            }
        }   
    }
    
    public void cnXoa(){
        boolean flag = false;
        int countAffCol = 0;
        upService = new UpdateService();
        cn =new CNModel();
        
        try{
            //Kiểm tra xem thông tin nhập đủ chưa
            if(txtMa.getText().equals("")){
                throw new BlankValueException("Thiếu thông tin!");
            }
            
            //Kiểm tra xem có tồn tại mã đĩa không nếu không thì báo lỗi
            for(Disk disk : this.disks){
                if(disk.getMa().trim().equals(this.txtMa.getText().trim())){
                    countAffCol = this.upService.deleteDisk(disk);
                    flag = true;
                }
            }
                    
            if(flag == false){
                throw new InvalidIDException("Không tìm thấy mã đĩa!");
            }
        }catch(BlankValueException e){
            JOptionPane.showMessageDialog(this, e, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
        } catch (InvalidIDException ex) {
            JOptionPane.showMessageDialog(this, ex, "Warning", JOptionPane.WARNING_MESSAGE);
            txtMa.requestFocus();
        }   
        
        if(txtMa.getText().equals("")){
            lblPhanHoi.setText("");
        }else{
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this change?");
            if(x == JOptionPane.YES_OPTION){
                setTableData(this.disks);
                setDefaultTextField();
                lblPhanHoi.setText("Số dòng bị ảnh hưởng là "+ countAffCol +" dòng!");
            }
        }        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblNcc;
    private javax.swing.JLabel lblPhanHoi;
    private javax.swing.JLabel lblSl;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblTra;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLayoutSize;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlProcess;
    private javax.swing.JPanel pnlText;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JScrollPane scpDia;
    private javax.swing.JSeparator sprtCD;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabNV;
    private javax.swing.JPanel tabUpdate;
    private javax.swing.JTable tblDia;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNcc;
    private javax.swing.JTextField txtSl;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
