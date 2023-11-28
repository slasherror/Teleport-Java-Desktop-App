
package cse2200;


public class Homepage extends javax.swing.JFrame {

    
    public Homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        goadmin = new javax.swing.JLabel();
        goofficial = new javax.swing.JLabel();
        track1 = new javax.swing.JLabel();
        charge = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 0, 40));

        jLabel2.setBackground(new java.awt.Color(255, 245, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/icon.jpg"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 245, 240));
        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TeLePorT 24/7");

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/cross.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("HomePage");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(326, 326, 326)
                .addComponent(x))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        goadmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        goadmin.setForeground(new java.awt.Color(0, 0, 153));
        goadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/admin.png"))); // NOI18N
        goadmin.setText("ADMIN");
        goadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goadminMouseClicked(evt);
            }
        });

        goofficial.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        goofficial.setForeground(new java.awt.Color(0, 0, 153));
        goofficial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/employee.png"))); // NOI18N
        goofficial.setText("Officials");
        goofficial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goofficialMouseClicked(evt);
            }
        });

        track1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        track1.setForeground(new java.awt.Color(0, 0, 153));
        track1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        track1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/track.png"))); // NOI18N
        track1.setText("Track Your Product");
        track1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                track1MouseClicked(evt);
            }
        });

        charge.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        charge.setForeground(new java.awt.Color(0, 0, 153));
        charge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        charge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/price.png"))); // NOI18N
        charge.setText("Delivery Charge list");
        charge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chargeMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse2200/about us.png"))); // NOI18N
        jLabel19.setText("about us");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(goadmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goofficial)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(track1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(charge)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goofficial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(track1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void goadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goadminMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_goadminMouseClicked

    private void goofficialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goofficialMouseClicked
        // TODO add your handling code here:
        new Loginofficials().setVisible(true);
        dispose();
    }//GEN-LAST:event_goofficialMouseClicked

    private void track1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_track1MouseClicked
        // TODO add your handling code here:
        new Track().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_track1MouseClicked

    private void chargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chargeMouseClicked
        // TODO add your handling code here:
        new Show().setVisible(true);
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_chargeMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        new about().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel charge;
    private javax.swing.JLabel goadmin;
    private javax.swing.JLabel goofficial;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel track1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
