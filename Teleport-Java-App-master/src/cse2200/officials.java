
package cse2200;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class officials extends javax.swing.JFrame {

  
    Color dc,cc;
    public officials() {
        initComponents();
        dc = new Color(255,0,40);
        cc = new Color(255,255,255);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        multi1 = new javax.swing.JTabbedPane();
        addor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        phonenbr = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        paymentvar = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox<>();
        receiver = new javax.swing.JTextField();
        area = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        charge = new javax.swing.JLabel();
        rocket = new javax.swing.JRadioButton();
        regular = new javax.swing.JRadioButton();
        dcharge = new javax.swing.JLabel();
        load = new javax.swing.JComboBox<>();
        pstatus = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        rphn = new javax.swing.JTextField();
        HD = new javax.swing.JCheckBox();
        calculate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        source = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        manageor = new javax.swing.JPanel();
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
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        editoffi = new javax.swing.JPanel();
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
        showpro = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        signout = new javax.swing.JButton();
        h1 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        a2 = new javax.swing.JPanel();
        addo = new javax.swing.JLabel();
        m3 = new javax.swing.JPanel();
        manageo = new javax.swing.JLabel();
        e5 = new javax.swing.JPanel();
        eprofile = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 40));
        jLabel19.setText("Name");

        jTextField7.setBackground(new java.awt.Color(204, 204, 255));
        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 40));
        jLabel18.setText("Phone No");

        jTextField9.setBackground(new java.awt.Color(204, 204, 255));
        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 40));
        jLabel17.setText("Allocated Office");

        jComboBox3.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylhet", "Khulna", "Rajsahi" }));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 40));
        jLabel20.setText("Gender");

        jComboBox2.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 40));
        jLabel22.setText("Password");

        jTextField11.setBackground(new java.awt.Color(204, 204, 255));
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 40));
        jLabel43.setText("Password");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 40));
        jLabel46.setText("Gender");

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 40));
        jLabel48.setText("Allocated Office");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 40));
        jLabel49.setText("Phone No");

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 40));
        jLabel52.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField14.setBackground(new java.awt.Color(204, 255, 255));
        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 40));
        setUndecorated(true);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 0, 40));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        multi1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 423));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 40));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/Create(2).png"))); // NOI18N
        jLabel14.setText("Add a Order");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 204, 204)));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 40));
        jLabel16.setText("Reciever Name");

        phonenbr.setBackground(new java.awt.Color(204, 204, 255));
        phonenbr.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        phonenbr.setText("Enter your Phone Number");
        phonenbr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phonenbrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phonenbrFocusLost(evt);
            }
        });
        phonenbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenbrActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 40));
        jLabel29.setText("Phone No");

        type.setBackground(new java.awt.Color(204, 204, 255));
        type.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Document", "Non-Document" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 40));
        jLabel30.setText("Parcel Type");

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 40));
        jLabel31.setText("Destination");

        paymentvar.setBackground(new java.awt.Color(255, 0, 40));
        paymentvar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        paymentvar.setForeground(new java.awt.Color(255, 255, 255));
        paymentvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid" }));
        paymentvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentvarActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 40));
        jLabel32.setText("Weight");

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 40));
        jLabel33.setText("Category");

        cat.setBackground(new java.awt.Color(204, 204, 255));
        cat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        receiver.setBackground(new java.awt.Color(204, 204, 255));
        receiver.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        receiver.setText("Who will receive this?");
        receiver.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        receiver.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                receiverFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                receiverFocusLost(evt);
            }
        });

        area.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        area.setModel(new javax.swing.SpinnerListModel(new String[] {"Chittagong", "Sylhet", "Dhaka", "Khulna", "Rajshahi"}));
        area.setToolTipText("");
        area.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(204, 204, 204), null, null));
        area.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Area");

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Location");

        address.setBackground(new java.awt.Color(204, 204, 255));
        address.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        address.setText("--- Address  (In Detail) ---");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        charge.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        charge.setForeground(new java.awt.Color(255, 0, 40));
        charge.setText("Delivery Type:");

        rocket.setBackground(new java.awt.Color(255, 255, 255));
        rocket.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        rocket.setText("<html>Fastest Delivery in 2 Days..\n(Only For products weighs less than 5 Kg)</html>\n");
        rocket.setActionCommand("rocket22");
        rocket.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Rocket Service", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("BankGothic Lt BT", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        rocket.setBorderPainted(true);
        rocket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketActionPerformed(evt);
            }
        });

        regular.setBackground(new java.awt.Color(255, 255, 255));
        regular.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        regular.setSelected(true);
        regular.setText("<html>\nEstimated Delivery in 3-4 Days \n</html>");
        regular.setActionCommand("regular23");
        regular.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 40), 2, true), "Regular Service", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("BankGothic Lt BT", 1, 18), new java.awt.Color(255, 0, 40))); // NOI18N
        regular.setBorderPainted(true);
        regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularActionPerformed(evt);
            }
        });

        dcharge.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dcharge.setForeground(new java.awt.Color(255, 0, 40));
        dcharge.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Delivery Charge", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(255, 0, 40))); // NOI18N

        load.setBackground(new java.awt.Color(204, 204, 255));
        load.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        load.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<5 Kg", "6-10 Kg", "11-50 Kg", "51-200 Kg" }));
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        pstatus.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        pstatus.setForeground(new java.awt.Color(255, 0, 40));
        pstatus.setText("Payment Status");

        add.setBackground(new java.awt.Color(255, 0, 40));
        add.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/add.png"))); // NOI18N
        add.setText("Add Order");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 40));
        jLabel36.setText("Reciever Number");

        rphn.setBackground(new java.awt.Color(204, 204, 255));
        rphn.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        rphn.setText("Reciever's Number");
        rphn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rphnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rphnFocusLost(evt);
            }
        });

        HD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        HD.setForeground(new java.awt.Color(255, 0, 40));
        HD.setText("Home Delivery");
        HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/calculate.png"))); // NOI18N
        calculate.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 40));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/print.png"))); // NOI18N
        jButton4.setText("Print The Receipt");

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 40));
        jLabel37.setText("From");

        source.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        source.setModel(new javax.swing.SpinnerListModel(new String[] {"Dhaka", "Chittagong", "Sylhet", "Khulna", "Rajshahi"}));
        source.setToolTipText("");
        source.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(204, 204, 204), null, null));
        source.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("Area");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel33)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel30))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(43, 43, 43)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(load, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(charge)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel31)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel34)))
                                                .addComponent(jLabel29))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel38)
                                            .addGap(14, 14, 14)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(rphn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(65, 65, 65)
                                            .addComponent(HD))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rocket, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(dcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(pstatus)
                                                .addGap(12, 12, 12)
                                                .addComponent(paymentvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel35)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phonenbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel16))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenbr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rphn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(charge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rocket, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout addorLayout = new javax.swing.GroupLayout(addor);
        addor.setLayout(addorLayout);
        addorLayout.setHorizontalGroup(
            addorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        addorLayout.setVerticalGroup(
            addorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
        );

        multi1.addTab("Add", addor);

        manageor.setBackground(new java.awt.Color(255, 255, 255));

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

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Order List");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Check Details");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), java.awt.Color.blue, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 0, 204)));

        jTextArea1.setEditable(false);
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

        jTable3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Name", "Phone No", "Deliver Status", "Destination", "Payment"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(51, 153, 255));
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(255, 0, 40));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable3.setShowGrid(true);
        jTable3.setShowHorizontalLines(false);
        jScrollPane3.setViewportView(jTable3);

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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout manageorLayout = new javax.swing.GroupLayout(manageor);
        manageor.setLayout(manageorLayout);
        manageorLayout.setHorizontalGroup(
            manageorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(manageorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );
        manageorLayout.setVerticalGroup(
            manageorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
            .addGroup(manageorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
        );

        multi1.addTab("manage", manageor);

        editoffi.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField13)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15))))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGap(32, 32, 32)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout editoffiLayout = new javax.swing.GroupLayout(editoffi);
        editoffi.setLayout(editoffiLayout);
        editoffiLayout.setHorizontalGroup(
            editoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(editoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editoffiLayout.setVerticalGroup(
            editoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(editoffiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        multi1.addTab("Edit", editoffi);

        showpro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 40));
        jLabel21.setText("Name");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 40));
        jLabel23.setText("Phone No");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 40));
        jLabel24.setText("Allocated Office");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 40));
        jLabel25.setText("Gender");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 40));
        jLabel26.setText("Password");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 40));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/Profile.png"))); // NOI18N
        jLabel27.setText("Official's Profile");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(204, 204, 204)));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 40));
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 0, 40));
        jLabel56.setText("Official Id");

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        javax.swing.GroupLayout showproLayout = new javax.swing.GroupLayout(showpro);
        showpro.setLayout(showproLayout);
        showproLayout.setHorizontalGroup(
            showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showproLayout.createSequentialGroup()
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showproLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showproLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(15, 15, 15)))
                            .addGroup(showproLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel56)))
                        .addGap(55, 55, 55)
                        .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(showproLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showproLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showproLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showproLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        showproLayout.setVerticalGroup(
            showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showproLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel27)
                .addGap(27, 27, 27)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        multi1.addTab("Profile", showpro);

        jPanel6.add(multi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, -41, 750, 730));

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

        signout.setBackground(new java.awt.Color(221, 221, 221));
        signout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        signout.setForeground(new java.awt.Color(0, 0, 255));
        signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/signout.png"))); // NOI18N
        signout.setText("Sign Out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        jPanel6.add(signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        h1.setBackground(new java.awt.Color(255, 0, 40));
        h1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h1MousePressed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/Homebig(1).png"))); // NOI18N
        Home.setText("Home");
        Home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout h1Layout = new javax.swing.GroupLayout(h1);
        h1.setLayout(h1Layout);
        h1Layout.setHorizontalGroup(
            h1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        h1Layout.setVerticalGroup(
            h1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 80));

        a2.setBackground(new java.awt.Color(255, 0, 40));

        addo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        addo.setForeground(new java.awt.Color(255, 255, 255));
        addo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/Create(2).png"))); // NOI18N
        addo.setText("Add Order");
        addo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout a2Layout = new javax.swing.GroupLayout(a2);
        a2.setLayout(a2Layout);
        a2Layout.setHorizontalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        a2Layout.setVerticalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 60));

        m3.setBackground(new java.awt.Color(255, 0, 40));

        manageo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        manageo.setForeground(new java.awt.Color(255, 255, 255));
        manageo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/manage.png"))); // NOI18N
        manageo.setText("Manage Orders");
        manageo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m3Layout = new javax.swing.GroupLayout(m3);
        m3.setLayout(m3Layout);
        m3Layout.setHorizontalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        m3Layout.setVerticalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 60));

        e5.setBackground(new java.awt.Color(255, 0, 40));

        eprofile.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        eprofile.setForeground(new java.awt.Color(255, 255, 255));
        eprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/edit.png"))); // NOI18N
        eprofile.setText("Edit Profile");
        eprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eprofileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eprofileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout e5Layout = new javax.swing.GroupLayout(e5);
        e5.setLayout(e5Layout);
        e5Layout.setHorizontalGroup(
            e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e5Layout.createSequentialGroup()
                .addComponent(eprofile)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        e5Layout.setVerticalGroup(
            e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, e5Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(eprofile))
        );

        jPanel6.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void phonenbrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonenbrFocusGained
        // TODO add your handling code here:
        if(phonenbr.getText().equals("Enter your Phone Number"))
        {
            phonenbr.setText("");
            phonenbr.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_phonenbrFocusGained

    private void phonenbrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonenbrFocusLost
        // TODO add your handling code here:
        if(phonenbr.getText().equals(""))
        {
            phonenbr.setText("Enter your Phone Number");
            phonenbr.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_phonenbrFocusLost

    private void phonenbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenbrActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
        if(type.getSelectedItem().equals("Non-Document"))
        {
            cat.addItem("Machinaries");
            cat.addItem("Clothes");
            cat.addItem("Digital Accesory");
            cat.addItem("Electric Device");
            cat.addItem("Food item");
            cat.addItem("Medical Supplies");
            cat.addItem("Donation Supplies");
        }
        else
        {
            cat.removeAllItems();
        }
    }//GEN-LAST:event_typeActionPerformed

    private void paymentvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentvarActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void receiverFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_receiverFocusGained
        if(receiver.getText().equals("Who will receive this?"))
        {
            receiver.setText("");
            receiver.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_receiverFocusGained

    private void receiverFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_receiverFocusLost
        // TODO add your handling code here:
        if(receiver.getText().equals(""))
        {
            receiver.setText("Who will receive this?");
            receiver.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_receiverFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
        if(address.getText().equals("--- Address  (In Detail) ---"))
        {
            address.setText("");
            address.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
        if(address.getText().equals(""))
        {
            address.setText("--- Address  (In Detail) ---");
            address.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addressFocusLost

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addressActionPerformed

    private void rocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketActionPerformed
        if(rocket.isSelected())
        {
            regular.setSelected(false);
        }
    }//GEN-LAST:event_rocketActionPerformed

    private void regularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularActionPerformed
        if(regular.isSelected())
        {
            rocket.setSelected(false);
        }
    }//GEN-LAST:event_regularActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        // String weight = (String) weight.getSelectedItem();
    }//GEN-LAST:event_loadActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     //
     // JOptionPane.showMessageDialog(this, "ekka");
        String url = "jdbc:mysql://localhost:3306/mysql";
String user = "root";
String password = "anik";

try (Connection connection = DriverManager.getConnection(url, user, password)) {
  /*  String createTableQuery = "CREATE TABLE order_table1(" +
        "id INT AUTO_INCREMENT PRIMARY KEY," +
        "source VARCHAR(255)," +
        "weight VARCHAR(255)," +
        "phone_no VARCHAR(255)," +
        "parcel_type VARCHAR(255)," +
        "name VARCHAR(255)," +
        "reciver_phone VARCHAR(255)," +
        "category VARCHAR(255)," +
        "destination VARCHAR(255)," +
        "home VARCHAR(255)," +
        "location VARCHAR(255)," +
        "delivery VARCHAR(255)," +
        "payment VARCHAR(255)" +
        ");";

     Statement createTableStatement = connection.createStatement();
    createTableStatement.executeUpdate(createTableQuery);
*/

    String from = source.getValue().toString();
    String weight = (String) load.getSelectedItem();
    // int weightInt = Integer.parseInt(weight);
    String phone_no = phonenbr.getText();
    String parcel_type = type.getSelectedItem().toString();
    String name = receiver.getText();
    String reciver_phone = rphn.getText();
    String category = cat.getSelectedItem().toString();
    String destination = area.getValue().toString();
    String home = HD.isSelected() ? "YES" : "NOT";
    String location = address.getText();
    String delivery;

    if (rocket.isSelected()) {
        delivery = "Rocket";
    } else {
        delivery = "Regular";
    }

    String payment = paymentvar.getSelectedItem().toString();

    String query = "INSERT INTO order_table1(source, weight, phone_no, parcel_type, name, reciver_phone, category, destination, home, location, delivery, payment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, from);
    preparedStatement.setString(2, weight);
    preparedStatement.setString(3, phone_no);
    preparedStatement.setString(4, parcel_type);
    preparedStatement.setString(5, name);
    preparedStatement.setString(6, reciver_phone);
    preparedStatement.setString(7, category);
    preparedStatement.setString(8, destination);
    preparedStatement.setString(9, home);
    preparedStatement.setString(10, location);
    preparedStatement.setString(11, delivery);
    preparedStatement.setString(12, payment);

    int rowsInserted = preparedStatement.executeUpdate();

    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, "Data added successfully");
    }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
      JOptionPane.showMessageDialog(this, "Failled");
}


    }//GEN-LAST:event_addActionPerformed

    private void rphnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rphnFocusGained
        if(rphn.getText().equals("Reciever's Number"))
        {
            rphn.setText("");
            rphn.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_rphnFocusGained

    private void rphnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rphnFocusLost
        if(rphn.getText().equals(""))
        {
            rphn.setText("Reciever's Number");
            rphn.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_rphnFocusLost

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        int total = 0 ;
        int subtotal = 0;
        int distance = 0;
        int unit = 0 ;
        if(load.getSelectedItem().equals("<5 Kg"))
        {
            unit = 30;
        }
        else if(load.getSelectedItem().equals("6-10 Kg"))
        {
            unit = 50;
        }
        else if(load.getSelectedItem().equals("11-50 Kg"))
        {
            unit = 70;
        }
        else if(load.getSelectedItem().equals("51-200 Kg"))
        {
            unit = 90;
        }
        
        

        if(area.getValue().equals("Dhaka") )
        {
            if(source.getValue().equals("Chittagong"))
            {
               distance = 3; 
            }
            else if(source.getValue().equals("Sylhet"))
            {
               distance = 4; 
            }
            else if(source.getValue().equals("Rajshahi"))
            {
               distance = 6; 
            }
            else if(source.getValue().equals("Khulna"))
            {
               distance = 4; 
            }
            else distance = 0;
        }
        else if(area.getValue().equals("Chittagong"))
        {
            if(source.getValue().equals("Dhaka"))
            {
               distance = 3; 
            }
            else if(source.getValue().equals("Sylhet"))
            {
               distance = 3; 
            }
            else if(source.getValue().equals("Rajshahi"))
            {
               distance = 8; 
            }
            else if(source.getValue().equals("Khulna"))
            {
               distance = 7; 
            }
            else distance = 0;
        }
        else if(area.getValue().equals("Sylhet"))
        {
            if(source.getValue().equals("Chittagong"))
            {
               distance = 3; 
            }
            else if(source.getValue().equals("Dhaka"))
            {
               distance = 4; 
            }
            else if(source.getValue().equals("Rajshahi"))
            {
               distance = 8; 
            }
            else if(source.getValue().equals("Khulna"))
            {
               distance = 8; 
            }
            else distance = 0;
        }
        else if(area.getValue().equals("Rajshahi"))
        {
            if(source.getValue().equals("Chittagong"))
            {
               distance = 8; 
            }
            else if(source.getValue().equals("Sylhet"))
            {
               distance = 8; 
            }
            else if(source.getValue().equals("Dhaka"))
            {
               distance = 6; 
            }
            else if(source.getValue().equals("Khulna"))
            {
               distance = 5; 
            }
            else distance = 0;
        }
        else if(area.getValue().equals("Khulna"))
        {
            if(source.getValue().equals("Chittagong"))
            {
               distance = 7; 
            }
            else if(source.getValue().equals("Sylhet"))
            {
               distance = 8; 
            }
            else if(source.getValue().equals("Rajshahi"))
            {
               distance = 5; 
            }
            else if(source.getValue().equals("Dhaka"))
            {
               distance = 4; 
            }
            else distance = 0;
        }

        if(rocket.isSelected())
        {
            total = distance*unit+100;
        }
        else if(regular.isSelected())
        {
            total = distance*unit;
        }
        if(HD.isSelected())
        {
            total = total + 50;
        }
        dcharge.setText(Double.toString(total));

    }//GEN-LAST:event_calculateActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "ekka");
        String url = "jdbc:mysql://localhost:3306/mysql";
String username = "root";
String dbPassword = "anik";
try {
    Connection connection = DriverManager.getConnection(url, username, dbPassword);

    String sql ="SELECT *FROM order_table1";
    PreparedStatement statement = connection.prepareStatement(sql);
 ResultSet resultSet=statement.executeQuery();
DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
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
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this, "sadik");
          //String orderId = jTextField3.getText();
            String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "anik";

        String orderId = jTextField3.getText();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM order_table1 WHERE id = ?"; // Change 'id' to your corresponding primary key column name

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, orderId);

            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data deleted successfully");
            } else {
                JOptionPane.showMessageDialog(this, "No data found for the given orderId");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
            JOptionPane.showMessageDialog(this, "Deletion failed");
        }
          
         
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this, "shible");
         String orderId = jTextField3.getText();
         String receiver = jTextField4.getText();
         String phone = jTextField5.getText();
         String status=jComboBox1.getSelectedItem().toString();
          String url = "jdbc:mysql://localhost:3306/mysql"; 
        String user = "root"; 
        String password = "anik";
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
           /* String createTableQuery = "CREATE TABLE order_status (" +
                    "orderId VARCHAR(255) PRIMARY KEY,"  +
                    "receiver VARCHAR(255)," +
                    "phone VARCHAR(255)," +
                    "status VARCHAR(255)" +
                    ");";
             PreparedStatement createTableStatement = connection.prepareStatement(createTableQuery);
            createTableStatement.executeUpdate();

*/

            String insertDataQuery = "INSERT INTO order_status(orderId, receiver, phone, status) VALUES (?, ?, ?, ?)";

          
            PreparedStatement insertDataStatement = connection.prepareStatement(insertDataQuery);
            insertDataStatement.setString(1, orderId);
            insertDataStatement.setString(2, receiver);
            insertDataStatement.setString(3, phone);
            insertDataStatement.setString(4, status);

            insertDataStatement.executeUpdate();

            //System.out.println("Data inserted successfully.");
            JOptionPane.showMessageDialog(this, "Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
         
         
         
//        System.out.println(orderId);   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         
         String offid = jTextField15.getText();
          String offname = jTextField12.getText();
           String offphone = jTextField8.getText();
           String offofice= jTextField13.getText();
            String offpass = jTextField10.getText();
            String offgender = jComboBox5.getSelectedItem().toString();
            
            String url = "jdbc:mysql://localhost:3306/mysql";
String user = "root";
String password = "anik"; 

try (Connection connection = DriverManager.getConnection(url, user, password)) {
    String query = "UPDATE official SET Name = ?, Phone_no = ?, Allocate_office = ?, Gender = ?, Password = ? WHERE id = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, offname);
    preparedStatement.setString(2, offphone);
    preparedStatement.setString(3, offofice);
    preparedStatement.setString(4, offgender);
    preparedStatement.setString(5, offpass);
    preparedStatement.setString(6, offid);

    int rowsUpdated = preparedStatement.executeUpdate();

    if (rowsUpdated > 0) {JOptionPane.showMessageDialog(this, "updated successfully!");
        
    } else {
        JOptionPane.showMessageDialog(this, "No record with the specified id was found.");
           }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
}
            
             
                   
                 
             
         
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        
        new Homepage().setVisible(true);
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_HomeMouseClicked

    private void addoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addoMouseClicked
        // TODO add your handling code here:
        multi1.setSelectedIndex(0);
    }//GEN-LAST:event_addoMouseClicked

    private void manageoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageoMouseClicked
        // TODO add your handling code here:
        multi1.setSelectedIndex(1);
    }//GEN-LAST:event_manageoMouseClicked

    private void eprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eprofileMouseClicked
        // TODO add your handling code here:
        multi1.setSelectedIndex(2);
    }//GEN-LAST:event_eprofileMouseClicked

    private void eprofileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eprofileMousePressed
        // TODO add your handling code here:
        h1.setBackground(dc);
        e5.setBackground(cc);
        a2.setBackground(dc);
        m3.setBackground(dc);
        eprofile.setForeground(dc);
        Home.setForeground(cc);
        addo.setForeground(cc);
        manageo.setForeground(cc);
        // oprofile.setForeground(cc);

        
        
    }//GEN-LAST:event_eprofileMousePressed

    private void h1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_h1MousePressed

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        // TODO add your handling code here:
        h1.setBackground(cc);
        e5.setBackground(dc);
        a2.setBackground(dc);
        m3.setBackground(dc);
        eprofile.setForeground(cc);
        Home.setForeground(dc);
        addo.setForeground(cc);
        manageo.setForeground(cc);
       
    }//GEN-LAST:event_HomeMousePressed

    private void addoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addoMousePressed
        // TODO add your handling code here:
       
        h1.setBackground(dc);
        e5.setBackground(dc);
        a2.setBackground(cc);
        m3.setBackground(dc);
        eprofile.setForeground(cc);
        Home.setForeground(cc);
        addo.setForeground(dc);
        manageo.setForeground(cc);
        
        
    }//GEN-LAST:event_addoMousePressed

    private void manageoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageoMousePressed
        // TODO add your handling code here:
        
        h1.setBackground(dc);
        e5.setBackground(dc);
        a2.setBackground(dc);
        m3.setBackground(cc);
        eprofile.setForeground(cc);
        Home.setForeground(cc);
        addo.setForeground(cc);
        manageo.setForeground(dc);
        
        
    }//GEN-LAST:event_manageoMousePressed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Loginofficials().setVisible(true);
        dispose();
    }//GEN-LAST:event_signoutActionPerformed

    private void addoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addoMouseEntered

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new officials().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox HD;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel a2;
    private javax.swing.JButton add;
    private javax.swing.JLabel addo;
    private javax.swing.JPanel addor;
    private javax.swing.JTextField address;
    private javax.swing.JSpinner area;
    private javax.swing.JButton calculate;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JLabel charge;
    private javax.swing.JLabel dcharge;
    private javax.swing.JPanel e5;
    private javax.swing.JPanel editoffi;
    private javax.swing.JLabel eprofile;
    private javax.swing.JPanel h1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> load;
    private javax.swing.JPanel m3;
    private javax.swing.JLabel manageo;
    private javax.swing.JPanel manageor;
    private javax.swing.JTabbedPane multi1;
    private javax.swing.JComboBox<String> paymentvar;
    private javax.swing.JTextField phonenbr;
    private javax.swing.JLabel pstatus;
    private javax.swing.JTextField receiver;
    private javax.swing.JRadioButton regular;
    private javax.swing.JRadioButton rocket;
    private javax.swing.JTextField rphn;
    private javax.swing.JPanel showpro;
    private javax.swing.JButton signout;
    private javax.swing.JSpinner source;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
