/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrangChinh;

import DAO.NhanVienDAO;
import Model.NhanVien;
import QuanLiHoaDon.Order;
import QuanLiTaiKhoan.TTCaNhan;

/**
 *
 * @author vomin
 */
public class MagementForm extends javax.swing.JFrame {

    /**
     * Creates new form MagementForm
     */
    public MagementForm() {
        initComponents();
    }

    private void setupRole(){
        NhanVien nhanVien = new NhanVien();
        String idtaikhoanpass = null;
        nhanVien = new NhanVienDAO().timkiemtheoID(Dang_Nhap.tkDangnhap.getManv());
//        lbUser.setText(nhanVien.getTennv());
        if(!nhanVien.getChucvu().equals("Nhân viên quản lí")){
            btnQLHD.setEnabled(false);
            btnQLNV.setEnabled(false);
            btnQLKH.setEnabled(false);
            btnQLS.setEnabled(false);
            btnQLTD.setEnabled(false);
            btnQLNV.setEnabled(false);
        }
        else{
            btnQLHD.setEnabled(true);
            btnQLNV.setEnabled(true);
            btnQLKH.setEnabled(true);
            btnQLS.setEnabled(true);
            btnQLTD.setEnabled(true);
            btnQLNV.setEnabled(true);
        }
        nhanVien = new NhanVienDAO().timkiemtheoID(idtaikhoanpass); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnQLDB2 = new com.k33ptoo.components.KButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnQLTK = new com.k33ptoo.components.KButton();
        btnQLKH = new com.k33ptoo.components.KButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnQLHD = new com.k33ptoo.components.KButton();
        btnQLTD = new com.k33ptoo.components.KButton();
        btnQLNV = new com.k33ptoo.components.KButton();
        jLabel18 = new javax.swing.JLabel();
        kButton12 = new com.k33ptoo.components.KButton();
        btnQLS = new com.k33ptoo.components.KButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnQLDB = new com.k33ptoo.components.KButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kButton8 = new com.k33ptoo.components.KButton();
        lbStatics = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnStatics = new com.k33ptoo.components.KButton();
        lbAccount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAccount = new com.k33ptoo.components.KButton();
        lbDashboard = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLogout = new com.k33ptoo.components.KButton();
        lbManagement = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnManagement = new com.k33ptoo.components.KButton();
        lbOrder = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOrder = new com.k33ptoo.components.KButton();
        lbWorkbench = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnWorkbench = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Search");
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 180, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Reservation");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 150, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Unfinished");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 130, 60));

        btnQLDB2.setkBorderRadius(15);
        btnQLDB2.setkEndColor(new java.awt.Color(153, 153, 255));
        btnQLDB2.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        btnQLDB2.setkHoverForeGround(new java.awt.Color(153, 51, 255));
        btnQLDB2.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnQLDB2.setkStartColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(btnQLDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 150, 210));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 80, 70));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 80, 70));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Account");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 130, 60));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Customer");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 150, 60));

        btnQLTK.setkBorderRadius(15);
        btnQLTK.setkEndColor(new java.awt.Color(0, 255, 204));
        btnQLTK.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnQLTK.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        btnQLTK.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnQLTK.setkStartColor(new java.awt.Color(102, 255, 102));
        btnQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 150, 210));

        btnQLKH.setkBorderRadius(15);
        btnQLKH.setkEndColor(new java.awt.Color(255, 255, 153));
        btnQLKH.setkHoverEndColor(new java.awt.Color(255, 204, 51));
        btnQLKH.setkHoverForeGround(new java.awt.Color(255, 204, 102));
        btnQLKH.setkHoverStartColor(new java.awt.Color(255, 153, 51));
        btnQLKH.setkStartColor(new java.awt.Color(255, 204, 153));
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 150, 210));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Management");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 270, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 80, 70));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Invoice");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 130, 60));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 80, 90));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("User");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 110, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 70, 90));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Book");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 110, 60));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 80, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Menu");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 130, 60));

        btnQLHD.setkBorderRadius(15);
        btnQLHD.setkEndColor(new java.awt.Color(255, 153, 255));
        btnQLHD.setkHoverEndColor(new java.awt.Color(255, 153, 51));
        btnQLHD.setkHoverForeGround(new java.awt.Color(255, 102, 102));
        btnQLHD.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnQLHD.setkStartColor(new java.awt.Color(255, 255, 153));
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 150, 210));

        btnQLTD.setkBorderRadius(15);
        btnQLTD.setkEndColor(new java.awt.Color(204, 204, 255));
        btnQLTD.setkHoverEndColor(new java.awt.Color(204, 102, 255));
        btnQLTD.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnQLTD.setkHoverStartColor(new java.awt.Color(102, 0, 255));
        btnQLTD.setkStartColor(new java.awt.Color(102, 204, 255));
        btnQLTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTDActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, 210));

        btnQLNV.setkBorderRadius(15);
        btnQLNV.setkEndColor(new java.awt.Color(204, 255, 204));
        btnQLNV.setkHoverEndColor(new java.awt.Color(51, 255, 153));
        btnQLNV.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnQLNV.setkHoverStartColor(new java.awt.Color(102, 255, 204));
        btnQLNV.setkStartColor(new java.awt.Color(153, 255, 102));
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, 210));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 700, 30, 40));

        kButton12.setkBorderRadius(100);
        kButton12.setkHoverForeGround(new java.awt.Color(51, 204, 255));
        kButton12.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(kButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 690, 60, 60));

        btnQLS.setkBorderRadius(15);
        btnQLS.setkEndColor(new java.awt.Color(102, 204, 255));
        btnQLS.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnQLS.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnQLS.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnQLS.setkStartColor(new java.awt.Color(255, 204, 255));
        btnQLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 150, 210));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Customer");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 150, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 90, 70));

        btnQLDB.setkBorderRadius(15);
        btnQLDB.setkEndColor(new java.awt.Color(51, 0, 153));
        btnQLDB.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        btnQLDB.setkHoverForeGround(new java.awt.Color(153, 51, 255));
        btnQLDB.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnQLDB.setkStartColor(new java.awt.Color(153, 153, 255));
        btnQLDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDBActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 150, 210));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(50);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 153, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton8.setkBorderRadius(15);
        kButton8.setkEndColor(new java.awt.Color(0, 255, 204));
        kButton8.setkHoverEndColor(new java.awt.Color(153, 51, 255));
        kButton8.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(204, 102, 255));
        kGradientPanel1.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, 210));

        lbStatics.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbStatics.setForeground(new java.awt.Color(255, 255, 255));
        lbStatics.setText("Statistics");
        kGradientPanel1.add(lbStatics, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 120, 30));
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 30, 50));

        btnStatics.setkBorderRadius(0);
        btnStatics.setkEndColor(new java.awt.Color(204, 153, 255));
        btnStatics.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnStatics.setkHoverForeGround(new java.awt.Color(255, 102, 255));
        btnStatics.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnStatics.setkStartColor(new java.awt.Color(204, 153, 255));
        btnStatics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaticsActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnStatics, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 50));

        lbAccount.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount.setText("Account");
        kGradientPanel1.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 120, 30));
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 30, 50));

        btnAccount.setkBorderRadius(0);
        btnAccount.setkEndColor(new java.awt.Color(204, 153, 255));
        btnAccount.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnAccount.setkHoverForeGround(new java.awt.Color(255, 102, 255));
        btnAccount.setkHoverStartColor(new java.awt.Color(255, 163, 255));
        btnAccount.setkStartColor(new java.awt.Color(204, 153, 255));
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 50));

        lbDashboard.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbDashboard.setText("Log out");
        kGradientPanel1.add(lbDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 30));
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 30, 50));

        btnLogout.setkBorderRadius(0);
        btnLogout.setkEndColor(new java.awt.Color(204, 153, 255));
        btnLogout.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnLogout.setkHoverForeGround(new java.awt.Color(255, 102, 255));
        btnLogout.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnLogout.setkStartColor(new java.awt.Color(204, 153, 255));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 50));

        lbManagement.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbManagement.setForeground(new java.awt.Color(255, 255, 255));
        lbManagement.setText("Management");
        kGradientPanel1.add(lbManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 120, 30));
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 30, 50));

        btnManagement.setkBorderRadius(0);
        btnManagement.setkEndColor(new java.awt.Color(204, 153, 255));
        btnManagement.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnManagement.setkHoverForeGround(new java.awt.Color(255, 102, 255));
        btnManagement.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnManagement.setkStartColor(new java.awt.Color(204, 153, 255));
        btnManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagementActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 50));

        lbOrder.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbOrder.setForeground(new java.awt.Color(255, 255, 255));
        lbOrder.setText("Order");
        kGradientPanel1.add(lbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 30));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 30, 50));

        btnOrder.setkBorderRadius(0);
        btnOrder.setkEndColor(new java.awt.Color(204, 153, 255));
        btnOrder.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnOrder.setkHoverForeGround(new java.awt.Color(255, 102, 204));
        btnOrder.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnOrder.setkStartColor(new java.awt.Color(204, 153, 255));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 50));

        lbWorkbench.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbWorkbench.setForeground(new java.awt.Color(255, 255, 255));
        lbWorkbench.setText("Workbench");
        kGradientPanel1.add(lbWorkbench, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 30));
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 30, 50));

        btnWorkbench.setkBorderRadius(0);
        btnWorkbench.setkEndColor(new java.awt.Color(204, 153, 255));
        btnWorkbench.setkHoverEndColor(new java.awt.Color(204, 204, 255));
        btnWorkbench.setkHoverForeGround(new java.awt.Color(255, 102, 255));
        btnWorkbench.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnWorkbench.setkStartColor(new java.awt.Color(204, 153, 255));
        btnWorkbench.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkbenchActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnWorkbench, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 50));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 250, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKActionPerformed
        // TODO add your handling code here:
        new QuanLiTaiKhoan.QLTaiKhoan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLTKActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        // TODO add your handling code here:
        new QuanLiKhachHang.QLKhachHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnQLTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTDActionPerformed
        // TODO add your handling code here:
        new QuanLiThucDon.QLThucDon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLTDActionPerformed

    private void btnQLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSActionPerformed
        // TODO add your handling code here:
        new QuanLiSach.QLSach().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLSActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        // TODO add your handling code here:
        new QuanLiNhanVien.QLNhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        // TODO add your handling code here:
        new QuanLiHoaDon.QLHoaDon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void btnQLDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDBActionPerformed
        // TODO add your handling code here:
        new QuanLiBan.QLBan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLDBActionPerformed

    private void btnStaticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaticsActionPerformed
        // TODO add your handling code here:
        new StaticsFormChoose().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStaticsActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        new TTCaNhan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new Dang_Nhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagementActionPerformed
        // TODO add your handling code here:
        new MagementForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManagementActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        new OrderFormChoose().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnWorkbenchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkbenchActionPerformed
        // TODO add your handling code here:
        new Welecome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnWorkbenchActionPerformed

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
            java.util.logging.Logger.getLogger(MagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAccount;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnManagement;
    private com.k33ptoo.components.KButton btnOrder;
    private com.k33ptoo.components.KButton btnQLDB;
    private com.k33ptoo.components.KButton btnQLDB2;
    private com.k33ptoo.components.KButton btnQLHD;
    private com.k33ptoo.components.KButton btnQLKH;
    private com.k33ptoo.components.KButton btnQLNV;
    private com.k33ptoo.components.KButton btnQLS;
    private com.k33ptoo.components.KButton btnQLTD;
    private com.k33ptoo.components.KButton btnQLTK;
    private com.k33ptoo.components.KButton btnStatics;
    private com.k33ptoo.components.KButton btnWorkbench;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton12;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbManagement;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbStatics;
    private javax.swing.JLabel lbWorkbench;
    // End of variables declaration//GEN-END:variables
}
