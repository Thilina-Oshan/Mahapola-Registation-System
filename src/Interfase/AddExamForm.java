/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import static Interfase.AddAdmin.con;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.toedter.calendar.JDateChooser;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddExamForm extends javax.swing.JFrame {
    
    static Connection com = MainInterfase.conn;
    Statement st;
    ResultSet rs;
    
    public AddExamForm() {
        initComponents();
        customizeCloseOperationExam();
        setCourseCombo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEnterNic = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        validateEnterNic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEnterBatch = new javax.swing.JTextField();
        ValidateEnterBatch = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtExamId = new javax.swing.JTextField();
        validaterIdExam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserExam = new com.toedter.calendar.JDateChooser();
        validateExamDate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxExamCourse = new javax.swing.JComboBox<>();
        validateCourseE = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        validateBatchE = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxPassFail = new javax.swing.JComboBox<>();
        validatePassOrFail = new javax.swing.JLabel();
        jButtonInsertE = new javax.swing.JButton();
        jButton3UpdATEe = new javax.swing.JButton();
        jButtonClearE = new javax.swing.JButton();
        txtMcExam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        validateMcE = new javax.swing.JLabel();
        txtBatchE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Student Nic");

        txtEnterNic.setBackground(new java.awt.Color(153, 153, 255));
        txtEnterNic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEnterNic.setForeground(new java.awt.Color(0, 0, 0));
        txtEnterNic.setCaretColor(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Load to Mc Number");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        validateEnterNic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validateEnterNic.setForeground(new java.awt.Color(0, 0, 0));
        validateEnterNic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validateEnterNic.setText("Enter the Nic first");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Batch");

        txtEnterBatch.setBackground(new java.awt.Color(153, 153, 255));
        txtEnterBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEnterBatch.setForeground(new java.awt.Color(0, 0, 0));

        ValidateEnterBatch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ValidateEnterBatch.setForeground(new java.awt.Color(0, 0, 0));
        ValidateEnterBatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValidateEnterBatch.setText("Enter the Batch Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validateEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtEnterBatch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ValidateEnterBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEnterNic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validateEnterNic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(ValidateEnterBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exam Id");

        txtExamId.setBackground(new java.awt.Color(204, 204, 204));
        txtExamId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtExamId.setForeground(new java.awt.Color(0, 0, 0));
        txtExamId.setCaretColor(new java.awt.Color(0, 0, 0));

        validaterIdExam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validaterIdExam.setForeground(new java.awt.Color(0, 0, 0));
        validaterIdExam.setText("Id is Auto Increment");

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Enterd Exam Details");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Exam Date");

        jDateChooserExam.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserExam.setForeground(new java.awt.Color(255, 255, 255));

        validateExamDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateExamDate.setForeground(new java.awt.Color(0, 0, 0));
        validateExamDate.setText("                                                          ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Batch");

        jComboBoxExamCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        validateCourseE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateCourseE.setForeground(new java.awt.Color(0, 0, 0));
        validateCourseE.setText("                                                       ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Course");

        validateBatchE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateBatchE.setForeground(new java.awt.Color(0, 0, 0));
        validateBatchE.setText("                                             ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Result");

        jComboBoxPassFail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pass", "Fail" }));

        validatePassOrFail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validatePassOrFail.setForeground(new java.awt.Color(0, 0, 0));
        validatePassOrFail.setText("jLabel15");

        jButtonInsertE.setBackground(new java.awt.Color(102, 102, 255));
        jButtonInsertE.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonInsertE.setForeground(new java.awt.Color(0, 0, 51));
        jButtonInsertE.setText("Save");
        jButtonInsertE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonInsertE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertEActionPerformed(evt);
            }
        });

        jButton3UpdATEe.setBackground(new java.awt.Color(102, 102, 255));
        jButton3UpdATEe.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3UpdATEe.setForeground(new java.awt.Color(0, 0, 51));
        jButton3UpdATEe.setText("Update");
        jButton3UpdATEe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButton3UpdATEe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3UpdATEeActionPerformed(evt);
            }
        });

        jButtonClearE.setBackground(new java.awt.Color(102, 102, 255));
        jButtonClearE.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonClearE.setForeground(new java.awt.Color(0, 0, 51));
        jButtonClearE.setText("Clear");
        jButtonClearE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonClearE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearEActionPerformed(evt);
            }
        });

        txtMcExam.setBackground(new java.awt.Color(255, 255, 255));
        txtMcExam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMcExam.setForeground(new java.awt.Color(0, 0, 0));
        txtMcExam.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mc Number");

        validateMcE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateMcE.setForeground(new java.awt.Color(0, 0, 0));
        validateMcE.setText("                                                 ");

        txtBatchE.setBackground(new java.awt.Color(255, 255, 255));
        txtBatchE.setForeground(new java.awt.Color(0, 0, 0));
        txtBatchE.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonInsertE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3UpdATEe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClearE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validateMcE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMcExam)
                            .addComponent(validatePassOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateBatchE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateCourseE, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(validaterIdExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExamId)
                            .addComponent(jComboBoxExamCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxPassFail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBatchE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validateExamDate, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserExam, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validaterIdExam, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMcExam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(validateMcE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooserExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validateExamDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxExamCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateCourseE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBatchE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(validateBatchE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validatePassOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertE)
                    .addComponent(jButton3UpdATEe)
                    .addComponent(jButtonClearE))
                .addContainerGap())
        );

        txtExamId.setEnabled(false);
        jDateChooserExam.setEnabled(false);
        jComboBoxExamCourse.setEnabled(false);
        jComboBoxExamCourse.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxExamCourse.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxPassFail.setEnabled(false);

        jComboBoxPassFail.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPassFail.setForeground(new java.awt.Color(0, 0, 0));
        txtBatchE.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearEActionPerformed
        clearFieldsEam();
    }//GEN-LAST:event_jButtonClearEActionPerformed

    private void jButtonInsertEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertEActionPerformed
        if (isvalidateExam()) {
            setVariableExam();
            try {
                String query = "INSERT INTO `exam_detail`(`mc_num`, `exam_date`, `couse_name`, `batch_name`, `examme_result`) VALUES (?,?,?,?,?)";
                // Debug statement to print the query
                System.out.println("Executing query: " + query);
                
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, Mc_numExam);
                if (ExameDate != null) {
                    pst.setDate(2, new java.sql.Date(ExameDate.getTime()));
                } else {
                    pst.setNull(2, java.sql.Types.DATE); // Corrected index here
                }
                pst.setString(3, CourseNameE);
                pst.setString(4, BatchNameE);
                pst.setString(5, ExameResult); // Corrected index here

                int rowsInserted = pst.executeUpdate(); // Use executeUpdate for INSERT
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Save Successfull");
                    System.out.println("Success");
                    clearFieldsEam();
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Can't Insert Data");
                JOptionPane.showMessageDialog(this, BatchNameE + " Batch  is Already Exists", "Found Duplicate Entries, HEIGHT", 2);
                System.out.println("Not");
//                JOptionPane.showMessageDialog(this, " Duplicate entry " + BatchNameE);
                System.out.println(e);
                System.out.println(e);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred");
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButtonInsertEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtEnterNic.getText().equals("") & txtEnterBatch.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Please Fill Fields");
        } else {
            
            getAddBatch();
            getAddRegdetails();

            // Enable other fields after button click
            txtBatchE.setEnabled(true);
            txtMcExam.setEnabled(true);
            jDateChooserExam.setEnabled(true);
            jComboBoxExamCourse.setEnabled(true);
            jComboBoxPassFail.setEnabled(true); // Example for enabling another button

            System.out.println("Data Ok");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3UpdATEeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3UpdATEeActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_NO_OPTION) {
            
            if (isvalidateExam()) {
                setVariableExam();
                
                try {
                    con.setAutoCommit(false); // Disable auto-commit for transaction management

                    String query = "UPDATE `exam_detail` SET `mc_num`=?,`exam_date`=?,`couse_name`=?,`batch_name`=?,`examme_result`=? WHERE `exam_id`= ?";
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        
                        pst.setInt(1, Mc_numExam);
                        pst.setDate(2, new java.sql.Date(ExameDate.getTime()));
                        pst.setString(3, CourseNameE);
                        pst.setString(4, BatchNameE);
                        pst.setString(5, ExameResult);
                        
                        pst.setInt(6, ExamId); // Use the correct variable for the registration ID

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Update Successful");
                        } else {
                            JOptionPane.showMessageDialog(null, "Update Failed: No rows affected.");
                            System.out.println("Update Failed: No rows affected.");
                        }
                    }
                    
                    con.commit(); // Commit the transaction
                    clearFieldsEam();
                } catch (Exception e) {
                    try {
                        con.rollback(); // Rollback transaction on error
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Rollback failed: " + ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(this, BatchNameE + " Batch  is Already Exists", "Found Duplicate Entries, HEIGHT", 2);
//                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    System.out.println(e);
                    e.printStackTrace(); // Print stack trace for debugging
                } finally {
                    try {
                        con.setAutoCommit(true); // Re-enable auto-commit
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Failed to reset auto-commit: " + ex.getMessage());
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton3UpdATEeActionPerformed
    
    public static void main(String args[]) {
        
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValidateEnterBatch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3UpdATEe;
    private javax.swing.JButton jButtonClearE;
    private javax.swing.JButton jButtonInsertE;
    private javax.swing.JComboBox<String> jComboBoxExamCourse;
    private javax.swing.JComboBox<String> jComboBoxPassFail;
    private com.toedter.calendar.JDateChooser jDateChooserExam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBatchE;
    private javax.swing.JTextField txtEnterBatch;
    private javax.swing.JTextField txtEnterNic;
    private javax.swing.JTextField txtExamId;
    private javax.swing.JTextField txtMcExam;
    private javax.swing.JLabel validateBatchE;
    private javax.swing.JLabel validateCourseE;
    private javax.swing.JLabel validateEnterNic;
    private javax.swing.JLabel validateExamDate;
    private javax.swing.JLabel validateMcE;
    private javax.swing.JLabel validatePassOrFail;
    private javax.swing.JLabel validaterIdExam;
    // End of variables declaration//GEN-END:variables

    int ExamId;
    String NicExam;
    int Mc_numExam;
    Date ExameDate;
    String CourseNameE;
    String BatchNameE;
    String ExameResult;
    
    public void setVariableExam() {
        
        NicExam = txtExamId.getText();
        Mc_numExam = Integer.parseInt(txtMcExam.getText());
        ExameDate = jDateChooserExam.getDate();
        CourseNameE = jComboBoxExamCourse.getSelectedItem().toString();
        BatchNameE = txtBatchE.getText();
        ExameResult = jComboBoxPassFail.getSelectedItem().toString();
        
        String idTextExam = txtExamId.getText();
        if (idTextExam != null && !idTextExam.isEmpty()) {
            try {
                ExamId = Integer.parseInt(idTextExam);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Exam ID");
                return;
            }
        }
        
    }
    
    public void clearFieldsEam() {
        
        txtExamId.setText("");
        jDateChooserExam.setDate(null);
        txtEnterNic.setText("");
        txtEnterNic.setEnabled(true);
        txtEnterBatch.setText("");
        txtEnterBatch.setEnabled(true);
        txtMcExam.setText("");
        txtMcExam.setEnabled(true);
        txtBatchE.setText("");
//        txtNicExam.setText("");
//        txtNicExam.setEnabled(true);

        validateBatchE.setText(" ");
        validateCourseE.setText(" ");
        validateEnterNic.setText("Enter the Nic");
        validateExamDate.setText(" ");
        validateMcE.setText(" ");
        validaterIdExam.setText("Id is Auto Increment ");
        validatePassOrFail.setText(" ");
    }
    
    private void customizeCloseOperationExam() {
        
        clearFieldsEam();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(
                        AddExamForm.this,
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
                    clearFieldsEam();
                }
            }
        });
    }
    
    public void setCourseCombo() {
        
        java.sql.Statement st;
        
        try {
            
            st = con.createStatement();
            
            String comboBox = "SELECT `couse_name` FROM `course`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxExamCourse.removeAllItems();
            
            while (rs.next()) {
                
                jComboBoxExamCourse.addItem(rs.getString(1));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
        
    }
    
    public void getAddRegdetails() {
        
        java.sql.Statement stmt;
        
        try {
            stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM `student_registation` WHERE `stu_nic`='" + txtEnterNic.getText() + "'");
            
            if (rs.next()) {
                
                String mcnumE = rs.getString(2);
                
                txtMcExam.setText(mcnumE);
            } else {
                JOptionPane.showMessageDialog(null, "Student not registerd");
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
    public void getAddBatch() {
        
        java.sql.Statement stmt;
        
        try {
            stmt = con.createStatement();

            // Get the text from the text field
            String enteredBatchId = txtEnterBatch.getText();
            System.out.println("Entered Batch ID: " + enteredBatchId); // For debugging

            // Correctly form the SQL query
            String query = "SELECT * FROM `batch_details` WHERE `batch_name`='" + enteredBatchId + "'";
            System.out.println("Executing query: " + query); // For debugging

            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                // Assuming the batch name is in the second column
                String batchNameumE = rs.getString(2);
                txtBatchE.setText(batchNameumE);
            } else {
                JOptionPane.showMessageDialog(null, "Batch not registered");
                System.out.println("Batch not registered");
            }
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "An error occurred while fetching batch details.");
        }
        
    }

    //Getter Sette Method

    public JTextField getTxtEnterBatch() {
        return txtEnterBatch;
    }

    public void setTxtEnterBatch(JTextField txtEnterBatch) {
        this.txtEnterBatch = txtEnterBatch;
    }

    public JLabel getValidateEnterBatch() {
        return ValidateEnterBatch;
    }

    public void setValidateEnterBatch(JLabel ValidateEnterBatch) {
        this.ValidateEnterBatch = ValidateEnterBatch;
    }

    
    
    public JTextField getTxtBatchE() {
        return txtBatchE;
    }
    
    public void setTxtBatchE(JTextField txtBatchE) {
        this.txtBatchE = txtBatchE;
    }
    
    public JComboBox<String> getjComboBoxExamCourse() {
        return jComboBoxExamCourse;
    }
    
    public void setjComboBoxExamCourse(JComboBox<String> jComboBoxExamCourse) {
        this.jComboBoxExamCourse = jComboBoxExamCourse;
    }
    
    public JComboBox<String> getjComboBoxPassFail() {
        return jComboBoxPassFail;
    }
    
    public void setjComboBoxPassFail(JComboBox<String> jComboBoxPassFail) {
        this.jComboBoxPassFail = jComboBoxPassFail;
    }
    
    public JDateChooser getjDateChooserExam() {
        return jDateChooserExam;
    }
    
    public void setjDateChooserExam(JDateChooser jDateChooserExam) {
        this.jDateChooserExam = jDateChooserExam;
    }
    
    public JTextField getTxtEnterNic() {
        return txtEnterNic;
    }
    
    public void setTxtEnterNic(JTextField txtEnterNic) {
        this.txtEnterNic = txtEnterNic;
    }
    
    public JTextField getTxtExamId() {
        return txtExamId;
    }
    
    public void setTxtExamId(JTextField txtExamId) {
        this.txtExamId = txtExamId;
    }
    
    public JTextField getTxtMcExam() {
        return txtMcExam;
    }
    
    public void setTxtMcExam(JTextField txtMcExam) {
        this.txtMcExam = txtMcExam;
    }
    
    public JLabel getValidateBatchE() {
        return validateBatchE;
    }
    
    public void setValidateBatchE(JLabel validateBatchE) {
        this.validateBatchE = validateBatchE;
    }
    
    public JLabel getValidateCourseE() {
        return validateCourseE;
    }
    
    public void setValidateCourseE(JLabel validateCourseE) {
        this.validateCourseE = validateCourseE;
    }
    
    public JLabel getValidateEnterNic() {
        return validateEnterNic;
    }
    
    public void setValidateEnterNic(JLabel validateEnterNic) {
        this.validateEnterNic = validateEnterNic;
    }
    
    public JLabel getValidateExamDate() {
        return validateExamDate;
    }
    
    public void setValidateExamDate(JLabel validateExamDate) {
        this.validateExamDate = validateExamDate;
    }
    
    public JLabel getValidateMcE() {
        return validateMcE;
    }
    
    public void setValidateMcE(JLabel validateMcE) {
        this.validateMcE = validateMcE;
    }
    
    public JLabel getValidaterIdExam() {
        return validaterIdExam;
    }
    
    public void setValidaterIdExam(JLabel validaterIdExam) {
        this.validaterIdExam = validaterIdExam;
    }
    
    public boolean isvalidateExam() {
        
        boolean isvalidate = isvalidateNicExam();
        return isvalidate;
    }

//    private boolean isvalidateMcNumber() {
//
//        String mcNumber = this.txtMCNUm.getText();
//        if (mcNumber.isBlank() | mcNumber.isEmpty()) {
//            validateMcNUm.setText("plz enter the MC Number");
//            return false;
//        } else if (!Pattern.matches("^[0-9]{1,5}", mcNumber)) {
//            validateMcNUm.setText("Invalid Mc Number");
//            return false;
//        } else {
//            validateMcNUm.setText("");
//            return true;
//
//        }
//
//    }
    private boolean isvalidateNicExam() {
        
        if (txtMcExam.getText().equals("")) {
            
            validateMcE.setText("Can not be empty");
            
        } else {
            validateMcE.setText(" ");
        }
        return true;
    }
    
}
