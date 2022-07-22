/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiHoaDon;

import BLL.ThongKeHoaDonBLL;
import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import Model.HoaDon;
import Model.KhachHang;
import Model.NhanVien;
import QuanLiTaiKhoan.TTCaNhan;
import TrangChinh.Dang_Nhap;
import TrangChinh.MagementForm;
import TrangChinh.OrderFormChoose;
import TrangChinh.StaticsFormChoose;
import TrangChinh.Welecome;
import java.sql.Date;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ThongKeHD extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public ThongKeHD() {
        initComponents();
        showTable();
        fillData();        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQLTKHD = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtTongtien = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtSoluong = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnThongke = new com.k33ptoo.components.KButton();
        btnXuatExcel = new com.k33ptoo.components.KButton();
        dcDenngay = new com.toedter.calendar.JDateChooser();
        dcTungay = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnQuaylai = new com.k33ptoo.components.KButton();
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
        jLabel24.setText("Thống kê");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 70, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cake");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quay lại");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 70, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Invoice Statics");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 360, 50));

        tableQLTKHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableQLTKHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã NV", "Tên NV", "Ngày bán", "Tên KH", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tableQLTKHD);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 870, 360));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Thông tin hóa đơn");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Xuất Excel");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 710, 90, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Số lượng đơn");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 150, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 300, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 300, 20));

        txtTongtien.setEditable(false);
        txtTongtien.setText("TT");
        txtTongtien.setBorder(null);
        txtTongtien.setOpaque(false);
        jPanel1.add(txtTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 230, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 230, 40));

        txtSoluong.setText("090324545");
        txtSoluong.setBorder(null);
        txtSoluong.setOpaque(false);
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 280, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 230, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Từ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 180, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Đến");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 180, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Tổng tiền");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 180, 20));

        btnThongke.setkBackGroundColor(new java.awt.Color(0, 153, 255));
        btnThongke.setkBorderRadius(0);
        btnThongke.setkEndColor(new java.awt.Color(102, 204, 255));
        btnThongke.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnThongke.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnThongke.setkHoverStartColor(new java.awt.Color(255, 153, 153));
        btnThongke.setkPressedColor(new java.awt.Color(153, 153, 255));
        btnThongke.setkSelectedColor(new java.awt.Color(153, 102, 255));
        btnThongke.setkStartColor(new java.awt.Color(204, 153, 255));
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });
        jPanel1.add(btnThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 140, 40));

        btnXuatExcel.setkBorderRadius(0);
        btnXuatExcel.setkEndColor(new java.awt.Color(0, 204, 153));
        btnXuatExcel.setkHoverEndColor(new java.awt.Color(0, 204, 153));
        btnXuatExcel.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnXuatExcel.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnXuatExcel.setkStartColor(new java.awt.Color(102, 255, 102));
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, 340, 40));
        jPanel1.add(dcDenngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 300, 30));
        jPanel1.add(dcTungay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 300, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Drinks");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 50, 20));

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Thông tin thống kê");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        btnQuaylai.setkBackGroundColor(new java.awt.Color(0, 153, 255));
        btnQuaylai.setkBorderRadius(0);
        btnQuaylai.setkEndColor(new java.awt.Color(102, 204, 255));
        btnQuaylai.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnQuaylai.setkHoverForeGround(new java.awt.Color(204, 102, 255));
        btnQuaylai.setkHoverStartColor(new java.awt.Color(255, 153, 153));
        btnQuaylai.setkPressedColor(new java.awt.Color(153, 153, 255));
        btnQuaylai.setkSelectedColor(new java.awt.Color(153, 102, 255));
        btnQuaylai.setkStartColor(new java.awt.Color(204, 153, 255));
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 140, 40));

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
            .addGap(0, 1340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTable(ArrayList<HoaDon> hoaDons){
        try {
        DefaultTableModel defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };      
        defaultTableModel.addColumn("Mã hóa đơn");
        defaultTableModel.addColumn("Mã nhân viên");
        defaultTableModel.addColumn("Tên nhân viên");
        defaultTableModel.addColumn("Ngày bán");
        defaultTableModel.addColumn("Tên khách hàng");
        defaultTableModel.addColumn("Tổng tiền");
        for(HoaDon HoaDon : hoaDons){
            KhachHang tenKhachHang = new KhachHangDAO().timkiemtheoID(HoaDon.getMakh());
            NhanVien tenNhanVien = new NhanVienDAO().timkiemtheoID(HoaDon.getManv());
            if(tenKhachHang==null){
            defaultTableModel.addRow(new Object[]{HoaDon.getMahd(), HoaDon.getManv(), tenNhanVien.getTennv(), HoaDon.getNgayban(),
                HoaDon.getMakh(), HoaDon.getTongtien()});                 
            }else
            defaultTableModel.addRow(new Object[]{HoaDon.getMahd(), HoaDon.getManv(), tenNhanVien.getTennv(), HoaDon.getNgayban(),
                tenKhachHang.getHoten(), HoaDon.getTongtien()}); 
        }
        tableQLTKHD.setModel(defaultTableModel);            
        } catch (Exception e) {
        }

    }
    
    ArrayList<HoaDon> chiTietHoaDonsBang = new ArrayList<>();
    private void showTable(){
        HoaDonDAO chiTietHoaDonDAO = new HoaDonDAO();  
        LocalDate endOM = YearMonth.now().atEndOfMonth();
        LocalDate startOM = YearMonth.now().atDay(1);
        Date dateTN = Date.valueOf(startOM);
        Date dateDN = Date.valueOf(endOM);
        System.out.println(""+dateDN+"|"+dateTN);
        chiTietHoaDonsBang = new HoaDonDAO().timkiemtheoThang(dateTN, dateDN);
        createTable(chiTietHoaDonsBang);
    }   
    
    private void fillData(){
        float tongtien = 0;
        for (int i = 0; i<tableQLTKHD.getRowCount(); i++) {
            tongtien += (float) tableQLTKHD.getValueAt(i, 5);
        }
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        txtTongtien.setText(currencyVN.format(tongtien));
        txtSoluong.setText(String.valueOf(chiTietHoaDonsBang.size()));
    }
    
    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        new ThongKeHoaDonBLL().writeFileExcel(chiTietHoaDonsBang);
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
        // TODO add your handling code here:
        chiTietHoaDonsBang.clear();
        java.sql.Date tnDate = new Date(dcTungay.getDate().getTime());
        Date dnDate = new Date(dcDenngay.getDate().getTime());
        chiTietHoaDonsBang = new HoaDonDAO().timkiemtheoNgay(tnDate, dnDate);
        createTable(chiTietHoaDonsBang);
        fillData();        
    }//GEN-LAST:event_btnThongkeActionPerformed

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        // TODO add your handling code here:
        new QLHoaDon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuaylaiActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeHD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAccount;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnManagement;
    private com.k33ptoo.components.KButton btnOrder;
    private com.k33ptoo.components.KButton btnQuaylai;
    private com.k33ptoo.components.KButton btnStatics;
    private com.k33ptoo.components.KButton btnThongke;
    private com.k33ptoo.components.KButton btnWorkbench;
    private com.k33ptoo.components.KButton btnXuatExcel;
    private com.toedter.calendar.JDateChooser dcDenngay;
    private com.toedter.calendar.JDateChooser dcTungay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JTable tableQLTKHD;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}