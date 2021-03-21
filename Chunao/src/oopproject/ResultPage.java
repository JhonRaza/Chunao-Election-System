/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Jhon Raz
 */
public class ResultPage extends javax.swing.JFrame {

    /**
     * Creates new form ResultPage
     */
    public ResultPage() {
        initComponents();
        this.setLocation(450, 170);
        this.pack();
        this.setSize(750, 645);
        ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img4.png")));
        Image img4 = img3.getImage();
        Image img5 = img4.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon c = new ImageIcon(img5);
        jLabel3.setIcon(c);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img4.png")));
        
       int vp1 = 0; int vp2 = 0; int vp3  = 0;
       int cfo1= 0 ; int cfo2 = 0 ;
       int gs1= 0 ; int gs2= 0 ;
       int cc1= 0 ; int cc2= 0 ; int cc3 = 0 ;
       int vpw = 0;
       int cfow = 0;
       int gsw = 0;
       int ccw = 0;
       int vpl1 = 0;
       int vpl2 = 0;
       int cfol1 = 0;
       int gsl1 = 0;
       int ccl1 = 0;
       int ccl2 = 0;       
       String win1 = "";
       String win2 = "";
       String win3 = "";
       String win4 = "";
       String loss11 = "";
       String loss12 = "";
       String loss21 = "";
       String loss31 = "";
       String loss41 = "";
       String loss42 = "";
       File f1 = new File("VP.txt");
        Scanner vp;
        try {
            vp = new Scanner(f1);
            while(vp.hasNext()){
           String s1 = vp.nextLine();
           if (s1.equals("Bilal")){
               vp1++ ;
           }
           if (s1.equals("Daniyal")){
               vp2++ ;
           }
           if (s1.equals("Amin")){
               vp3++ ;
           }
           
       }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        File f2 = new File("GS.txt");
        Scanner cfo;
        try {
            cfo = new Scanner(f2);
            while(cfo.hasNext()){
           String s2 = cfo.nextLine();
           if (s2.equals("Azeem ul Hassan")){
               cfo1++ ;
           }
           if (s2.equals("Asad Siddiqui")){
               cfo2++ ;
           }
       }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       File f3 = new File("CFO.txt");
       Scanner gs;
        try {
            gs = new Scanner(f3);
            while(gs.hasNext()){
           String s3 = gs.nextLine();
           if (s3.equals("Kunal")){
               gs1++ ;
           }
           if (s3.equals("Hafsa")){
               gs2++ ;
           }
       }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       File f4 = new File("CC.txt");
       Scanner cc;
        try {
            cc = new Scanner(f4);
            while(cc.hasNext()){
           String s4 = cc.nextLine();
           if (s4.equals("Arsalan")){
               cc1++ ;
           }
           if (s4.equals("Yahya")){
               cc2++ ;
           }
           if (s4.equals("Sanjana")){
               cc3++ ;
           }
       }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       vpw = Math.max(vp1, Math.max(vp2, vp3));
       gsw = Math.max(gs1, gs2);
       cfow = Math.max(cfo1, cfo2);
       ccw = Math.max(cc1, Math.max(cc2, cc3));
       vpl2 = Math.min(vp1, Math.min(vp2, vp3));
       vpl1 = (vp1 + vp2 + vp3) - vpl2 - vpw;
       cfol1 = Math.min(cfo1, cfo2);
       gsl1 = Math.min(gs1, gs2);
       ccl2 = Math.min(cc1, Math.min(cc2, cc3));
       ccl1 = (cc1 + cc2 + cc3) - ccl2 - ccw;
       if (vpw == vp1)
       {
           win1 = "Bilal";
           if (vpl1 == vp2)
           {
               loss11 = "Daniyal";
               loss12 = "Amin";
           }
           else
           {
               loss11 = "Amin";
               loss12 = "Daniyal";
           }
       }
       else if (vpw == vp2)
       {
           win1 = "Daniyal";
           if (vpl1 == vp1)
           {
               loss11 = "Bilal";
               loss12 = "Amin";
           }
           else
           {
               loss11 = "Amin";
               loss12 = "Bilal";
           }
       }
       else if (vpw == vp3)
       {
           win1 = "Amin";
           if (vpl1 == vp1)
           {
               loss11 = "Bilal";
               loss12 = "Daniyal";
           }
           else
           {
               loss11 = "Daniyal";
               loss12 = "Bilal";
           }
       }
       if (cfow == cfo1)
       {
           win2 = "Azeem ul Hassan";
           loss21 = "Asad Siddiqui";
       }
       else if (cfow == cfo2)
       {
           win2 = "Asad Siddiqui";
           loss21 = "Azeem ul Hassan";
       }
       if (gsw == gs1)
       {
           win3 = "Kunal";
           loss31 = "Hafsa";
       }
       else if (gsw == gs2)
       {
           win3 = "Hafsa";
           loss31 = "Kunal";
       }
       if (ccw == cc1)
       {
           win4 = "Arsalan";
           if (ccl1 == cc2)
           {
               loss41 = "Yahya";
               loss42 = "Sanjana";
           }
           else
           {
               loss41 = "Sanjana";
               loss42 = "Yahya";
           }
       }
       else if (ccw == cc2)
       {
           win4 = "Yahya";
           if (ccl1 == cc1)
           {
               loss41 = "Arsalan";
               loss42 = "Sanjana";
           }
           else
           {
               loss41 = "Sanjana";
               loss42 = "Arsalan";
           }
       }
       else if (ccw == cc3)
       {
           win4 = "Sanjana";
           if (ccl1 == cc2)
           {
               loss41 = "Yahya";
               loss42 = "Arsalan";
           }
           else
           {
               loss41 = "Arsalan";
               loss42 = "Yahya";
           }
       }
       this.win1.setText(win1 + " - " + vpw);
       this.win2.setText(win2 + " - " + cfow);
       this.win3.setText(win3 + " - " + gsw);
       this.win4.setText(win4 + " - " + ccw);
       this.loss1.setText(loss11 + " - " + vpl1);
       this.loss2.setText(loss21 + " - " + cfol1);
       this.loss3.setText(loss31 + " - " + gsl1);
       this.loss4.setText(loss41 + " - " + ccl1);
       this.jLabel1.setText(loss12 + " - " + vpl2);
       this.jLabel6.setText(loss42 + " - " + ccl2);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VP = new javax.swing.JLabel();
        CFO = new javax.swing.JLabel();
        GS = new javax.swing.JLabel();
        CC = new javax.swing.JLabel();
        win1 = new javax.swing.JLabel();
        win2 = new javax.swing.JLabel();
        win3 = new javax.swing.JLabel();
        win4 = new javax.swing.JLabel();
        loss1 = new javax.swing.JLabel();
        loss2 = new javax.swing.JLabel();
        loss3 = new javax.swing.JLabel();
        loss4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(109, 33, 79));

        jPanel2.setBackground(new java.awt.Color(179, 55, 113));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Results");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel8)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chunao");
        jLabel4.setToolTipText("");

        VP.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        VP.setForeground(new java.awt.Color(255, 255, 255));
        VP.setText("VP");

        CFO.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        CFO.setForeground(new java.awt.Color(255, 255, 255));
        CFO.setText("CFO");

        GS.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        GS.setForeground(new java.awt.Color(255, 255, 255));
        GS.setText("GS");

        CC.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        CC.setForeground(new java.awt.Color(255, 255, 255));
        CC.setText("CC");

        win1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        win1.setForeground(new java.awt.Color(255, 255, 255));
        win1.setText("jLabel7");

        win2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        win2.setForeground(new java.awt.Color(255, 255, 255));
        win2.setText("jLabel9");

        win3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        win3.setForeground(new java.awt.Color(255, 255, 255));
        win3.setText("jLabel10");

        win4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        win4.setForeground(new java.awt.Color(255, 255, 255));
        win4.setText("jLabel11");

        loss1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loss1.setForeground(new java.awt.Color(255, 255, 255));
        loss1.setText("jLabel12");

        loss2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loss2.setForeground(new java.awt.Color(255, 255, 255));
        loss2.setText("jLabel13");

        loss3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loss3.setForeground(new java.awt.Color(255, 255, 255));
        loss3.setText("jLabel14");

        loss4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loss4.setForeground(new java.awt.Color(255, 255, 255));
        loss4.setText("jLabel15");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WINNER");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WINNER");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WINNER");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("WINNER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(win1)
                            .addComponent(VP)
                            .addComponent(loss1)
                            .addComponent(loss3)
                            .addComponent(win3)
                            .addComponent(CFO))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loss2)
                                    .addComponent(GS)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(win2)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loss4)
                                    .addComponent(CC)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(win4)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel9)))))))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VP)
                    .addComponent(GS))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(win1)
                    .addComponent(win2)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loss2)
                    .addComponent(loss1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CC)
                            .addComponent(CFO))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(win4)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(win3)
                                    .addComponent(jLabel7))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loss4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(loss3)))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 608);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC;
    private javax.swing.JLabel CFO;
    private javax.swing.JLabel GS;
    private javax.swing.JLabel VP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loss1;
    private javax.swing.JLabel loss2;
    private javax.swing.JLabel loss3;
    private javax.swing.JLabel loss4;
    private javax.swing.JLabel win1;
    private javax.swing.JLabel win2;
    private javax.swing.JLabel win3;
    private javax.swing.JLabel win4;
    // End of variables declaration//GEN-END:variables
}
