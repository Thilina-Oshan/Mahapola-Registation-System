/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import Classes.CustomTextFieldBorder;
import java.awt.Color;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class LoginMainFrame extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;
    Home hp = new Home();
    MainInterfase main = new MainInterfase();
    AddAdminForm addadminform = new AddAdminForm();

    public LoginMainFrame() {
        initComponents();
        setCustomBorder(txtEmail, txtPasswordL);
        hp.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSingIN = new javax.swing.JButton();
        txtPasswordL = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabelSignUp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Email");

        txtEmail.setBackground(new java.awt.Color(255, 204, 204));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Forgot Password");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jButtonSingIN.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSingIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSingIN.setForeground(new java.awt.Color(0, 0, 51));
        jButtonSingIN.setText("Sign In");
        jButtonSingIN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        jButtonSingIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSingINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSingINMouseExited(evt);
            }
        });
        jButtonSingIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSingINActionPerformed(evt);
            }
        });

        txtPasswordL.setBackground(new java.awt.Color(255, 204, 204));
        txtPasswordL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPasswordL.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordL.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Not a Member ?");

        jLabelSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSignUp.setForeground(new java.awt.Color(51, 0, 51));
        jLabelSignUp.setText("Sign Up");
        jLabelSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7)
                            .addComponent(txtPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSingIN, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSignUp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(99, 99, 99)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addComponent(jButtonSingIN)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelSignUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Mahapola Ports and Maritime Academy");

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Sri Lanka Ports Authority");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup-library-icon.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButtonSingINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSingINActionPerformed
        String Email, query, fname = null, passDb = null;
        String Password = new String(txtPasswordL.getPassword());
        int notFound = 0;

        // Check if the fields are empty
        if ("".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ("".equals(txtPasswordL.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Statement st = con.createStatement();

            Email = txtEmail.getText();
            Password = new String(txtPasswordL.getPassword());  // Get password securely

            query = "SELECT * FROM users WHERE email= '" + Email + "'";

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                passDb = rs.getString("password");
                fname = rs.getString("name");
                notFound = 1;
            }

            if (notFound == 1 && Password.equals(passDb)) {
                Home hp = new Home(); // Create a new instance of Home
                main.setUser(fname);  // Set the admin's name

                main.add(hp); // Add the Home panel to the JFrame
                main.pack();
                JOptionPane.showMessageDialog(this, "Successful Login");
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            txtPasswordL.setText("");
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonSingINActionPerformed

    private void jButtonSingINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSingINMouseExited
        jButtonSingIN.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSingIN.setForeground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_jButtonSingINMouseExited

    private void jButtonSingINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSingINMouseEntered
        jButtonSingIN.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSingIN.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButtonSingINMouseEntered

    private void jLabelSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseEntered
        jLabelSignUp.setForeground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_jLabelSignUpMouseEntered

    private void jLabelSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseExited
        jLabelSignUp.setForeground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_jLabelSignUpMouseExited

    private void jLabelSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseClicked
        addadminform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelSignUpMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       ForgotPasswordForm forgotpasswordform = new ForgotPasswordForm();
       forgotpasswordform.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_jLabel7MouseClicked

    public static void main(String args[]) {

        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSingIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPasswordL;
    // End of variables declaration//GEN-END:variables

    // Changing the border of the text field me method eka interfase eke
    // Changing the border of the text field method
    public void setCustomBorder(JTextField... textFields) {
        CustomTextFieldBorder customBorder = new CustomTextFieldBorder(
                Color.BLACK, // Bottom border color
                1 // Border width
        );

        for (JTextField textField : textFields) {
            textField.setBorder(customBorder);
        }
    }

}
