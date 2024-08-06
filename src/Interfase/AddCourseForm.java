/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import Classes.AddCourseClass;
import static Interfase.AddCourseForm.con;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oshan Demel
 */
public class AddCourseForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;
    ResultSet rs;
    
    
    
    public AddCourseForm() {
        initComponents();
        customizeCloseOperation();
    }
    
    private ArrayList<AddCourseClass> getCourseList(String query) {
        
        
        ArrayList<AddCourseClass> coursedlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddCourseClass course;

            while (rs.next()) {

                course = new AddCourseClass(rs.getInt(1), rs.getString(2), rs.getString(3));
                coursedlist.add(course);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return coursedlist;
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
        txtCourseName = new javax.swing.JTextField();
        txtCourseId = new javax.swing.JTextField();
        NOValidates = new javax.swing.JLabel();
        validateCourseName = new javax.swing.JLabel();
        validateDuration = new javax.swing.JLabel();
        validateEnddate = new javax.swing.JLabel();
        ButtonClear = new javax.swing.JButton();
        ButtonInsert = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        textDuration = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton151 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Course (1).png"))); // NOI18N
        jLabel9.setText(" Enterd Course Details");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Course Name ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Duration");

        txtCourseName.setBackground(new java.awt.Color(255, 255, 255));
        txtCourseName.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtCourseName.setForeground(new java.awt.Color(0, 0, 0));
        txtCourseName.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCourseName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCourseNameFocusLost(evt);
            }
        });

        txtCourseId.setBackground(new java.awt.Color(204, 255, 255));
        txtCourseId.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtCourseId.setForeground(new java.awt.Color(0, 0, 0));
        txtCourseId.setCaretColor(new java.awt.Color(0, 0, 0));

        NOValidates.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NOValidates.setForeground(new java.awt.Color(0, 0, 0));
        NOValidates.setText("Course Id Is Auto Increment");

        validateCourseName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateCourseName.setForeground(new java.awt.Color(0, 0, 0));
        validateCourseName.setText(" ");

        validateDuration.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateDuration.setForeground(new java.awt.Color(0, 0, 0));
        validateDuration.setText("    ");

        validateEnddate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateEnddate.setForeground(new java.awt.Color(0, 0, 0));
        validateEnddate.setText("     ");

        ButtonClear.setBackground(new java.awt.Color(102, 102, 255));
        ButtonClear.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ButtonClear.setForeground(new java.awt.Color(0, 0, 51));
        ButtonClear.setText("Clear");
        ButtonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonInsert.setBackground(new java.awt.Color(102, 102, 255));
        ButtonInsert.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ButtonInsert.setForeground(new java.awt.Color(0, 0, 51));
        ButtonInsert.setText("Save");
        ButtonInsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        ButtonInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertActionPerformed(evt);
            }
        });

        ButtonUpdate.setBackground(new java.awt.Color(102, 102, 255));
        ButtonUpdate.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ButtonUpdate.setForeground(new java.awt.Color(0, 0, 51));
        ButtonUpdate.setText("Update");
        ButtonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        ButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        textDuration.setBackground(new java.awt.Color(255, 255, 255));
        textDuration.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        textDuration.setForeground(new java.awt.Color(0, 0, 0));
        textDuration.setCaretColor(new java.awt.Color(0, 0, 0));
        textDuration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textDurationFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOValidates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateEnddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCourseName)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textDuration))))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(ButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOValidates, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(validateDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(validateEnddate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        txtCourseId.setEnabled(false);

        jButton151.setBackground(new java.awt.Color(51, 102, 255));
        jButton151.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton151.setForeground(new java.awt.Color(255, 255, 255));
        jButton151.setText("Back");
        jButton151.setBorder(null);
        jButton151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton151ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup-library-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton151ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton151ActionPerformed

    private void txtCourseNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCourseNameFocusLost
        isvalidateCname();
    }//GEN-LAST:event_txtCourseNameFocusLost

    private void textDurationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDurationFocusLost
        isvalidateDuration();
    }//GEN-LAST:event_textDurationFocusLost

    private void ButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertActionPerformed
        if (isvalidate()) {

               
            try {

                setCourseVariables();

                String query = "INSERT INTO `course`(`couse_name`, `course_duration`) VALUES (?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, cName);
                pst.setString(2, duration);
                pst.execute();
                
                JOptionPane.showMessageDialog(this, "Data Saved! ");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        }
    }//GEN-LAST:event_ButtonInsertActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        clearFiled();
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        if (isvalidate()) {
            setCourseVariables();

            try {
                // Print the variables to ensure they are set correctly
                System.out.println("Course ID: " + cid);
                System.out.println("Name: " + cName);
                System.out.println("Duration: " + duration);
                

                // Check if the student ID exists
                String checkQuery = "SELECT COUNT(*) FROM `course` WHERE `couse_id` = ?";
                PreparedStatement checkPst = con.prepareStatement(checkQuery);
                checkPst.setInt(1, cid);

                ResultSet rs = checkPst.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    // Proceed with the update
                    String query = "UPDATE `course` SET `couse_name`= ?,`course_duration`= ? WHERE `couse_id`= ?";
                    PreparedStatement pst = con.prepareStatement(query);
                    
                    pst.setString(1, cName);
                    pst.setString(2, duration);
                    pst.setInt(3, cid);
                    

                    int rowsUpdated = pst.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "UPDATE  SUCCESSFUL");
                    } else {
                        JOptionPane.showMessageDialog(null, "No record found with the given ID");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No record found with the given ID");
                }
                clearFiled();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Can't Update");
            }
        }
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonInsert;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JLabel NOValidates;
    private javax.swing.JButton jButton151;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textDuration;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JLabel validateCourseName;
    private javax.swing.JLabel validateDuration;
    private javax.swing.JLabel validateEnddate;
    // End of variables declaration//GEN-END:variables
    int cid;
    String cName;
    String duration;
    
    public void setCourseVariables() {
        
        cid = Integer.parseInt(txtCourseId.getText());
        cName = txtCourseName.getText();
        duration = textDuration.getText();
    }
    
    private void customizeCloseOperation() {

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(
                        AddCourseForm.this,
                        "Are you sure you want to close this application?",
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
    
    public boolean isvalidate() {

        boolean isvalidate = isvalidateCname() & isvalidateDuration();
        return isvalidate;
    }
    
    public boolean isvalidateCname() {

        if (txtCourseName.getText().isEmpty()) {
            validateCourseName.setText("Can not be Empty");
            return false;
        } else if (!Pattern.matches("[A-Za-z ]{1,50}", txtCourseName.getText())) {
            validateCourseName.setText("only 50 leters (ex: Personal Survival techniques)");
            return false;
        } else {
            validateCourseName.setText("");
        }
        return true;

    }
    
    public boolean isvalidateDuration() {

        if (textDuration.getText().isEmpty()) {
            validateDuration.setText("Can not be Empty");
            return false;
        } else if (!Pattern.matches("[A-Za-z0-9 ]{1,50}", textDuration.getText())) {
            validateDuration.setText("only 50 leters/Numbers (ex: 03 Months)");
            return false;
        } else {
            validateDuration.setText("");
        }
        return true;

    }
    
    public void clearFiled() {

        txtCourseName.setText("");
        textDuration.setText("");
        
    }

}
