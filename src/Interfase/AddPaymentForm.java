/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import static Interfase.AddRegistationForm.con;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class AddPaymentForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;

    public AddPaymentForm() {
        initComponents();
        customizeCloseOperation();
        setBatchCombo();
        setCourseCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lable_IBid = new javax.swing.JLabel();
        lable_ISid = new javax.swing.JLabel();
        lable_IDueDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        txtPayMcNumber = new javax.swing.JTextField();
        validateNot = new javax.swing.JLabel();
        validateCoursesName = new javax.swing.JLabel();
        validateBatchName1 = new javax.swing.JLabel();
        validateAmount = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsert1 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        validateMcnumbers = new javax.swing.JLabel();
        txtPaymentNUm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ValidatePayment = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        validateBalanse = new javax.swing.JLabel();
        jComboBoxCoursePay = new javax.swing.JComboBox<>();
        jComboBoxBatchPay = new javax.swing.JComboBox<>();
        txtPayment = new javax.swing.JTextField();
        txtBalnse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLoadMcNum = new javax.swing.JTextField();
        jButtonLoadMc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Iconsmind-Outline-Student-MaleFemale.512 (3).png"))); // NOI18N
        jLabel10.setText(" Enterd Payment Details");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Payment Id");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course Name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Batch Name");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Amount");

        txtAmount1.setBackground(new java.awt.Color(255, 255, 255));
        txtAmount1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtAmount1.setForeground(new java.awt.Color(0, 0, 0));
        txtAmount1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtAmount1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmount1FocusLost(evt);
            }
        });

        txtPayMcNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPayMcNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtPayMcNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtPayMcNumber.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPayMcNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPayMcNumberFocusLost(evt);
            }
        });

        validateNot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateNot.setForeground(new java.awt.Color(0, 0, 0));
        validateNot.setText("Payment Id Is Auto Increment");

        validateCoursesName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateCoursesName.setForeground(new java.awt.Color(0, 0, 0));
        validateCoursesName.setText(" ");

        validateBatchName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateBatchName1.setForeground(new java.awt.Color(0, 0, 0));
        validateBatchName1.setText("    ");

        validateAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateAmount.setForeground(new java.awt.Color(0, 0, 0));
        validateAmount.setText("     ");

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

        jButtonInsert1.setBackground(new java.awt.Color(102, 102, 255));
        jButtonInsert1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonInsert1.setForeground(new java.awt.Color(0, 0, 51));
        jButtonInsert1.setText("Save");
        jButtonInsert1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonInsert1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsert1ActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(102, 102, 255));
        jButtonClear.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(0, 0, 51));
        jButtonClear.setText("Clear");
        jButtonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mc Number");

        validateMcnumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateMcnumbers.setForeground(new java.awt.Color(0, 0, 0));
        validateMcnumbers.setText("                                      ");

        txtPaymentNUm.setBackground(new java.awt.Color(204, 204, 204));
        txtPaymentNUm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtPaymentNUm.setForeground(new java.awt.Color(0, 0, 0));
        txtPaymentNUm.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment");

        ValidatePayment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ValidatePayment.setForeground(new java.awt.Color(0, 0, 0));
        ValidatePayment.setText("   ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Balanse");

        validateBalanse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateBalanse.setForeground(new java.awt.Color(0, 0, 0));
        validateBalanse.setText("   ");

        jComboBoxCoursePay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCoursePay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxCoursePayFocusLost(evt);
            }
        });

        jComboBoxBatchPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBatchPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxBatchPayFocusLost(evt);
            }
        });

        txtPayment.setBackground(new java.awt.Color(255, 255, 255));
        txtPayment.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtPayment.setForeground(new java.awt.Color(0, 0, 0));
        txtPayment.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaymentFocusLost(evt);
            }
        });

        txtBalnse.setBackground(new java.awt.Color(255, 255, 255));
        txtBalnse.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtBalnse.setForeground(new java.awt.Color(0, 0, 0));
        txtBalnse.setCaretColor(new java.awt.Color(0, 0, 0));
        txtBalnse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBalnseFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validateMcnumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(validateNot, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                        .addComponent(txtPayMcNumber)
                                        .addComponent(validateCoursesName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(validateBatchName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAmount1)
                                        .addComponent(validateAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ValidatePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(validateBalanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxCoursePay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxBatchPay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPayment)
                                        .addComponent(txtBalnse)
                                        .addComponent(txtPaymentNUm)))))))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentNUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNot, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPayMcNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateMcnumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCoursePay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxBatchPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateBatchName1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValidatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBalnse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateBalanse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert1)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonClear))
                .addContainerGap())
        );

        txtPaymentNUm.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Payment.jpeg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Student Nic");

        txtLoadMcNum.setBackground(new java.awt.Color(153, 153, 255));
        txtLoadMcNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLoadMcNum.setForeground(new java.awt.Color(0, 0, 0));
        txtLoadMcNum.setCaretColor(new java.awt.Color(0, 0, 0));

        jButtonLoadMc.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLoadMc.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonLoadMc.setForeground(new java.awt.Color(0, 0, 51));
        jButtonLoadMc.setText("Load to Mc Number Payment  From");
        jButtonLoadMc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonLoadMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadMcActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter the Nic First");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lable_IBid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lable_ISid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lable_IDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonLoadMc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLoadMcNum, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoadMcNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLoadMc)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lable_IBid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lable_ISid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lable_IDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLoadMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadMcActionPerformed
        if (txtLoadMcNum.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please Fill Fields");
        } else {

            getregistationdetails();

            System.out.println("Data Ok");
        }


    }//GEN-LAST:event_jButtonLoadMcActionPerformed

    private void jButtonInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsert1ActionPerformed

        if (isSetvalidatePay()) {

            setPayVeriables();

            try {

                String query = "INSERT INTO `payment`(`mc_num`, `couse_name`, `batch_name`, `amount`, `coustormer_payment`, `balanse`) VALUES(?,?,?,?,?,?)";
                // Debug statement to print the query
                System.out.println("Executing query: " + query);
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1, Pay_mc_num);
                pst.setString(2, Pay_course_name);
                pst.setString(3, Pay_batch_name);
                pst.setDouble(4, Pay_amount);
                pst.setDouble(5, Pay_coustomer_payment);
                pst.setDouble(6, Pay_balanse);
                pst.executeUpdate(); // Use executeUpdate for INSERT
                JOptionPane.showMessageDialog(null, "SAVE  SUCCESSFUL");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Can't Insert Data");
                JOptionPane.showMessageDialog(this, e);
                System.out.println(e);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred");
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_jButtonInsert1ActionPerformed

    private void txtPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentFocusLost

        valiPaymentPay();
        Double num1, num2, ans;

        num1 = Double.parseDouble(this.txtAmount1.getText());
        num2 = Double.parseDouble(this.txtPayment.getText());
        ans = num1 - num2;
        this.txtBalnse.setText(ans + "");


    }//GEN-LAST:event_txtPaymentFocusLost

    private void jComboBoxCoursePayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxCoursePayFocusLost
        isvalidateCourseNamePay();
    }//GEN-LAST:event_jComboBoxCoursePayFocusLost

    private void jComboBoxBatchPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxBatchPayFocusLost
        isvalidateBatchPay();
    }//GEN-LAST:event_jComboBoxBatchPayFocusLost

    private void txtAmount1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmount1FocusLost
        validateAmountPay();
    }//GEN-LAST:event_txtAmount1FocusLost

    private void txtBalnseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBalnseFocusLost
        validetBalanse();
    }//GEN-LAST:event_txtBalnseFocusLost

    private void txtPayMcNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayMcNumberFocusLost
        isvalidateMCNumberPay();
    }//GEN-LAST:event_txtPayMcNumberFocusLost

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        ClearPaymentFandL();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_NO_OPTION) {

            if (isSetvalidatePay()) {
                setPayVeriables();

                try {
                    con.setAutoCommit(false); // Disable auto-commit for transaction management

                    String query = "UPDATE `payment` SET `mc_num`=?,`couse_name`=?,`batch_name`=?,`amount`=?,`coustormer_payment`=?,`balanse`=? WHERE  `payment_id`=? ";
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setInt(1, Pay_mc_num);
                        pst.setString(2, Pay_course_name);
                        pst.setString(3, Pay_batch_name);
                        pst.setDouble(4, Pay_amount);
                        pst.setDouble(5, Pay_coustomer_payment);
                        pst.setDouble(6, Pay_balanse);
                        pst.setInt(7, Pay_Id);

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Update Successful");
                        } else {
                            JOptionPane.showMessageDialog(null, "Update Failed: No rows affected.");
                            System.out.println("Update Failed: No rows affected.");
                        }
                    }

                    con.commit(); // Commit the transaction
                    ClearPaymentFandL();
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

    public static void main(String args[]) {

        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValidatePayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonInsert1;
    private javax.swing.JButton jButtonLoadMc;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxBatchPay;
    private javax.swing.JComboBox<String> jComboBoxCoursePay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lable_IBid;
    private javax.swing.JLabel lable_IDueDate;
    private javax.swing.JLabel lable_ISid;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtBalnse;
    private javax.swing.JTextField txtLoadMcNum;
    private javax.swing.JTextField txtPayMcNumber;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPaymentNUm;
    private javax.swing.JLabel validateAmount;
    private javax.swing.JLabel validateBalanse;
    private javax.swing.JLabel validateBatchName1;
    private javax.swing.JLabel validateCoursesName;
    private javax.swing.JLabel validateMcnumbers;
    private javax.swing.JLabel validateNot;
    // End of variables declaration//GEN-END:variables

    int Pay_Id;
    int Pay_mc_num;
    String Pay_course_name;
    String Pay_batch_name;
    float Pay_amount;
    float Pay_coustomer_payment;
    float Pay_balanse;

    public void setPayVeriables() {

        Pay_mc_num = Integer.parseInt(txtPayMcNumber.getText());
        Pay_course_name = jComboBoxCoursePay.getSelectedItem().toString();
        Pay_batch_name = jComboBoxBatchPay.getSelectedItem().toString();
        Pay_amount = Float.parseFloat(txtAmount1.getText());
        Pay_coustomer_payment = Float.parseFloat(txtPayment.getText());
        Pay_balanse = Float.parseFloat(txtBalnse.getText());

        String idTextPay = txtPaymentNUm.getText();
        if (idTextPay != null && !idTextPay.isEmpty()) {
            try {
                Pay_Id = Integer.parseInt(idTextPay);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Student ID");
                return;
            }
        }

    }

    private void customizeCloseOperation() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(
                        AddPaymentForm.this,
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

    public void getregistationdetails() {

        java.sql.Statement stmt;

        try {
            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM `student_registation` WHERE `stu_nic`='" + txtLoadMcNum.getText() + "'");

            if (rs.next()) {

                int mc_num = rs.getInt(2);
                txtPayMcNumber.setText(String.valueOf(mc_num));

            } else {
                JOptionPane.showMessageDialog(null, "Mc Number not found");
                System.out.println("Mc Number not found");

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void setBatchCombo() {

        java.sql.Statement st;

        try {

            st = con.createStatement();

            String comboBox = "SELECT  `batch_name`  FROM `batch_details`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxBatchPay.removeAllItems();

            while (rs.next()) {

                jComboBoxBatchPay.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }

    }

    public void setCourseCombo() {

        java.sql.Statement st;

        try {

            st = con.createStatement();

            String comboBox = "SELECT `couse_name` FROM `course`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxCoursePay.removeAllItems();

            while (rs.next()) {

                jComboBoxCoursePay.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }

    }

    public boolean isSetvalidatePay() {

        boolean isvalidate = isvalidateMCNumberPay() & isvalidateCourseNamePay() & isvalidateBatchPay() & valiPaymentPay() & validateAmountPay() & validetBalanse();
        return isvalidate;
    }

    private boolean isvalidateMCNumberPay() {

        if (txtPayMcNumber.getText().equals("")) {

            validateMcnumbers.setText("Can not be empty");

        } else if (!Pattern.matches("[0-9]{4,5}", txtPayMcNumber.getText())) {

            validateMcnumbers.setText("Min 4 Numbers Max 5 Numbers(2024 or 20245)");

        } else {
            validateMcnumbers.setText(" ");
        }
        return true;
    }

    public boolean isvalidateCourseNamePay() {

        if (jComboBoxCoursePay.getSelectedIndex() == 0) {
            validateCoursesName.setText("Selected Course Name");
            return false;

        } else {
            validateCoursesName.setText(" ");

        }

        return true;

    }

    public boolean isvalidateBatchPay() {

        if (jComboBoxBatchPay.getSelectedIndex() == 0) {
            validateBatchName1.setText("Selected Course Name");
            return false;

        } else {
            validateBatchName1.setText(" ");

        }

        return true;

    }

    public boolean validateAmountPay() {

        if (txtAmount1.getText().isEmpty()) {

            validateAmount.setText("Can not be empty");
            return false;

        } else if (!Pattern.matches("[0-9]{1,6}.[0-9]{1,2}", txtAmount1.getText())) {

            validateAmount.setText("Please enter maximum 6 numbers with maximum 2 desimals.");
            return false;
        } else {
            validateAmount.setText(" ");
        }

        return true;

    }

    public boolean valiPaymentPay() {

        if (txtPayment.getText().isEmpty()) {

            ValidatePayment.setText("Can not be empty");
            return false;

        } else if (!Pattern.matches("[0-9]{1,6}.[0-9]{1,2}", txtPayment.getText())) {

            ValidatePayment.setText("Please enter maximum 6 numbers with maximum 2 desimals.");
            return false;
        } else {
            ValidatePayment.setText(" ");
        }

        return true;
    }

    public boolean validetBalanse() {

        if (txtBalnse.getText().equals("")) {

            validateBalanse.setText("Can not be empty");

        } else {
            validateBalanse.setText(" ");
        }
        return true;
    }

    //Clear method for Fields And ValidateLabels....
    public void ClearPaymentFandL() {

        txtAmount1.setText("");
        txtBalnse.setText("");
        txtLoadMcNum.setText("");
        txtPayMcNumber.setText("");
        txtPayment.setText("");
        txtPaymentNUm.setText("");
        jComboBoxBatchPay.setSelectedIndex(0);
        jComboBoxCoursePay.setSelectedIndex(0);

        ValidatePayment.setText(" ");
        validateAmount.setText(" ");
        validateBalanse.setText(" ");
        validateBatchName1.setText(" ");
        validateCoursesName.setText(" ");
        validateMcnumbers.setText(" ");

    }

}
