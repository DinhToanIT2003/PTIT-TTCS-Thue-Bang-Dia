/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.main;

import Helper.CustomUUID;
import Helper.RandomCodeGenerator;
import control.BlankValueException;
import control.InvalidIDException;
import control.LoginService;
import control.RentService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Disk;
import model.RentDetails;

/**
 *
 * @author vduct
 */
public class UI_Staff extends javax.swing.JFrame {
    
    Color lightBlue = new Color(204,204,255);
    
    private int countAffCol = 0;
    private String idThue;
    private RentService rentService = new RentService();
    private List<Disk> disks = new ArrayList<Disk>();
    private DefaultTableModel defTabMod = new DefaultTableModel();
    private LoginService login;
    private RandomCodeGenerator uID; 
    private RentDetails rentDt;
    private List<RentDetails> rentDtls = new ArrayList<RentDetails>();
    private List<Customer> customers = null;
    
    /**
     * Creates new form UI_Staff
     */
    public UI_Staff() {
        initComponents();
        
        pnlTra.setVisible(false);
        pnlThue.setVisible(false);
        
        showThongTin();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgThue = new javax.swing.JDialog();
        pnlThue_Them1 = new javax.swing.JPanel();
        lblThue_CCCD1 = new javax.swing.JLabel();
        lblThue_MaDia1 = new javax.swing.JLabel();
        lblThue_SoLuong1 = new javax.swing.JLabel();
        lblThue_NgayTra1 = new javax.swing.JLabel();
        txtThue_CCCD1 = new javax.swing.JTextField();
        txtThue_MaDia1 = new javax.swing.JTextField();
        txtThue_SoLuong1 = new javax.swing.JTextField();
        txtThue_NgayTra1 = new javax.swing.JTextField();
        btnThue_Luu = new javax.swing.JButton();
        btnThue_Huy = new javax.swing.JButton();
        pnlLayoutSize = new javax.swing.JPanel();
        pnlNavigationBar = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblCD = new javax.swing.JLabel();
        sprtCD = new javax.swing.JSeparator();
        pnlMenu = new javax.swing.JPanel();
        tabThue = new javax.swing.JPanel();
        lblThue = new javax.swing.JLabel();
        tabTra = new javax.swing.JPanel();
        lblTra = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlThue = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThue = new javax.swing.JTable();
        pnlThueProcess = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiemThue = new javax.swing.JButton();
        btnThue = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnRstThue = new javax.swing.JButton();
        txtThongBao = new javax.swing.JLabel();
        pnlTra = new javax.swing.JPanel();
        scrTra = new javax.swing.JScrollPane();
        tblTra = new javax.swing.JTable();
        pnlTra_TimKiem = new javax.swing.JPanel();
        lblTra_TimKiem_CCCD = new javax.swing.JLabel();
        txtTra_TimKiem_CCCD = new javax.swing.JTextField();
        btnTra_Tim = new javax.swing.JButton();
        pnlTra_Them = new javax.swing.JPanel();
        lblTra_ID = new javax.swing.JLabel();
        lblTra_PhuPhi = new javax.swing.JLabel();
        txtTra_ID = new javax.swing.JTextField();
        txtTra_PhuPhi = new javax.swing.JTextField();
        btnTra_OK = new javax.swing.JButton();
        btnTra_Reset = new javax.swing.JButton();

        dlgThue.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgThue.setTitle("Phiếu thuê");
        dlgThue.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        dlgThue.setResizable(false);
        dlgThue.setSize(new java.awt.Dimension(377, 300));

        pnlThue_Them1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlThue_Them1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThue_CCCD1.setText("CCCD:");
        pnlThue_Them1.add(lblThue_CCCD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 50, 43, -1));

        lblThue_MaDia1.setText("Mã đĩa:");
        pnlThue_Them1.add(lblThue_MaDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 90, 43, -1));

        lblThue_SoLuong1.setText("Số lượng:");
        pnlThue_Them1.add(lblThue_SoLuong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 135, -1, -1));

        lblThue_NgayTra1.setText("Ngày trả:");
        pnlThue_Them1.add(lblThue_NgayTra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 181, 50, -1));
        pnlThue_Them1.add(txtThue_CCCD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 47, 149, -1));
        pnlThue_Them1.add(txtThue_MaDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 87, 149, -1));
        pnlThue_Them1.add(txtThue_SoLuong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 132, 148, -1));
        pnlThue_Them1.add(txtThue_NgayTra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 178, 148, -1));

        btnThue_Luu.setText("Save");
        btnThue_Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThue_LuuMouseClicked(evt);
            }
        });
        pnlThue_Them1.add(btnThue_Luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 218, -1, -1));

        btnThue_Huy.setText("Cancel");
        btnThue_Huy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThue_HuyMouseClicked(evt);
            }
        });
        pnlThue_Them1.add(btnThue_Huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 218, -1, -1));

        dlgThue.getContentPane().add(pnlThue_Them1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STAFF");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLayoutSize.setBackground(new java.awt.Color(102, 102, 255));

        pnlNavigationBar.setBackground(new java.awt.Color(102, 102, 255));
        pnlNavigationBar.setPreferredSize(new java.awt.Dimension(270, 500));
        pnlNavigationBar.setLayout(new java.awt.BorderLayout());

        pnlLogo.setBackground(new java.awt.Color(102, 102, 255));

        lblCD.setFont(new java.awt.Font("Script MT Bold", 3, 48)); // NOI18N
        lblCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCD.setText("CD");

        sprtCD.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sprtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sprtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlNavigationBar.add(pnlLogo, java.awt.BorderLayout.PAGE_START);

        pnlMenu.setBackground(new java.awt.Color(102, 102, 255));
        pnlMenu.setMaximumSize(new java.awt.Dimension(282, 392));
        pnlMenu.setName(""); // NOI18N
        pnlMenu.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        tabThue.setBackground(new java.awt.Color(204, 204, 255));
        tabThue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabThueMouseClicked(evt);
            }
        });

        lblThue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblThue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThue.setText("Thuê sản phẩm");
        lblThue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tabThueLayout = new javax.swing.GroupLayout(tabThue);
        tabThue.setLayout(tabThueLayout);
        tabThueLayout.setHorizontalGroup(
            tabThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThue, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabThueLayout.setVerticalGroup(
            tabThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThue, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabThue);

        tabTra.setBackground(new java.awt.Color(204, 204, 255));
        tabTra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTraMouseClicked(evt);
            }
        });

        lblTra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTra.setText("Trả sản phẩm");
        lblTra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tabTraLayout = new javax.swing.GroupLayout(tabTra);
        tabTra.setLayout(tabTraLayout);
        tabTraLayout.setHorizontalGroup(
            tabTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTra, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabTraLayout.setVerticalGroup(
            tabTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTra, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabTra);

        pnlNavigationBar.add(pnlMenu, java.awt.BorderLayout.CENTER);

        pnlContent.setBackground(new java.awt.Color(204, 204, 255));
        pnlContent.setOpaque(false);
        pnlContent.setLayout(new java.awt.CardLayout());

        tblThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblThue);

        btnTimKiemThue.setText("Tìm Kiếm");
        btnTimKiemThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemThueMouseClicked(evt);
            }
        });

        btnThue.setText("Thuê");
        btnThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThueMouseClicked(evt);
            }
        });
        btnThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThueActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnRstThue.setText("Reset");
        btnRstThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRstThueActionPerformed(evt);
            }
        });

        txtThongBao.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlThueProcessLayout = new javax.swing.GroupLayout(pnlThueProcess);
        pnlThueProcess.setLayout(pnlThueProcessLayout);
        pnlThueProcessLayout.setHorizontalGroup(
            pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThueProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlThueProcessLayout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemThue))
                    .addComponent(txtThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRstThue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlThueProcessLayout.setVerticalGroup(
            pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThueProcessLayout.createSequentialGroup()
                .addGroup(pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThue)
                        .addComponent(btnRstThue))
                    .addGroup(pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlThueProcessLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlThueProcessLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(pnlThueProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTimKiemThue)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThongBao)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlThueLayout = new javax.swing.GroupLayout(pnlThue);
        pnlThue.setLayout(pnlThueLayout);
        pnlThueLayout.setHorizontalGroup(
            pnlThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addComponent(pnlThueProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlThueLayout.setVerticalGroup(
            pnlThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThueLayout.createSequentialGroup()
                .addComponent(pnlThueProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlContent.add(pnlThue, "card2");

        tblTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrTra.setViewportView(tblTra);

        pnlTra_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTra_TimKiem_CCCD.setText("CCCD:");

        btnTra_Tim.setText("Tìm");
        btnTra_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTra_TimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTra_TimKiemLayout = new javax.swing.GroupLayout(pnlTra_TimKiem);
        pnlTra_TimKiem.setLayout(pnlTra_TimKiemLayout);
        pnlTra_TimKiemLayout.setHorizontalGroup(
            pnlTra_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTra_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTra_TimKiem_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTra_TimKiem_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTra_TimKiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTra_Tim)
                .addContainerGap())
        );
        pnlTra_TimKiemLayout.setVerticalGroup(
            pnlTra_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTra_TimKiemLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlTra_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTra_TimKiem_CCCD)
                    .addComponent(txtTra_TimKiem_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTra_Tim)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pnlTra_Them.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTra_ID.setText("ID:");

        lblTra_PhuPhi.setText("Phụ phí:");

        btnTra_OK.setText("OK");
        btnTra_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTra_OKActionPerformed(evt);
            }
        });

        btnTra_Reset.setText("Reset");
        btnTra_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTra_ResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTra_ThemLayout = new javax.swing.GroupLayout(pnlTra_Them);
        pnlTra_Them.setLayout(pnlTra_ThemLayout);
        pnlTra_ThemLayout.setHorizontalGroup(
            pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                        .addComponent(btnTra_OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTra_Reset))
                    .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                        .addGroup(pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                                .addComponent(lblTra_PhuPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTra_PhuPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                                .addComponent(lblTra_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTra_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTra_ThemLayout.setVerticalGroup(
            pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTra_ThemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTra_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTra_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTra_PhuPhi)
                    .addComponent(txtTra_PhuPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pnlTra_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTra_OK)
                    .addComponent(btnTra_Reset))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout pnlTraLayout = new javax.swing.GroupLayout(pnlTra);
        pnlTra.setLayout(pnlTraLayout);
        pnlTraLayout.setHorizontalGroup(
            pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTra, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTra_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTra_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTraLayout.setVerticalGroup(
            pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrTra, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addGroup(pnlTraLayout.createSequentialGroup()
                        .addComponent(pnlTra_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlTra_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlContent.add(pnlTra, "card3");

        javax.swing.GroupLayout pnlLayoutSizeLayout = new javax.swing.GroupLayout(pnlLayoutSize);
        pnlLayoutSize.setLayout(pnlLayoutSizeLayout);
        pnlLayoutSizeLayout.setHorizontalGroup(
            pnlLayoutSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayoutSizeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNavigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlLayoutSizeLayout.setVerticalGroup(
            pnlLayoutSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlNavigationBar.getAccessibleContext().setAccessibleName("Menu");

        getContentPane().add(pnlLayoutSize, java.awt.BorderLayout.CENTER);
        pnlLayoutSize.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabThueMouseClicked
        pnlThue.setVisible(true);
        
        pnlTra.setVisible(false);
        tabThue.setBackground(Color.white);
        
        tabTra.setBackground(lightBlue);
    }//GEN-LAST:event_tabThueMouseClicked

    private void tabTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTraMouseClicked
        pnlTra.setVisible(true);
       
        pnlThue.setVisible(false);
        tabTra.setBackground(Color.white);
        
        tabThue.setBackground(lightBlue);
    }//GEN-LAST:event_tabTraMouseClicked

    private void btnThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThueActionPerformed

    private void btnTra_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTra_TimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTra_TimActionPerformed

    private void btnTra_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTra_OKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTra_OKActionPerformed

    private void btnTra_ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTra_ResetMouseClicked
        txtTra_ID.setText("");
        txtTra_PhuPhi.setText("");
    }//GEN-LAST:event_btnTra_ResetMouseClicked

    private void btnThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThueMouseClicked
        this.dlgThue.setLocationRelativeTo(this);
        this.dlgThue.setVisible(true);
        
    }//GEN-LAST:event_btnThueMouseClicked

    private void btnThue_HuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThue_HuyMouseClicked
        this.dlgThue.dispose();
    }//GEN-LAST:event_btnThue_HuyMouseClicked

    private void btnTimKiemThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemThueMouseClicked
        this.showTKInfo(txtTimKiem.getText());
    }//GEN-LAST:event_btnTimKiemThueMouseClicked

    private void btnRstThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRstThueActionPerformed
        resetTableThue();        
    }//GEN-LAST:event_btnRstThueActionPerformed

    private void btnThue_LuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThue_LuuMouseClicked
        getThueForm();
        
        this.countAffCol = this.rentService.insertRent(this.rentDt, this.login.getId(), this.idThue);
        
        txtThongBao.setText("Số dòng bị ảnh hưởng trên Csdl là "+ this.countAffCol + " !");
    }//GEN-LAST:event_btnThue_LuuMouseClicked

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
    
    public void showThongTin(){
        
        this.tblThue.setModel(defTabMod);
        
        this.disks = this.rentService.getAllDisk();
        
        defTabMod.addColumn("Mã đĩa");
        defTabMod.addColumn("Tên đĩa");
        defTabMod.addColumn("Loại");
        defTabMod.addColumn("Số lượng");
        defTabMod.addColumn("Giá thuê");
        
        for(Disk disk : disks){
            defTabMod.addRow(new Object[] {
                disk.getMa(), disk.getTen(), disk.getLoai(), disk.getSoluong(), disk.getGia()
            });
        }
        
    }
    
    public void showTKInfo(String tenDia){
        this.defTabMod.setRowCount(0);
        boolean flag = false;
        
        for(Disk disk : this.disks){
            if(disk.getTen().equals(tenDia)){
                defTabMod.addRow(new Object[] {
                disk.getMa(), disk.getTen(), disk.getLoai(), disk.getSoluong(), disk.getGia()
                });
                flag = true;
            }
        }
        if(flag == false) this.txtThongBao.setText("Không có đĩa nào hợp lệ!");
    }
    
    public void getThueForm(){
        boolean flag = true;
        rentDt = new RentDetails();
        customers = new ArrayList<Customer>();
        this.customers = this.rentService.getAllCust();
        this.uID = new RandomCodeGenerator();
        
        try{
            //Kiểm tra các trường có bị trống không
            if(txtThue_CCCD1.getText().equals("") || txtThue_MaDia1.getText().equals("") || txtThue_SoLuong1.getText().equals("") || 
                    txtThue_NgayTra1.getText().equals("")){
                throw new BlankValueException("Thiếu thông tin!");
            }
            
            //Kiểm tra mã id thuê sinh ra có trùng không
            this.rentDtls = this.rentService.getAllRent();
            do{
                this.idThue = this.uID.generateCode();
                

                for(RentDetails rent : rentDtls){
                    if(rent.getId().equals(idThue)){
                        flag = false;
                    }else{
                        flag = true;
                    }
                }
                
                
            }while(flag == false);
            
            //lấy dữ liệu vào rent details
            rentDt.setMadia(txtThue_MaDia1.getText());            
            rentDt.setSlThue(Integer.parseInt(this.txtThue_SoLuong1.getText()));
            rentDt.setNgayTra(this.txtThue_NgayTra1.getText());
            
            if(!this.rentService.chkIDCustomer(this.txtThue_CCCD1.getText(), customers)){
                flag = false;
                throw new InvalidIDException("Không tìm thấy khách hàng!");
            }
            
            rentDt.setCccdKh(this.txtThue_CCCD1.getText());
        }catch(BlankValueException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }catch(InvalidIDException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
        if(txtThue_CCCD1.getText().equals("") || txtThue_MaDia1.getText().equals("") || txtThue_SoLuong1.getText().equals("") || 
                    txtThue_NgayTra1.getText().equals("") || flag == false){
            this.txtThongBao.setText("");
        }else{
            this.dlgThue.dispose();
            resetTableThue();
        }
      
    }
    
    public void resetTableThue(){
        this.defTabMod.setRowCount(0);
        this.txtThongBao.setText("");
        for(Disk disk : disks){
            defTabMod.addRow(new Object[] {
                disk.getMa(), disk.getTen(), disk.getLoai(), disk.getSoluong(), disk.getGia()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRstThue;
    private javax.swing.JButton btnThue;
    private javax.swing.JButton btnThue_Huy;
    private javax.swing.JButton btnThue_Luu;
    private javax.swing.JButton btnTimKiemThue;
    private javax.swing.JButton btnTra_OK;
    private javax.swing.JButton btnTra_Reset;
    private javax.swing.JButton btnTra_Tim;
    private javax.swing.JDialog dlgThue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblThue_CCCD1;
    private javax.swing.JLabel lblThue_MaDia1;
    private javax.swing.JLabel lblThue_NgayTra1;
    private javax.swing.JLabel lblThue_SoLuong1;
    private javax.swing.JLabel lblTra;
    private javax.swing.JLabel lblTra_ID;
    private javax.swing.JLabel lblTra_PhuPhi;
    private javax.swing.JLabel lblTra_TimKiem_CCCD;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLayoutSize;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNavigationBar;
    private javax.swing.JPanel pnlThue;
    private javax.swing.JPanel pnlThueProcess;
    private javax.swing.JPanel pnlThue_Them1;
    private javax.swing.JPanel pnlTra;
    private javax.swing.JPanel pnlTra_Them;
    private javax.swing.JPanel pnlTra_TimKiem;
    private javax.swing.JScrollPane scrTra;
    private javax.swing.JSeparator sprtCD;
    private javax.swing.JPanel tabThue;
    private javax.swing.JPanel tabTra;
    private javax.swing.JTable tblThue;
    private javax.swing.JTable tblTra;
    private javax.swing.JLabel txtThongBao;
    private javax.swing.JTextField txtThue_CCCD1;
    private javax.swing.JTextField txtThue_MaDia1;
    private javax.swing.JTextField txtThue_NgayTra1;
    private javax.swing.JTextField txtThue_SoLuong1;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTra_ID;
    private javax.swing.JTextField txtTra_PhuPhi;
    private javax.swing.JTextField txtTra_TimKiem_CCCD;
    // End of variables declaration//GEN-END:variables
}
