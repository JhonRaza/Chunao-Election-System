/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon Raza
 */
public class AdminSign extends javax.swing.JFrame {

    /**
     * Creates new form AdminSign
     */
    public AdminSign() {
        initComponents();
        this.setLocation(400, 170);
        this.pack();
        this.setSize(856,630);
        ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img4.png")));
        Image img4 = img3.getImage();
        Image img5 = img4.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon c = new ImageIcon(img5);
        jLabel2.setIcon(c);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img4.png")));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LoginAct = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(109, 33, 79));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chunao");
        jLabel1.setToolTipText("");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER YOUR NAME");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENTER YOUR EMAIL-ADDRESS");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YOUR USERNAME");

        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jPasswordField3.setText("jPasswordField1");
        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseClicked(evt);
            }
        });
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER A PASSWORD");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RE-TYPE YOUR PASSWORD");

        LoginAct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginAct.setForeground(new java.awt.Color(255, 255, 255));
        LoginAct.setText("Already a member? Click here to login");
        LoginAct.setToolTipText("tap to log in");
        LoginAct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginActMouseClicked(evt);
            }
        });

        signUpButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signUpButton.setText("Sign-up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BECOME");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("A");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTROLLER");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("WRONG PLACE?");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CLICK HERE");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(0, 221, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LoginAct)
                                .addGap(124, 124, 124)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(signUpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LoginAct)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(105, 105, 105))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked

    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed

    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3MouseClicked

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void LoginActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginActMouseClicked
        
        this.dispose();
        LogInForm o = new LogInForm();
        o.setVisible(true);
    }//GEN-LAST:event_LoginActMouseClicked

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        File tempFile = new File(jTextField3.getText() + ".txt");
        Scanner nine = new Scanner(System.in);
        boolean exists = tempFile.exists();
        if (!exists) {
                if (this.jTextField2.getText().matches("\\w.*@.*mail.com")) {
                        if (this.jPasswordField2.getText().matches(".*\\d{2}.*")) {
                            if (this.jPasswordField2.getText().matches(".*\\W{1,}.*")) {
                                if (this.jPasswordField2.getText().length() >= 8) {
                                    if (this.jPasswordField2.getText().equals(this.jPasswordField3.getText())) {
                                        try {
                                            String username = this.jTextField3.getText();
                                            File file = new File(this.jTextField3.getText() + ".txt"); //creates a file in the project for the user, with the username
                                            try {
                                                BufferedWriter writer;
                                                writer = new BufferedWriter(new FileWriter(file));
                                                writer.append(this.jTextField3.getText()); //saves username
                                                writer.newLine();
                                                writer.append(this.jTextField2.getText()); //saves email
                                                writer.newLine();
                                                writer.append(this.jPasswordField2.getText()); //saves the password
                                                writer.newLine();
                                                writer.append(this.jTextField1.getText()); //saves the name of the user
                                                writer.newLine();
                                                writer.flush();
                                                this.dispose();
                                            } catch (IOException ex) {
                                                Logger.getLogger(AdminSign.class.getName()).log(Level.SEVERE, null, ex);
                                                this.dispose();
                                                file.delete();
                                            }
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(this, "Couldn't create a file", "Error", JOptionPane.ERROR_MESSAGE);
                                            this.dispose();
                                        }
                                        Success_Sign_Up good = new Success_Sign_Up();
                                        good.setVisible(!exists);
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(this, "Two passwords don't match", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Password must contain atleast 8 characters", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Password must contain atleast 1 special character", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Password must contain atleast 2 digits", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Enter a valid Email Address", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        SignUpForm one = new SignUpForm();
        this.dispose();
        one.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(AdminSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    protected javax.swing.JTextField jTextField3;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}
