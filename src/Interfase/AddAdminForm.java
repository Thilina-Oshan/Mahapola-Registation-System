/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Interfase.MainInterfase;

public class AddAdminForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;

    public AddAdminForm() {
        initComponents();
        customizeCloseOperation();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        txtAdminId = new javax.swing.JTextField();
        NOValidate = new javax.swing.JLabel();
        validateAdminName = new javax.swing.JLabel();
        validatePassword = new javax.swing.JLabel();
        validateReenderPassword = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonInsertAdmin = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtReenterPws = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        ValidationEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        validateQue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxQue = new javax.swing.JComboBox<>();
        txtAns = new javax.swing.JTextField();
        validateAns = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Batch-removebg-preview (1).png"))); // NOI18N
        jLabel9.setText(" Enterd admin Details");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin Id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin  Name ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Re-Enter Password");

        txtAdminName.setBackground(new java.awt.Color(255, 255, 255));
        txtAdminName.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtAdminName.setForeground(new java.awt.Color(0, 0, 0));
        txtAdminName.setCaretColor(new java.awt.Color(0, 0, 0));
        txtAdminName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdminNameFocusLost(evt);
            }
        });

        txtAdminId.setBackground(new java.awt.Color(204, 255, 255));
        txtAdminId.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtAdminId.setForeground(new java.awt.Color(0, 0, 0));
        txtAdminId.setCaretColor(new java.awt.Color(0, 0, 0));

        NOValidate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NOValidate.setForeground(new java.awt.Color(0, 0, 0));
        NOValidate.setText("Admin Id Is Auto Increment");

        validateAdminName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateAdminName.setForeground(new java.awt.Color(0, 0, 0));
        validateAdminName.setText(" ");

        validatePassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validatePassword.setForeground(new java.awt.Color(0, 0, 0));
        validatePassword.setText("    ");

        validateReenderPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateReenderPassword.setForeground(new java.awt.Color(0, 0, 0));
        validateReenderPassword.setText("     ");

        jButtonClear.setBackground(new java.awt.Color(102, 102, 255));
        jButtonClear.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(0, 0, 51));
        jButtonClear.setText("Clear");
        jButtonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonInsertAdmin.setBackground(new java.awt.Color(102, 102, 255));
        jButtonInsertAdmin.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonInsertAdmin.setForeground(new java.awt.Color(0, 0, 51));
        jButtonInsertAdmin.setText("Save");
        jButtonInsertAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonInsertAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsertAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertAdminActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(102, 102, 255));
        jButtonUpdate.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(0, 0, 51));
        jButtonUpdate.setText("Update");
        jButtonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        txtReenterPws.setBackground(new java.awt.Color(255, 255, 255));
        txtReenterPws.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtReenterPws.setForeground(new java.awt.Color(0, 0, 0));
        txtReenterPws.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtReenterPwsCaretUpdate(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Email");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        ValidationEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ValidationEmail.setText("                                           ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Security question");

        validateQue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateQue.setForeground(new java.awt.Color(0, 0, 0));
        validateQue.setText("                                                       ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Anwer");

        jComboBoxQue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your Favariout Game ?", "What is your Nick Name ?", "What is your pet's Name ?" }));

        txtAns.setBackground(new java.awt.Color(255, 255, 255));
        txtAns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAns.setForeground(new java.awt.Color(0, 0, 0));
        txtAns.setCaretColor(new java.awt.Color(0, 0, 0));

        validateAns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateAns.setForeground(new java.awt.Color(0, 0, 0));
        validateAns.setText("                                                      ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReenterPws)
                            .addComponent(validatePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonInsertAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(validateReenderPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValidationEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validateAdminName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NOValidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAdminId)
                            .addComponent(txtAdminName)
                            .addComponent(validateQue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxQue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAns)
                            .addComponent(validateAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOValidate)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(validateAdminName)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValidationEmail)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxQue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateQue)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(validateAns)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validatePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReenterPws, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateReenderPassword)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInsertAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtAdminId.setEnabled(false);
        jComboBoxQue.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxQue.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup-library-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        emailValidatation();
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtReenterPwsCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtReenterPwsCaretUpdate
        reEnterPasswordValidation();
    }//GEN-LAST:event_txtReenterPwsCaretUpdate

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        passwordValidation();
    }//GEN-LAST:event_txtPasswordFocusLost

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_NO_OPTION) {

            setVariableAdmin();

            if (isvalidateAdmin()) {

                try {
                    con.setAutoCommit(false); // Disable auto-commit for transaction management

                    String query = "UPDATE `users` SET `name`=?,`email`=?,`password`=?,`re_enterpassword`=? WHERE `id`=?";
                    try (PreparedStatement pst = con.prepareStatement(query)) {

                        pst.setString(1, User_name);
                        pst.setString(2, Email);
                        pst.setString(3, Password);
                        pst.setString(4, Re_enterPassword);
                        pst.setInt(5, User_id); // Use the correct variable for the registration ID

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Update Successful");
                            ClearAdminF();
                        } else {
                            JOptionPane.showMessageDialog(null, "Update Failed: No rows affected.");
                            System.out.println("Update Failed: No rows affected.");
                        }
                    }

                    con.commit(); // Commit the transaction
                } catch (Exception e) {
                    try {
                        con.rollback(); // Rollback transaction on error
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Rollback failed: " + ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    System.out.println(e);
                    e.printStackTrace(); // Print stack trace for debugging
                } finally {
                    try {
                        con.setAutoCommit(true); // Re-enable auto-commit
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Failed to reset auto-commit: " + ex.getMessage());

                    }
                }
            }

        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonInsertAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertAdminActionPerformed
        if (isvalidateAdmin()) {
            setVariableAdmin();

            try {
                String query = "INSERT INTO `users`(`name`, `email`, `secu_que`, `anws`, `password`, `re_enterpassword`) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, User_name);
                pst.setString(2, Email);
                pst.setString(3, Quet);
                pst.setString(4, Answ);
                pst.setString(5, Password);
                pst.setString(6, Re_enterPassword);
                pst.execute();

                JOptionPane.showMessageDialog(this, "Success");

                // Load the main interface
                MainInterfase mainInterface = new MainInterfase(); // Replace with your main interface class
                mainInterface.setVisible(true);
                this.dispose(); // Close the current window

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Can't Insert Data");
                JOptionPane.showMessageDialog(this, e);
                System.out.println(e);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred");
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButtonInsertAdminActionPerformed

    private void txtAdminNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdminNameFocusLost
        nameValidation();
    }//GEN-LAST:event_txtAdminNameFocusLost

    public static void main(String args[]) {
        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOValidate;
    private javax.swing.JLabel ValidationEmail;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonInsertAdmin;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxQue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAdminId;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtAns;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtReenterPws;
    private javax.swing.JLabel validateAdminName;
    private javax.swing.JLabel validateAns;
    private javax.swing.JLabel validatePassword;
    private javax.swing.JLabel validateQue;
    private javax.swing.JLabel validateReenderPassword;
    // End of variables declaration//GEN-END:variables

    int User_id;
    String User_name;
    String Email;
    String Quet;
    String Answ;
    String Password;
    String Re_enterPassword;

    public void setVariableAdmin() {

        User_name = txtAdminName.getText();
        Email = txtEmail.getText();
        Quet = jComboBoxQue.getSelectedItem().toString();
        Answ = txtAns.getText();
        Password = txtPassword.getText();
        Re_enterPassword = txtReenterPws.getText();

        String idTextAdmin = txtAdminId.getText();
        if (idTextAdmin != null && !idTextAdmin.isEmpty()) {
            try {
                User_id = Integer.parseInt(idTextAdmin);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Student ID");
                return;
            }
        }

    }

    public void ClearAdminF() {

        txtAdminId.setText("");
        txtAdminName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtReenterPws.setText("");

    }

    private void customizeCloseOperation() {

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(
                        AddAdminForm.this,
                        "Are you sure you want to close the application?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        null,
                        null
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }

    public boolean isvalidateAdmin() {

        boolean isvalidate = passwordValidation() & reEnterPasswordValidation() & nameValidation() & emailValidatation();
        return isvalidate;
    }

    boolean passwordValidation() {
        String password = this.txtPassword.getText();
        if (password.isBlank() | password.isEmpty()) {
            validatePassword.setText("plz enter a passowrd");
            return false;
        } else if (!Pattern.matches("^[A-Za-z0-9]{1,16}$", password)) {
            validatePassword.setText("Invalid password - cannot contain special charachters");
            return false;
        } else {
            validatePassword.setText("");
            return true;
        }
    }

    boolean reEnterPasswordValidation() {
        if (!passwordValidation()) {
            return false;
        } else if (txtPassword.getText().equals(txtReenterPws.getText())) {
            validateReenderPassword.setText("");
            return true;

        } else {
            validateReenderPassword.setText("passwords doesent match");
            return false;
        }
    }

    boolean nameValidation() {
        String name = this.txtAdminName.getText();
        if (name.isBlank() | name.isEmpty()) {
            validateAdminName.setText("plz enter the name");
            return false;
        } else if (!Pattern.matches("^[A-Za-z0-9\\s]{1,100}", name)) {
            validateAdminName.setText("Invalid canot contains numbers or special charachters");
            return false;
        } else {
            validateAdminName.setText("");
            return true;

        }
    }

    boolean emailValidatation() {

        String email = this.txtEmail.getText();
        if (email.isBlank() | email.isEmpty()) {
            ValidationEmail.setText("plz enter the name");
            return false;
        } else if (!Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)) {
            ValidationEmail.setText("Invalid Email");
            return false;
        } else {
            ValidationEmail.setText("");
            return true;

        }

    }

}
