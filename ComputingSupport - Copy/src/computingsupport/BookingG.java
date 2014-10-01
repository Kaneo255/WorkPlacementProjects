/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author James Cosgrave
 */
public class BookingG extends javax.swing.JFrame {

    private ArrayList<Booking> aList;
    private String Name;
    private String StudentNumber;
    private String Module;
    private String ProblemArea;
    private int count;

    public BookingG() {
        initComponents();
        setLocationRelativeTo(null);
        aList = new ArrayList<>();
        Name = new String();
        StudentNumber = new String();
        Module = new String();
        ProblemArea = new String();
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        NameTF = new javax.swing.JTextField();
        NameLbl = new javax.swing.JLabel();
        StudentNumberTF = new javax.swing.JTextField();
        StudentNumberLbl = new javax.swing.JLabel();
        moduleLbl = new javax.swing.JLabel();
        ModuleTF = new javax.swing.JTextField();
        ProblemAreaLbl = new javax.swing.JLabel();
        ProblemAreaTF = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        DisplayAllBtn = new javax.swing.JButton();
        SULbl = new javax.swing.JLabel();
        GmailLbl = new javax.swing.JLabel();
        TwitterLbl = new javax.swing.JLabel();
        FacebookLbl = new javax.swing.JLabel();
        BookingAppointmentLbl = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        NameTF.setBounds(120, 140, 170, 30);
        jLayeredPane1.add(NameTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NameLbl.setBackground(new java.awt.Color(255, 255, 255));
        NameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("Name:");
        NameLbl.setBounds(10, 140, 110, 20);
        jLayeredPane1.add(NameLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        StudentNumberTF.setBounds(120, 180, 170, 30);
        jLayeredPane1.add(StudentNumberTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        StudentNumberLbl.setBackground(new java.awt.Color(255, 255, 255));
        StudentNumberLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StudentNumberLbl.setForeground(new java.awt.Color(255, 255, 255));
        StudentNumberLbl.setText("Student ID:");
        StudentNumberLbl.setBounds(10, 180, 120, 17);
        jLayeredPane1.add(StudentNumberLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        moduleLbl.setBackground(new java.awt.Color(255, 255, 255));
        moduleLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        moduleLbl.setForeground(new java.awt.Color(255, 255, 255));
        moduleLbl.setText("Module:");
        moduleLbl.setBounds(10, 230, 80, 17);
        jLayeredPane1.add(moduleLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModuleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuleTFActionPerformed(evt);
            }
        });
        ModuleTF.setBounds(120, 220, 170, 30);
        jLayeredPane1.add(ModuleTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ProblemAreaLbl.setBackground(new java.awt.Color(255, 255, 255));
        ProblemAreaLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProblemAreaLbl.setForeground(new java.awt.Color(255, 255, 255));
        ProblemAreaLbl.setText("Problem Area:");
        ProblemAreaLbl.setBounds(10, 270, 110, 17);
        jLayeredPane1.add(ProblemAreaLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ProblemAreaTF.setBounds(120, 270, 170, 30);
        jLayeredPane1.add(ProblemAreaTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/ADD.png"))); // NOI18N
        AddBtn.setOpaque(false);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        AddBtn.setBounds(10, 360, 80, 40);
        jLayeredPane1.add(AddBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Clear2.png"))); // NOI18N
        ClearBtn.setOpaque(false);
        ClearBtn.setBounds(100, 360, 80, 40);
        jLayeredPane1.add(ClearBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        DisplayAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/SamSent.png"))); // NOI18N
        DisplayAllBtn.setOpaque(false);
        DisplayAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllBtnActionPerformed(evt);
            }
        });
        DisplayAllBtn.setBounds(200, 360, 80, 40);
        jLayeredPane1.add(DisplayAllBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SULbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/SU.png"))); // NOI18N
        SULbl.setText("SU");
        SULbl.setBounds(240, 430, 50, 50);
        jLayeredPane1.add(SULbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        GmailLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/goo.png"))); // NOI18N
        GmailLbl.setText("Gmail");
        GmailLbl.setBounds(90, 430, 50, 50);
        jLayeredPane1.add(GmailLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TwitterLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/tw.png"))); // NOI18N
        TwitterLbl.setText("Twitter");
        TwitterLbl.setBounds(170, 430, 50, 50);
        jLayeredPane1.add(TwitterLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FacebookLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/fb.png"))); // NOI18N
        FacebookLbl.setText("Facebook");
        FacebookLbl.setBounds(10, 430, 50, 50);
        jLayeredPane1.add(FacebookLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BookingAppointmentLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BookingAppointmentLbl.setForeground(new java.awt.Color(255, 255, 255));
        BookingAppointmentLbl.setText("Booking Appointment");
        BookingAppointmentLbl.setBounds(120, 110, 171, 22);
        jLayeredPane1.add(BookingAppointmentLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Home.png"))); // NOI18N
        home.setOpaque(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        home.setBounds(10, 60, 50, 50);
        jLayeredPane1.add(home, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Layer 2.jpg"))); // NOI18N
        jLabel2.setBounds(0, 0, 300, 500);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void ModuleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModuleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModuleTFActionPerformed

    private void DisplayAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllBtnActionPerformed
        for (int i = 0; i < aList.size(); i++) {
            JOptionPane.showMessageDialog(null, " Name: " + aList.get(i).getName() + "\n\n Student ID: " + aList.get(i).getStudentNumber() + "\n\n Module: " + aList.get(i).getModule() + "\n\n ProblemArea: " + aList.get(i).getProblemArea() );
        }    }//GEN-LAST:event_DisplayAllBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
         //Makes home button visible - brings back to home page
        this.setVisible(false);
        LearnHome myLearn = new LearnHome();
        myLearn.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void FacebookLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookLblMouseClicked
        //Brings you to facebook page
        try {
            String URL = "www.facebook.com/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_FacebookLblMouseClicked

    private void GmailLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GmailLblMouseClicked
        //Brings you to gmail page
        try {
            String URL = "www.gmail.com";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_GmailLblMouseClicked

    private void TwitterLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterLblMouseClicked
        //Brings you to twitter page
        try {
            String URL = "www.twitter.com/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_TwitterLblMouseClicked

    private void SULblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SULblMouseClicked
        //Brings you to SU page
        try {
            String URL = "www.ncisu.ie/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_SULblMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
          File outFile;        
          FileWriter fw;        
          BufferedWriter bw;        
          String notes = NameTF.getText();
                         StudentNumberTF.getText(); 
                         ModuleTF.getText();
                         ProblemAreaTF.getText();
          
          try {            
          outFile = new File("Notes.txt");            
          fw = new FileWriter(outFile, false);            
          bw = new BufferedWriter(fw);            
          bw.write(notes);            
          bw.newLine();            
          bw.close(); 
        
           JOptionPane.showMessageDialog(null, "Your Notes have been saved.");        
           } catch (IOException e) {            
           System.out.println("Error cannot write to Learning Notes: " + e);        }
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void StudentNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNumberTFActionPerformed

    private void ProblemAreaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProblemAreaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProblemAreaTFActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed

        Name = NameTF.getText();
        StudentNumber = StudentNumberTF.getText();
        Module = ModuleTF.getText();
        ProblemArea = ProblemAreaTF.getText();

        Booking b = new Booking();

        b.setName(Name);
        b.setStudentNumber(StudentNumber);
        b.setModule(Module);
        b.setProblemArea(ProblemArea);

        aList.add(b);
        count++;
    }//GEN-LAST:event_AddBtnActionPerformed
    
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {
this.setVisible(false);
MainHome myMain = new MainHome();
myMain.setVisible(true);}
    
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
            java.util.logging.Logger.getLogger(BookingG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookingG().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel BookingAppointmentLbl;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DisplayAllBtn;
    private javax.swing.JLabel FacebookLbl;
    private javax.swing.JLabel GmailLbl;
    private javax.swing.JTextField ModuleTF;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTF;
    private javax.swing.JLabel ProblemAreaLbl;
    private javax.swing.JTextField ProblemAreaTF;
    private javax.swing.JLabel SULbl;
    private javax.swing.JLabel StudentNumberLbl;
    private javax.swing.JTextField StudentNumberTF;
    private javax.swing.JLabel TwitterLbl;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel moduleLbl;
    // End of variables declaration//GEN-END:variables
}