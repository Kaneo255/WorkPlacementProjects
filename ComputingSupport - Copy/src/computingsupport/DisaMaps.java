/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author Sam Gormley
 */
public class DisaMaps extends javax.swing.JFrame {

    /**
     * Creates new form DisaMaps
     */
    public DisaMaps() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBTN = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        FourthFloorBtn = new javax.swing.JButton();
        BasementBtn = new javax.swing.JButton();
        GroundFloorBtn = new javax.swing.JButton();
        SecondFloorBtn = new javax.swing.JButton();
        FirstFloorBtn = new javax.swing.JButton();
        ThirdFloorBtn = new javax.swing.JButton();
        BackBTN1 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        mapsLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        BackBTN.setMaximumSize(new java.awt.Dimension(300, 500));
        BackBTN.setOpaque(false);
        BackBTN.setPreferredSize(new java.awt.Dimension(300, 500));
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FourthFloorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Fourth.png"))); // NOI18N
        FourthFloorBtn.setOpaque(false);
        FourthFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthFloorBtnActionPerformed(evt);
            }
        });
        FourthFloorBtn.setBounds(20, 160, 130, 60);
        jLayeredPane1.add(FourthFloorBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BasementBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Bassment.png"))); // NOI18N
        BasementBtn.setOpaque(false);
        BasementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasementBtnActionPerformed(evt);
            }
        });
        BasementBtn.setBounds(160, 300, 130, 60);
        jLayeredPane1.add(BasementBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        GroundFloorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Gf.png"))); // NOI18N
        GroundFloorBtn.setOpaque(false);
        GroundFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroundFloorBtnActionPerformed(evt);
            }
        });
        GroundFloorBtn.setBounds(20, 300, 130, 60);
        jLayeredPane1.add(GroundFloorBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SecondFloorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/SF.png"))); // NOI18N
        SecondFloorBtn.setOpaque(false);
        SecondFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondFloorBtnActionPerformed(evt);
            }
        });
        SecondFloorBtn.setBounds(20, 230, 130, 60);
        jLayeredPane1.add(SecondFloorBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FirstFloorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/FF.png"))); // NOI18N
        FirstFloorBtn.setOpaque(false);
        FirstFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstFloorBtnActionPerformed(evt);
            }
        });
        FirstFloorBtn.setBounds(160, 230, 130, 60);
        jLayeredPane1.add(FirstFloorBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThirdFloorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/TF.png"))); // NOI18N
        ThirdFloorBtn.setOpaque(false);
        ThirdFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdFloorBtnActionPerformed(evt);
            }
        });
        ThirdFloorBtn.setBounds(160, 160, 130, 60);
        jLayeredPane1.add(ThirdFloorBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BackBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Arrow.png"))); // NOI18N
        BackBTN1.setMaximumSize(new java.awt.Dimension(300, 500));
        BackBTN1.setOpaque(false);
        BackBTN1.setPreferredSize(new java.awt.Dimension(300, 500));
        BackBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTN1ActionPerformed(evt);
            }
        });
        BackBTN1.setBounds(10, 450, 80, 40);
        jLayeredPane1.add(BackBTN1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Home.png"))); // NOI18N
        homeBtn.setOpaque(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        homeBtn.setBounds(10, 60, 50, 50);
        jLayeredPane1.add(homeBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mapsLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        mapsLbl.setForeground(new java.awt.Color(255, 255, 255));
        mapsLbl.setText("MAPS");
        mapsLbl.setBounds(190, 100, 190, 50);
        jLayeredPane1.add(mapsLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Layer 2.jpg"))); // NOI18N
        backgroundLbl.setBounds(0, 0, 300, 500);
        jLayeredPane1.add(backgroundLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FourthFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthFloorBtnActionPerformed
        this.setVisible(false);
        Fourth myFourth = new Fourth();
        myFourth.setVisible(true);
    }//GEN-LAST:event_FourthFloorBtnActionPerformed

    private void BasementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasementBtnActionPerformed
        this.setVisible(false);
        Bassment myBass = new Bassment();
        myBass.setVisible(true);
    }//GEN-LAST:event_BasementBtnActionPerformed

    private void GroundFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroundFloorBtnActionPerformed
        this.setVisible(false);
        Ground myGround = new Ground();
        myGround.setVisible(true);
    }//GEN-LAST:event_GroundFloorBtnActionPerformed

    private void SecondFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondFloorBtnActionPerformed
        this.setVisible(false);
        Second mySecond = new Second();
        mySecond.setVisible(true);
    }//GEN-LAST:event_SecondFloorBtnActionPerformed

    private void FirstFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstFloorBtnActionPerformed
        this.setVisible(false);
        First myFirst = new First();
        myFirst.setVisible(true);
    }//GEN-LAST:event_FirstFloorBtnActionPerformed

    private void ThirdFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdFloorBtnActionPerformed
        this.setVisible(false);
        Third myThird = new Third();
        myThird.setVisible(true);
    }//GEN-LAST:event_ThirdFloorBtnActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        this.setVisible(false);
        DisaHome myDHome = new DisaHome();
        myDHome.setVisible(true);
    }//GEN-LAST:event_BackBTNActionPerformed

    private void BackBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTN1ActionPerformed
        this.setVisible(false);
        DisaHome myDHome = new DisaHome();
        myDHome.setVisible(true);
    }//GEN-LAST:event_BackBTN1ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.setVisible(false);
        MainHome myMain = new MainHome();
        myMain.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DisaMaps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisaMaps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisaMaps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisaMaps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisaMaps().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JButton BackBTN1;
    private javax.swing.JButton BasementBtn;
    private javax.swing.JButton FirstFloorBtn;
    private javax.swing.JButton FourthFloorBtn;
    private javax.swing.JButton GroundFloorBtn;
    private javax.swing.JButton SecondFloorBtn;
    private javax.swing.JButton ThirdFloorBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel mapsLbl;
    // End of variables declaration//GEN-END:variables
}