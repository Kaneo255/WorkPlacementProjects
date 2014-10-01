/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author James Cosgrave
 */
public class MathsLocation extends javax.swing.JFrame {

    /**
     * Creates new form MathsLocation
     */
    public MathsLocation() {
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

        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        homeBtn = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        tableLbl = new javax.swing.JLabel();
        lectureLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Home.png"))); // NOI18N
        homeBtn.setOpaque(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        homeBtn.setBounds(10, 60, 50, 40);
        jLayeredPane1.add(homeBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Arrow.png"))); // NOI18N
        BackBTN.setText("Back");
        BackBTN.setMaximumSize(new java.awt.Dimension(300, 500));
        BackBTN.setOpaque(false);
        BackBTN.setPreferredSize(new java.awt.Dimension(300, 500));
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        BackBTN.setBounds(10, 450, 80, 40);
        jLayeredPane1.add(BackBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableLbl.setText("<html>   <style> td  { background-color:#bff662;  font-weight:bold; font-size:12;  }  </style>   <table style=\"background-color:#;\" border=\"0\" cellspacing=\"5\" cellpadding=\"5\">    <tr align=\"center\" style=\" color:red;\">  <td style=\"  background-color:white; \" > Day </td>  <td style=\"  background-color:white; \" >  Room </td>  <td style=\"  background-color:white; \" >  Modulel </td>  <td style=\"  background-color:white; \" >  Lecturer </td>    </tr>   <tr align=\"center\" >   <td> Tuesday </td>  <td> SCR1 1.01 3.02  </td>  <td> Support Workshop </td>  <td> Jonathan Lambert </td>   </tr>  <tr align=\"center\"  >   <td> Thursday </td>  <td>3.02 </td>  <td> Support Workshop </td>  <td>Jonathan Lambert </td>   </tr>     </tr>  <tr align=\"center\"  >   <td> Friday </td>  <td>Theatre 2 <br></br> 3.08 </td>  <td> Support Workshop </td>  <td>Jonathan Lambert </td>   </tr>      </table>      </html> ");
        tableLbl.setBounds(0, 120, 300, 320);
        jLayeredPane1.add(tableLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lectureLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lectureLbl.setForeground(new java.awt.Color(255, 255, 255));
        lectureLbl.setText("Lecture Locations");
        lectureLbl.setBounds(70, 120, 220, 50);
        jLayeredPane1.add(lectureLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/bg5 (1).jpg"))); // NOI18N
        backgroundLbl.setBounds(0, -6, 300, 510);
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

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.setVisible(false);
        MainHome myMain = new MainHome();
        myMain.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        this.setVisible(false);
        MathsHome myMaths = new MathsHome();
        myMaths.setVisible(true);
    }//GEN-LAST:event_BackBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MathsLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathsLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathsLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathsLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathsLocation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lectureLbl;
    private javax.swing.JLabel tableLbl;
    // End of variables declaration//GEN-END:variables
}