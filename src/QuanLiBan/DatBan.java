/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package QuanLiBan;

import DAO.BanDAO;
import DAO.HoaDonBanDAO;
import DAO.KhachHangDAO;
import Model.Ban;
import Model.HDDatBan;
import QuanLiTaiKhoan.TTCaNhan;
import TrangChinh.Dang_Nhap;
import TrangChinh.MagementForm;
import TrangChinh.OrderFormChoose;
import TrangChinh.StaticsFormChoose;
import TrangChinh.Welecome;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author vomin
 */
public class DatBan extends javax.swing.JFrame {

    /**
     * Creates new form DatBan1
     */
    public DatBan() {
        initComponents();
        AddButtonToFrame();
        Calendar calendar = Calendar.getInstance(Locale.forLanguageTag("VN"));               
        String idDb = "HD"+LocalDateTime.now().getNano();
        formatJdateChooser();
        txtID.setText(idDb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator10 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        txtTenkh = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        txtTiencoc = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnDatban = new com.k33ptoo.components.KButton();
        jLabel48 = new javax.swing.JLabel();
        txtMaban = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtKhuvuc = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtSucchua = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtGiatien = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        dcNNB = new com.toedter.calendar.JDateChooser();
        pnBan = new javax.swing.JPanel();
        dcNDB = new com.toedter.calendar.JDateChooser();
        lbTongtien = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Đặt bàn");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 220, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setText("Đặt Bàn");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 270, 50));
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 690, 30, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Thông tin bàn");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, -1, -1));

        txtID.setEditable(false);
        txtID.setText("ID");
        txtID.setBorder(null);
        txtID.setOpaque(false);
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 230, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 230, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ID");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 193, 110, 20));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("ID");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 193, 110, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 230, 20));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Mã Bàn");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 193, 110, 20));

        txtTenkh.setBorder(null);
        txtTenkh.setOpaque(false);
        jPanel2.add(txtTenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 220, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 230, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("SĐT");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 110, 20));

        txtSdt.setBorder(null);
        txtSdt.setOpaque(false);
        jPanel2.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 220, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 230, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Ngày Nhận Bàn");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 130, 20));

        txtTiencoc.setBorder(null);
        txtTiencoc.setOpaque(false);
        jPanel2.add(txtTiencoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 220, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 230, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Tiền Cọc");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 110, 20));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Ngày Đạt Bàn");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 130, 20));

        btnDatban.setkBorderRadius(25);
        btnDatban.setkEndColor(new java.awt.Color(255, 153, 255));
        btnDatban.setkHoverEndColor(new java.awt.Color(255, 153, 51));
        btnDatban.setkHoverForeGround(new java.awt.Color(255, 102, 102));
        btnDatban.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnDatban.setkStartColor(new java.awt.Color(255, 102, 51));
        btnDatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatbanActionPerformed(evt);
            }
        });
        jPanel2.add(btnDatban, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 240, 50));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Thông tin khách hàng");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        txtMaban.setText("MB");
        txtMaban.setBorder(null);
        jPanel2.add(txtMaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 240, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Tên KH");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 110, 20));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Khu Vực");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 110, 20));

        txtKhuvuc.setText("KV");
        txtKhuvuc.setBorder(null);
        jPanel2.add(txtKhuvuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 300, 240, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Sức Chứa");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, 110, 20));

        txtSucchua.setText("SC");
        txtSucchua.setBorder(null);
        jPanel2.add(txtSucchua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 380, 240, 30));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Tổng tiền");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 110, 20));

        txtGiatien.setText("GT");
        txtGiatien.setBorder(null);
        jPanel2.add(txtGiatien, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 240, 30));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 240, 20));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 240, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, 240, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, 240, 10));

        dcNNB.setDate(new java.util.Date(1633576526000L));
        dcNNB.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(dcNNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 230, 30));

        pnBan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnBanLayout = new javax.swing.GroupLayout(pnBan);
        pnBan.setLayout(pnBanLayout);
        pnBanLayout.setHorizontalGroup(
            pnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        pnBanLayout.setVerticalGroup(
            pnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel2.add(pnBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 490, 490));

        dcNDB.setDate(new java.util.Date(1633576526000L));
        dcNDB.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(dcNDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 230, 30));

        lbTongtien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lbTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 240, 30));

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

        jPanel2.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 250, 760));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1295, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void formatJdateChooser(){
        Date date=java.util.Calendar.getInstance().getTime();
        dcNDB.setDate(date);
        dcNNB.setDate(date);
    }
    
    static final ArrayList<JButton> listBtn = new ArrayList<>();
    static int flag = 0;
    static String dsbtn = "";
    ArrayList<Ban> listBanChon = new ArrayList<>();
    HDDatBan hdDatban = new HDDatBan();

    private void AddButtonToFrame()
        {         
            ArrayList<Ban> list = new BanDAO().toanbodanhsach();
            int dem = 0;
            int gtdong = list.size()/2-1;
            GridLayout layout = new GridLayout(gtdong,3);
            layout.preferredLayoutSize(pnBan);
            layout.setHgap(10);
            layout.setVgap(10);           
            for (Ban ban : list) {               
                JButton button = new JButton(ban.getMaban());
                button.setBackground(Color.LIGHT_GRAY);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {                       
                        if(button.getBackground()==Color.LIGHT_GRAY){
                            button.setBackground(Color.GREEN);
                            listBanChon.add(ban); 
                            listBtn.add(button);
                        }else if(button.getBackground()==Color.GREEN){
                            button.setBackground(Color.LIGHT_GRAY);
                            listBanChon.remove(ban);
                        }else if(button.getBackground()==Color.CYAN){
                            int confirm = JOptionPane.showConfirmDialog(rootPane, "Hủy hóa đơn đặt bàn");
                            if(confirm ==JOptionPane.YES_OPTION){
                                new HoaDonBanDAO().xoa(hdDatban.getId());
                                JOptionPane.showMessageDialog(rootPane, "Hủy hóa đơn thành công");
                            }
                            button.setBackground(Color.LIGHT_GRAY);
                        }
                        fillListBan(listBanChon);                        
                    }                                        
                });
                this.pnBan.setLayout(layout);
                this.pnBan.add(button);
                
            }
            
           
        }
    
    private void fillListBan(ArrayList<Ban> list){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String maban="", khuvuc="", succhua="", giatien="";
        int sc=0;
        Float tongtien = (float) 0.0;
        for (Ban ban : list) {
            maban += ban.getMaban()+" ";
            khuvuc += ban.getKhuvuc()+" ";
            sc += ban.getSucchua();          
            tongtien += ban.getGiatien();
        }
        txtMaban.setText(maban);
        
        txtKhuvuc.setText(khuvuc);
        txtSucchua.setText(String.valueOf(sc));
        
        txtGiatien.setText(currencyVN.format(tongtien));
        
//        lbTongtien.setText(currencyVN.format(tongtien));
        hdDatban.setTongtien(tongtien);
    }
    
    private void btnDatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatbanActionPerformed
        // TODO add your handling code here:
        try {
        for (JButton btn : listBtn) {
            if(btn.getBackground()==Color.GREEN){               
                btn.setBackground(Color.CYAN);               
            }
        }       
        Float.parseFloat(txtTiencoc.getText());
        if(txtTenkh.getText().equals("") || txtSdt.getText().equals("") || txtTiencoc.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Yêu cầu nhập đầy đủ yêu cầu");
        }else{
            hdDatban.setMaban(txtMaban.getText());
            hdDatban.setId(txtID.getText());
            hdDatban.setTenkh(txtTenkh.getText());
            hdDatban.setSdt(txtSdt.getText());
            hdDatban.setTiencoc(Float.parseFloat(txtTiencoc.getText())); 
            java.sql.Date sqldateNDB = new java.sql.Date(dcNDB.getDate().getTime());
            java.sql.Date sqldateNNB = new java.sql.Date(dcNDB.getDate().getTime());
            hdDatban.setNgaydat(sqldateNDB);
            hdDatban.setNgaynhan(sqldateNNB);
            //new HoaDonBanDAO().them(hdDatban);
            JOptionPane.showMessageDialog(rootPane, "Thêm hóa đơn đặt bàn thành công");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_btnDatbanActionPerformed

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

     private void disableBtn(JButton btn){
        btn.setEnabled(false);
    }
    
    private void enableBtn(JButton btn){
        btn.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAccount;
    private com.k33ptoo.components.KButton btnDatban;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnManagement;
    private com.k33ptoo.components.KButton btnOrder;
    private com.k33ptoo.components.KButton btnStatics;
    private com.k33ptoo.components.KButton btnWorkbench;
    private com.toedter.calendar.JDateChooser dcNDB;
    private com.toedter.calendar.JDateChooser dcNNB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbManagement;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbStatics;
    private javax.swing.JLabel lbTongtien;
    private javax.swing.JLabel lbWorkbench;
    private javax.swing.JPanel pnBan;
    private javax.swing.JTextField txtGiatien;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKhuvuc;
    private javax.swing.JTextField txtMaban;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSucchua;
    private javax.swing.JTextField txtTenkh;
    private javax.swing.JTextField txtTiencoc;
    // End of variables declaration//GEN-END:variables
}
