/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTaiKhoan;

import DAO.NhanVienDAO;
import DAO.SachDAO;
import DAO.TaiKhoanDAO;
import Model.NhanVien;
import Model.TaiKhoan;
import TrangChinh.Dang_Nhap;
import TrangChinh.MagementForm;
import TrangChinh.OrderFormChoose;
import TrangChinh.StaticsFormChoose;
import TrangChinh.Welecome;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vomin
 */
public class QLTaiKhoan extends javax.swing.JFrame {

    /**
     * Creates new form QLTaiKhoan1
     */
    public QLTaiKhoan() {
        initComponents();
        fillCombobox();
        showTable();
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
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnThem = new com.k33ptoo.components.KButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQLTK = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSua = new com.k33ptoo.components.KButton();
        btnLammoi = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbbNhanvien = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        btnTimkiem = new com.k33ptoo.components.KButton();
        jLabel32 = new javax.swing.JLabel();
        btnXuatExcel = new com.k33ptoo.components.KButton();
        pwfPassword = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        pwfAgainPassword = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
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

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Thêm");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 130, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cake");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sửa");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 50, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Account Manager");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 360, 50));

        btnThem.setkBorderRadius(25);
        btnThem.setkEndColor(new java.awt.Color(255, 153, 255));
        btnThem.setkHoverEndColor(new java.awt.Color(255, 153, 51));
        btnThem.setkHoverForeGround(new java.awt.Color(255, 102, 102));
        btnThem.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnThem.setkStartColor(new java.awt.Color(255, 102, 51));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 150, 40));

        txtTimkiem.setOpaque(false);
        jPanel1.add(txtTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 490, 40));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 30));

        tableQLTK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableQLTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Ngay sinh", "Địa chỉ", "SĐT", "Ca làm việc", "Chức vụ", "CCCD"
            }
        ));
        tableQLTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQLTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQLTK);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 650, 380));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Thông tin tài khoản");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Làm mới");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 130, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Xóa");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 640, 50, 20));

        txtUsername.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 204, 204));
        txtUsername.setBorder(null);
        txtUsername.setOpaque(false);
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 230, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 230, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 230, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Nhập Username");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 180, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Nhân viên");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 180, 20));

        btnSua.setkBorderRadius(25);
        btnSua.setkEndColor(new java.awt.Color(102, 204, 255));
        btnSua.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnSua.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnSua.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnSua.setkStartColor(new java.awt.Color(255, 153, 102));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 150, 40));

        btnLammoi.setkBorderRadius(25);
        btnLammoi.setkEndColor(new java.awt.Color(102, 204, 255));
        btnLammoi.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnLammoi.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnLammoi.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnLammoi.setkStartColor(new java.awt.Color(255, 102, 51));
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLammoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 150, 40));

        btnXoa.setkBorderRadius(25);
        btnXoa.setkEndColor(new java.awt.Color(102, 204, 255));
        btnXoa.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnXoa.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnXoa.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnXoa.setkStartColor(new java.awt.Color(255, 102, 102));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 630, 150, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Drinks");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 50, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Nhập Password");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, 20));

        jPanel1.add(cbbNhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 230, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Tìm kiếm");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 90, 40));

        btnTimkiem.setToolTipText("");
        btnTimkiem.setkBorderRadius(25);
        btnTimkiem.setkEndColor(new java.awt.Color(102, 0, 102));
        btnTimkiem.setkHoverEndColor(new java.awt.Color(255, 153, 51));
        btnTimkiem.setkHoverForeGround(new java.awt.Color(255, 102, 102));
        btnTimkiem.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnTimkiem.setkStartColor(new java.awt.Color(51, 204, 255));
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 110, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Xuất Excel");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 640, 130, 20));

        btnXuatExcel.setkBorderRadius(25);
        btnXuatExcel.setkEndColor(new java.awt.Color(0, 102, 51));
        btnXuatExcel.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnXuatExcel.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnXuatExcel.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnXuatExcel.setkStartColor(new java.awt.Color(0, 204, 102));
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, 150, 40));

        pwfPassword.setText("mthv2k");
        pwfPassword.setBorder(null);
        jPanel1.add(pwfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 230, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Nhập lại Password");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 180, 20));

        pwfAgainPassword.setText("mthv2k");
        pwfAgainPassword.setBorder(null);
        jPanel1.add(pwfAgainPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 230, 40));

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

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\OneDrive\\Máy tính\\icons8-account-18.png")); // NOI18N
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

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\OneDrive\\Máy tính\\icons8-user-account-18.png")); // NOI18N
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

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\Downloads\\icons8-logout-rounded-left-24.png")); // NOI18N
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

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\OneDrive\\Máy tính\\icons8-add-user-male-18.png")); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\OneDrive\\Máy tính\\icons8-shopping-cart-18.png")); // NOI18N
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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vomin\\OneDrive\\Máy tính\\icons8-home-18.png")); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillCombobox(){
        ArrayList<NhanVien> nhanvienList = new NhanVienDAO().toanbodanhsach();
        for (NhanVien nhanVien : nhanvienList) {
            cbbNhanvien.addItem(nhanVien.getManv());
        }
    }
    
    private void createTable(ArrayList<TaiKhoan> taiKhoans){
        DefaultTableModel defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            } 
        };      
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Tên nhân viên");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.setRowCount(0);
        
        for(TaiKhoan taiKhoan : taiKhoans){
            NhanVien nhanVien = new NhanVienDAO().timkiemtheoID(taiKhoan.getManv());
            defaultTableModel.addRow(new Object[]{taiKhoan.getUsername(), nhanVien.getTennv(), nhanVien.getChucvu()});   
        }
        tableQLTK.setModel(defaultTableModel);
    }
    
    private void showTable(){
        ArrayList<TaiKhoan> taiKhoans = new ArrayList<>();
        taiKhoans = new TaiKhoanDAO().toanbodanhsach();
        createTable(taiKhoans);
    }    
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        CheckInputTaiKhoan checkInputTaiKhoan = new CheckInputTaiKhoan();
        TaiKhoan taiKhoan = new TaiKhoan();
        if(checkInputTaiKhoan.checkUsername(txtUsername.getText()))
        JOptionPane.showMessageDialog(rootPane, "Username không hợp lệ");
        else{
            taiKhoan.setUsername(txtUsername.getText());
            if(!new CheckInputTaiKhoan().checkPassword(String.valueOf(pwfPassword.getPassword()))){
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu không hợp lệ");
            }
            else{
                if(!String.valueOf(pwfAgainPassword.getPassword()).equals(String.valueOf(pwfPassword.getPassword()))){
                    JOptionPane.showMessageDialog(rootPane, "Nhập lại mật khẩu không chính xác");
                }
                else{
                    taiKhoan.setPassword(String.valueOf(pwfPassword.getPassword()));
                        taiKhoan.setManv(String.valueOf(cbbNhanvien.getSelectedItem()));
                            try {
                                new TaiKhoanDAO().them(taiKhoan);
                                JOptionPane.showMessageDialog(rootPane, "Thêm vào thành công");
                                showTable();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(rootPane, "Thêm vào không thành công");
                            }
                        
                       
                
                }    
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableQLTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQLTKMouseClicked
        // TODO add your handling code here:
        //sach.getMasach(), sach.getTensach(), sach.getTheloai(), sach.getTentacgia(),sach.getNgonngu(), sach.getNamsx(), sach.getDongianhap()}
        int row = tableQLTK.getSelectedRow();
        try {
            if(row != -1){
                txtUsername.setText((String) tableQLTK.getValueAt(row, 0));
                cbbNhanvien.setSelectedItem((String) tableQLTK.getValueAt(row, 2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableQLTKMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        TaiKhoan taiKhoan = new TaiKhoanDAO().timkiemtheoID(txtUsername.getText());
        CheckInputTaiKhoan checkInputTaiKhoan = new CheckInputTaiKhoan();
        if(checkInputTaiKhoan.checkUsername(txtUsername.getText()))
        JOptionPane.showMessageDialog(rootPane, "Username không hợp lệ");
        else{
            if(!new CheckInputTaiKhoan().checkPassword(String.valueOf(pwfPassword.getPassword()))){
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu không hợp lệ");
            }
            else{
                if(!String.valueOf(pwfAgainPassword.getPassword()).equals(String.valueOf(pwfPassword.getPassword()))){
                    JOptionPane.showMessageDialog(rootPane, "Nhập lại mật khẩu không chính xác");
                }
                else{
                            try {
                                new TaiKhoanDAO().sua(taiKhoan);
                                JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                                showTable();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công");
                            }
                        
                       
                
                }    
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtTimkiem.setText("");
        cbbNhanvien.setSelectedIndex(0);
        pwfPassword.setText("");
        pwfAgainPassword.setText("");
        showTable();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tableQLTK.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn tài khoản cần xóa");
        }else{
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa sách");
            if(confirm == JOptionPane.YES_OPTION){
                String idsachxoa = (String) tableQLTK.getValueAt(row, 0);
                if(new TaiKhoanDAO().xoa(idsachxoa)){
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    showTable();
                }
                else
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    ArrayList<TaiKhoan> taiKhoans = new ArrayList<>();
    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        TaiKhoanDAO nvDAO = new TaiKhoanDAO();
        taiKhoans.clear();
        try {
            taiKhoans = nvDAO.timkiemtheoTen(txtTimkiem.getText());
            createTable(taiKhoans);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Chúng em làm vẫn chưa kịp ạ! Tương tự như Quản lý khách hàng");
    }//GEN-LAST:event_btnXuatExcelActionPerformed

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
            java.util.logging.Logger.getLogger(QLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAccount;
    private com.k33ptoo.components.KButton btnLammoi;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnManagement;
    private com.k33ptoo.components.KButton btnOrder;
    private com.k33ptoo.components.KButton btnStatics;
    private com.k33ptoo.components.KButton btnSua;
    private com.k33ptoo.components.KButton btnThem;
    private com.k33ptoo.components.KButton btnTimkiem;
    private com.k33ptoo.components.KButton btnWorkbench;
    private com.k33ptoo.components.KButton btnXoa;
    private com.k33ptoo.components.KButton btnXuatExcel;
    private javax.swing.JComboBox<String> cbbNhanvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbManagement;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbStatics;
    private javax.swing.JLabel lbWorkbench;
    private javax.swing.JPasswordField pwfAgainPassword;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTable tableQLTK;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
