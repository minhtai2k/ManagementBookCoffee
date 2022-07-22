package QuanLiKhachHang;

import BLL.KhachHangBLL;
import DAO.BanDAO;
import DAO.KhachHangDAO;
import Model.KhachHang;
import QuanLiTaiKhoan.TTCaNhan;
import TrangChinh.Dang_Nhap;
import TrangChinh.MagementForm;
import TrangChinh.OrderFormChoose;
import TrangChinh.StaticsFormChoose;
import TrangChinh.Welecome;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class QLKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form KH
     */
    public QLKhachHang() {
        initComponents();
        txtMakh.setText(new KhachHangBLL().autoIdKH());
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
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnThem = new com.k33ptoo.components.KButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQLKH = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtTenkh = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDiachi = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtSdt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSua = new com.k33ptoo.components.KButton();
        btnLammoi = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnTimkiem = new com.k33ptoo.components.KButton();
        btnXuatExcel = new com.k33ptoo.components.KButton();
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

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Tìm kiếm");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 80, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Thêm");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 130, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cake");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Sửa");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 130, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Customer Manager");
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
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 150, 40));

        txtTimkiem.setOpaque(false);
        jPanel1.add(txtTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 490, 40));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 30));

        tableQLKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableQLKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Loại KH", "Địa chỉ", "SĐT"
            }
        ));
        tableQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQLKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQLKH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 700, 440));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Thông tin khách hàng");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Làm mới");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 130, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Xóa");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 640, 50, 20));

        txtMakh.setEditable(false);
        txtMakh.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtMakh.setForeground(new java.awt.Color(0, 204, 204));
        txtMakh.setBorder(null);
        txtMakh.setOpaque(false);
        jPanel1.add(txtMakh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 310, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Nhập số diện thoại");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 180, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, 20));

        txtTenkh.setBorder(null);
        txtTenkh.setOpaque(false);
        jPanel1.add(txtTenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 310, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 230, 20));

        txtDiachi.setToolTipText("");
        txtDiachi.setBorder(null);
        txtDiachi.setOpaque(false);
        jPanel1.add(txtDiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 310, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 230, 40));

        txtSdt.setBorder(null);
        txtSdt.setOpaque(false);
        jPanel1.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 310, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 230, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Nhập mã khách hàng");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 180, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Nhập tên khách hàng");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Nhập địa chỉ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 180, 20));

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
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 630, 150, 40));

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
        jPanel1.add(btnLammoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 150, 40));

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
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 150, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Drinks");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 50, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Xuất Excel");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 640, 130, 20));

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
        jPanel1.add(btnTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 100, 40));

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
        jPanel1.add(btnXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 630, 150, 40));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTable(ArrayList<KhachHang> khachHangs){
        DefaultTableModel defaultTableModel = new DefaultTableModel(){
            @Override
            //isCellEditable:Không thể chỉnh sửa trực tiếp ở trên bảng
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }   
        };     
        //Thêm các cột
        defaultTableModel.addColumn("Mã khách hàng");
        defaultTableModel.addColumn("Tên khách hàng");
        defaultTableModel.addColumn("Loại khách hàng");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Số điện thoại");
        //set số hàng của bảng = 0;
        defaultTableModel.setRowCount(0);
        for(KhachHang khachHang : khachHangs){
            defaultTableModel.addRow(new Object[]{khachHang.getMakhachhang(), khachHang.getHoten(), khachHang.getLoaikhachhang(),
                khachHang.getDiachi(), khachHang.getSdt()});   
        }
        tableQLKH.setModel(defaultTableModel);
    }
    
    ArrayList<KhachHang> khachHangs = new ArrayList<>();   
    private void showTable(){
        KhachHangDAO khachhangDAO = new KhachHangDAO();
        khachHangs = khachhangDAO.toanbodanhsach();
        createTable(khachHangs);
    }
    
    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        KhachHangDAO khachhangDAO = new KhachHangDAO();
        //reset lại mảng khachHangs
        khachHangs.clear();
            try {
                khachHangs = khachhangDAO.timkiemKhachHangs(txtTimkiem.getText());
                createTable(khachHangs);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Lớp kiểm tra định dạng nhập vào
        CheckInputKhachhang checkQLKhachHang = new CheckInputKhachhang();
        try{    
            //Khởi tạo khachhang
            KhachHang khachHang = new KhachHang();          
            khachHang.setMakhachhang(txtMakh.getText());
            khachHang.setHoten(txtTenkh.getText());
            //Nếu tên khách hàng có chứa số thông báo k hợp lệ! Yêu cầu nhập lại
            if(!checkQLKhachHang.checkChuoiKhongSo(txtTenkh.getText())){
                JOptionPane.showMessageDialog(rootPane, "Định dạng tên không hợp lệ (Có số)! Yêu cầu nhập lại");
                txtTenkh.setText("");
            }else {
                khachHang.setDiachi(txtDiachi.getText());
                if(txtDiachi.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Địa chỉ rỗng");
                        txtDiachi.setText("");
                    }
                    khachHang.setSdt(txtSdt.getText());
                    //Định dạng sdt nhập vào k hợp lệ
                    if(!checkQLKhachHang.checkChuoiSDT(txtSdt.getText())){
                        JOptionPane.showMessageDialog(rootPane, "Định dạng số điện thoại không hợp lệ! Yêu cầu nhập lại");
                        txtSdt.setText("");
                    }
                    else{                     
                        khachHang.setLoaikhachhang("Khách hàng tiềm năng");
                        if(!new KhachHangDAO().checkIDValid(txtMakh.getText()))
                            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng tồn tại! Yêu cầu nhập lại");
                            else{
                                new KhachHangDAO().them(khachHang);
                                JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thành công");
                                showTable();
                            }
                        }
            }            
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Thêm vào không thành công");
            e.printStackTrace();
        }        
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQLKHMouseClicked
        // TODO add your handling code here:
        int row = tableQLKH.getSelectedRow();
        try {
            if(row != -1){            
            txtMakh.setText((String) tableQLKH.getValueAt(row, 0));
            txtTenkh.setText((String) tableQLKH.getValueAt(row, 1));
            txtDiachi.setText((String) tableQLKH.getValueAt(row, 3));
            txtSdt.setText((String) tableQLKH.getValueAt(row, 4));  
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableQLKHMouseClicked

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        txtMakh.setText("");
        txtTenkh.setText("");
        txtDiachi.setText("");
        txtSdt.setText("");        
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        CheckInputKhachhang checkQLKhachHang = new CheckInputKhachhang();
        try{
            //Tìm khách hàng thông qua mã khách hàng
            KhachHang khachHang = new KhachHangDAO().timkiemtheoID(txtMakh.getText());
//            txtMakh.setText(new KhachHangBLL().autoIdKH());
            khachHang.setMakhachhang(txtMakh.getText());
            khachHang.setHoten(txtTenkh.getText());
           if(!checkQLKhachHang.checkChuoiKhongSo(txtTenkh.getText())){
                JOptionPane.showMessageDialog(rootPane, "Định dạng tên không hợp lệ (Có số)! Yêu cầu nhập lại");
                txtTenkh.setText("");
            }else {
                khachHang.setDiachi(txtDiachi.getText());
                if(txtDiachi.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Địa chỉ rỗng");
                        txtDiachi.setText("");
                    }
                    khachHang.setSdt(txtSdt.getText());
                    if(!checkQLKhachHang.checkChuoiSDT(txtSdt.getText())){
                        JOptionPane.showMessageDialog(rootPane, "Định dạng số điện thoại không hợp lệ! Yêu cầu nhập lại");
                        txtSdt.setText("");
                    }
                    else{                     
                        khachHang.setLoaikhachhang("Khách hàng tiềm năng");
                        new KhachHangDAO().sua(khachHang);
                                JOptionPane.showMessageDialog(rootPane, "Sửa khách hàng thành công");
                                showTable();
                    }
            }            
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Thêm vào không thành công");
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa?");
        if(confirm ==JOptionPane.YES_OPTION){
            new KhachHangDAO().xoa(txtMakh.getText());
            JOptionPane.showMessageDialog(rootPane, "Xóa bàn thành công");
            showTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        new KhachHangBLL().writeFileExcel(khachHangs);
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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhachHang().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTable tableQLKH;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenkh;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}