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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
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
        setBatchCombo();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtExamId = new javax.swing.JTextField();
        validaterIdExam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNicExam = new javax.swing.JTextField();
        validateNicE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMcExam = new javax.swing.JTextField();
        validateMcE = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserExam = new com.toedter.calendar.JDateChooser();
        validateExamDate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxExamCourse = new javax.swing.JComboBox<>();
        validateCourseE = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxBatcExam = new javax.swing.JComboBox<>();
        validateBatchE = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxPassFail = new javax.swing.JComboBox<>();
        validatePassOrFail = new javax.swing.JLabel();
        jButtonInsertE = new javax.swing.JButton();
        jButton3UpdATEe = new javax.swing.JButton();
        jButtonClearE = new javax.swing.JButton();

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

        validateEnterNic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validateEnterNic.setForeground(new java.awt.Color(0, 0, 0));
        validateEnterNic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validateEnterNic.setText("Enter the Nic first");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validateEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIC");

        txtNicExam.setBackground(new java.awt.Color(255, 255, 255));
        txtNicExam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNicExam.setForeground(new java.awt.Color(0, 0, 0));
        txtNicExam.setText("jTextField2");
        txtNicExam.setCaretColor(new java.awt.Color(0, 0, 0));

        validateNicE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateNicE.setForeground(new java.awt.Color(0, 0, 0));
        validateNicE.setText("                                               ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mc Number");

        txtMcExam.setBackground(new java.awt.Color(255, 255, 255));
        txtMcExam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMcExam.setForeground(new java.awt.Color(0, 0, 0));
        txtMcExam.setText("jTextField3");
        txtMcExam.setCaretColor(new java.awt.Color(0, 0, 0));

        validateMcE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateMcE.setForeground(new java.awt.Color(0, 0, 0));
        validateMcE.setText("                                                 ");

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

        jComboBoxBatcExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jButton3UpdATEe.setBackground(new java.awt.Color(102, 102, 255));
        jButton3UpdATEe.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3UpdATEe.setForeground(new java.awt.Color(0, 0, 51));
        jButton3UpdATEe.setText("Update");
        jButton3UpdATEe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonInsertE, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3UpdATEe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClearE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                        .addComponent(jLabel6)))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validatePassOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateBatchE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateCourseE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateExamDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateMcE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validateNicE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validaterIdExam, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txtExamId)
                            .addComponent(txtNicExam)
                            .addComponent(txtMcExam)
                            .addComponent(jDateChooserExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxExamCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxBatcExam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxPassFail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
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
                .addGap(12, 12, 12)
                .addComponent(validaterIdExam, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNicExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateNicE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMcExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateMcE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addComponent(validateExamDate)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxExamCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateCourseE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxBatcExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateBatchE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validatePassOrFail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertE)
                    .addComponent(jButton3UpdATEe)
                    .addComponent(jButtonClearE))
                .addGap(17, 17, 17))
        );

        txtExamId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3UpdATEe;
    private javax.swing.JButton jButtonClearE;
    private javax.swing.JButton jButtonInsertE;
    private javax.swing.JComboBox<String> jComboBoxBatcExam;
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
    private javax.swing.JTextField txtEnterNic;
    private javax.swing.JTextField txtExamId;
    private javax.swing.JTextField txtMcExam;
    private javax.swing.JTextField txtNicExam;
    private javax.swing.JLabel validateBatchE;
    private javax.swing.JLabel validateCourseE;
    private javax.swing.JLabel validateEnterNic;
    private javax.swing.JLabel validateExamDate;
    private javax.swing.JLabel validateMcE;
    private javax.swing.JLabel validateNicE;
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
        BatchNameE = jComboBoxBatcExam.getSelectedItem().toString();
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

        txtEnterNic.setText("");
        txtEnterNic.setEnabled(true);
        txtMcExam.setText("");
        txtMcExam.setEnabled(true);
        txtNicExam.setText("");
        txtNicExam.setEnabled(true);

        validateBatchE.setText(" ");
        validateCourseE.setText(" ");
        validateEnterNic.setText("Enter the Nic");
        validateExamDate.setText(" ");
        validateMcE.setText(" ");
        validateNicE.setText(" ");
        validatePassOrFail.setText(" ");
        validaterIdExam.setText(" ");
    }

    private void customizeCloseOperationExam() {

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
                }
            }
        });
    }

    public void setBatchCombo() {

        java.sql.Statement st;

        try {

            st = con.createStatement();

            String comboBox = "SELECT  `batch_name`  FROM `batch_details`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxBatcExam.removeAllItems();

            while (rs.next()) {

                jComboBoxBatcExam.addItem(rs.getString(1));
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
            jComboBoxExamCourse.removeAllItems();

            while (rs.next()) {

                jComboBoxExamCourse.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }

    }

    //Getter Sette Method
    public JComboBox<String> getjComboBoxBatcExam() {
        return jComboBoxBatcExam;
    }

    public void setjComboBoxBatcExam(JComboBox<String> jComboBoxBatcExam) {
        this.jComboBoxBatcExam = jComboBoxBatcExam;
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

    public JTextField getTxtNicExam() {
        return txtNicExam;
    }

    public void setTxtNicExam(JTextField txtNicExam) {
        this.txtNicExam = txtNicExam;
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

    public JLabel getValidateNicE() {
        return validateNicE;
    }

    public void setValidateNicE(JLabel validateNicE) {
        this.validateNicE = validateNicE;
    }

    public JLabel getValidaterIdExam() {
        return validaterIdExam;
    }

    public void setValidaterIdExam(JLabel validaterIdExam) {
        this.validaterIdExam = validaterIdExam;
    }

}
