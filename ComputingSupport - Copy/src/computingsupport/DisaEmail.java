/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author James Cosgrave
 */
public class DisaEmail extends javax.swing.JFrame implements Serializable {

    private ArrayList<Mail> aList;
    private String Name;
    private String Assistance;
    private String StudentID;
    private String To;
    private String Subject;
    private String Mail;
    private int count;

    public DisaEmail() {
        initComponents();
        setLocationRelativeTo(null);
        aList = new ArrayList<>();
        Name = new String();
        Assistance = new String();
        StudentID = new String();
        To = new String();
        Subject = new String();
        Mail = new String();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MailTF = new javax.swing.JTextArea();
        IDTF = new javax.swing.JTextField();
        AssisTF = new javax.swing.JTextField();
        SubjectTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        ToTF = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Sent = new javax.swing.JButton();
        HomeBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID:");
        jLabel1.setBounds(10, 150, 110, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject:");
        jLabel3.setBounds(10, 290, 90, 30);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jLabel4.setBounds(10, 110, 90, 30);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To:");
        jLabel5.setBounds(10, 240, 90, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Assistance:");
        jLabel6.setBounds(10, 190, 90, 30);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MailTF.setColumns(20);
        MailTF.setRows(5);
        jScrollPane1.setViewportView(MailTF);

        jScrollPane1.setBounds(10, 330, 280, 110);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        IDTF.setBounds(110, 150, 180, 30);
        jLayeredPane1.add(IDTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AssisTF.setBounds(110, 190, 180, 30);
        jLayeredPane1.add(AssisTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SubjectTF.setBounds(110, 290, 180, 30);
        jLayeredPane1.add(SubjectTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });
        NameTF.setBounds(110, 110, 180, 30);
        jLayeredPane1.add(NameTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ToTF.setBounds(110, 240, 180, 30);
        jLayeredPane1.add(ToTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Send.png"))); // NOI18N
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        Send.setBounds(10, 450, 80, 40);
        jLayeredPane1.add(Send, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Cancel.png"))); // NOI18N
        Cancel.setBounds(110, 450, 80, 40);
        jLayeredPane1.add(Cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Sent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/SamSent.png"))); // NOI18N
        Sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SentActionPerformed(evt);
            }
        });
        Sent.setBounds(210, 450, 80, 40);
        jLayeredPane1.add(Sent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        HomeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Home.png"))); // NOI18N
        HomeBTN.setOpaque(false);
        HomeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBTNActionPerformed(evt);
            }
        });
        HomeBTN.setBounds(10, 50, 50, 50);
        jLayeredPane1.add(HomeBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computingsupport/Layer 2.jpg"))); // NOI18N
        jLabel7.setBounds(0, 0, 300, 500);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed

        Name = NameTF.getText();
        Assistance = AssisTF.getText();
        StudentID = IDTF.getText();
        To = ToTF.getText();
        Subject = SubjectTF.getText();
        Mail = MailTF.getText();

        Mail m = new Mail();

        m.setName(Name);
        m.setAssistance(Assistance);
        m.setStudentID(StudentID);
        m.setTo(To);
        m.setSubject(Subject);
        m.setMail(Mail);

        aList.add(m);
        count++;

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("output.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(aList);

            JOptionPane.showMessageDialog(null, "File written successfully");

            oStream.close();

        } catch (IOException e) {
            System.out.println(e);
        }





    }//GEN-LAST:event_SendActionPerformed

    private void SentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SentActionPerformed

        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("output.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<Mail> aList;
            aList = (ArrayList<Mail>) oStream.readObject();
            for (Mail a : aList) {
            }

            for (int i = 0; i < aList.size(); i++) {
                JOptionPane.showMessageDialog(null, " Name: " + aList.get(i).getName() + "\n Assistance: " + aList.get(i).getAssistance() + "\n Students ID: " + aList.get(i).getStudentID() + "\n\n Mail: " + aList.get(i).getMail());
            }

            oStream.close();


    }//GEN-LAST:event_SentActionPerformed
    catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    private void HomeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBTNActionPerformed
        this.setVisible(false);
        MainHome myMain = new MainHome();
        myMain.setVisible(true);
    }//GEN-LAST:event_HomeBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisaEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisaEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisaEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisaEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisaEmail().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AssisTF;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton HomeBTN;
    private javax.swing.JTextField IDTF;
    private javax.swing.JTextArea MailTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton Send;
    private javax.swing.JButton Sent;
    private javax.swing.JTextField SubjectTF;
    private javax.swing.JTextField ToTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
