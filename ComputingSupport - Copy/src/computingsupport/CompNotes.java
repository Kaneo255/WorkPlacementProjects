/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author James Cosgrave
 */
public class CompNotes extends javax.swing.JFrame {

    /**
     * Creates new form CompNotes
     */
    public CompNotes() {
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
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        NotesText = new javax.swing.JLabel();
        BackBTN1 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        CompArcBTN = new javax.swing.JButton();
        MultimediaBTN = new javax.swing.JButton();
        ProgrammingBTN = new javax.swing.JButton();
        OperatingBTN = new javax.swing.JButton();
        HTMLBTN = new javax.swing.JButton();
        RequestNotesBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        BackBTN.setMaximumSize(new java.awt.Dimension(300, 500));
        BackBTN.setOpaque(false);
        BackBTN.setPreferredSize(new java.awt.Dimension(300, 500));
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        NotesText.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        NotesText.setForeground(new java.awt.Color(255, 255, 255));
        NotesText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Notes (3).gif"))); // NOI18N
        NotesText.setBounds(200, 100, 100, 30);
        jLayeredPane1.add(NotesText, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        CompArcBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/CompArc.png"))); // NOI18N
        CompArcBTN.setOpaque(false);
        CompArcBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompArcBTNActionPerformed(evt);
            }
        });
        CompArcBTN.setBounds(50, 190, 190, 40);
        jLayeredPane1.add(CompArcBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MultimediaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/MultiMedia.png"))); // NOI18N
        MultimediaBTN.setOpaque(false);
        MultimediaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultimediaBTNActionPerformed(evt);
            }
        });
        MultimediaBTN.setBounds(50, 240, 190, 40);
        jLayeredPane1.add(MultimediaBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ProgrammingBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Programming.png"))); // NOI18N
        ProgrammingBTN.setOpaque(false);
        ProgrammingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgrammingBTNActionPerformed(evt);
            }
        });
        ProgrammingBTN.setBounds(50, 290, 190, 40);
        jLayeredPane1.add(ProgrammingBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        OperatingBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Operating Systems.png"))); // NOI18N
        OperatingBTN.setOpaque(false);
        OperatingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatingBTNActionPerformed(evt);
            }
        });
        OperatingBTN.setBounds(50, 340, 190, 40);
        jLayeredPane1.add(OperatingBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        HTMLBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/HTML&.png"))); // NOI18N
        HTMLBTN.setOpaque(false);
        HTMLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTMLBTNActionPerformed(evt);
            }
        });
        HTMLBTN.setBounds(50, 140, 190, 40);
        jLayeredPane1.add(HTMLBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        RequestNotesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Request Notes.png"))); // NOI18N
        RequestNotesBtn.setOpaque(false);
        RequestNotesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestNotesBtnActionPerformed(evt);
            }
        });
        RequestNotesBtn.setBounds(20, 400, 260, 40);
        jLayeredPane1.add(RequestNotesBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        this.setVisible(false);
        ComputingHome myHome = new ComputingHome();
        myHome.setVisible(true);
    }//GEN-LAST:event_BackBTNActionPerformed

    private void BackBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTN1ActionPerformed
        this.setVisible(false);
        ComputingHome myHome = new ComputingHome();
        myHome.setVisible(true);
    }//GEN-LAST:event_BackBTN1ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.setVisible(false);
        MainHome myMain = new MainHome();
        myMain.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void HTMLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTMLBTNActionPerformed
        this.setVisible(false);
        HTML myHtml = new HTML();
        myHtml.setVisible(true);

    }//GEN-LAST:event_HTMLBTNActionPerformed

    private void CompArcBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompArcBTNActionPerformed
        this.setVisible(false);
        ArcNotes myArc = new ArcNotes();
        myArc.setVisible(true);

    }//GEN-LAST:event_CompArcBTNActionPerformed

    private void MultimediaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultimediaBTNActionPerformed
        this.setVisible(false);
        MultiMediaNotes myMulti = new MultiMediaNotes();
        myMulti.setVisible(true);
    }//GEN-LAST:event_MultimediaBTNActionPerformed

    private void ProgrammingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammingBTNActionPerformed
        this.setVisible(false);
        Programming myProgram = new Programming();
        myProgram.setVisible(true);
    }//GEN-LAST:event_ProgrammingBTNActionPerformed

    private void OperatingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperatingBTNActionPerformed
        this.setVisible(false);
        Operate myOperate = new Operate();
        myOperate.setVisible(true);

    }//GEN-LAST:event_OperatingBTNActionPerformed

    private void RequestNotesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestNotesBtnActionPerformed

        this.setVisible(false);
        RequestNotes myRequest = new RequestNotes();
        myRequest.setVisible(true);

    }//GEN-LAST:event_RequestNotesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CompNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompNotes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JButton BackBTN1;
    private javax.swing.JButton CompArcBTN;
    private javax.swing.JButton HTMLBTN;
    private javax.swing.JButton MultimediaBTN;
    private javax.swing.JLabel NotesText;
    private javax.swing.JButton OperatingBTN;
    private javax.swing.JButton ProgrammingBTN;
    private javax.swing.JButton RequestNotesBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}