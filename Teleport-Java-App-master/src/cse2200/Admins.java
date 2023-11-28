
package cse2200;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Admins extends javax.swing.JFrame {

   
    
        Color dc,cc,p;
    public Admins() {
        initComponents();
        dc = new Color(255,0,40);
        cc = new Color(255,255,255);
        p = new Color(0,255,255);
        
        
    }
       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        vieworder = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        ordermanager = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        manageoffi = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        offilist = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        update = new javax.swing.JPanel();
        uaid = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        uapass = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mmm = new javax.swing.JPanel();
        mm = new javax.swing.JLabel();
        hh2 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        vv3 = new javax.swing.JPanel();
        vv = new javax.swing.JLabel();
        uu4 = new javax.swing.JPanel();
        uu = new javax.swing.JLabel();
        vo5 = new javax.swing.JPanel();
        vo = new javax.swing.JLabel();
        mo234 = new javax.swing.JPanel();
        mo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 0, 40));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setBackground(new java.awt.Color(255, 255, 255));

        vieworder.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/delivery.png"))); // NOI18N
        jLabel21.setText("Order & Delivery");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(153, 153, 153)));

        jTable4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Name", "Phone No", "Deliver Status", "Destination", "Payment"
            }
        ));
        jTable4.setGridColor(new java.awt.Color(51, 153, 255));
        jTable4.setRowHeight(25);
        jTable4.setSelectionBackground(new java.awt.Color(255, 0, 40));
        jTable4.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable4.setShowGrid(true);
        jTable4.setShowHorizontalLines(false);
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout vieworderLayout = new javax.swing.GroupLayout(vieworder);
        vieworder.setLayout(vieworderLayout);
        vieworderLayout.setHorizontalGroup(
            vieworderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vieworderLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel21)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(vieworderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        vieworderLayout.setVerticalGroup(
            vieworderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vieworderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Order", vieworder);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 423));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 40));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/manage.png"))); // NOI18N
        jLabel15.setText("Order Manager");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 204, 204)));

        jTextField3.setBackground(new java.awt.Color(204, 204, 255));
        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 40));
        jLabel39.setText("OrderId");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 40));
        jLabel40.setText("Reciever Name");

        jTextField4.setBackground(new java.awt.Color(204, 204, 255));
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 40));
        jLabel41.setText("Phone No");

        jTextField5.setBackground(new java.awt.Color(204, 204, 255));
        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 0, 40));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Collected", "Shipped", "On Process", "Delivered" }));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 40));
        jLabel42.setText("Order Status");

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Check Details");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancel Order");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(236, 236, 236))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel40))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout ordermanagerLayout = new javax.swing.GroupLayout(ordermanager);
        ordermanager.setLayout(ordermanagerLayout);
        ordermanagerLayout.setHorizontalGroup(
            ordermanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(ordermanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );
        ordermanagerLayout.setVerticalGroup(
            ordermanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(ordermanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
        );

        tab.addTab("manage", ordermanager);

        manageoffi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 0, 40));
        jLabel53.setText("Name");

        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 0, 40));
        jLabel54.setText("Phone No");

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 40));
        jLabel55.setText("Allocated Office");

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 0, 40));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/edit.png"))); // NOI18N
        jLabel63.setText("Edit Official's Profile");
        jLabel63.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 204, 204)));

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 0, 40));
        jLabel64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTextField8.setBackground(new java.awt.Color(204, 255, 255));
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextField10.setBackground(new java.awt.Color(204, 255, 255));
        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextField12.setBackground(new java.awt.Color(204, 255, 255));
        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 0, 40));
        jLabel59.setText("Gender");

        jComboBox5.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 0, 40));
        jLabel60.setText("Password");

        jTextField13.setBackground(new java.awt.Color(204, 255, 255));
        jTextField13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 255));
        jButton7.setText("Update");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 0, 40));
        jLabel58.setText("Official Id");

        jTextField15.setBackground(new java.awt.Color(204, 255, 255));
        jTextField15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton10.setBackground(new java.awt.Color(255, 255, 51));
        jButton10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/cancel.png"))); // NOI18N
        jButton10.setText("Delete");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 40));
        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/add.png"))); // NOI18N
        jButton11.setText("Add");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField10)
                            .addComponent(jTextField8)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13)
                            .addComponent(jComboBox5, 0, 185, Short.MAX_VALUE)
                            .addComponent(jTextField15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout manageoffiLayout = new javax.swing.GroupLayout(manageoffi);
        manageoffi.setLayout(manageoffiLayout);
        manageoffiLayout.setHorizontalGroup(
            manageoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(manageoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageoffiLayout.setVerticalGroup(
            manageoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(manageoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.addTab("Manageofficials", manageoffi);

        offilist.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/employee.png"))); // NOI18N
        jLabel14.setText("Officials List");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(153, 153, 153)));

        jTable3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Offcial Id", "Name", "Phone No", "Password", "Gender"
            }
        ));
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(255, 0, 40));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout offilistLayout = new javax.swing.GroupLayout(offilist);
        offilist.setLayout(offilistLayout);
        offilistLayout.setHorizontalGroup(
            offilistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offilistLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(offilistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        offilistLayout.setVerticalGroup(
            offilistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, offilistLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        tab.addTab("View", offilist);

        uaid.setBackground(new java.awt.Color(204, 255, 255));
        uaid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        uaid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 0, 40));
        jLabel61.setText("Admin Id");

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 0, 40));
        jLabel62.setText("Password");

        uapass.setBackground(new java.awt.Color(204, 255, 255));
        uapass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        uapass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 255));
        jButton8.setText("Update");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 0, 40));
        jButton12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/add.png"))); // NOI18N
        jButton12.setText("Add");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 51));
        jButton13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/cancel.png"))); // NOI18N
        jButton13.setText("Delete");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 204, 204));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 102, 102));
        jButton9.setText("*****Please try to Keep more than 1 Admin to avoid any risk*****\n\n");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/uadmin.png"))); // NOI18N
        jLabel16.setText("Update Admin Profile");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel61))
                                .addGap(18, 18, 18)
                                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uaid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uapass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(updateLayout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uaid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uapass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Update", update);

        jPanel6.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -30, 750, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/big icon with back.jpg"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 118, 103));

        jLabel6.setBackground(new java.awt.Color(255, 245, 240));
        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TeLePorT 24/7");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/cross.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        jPanel6.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, 30));

        jButton1.setBackground(new java.awt.Color(221, 221, 221));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/signout.png"))); // NOI18N
        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        mmm.setBackground(new java.awt.Color(255, 0, 40));

        mm.setBackground(new java.awt.Color(255, 0, 40));
        mm.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mm.setForeground(new java.awt.Color(255, 255, 255));
        mm.setText("Manage Orders");
        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mmMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mmmLayout = new javax.swing.GroupLayout(mmm);
        mmm.setLayout(mmmLayout);
        mmmLayout.setHorizontalGroup(
            mmmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mmmLayout.setVerticalGroup(
            mmmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mmmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(mmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        hh2.setBackground(new java.awt.Color(255, 0, 40));

        home1.setBackground(new java.awt.Color(255, 0, 40));
        home1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/Homebig(1).png"))); // NOI18N
        home1.setText("Home");
        home1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout hh2Layout = new javax.swing.GroupLayout(hh2);
        hh2.setLayout(hh2Layout);
        hh2Layout.setHorizontalGroup(
            hh2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hh2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        hh2Layout.setVerticalGroup(
            hh2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.add(hh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 70));

        vv3.setBackground(new java.awt.Color(255, 0, 40));

        vv.setBackground(new java.awt.Color(255, 0, 40));
        vv.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        vv.setForeground(new java.awt.Color(255, 255, 255));
        vv.setText("View Orders");
        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vvMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vv3Layout = new javax.swing.GroupLayout(vv3);
        vv3.setLayout(vv3Layout);
        vv3Layout.setHorizontalGroup(
            vv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vv3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vv3Layout.setVerticalGroup(
            vv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vv3Layout.createSequentialGroup()
                .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel6.add(vv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        uu4.setBackground(new java.awt.Color(255, 0, 40));

        uu.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        uu.setForeground(new java.awt.Color(0, 255, 255));
        uu.setText("Update Admin Id\n");
        uu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout uu4Layout = new javax.swing.GroupLayout(uu4);
        uu4.setLayout(uu4Layout);
        uu4Layout.setHorizontalGroup(
            uu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uu4Layout.createSequentialGroup()
                .addComponent(uu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        uu4Layout.setVerticalGroup(
            uu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uu4Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(uu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(uu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, 40));

        vo5.setBackground(new java.awt.Color(255, 0, 40));

        vo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        vo.setForeground(new java.awt.Color(255, 255, 255));
        vo.setText("View Officials");
        vo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vo5Layout = new javax.swing.GroupLayout(vo5);
        vo5.setLayout(vo5Layout);
        vo5Layout.setHorizontalGroup(
            vo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vo5Layout.setVerticalGroup(
            vo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vo5Layout.createSequentialGroup()
                .addComponent(vo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(vo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, 30));

        mo234.setBackground(new java.awt.Color(255, 0, 40));

        mo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mo.setForeground(new java.awt.Color(255, 255, 255));
        mo.setText("Manage Officials");
        mo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mo234Layout = new javax.swing.GroupLayout(mo234);
        mo234.setLayout(mo234Layout);
        mo234Layout.setHorizontalGroup(
            mo234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mo234Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mo234Layout.setVerticalGroup(
            mo234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mo234Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(mo234, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
 
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      // JOptionPane.showMessageDialog(this, "anik");
    System.out.println("Login failed");
   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       //  JOptionPane.showMessageDialog(this, "ekka");
         String id = jTextField15.getText();
String url = "jdbc:mysql://localhost:3306/mysql";
String user = "root";
String password = "anik";

try (Connection connection = DriverManager.getConnection(url, user, password)) {
    String query = "DELETE FROM official WHERE id = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, id);

    int rowsDeleted = preparedStatement.executeUpdate();
    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(this,  id + " deleted successfully");
    } else {
        JOptionPane.showMessageDialog(this, "No Data found with ID " + id);
    }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
    JOptionPane.showMessageDialog(this, "Deletion failed");
}

        
      
  
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
 String id = jTextField15.getText(); 
String name = jTextField10.getText(); 
String phoneNo = jTextField8.getText(); 
String allocatedOffice = jTextField13.getText(); 
String gender = jComboBox5.getSelectedItem().toString(); 
String password = jTextField12.getText(); 

String url = "jdbc:mysql://localhost:3306/mysql";
String username = "root";
String dbPassword = "anik";

try {
    Connection connection = DriverManager.getConnection(url, username, dbPassword);

    String sql = "INSERT INTO official (id, Name, Phone_no, Allocate_office, Gender, Password) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, id);
    statement.setString(2, name);
    statement.setString(3, phoneNo);
    statement.setString(4, allocatedOffice);
    statement.setString(5, gender);
    statement.setString(6, password);

    statement.executeUpdate();

    statement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace(); 
}

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // JOptionPane.showMessageDialog(this, "sadik");
    System.out.println("Login failed");
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         JOptionPane.showMessageDialog(this, "1");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         JOptionPane.showMessageDialog(this, "2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // JOptionPane.showMessageDialog(this, "5");
        String adminid= uaid.getText();
        String adminpass=uapass.getText();
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root"; 
        String password = "anik"; 
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
    String query = "UPDATE admin_login1 SET Password = ? WHERE UserId = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, adminpass);
    preparedStatement.setString(2, adminid);

    int rowsUpdated = preparedStatement.executeUpdate();

    if (rowsUpdated > 0) {JOptionPane.showMessageDialog(this, "updated successfully!");
       // System.out.println("");
    } else {
        JOptionPane.showMessageDialog(this, "No recordwa s found.");
       // System.out.println("");
    }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      
         String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root"; 
        String password = "anik"; 

         try (Connection connection = DriverManager.getConnection(url, user, password)) {
        String query = "INSERT INTO Admin_login1 (UserId, Password) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, uaid.getText()); 
        preparedStatement.setString(2, new String(uapass.getText())); 

        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
     
        }
    } catch (SQLException e) {
        
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       // JOptionPane.showMessageDialog(this, "5");
        String adminid= uaid.getText();
        String adminpass=uapass.getText();
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root"; 
        String password = "anik"; 
        
      try (Connection connection = DriverManager.getConnection(url, user, password)) {
    String query = "DELETE FROM admin_login1 WHERE UserId = ? AND Password = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, adminid);
    preparedStatement.setString(2, adminpass);

    int rowsDeleted = preparedStatement.executeUpdate();

    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(this, "deleted successfully!");
        //System.out.println("The user was deleted successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "No record with Id and Password was found.");
       // System.out.println("No record with Id and Password was found.");
    }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
}
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JOptionPane.showMessageDialog(this, "6");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        
        new Homepage().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_home1MouseClicked

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(0);
        
        String url = "jdbc:mysql://localhost:3306/mysql";
String username = "root";
String dbPassword = "anik";

try {
    Connection connection = DriverManager.getConnection(url, username, dbPassword);

    String sql ="SELECT *FROM order_table1";
    PreparedStatement statement = connection.prepareStatement(sql);
 ResultSet resultSet=statement.executeQuery();
DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
model.setRowCount(0);
 while (resultSet.next()) {
            model.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet.getString("phone_no"),
                    resultSet.getString("delivery"),
                    resultSet.getString("destination"),
                    resultSet.getString("payment")
            }
           );
 }

} catch (SQLException e) {
   // e.printStackTrace(); // Handle the exception appropriately
   JOptionPane.showMessageDialog(this, "sadik");
}
    }//GEN-LAST:event_vvMouseClicked

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(1);
    }//GEN-LAST:event_mmMouseClicked

    private void uuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uuMouseClicked
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(this, "sadik");
        tab.setSelectedIndex(4);
    }//GEN-LAST:event_uuMouseClicked

    private void voMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voMouseClicked
        // TODO add your handling code here:
   
       tab.setSelectedIndex(3);
   
       
String url = "jdbc:mysql://localhost:3306/mysql";
String username = "root";
String dbPassword = "anik";

try {
    Connection connection = DriverManager.getConnection(url, username, dbPassword);

    String sql ="SELECT *FROM official";
    PreparedStatement statement = connection.prepareStatement(sql);
 ResultSet resultSet=statement.executeQuery();
DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
model.setRowCount(0);
 while (resultSet.next()) {
            model.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("Name"),
                    resultSet.getString("Phone_no"),
                    //resultSet.getString("Allocate_office"),
                    resultSet.getString("password"),
                    resultSet.getString("Gender")
            }
           );
 }

} catch (SQLException e) {
   // e.printStackTrace(); // Handle the exception appropriately
   JOptionPane.showMessageDialog(this, "sadik");
}
        
       
    }//GEN-LAST:event_voMouseClicked

    private void moMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(2);
    }//GEN-LAST:event_moMouseClicked

    private void home1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MousePressed
        // TODO add your handling code here:
        hh2.setBackground(cc);
        mmm.setBackground(dc);
        vv3.setBackground(dc);
        uu4.setBackground(dc);
        vo5.setBackground(dc);
        mo234.setBackground(dc);
        home1.setForeground(dc);
        vv.setForeground(cc);
        mm.setForeground(cc);
        uu.setForeground(p);
        mo.setForeground(cc);
        vo.setForeground(cc);
    }//GEN-LAST:event_home1MousePressed

    private void vvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMousePressed
        // TODO add your handling code here:
        hh2.setBackground(dc);
        mmm.setBackground(dc);
        vv3.setBackground(cc);
        uu4.setBackground(dc);
        vo5.setBackground(dc);
        mo234.setBackground(dc);
        home1.setForeground(cc);
        vv.setForeground(dc);
        mm.setForeground(cc);
        uu.setForeground(p);
        mo.setForeground(cc);
        vo.setForeground(cc);
        
        
    
    }//GEN-LAST:event_vvMousePressed

    private void mmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMousePressed
        // TODO add your handling code here:
        hh2.setBackground(dc);
        mmm.setBackground(cc);
        vv3.setBackground(dc);
        uu4.setBackground(dc);
        vo5.setBackground(dc);
        mo234.setBackground(dc);
        home1.setForeground(cc);
        vv.setForeground(cc);
        mm.setForeground(dc);
        uu.setForeground(p);
        mo.setForeground(cc);
        vo.setForeground(cc);
        
    }//GEN-LAST:event_mmMousePressed

    private void uuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uuMousePressed
        // TODO add your handling code here:
        hh2.setBackground(dc);
        mmm.setBackground(dc);
        vv3.setBackground(dc);
        uu4.setBackground(cc);
        vo5.setBackground(dc);
        mo234.setBackground(dc);
        home1.setForeground(cc);
        vv.setForeground(cc);
        mm.setForeground(cc);
        uu.setForeground(dc);
        mo.setForeground(cc);
        vo.setForeground(cc);
        
    }//GEN-LAST:event_uuMousePressed

    private void voMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voMousePressed
        // TODO add your handling code here:
        hh2.setBackground(dc);
        mmm.setBackground(dc);
        vv3.setBackground(dc);
        uu4.setBackground(dc);
        vo5.setBackground(cc);
        mo234.setBackground(dc);
        home1.setForeground(cc);
        vv.setForeground(cc);
        mm.setForeground(cc);
        uu.setForeground(p);
        mo.setForeground(cc);
        vo.setForeground(dc);
    }//GEN-LAST:event_voMousePressed

    private void moMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moMousePressed
        // TODO add your handling code here:
        hh2.setBackground(dc);
        mmm.setBackground(dc);
        vv3.setBackground(dc);
        uu4.setBackground(dc);
        vo5.setBackground(dc);
        mo234.setBackground(cc);
        home1.setForeground(cc);
        vv.setForeground(cc);
        mm.setForeground(cc);
        uu.setForeground(p);
        mo.setForeground(dc);
        vo.setForeground(cc);
    }//GEN-LAST:event_moMousePressed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hh2;
    private javax.swing.JLabel home1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel manageoffi;
    private javax.swing.JLabel mm;
    private javax.swing.JPanel mmm;
    private javax.swing.JLabel mo;
    private javax.swing.JPanel mo234;
    private javax.swing.JPanel offilist;
    private javax.swing.JPanel ordermanager;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField uaid;
    private javax.swing.JTextField uapass;
    private javax.swing.JPanel update;
    private javax.swing.JLabel uu;
    private javax.swing.JPanel uu4;
    private javax.swing.JPanel vieworder;
    private javax.swing.JLabel vo;
    private javax.swing.JPanel vo5;
    private javax.swing.JLabel vv;
    private javax.swing.JPanel vv3;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
