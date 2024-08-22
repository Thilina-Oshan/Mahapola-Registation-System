package Interfase;

import Classes.AddRegistationClass;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddRegistationForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;
    Statement st;
    ResultSet rs;

    public AddRegistationForm() {
        initComponents();
        setBatchCombo();
        setCourseCombo();
        customizeCloseOperation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEnterNic = new javax.swing.JTextField();
        lable_IBid = new javax.swing.JLabel();
        lable_ISid = new javax.swing.JLabel();
        lable_IDate = new javax.swing.JLabel();
        lable_IDueDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtPhoneNUm1 = new javax.swing.JTextField();
        txtNic1 = new javax.swing.JTextField();
        validateMcNUm = new javax.swing.JLabel();
        validateName1 = new javax.swing.JLabel();
        validatePnum1 = new javax.swing.JLabel();
        validateAddress1 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsert1 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        validateNIc2 = new javax.swing.JLabel();
        txtMCNUm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBatchReg = new javax.swing.JComboBox<>();
        validateBstchReg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCourseReg = new javax.swing.JComboBox<>();
        validateCourseReg = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRegId = new javax.swing.JTextField();
        validateRegId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        validateStatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        validateEnterdNic = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserReg = new com.toedter.calendar.JDateChooser();
        vaidateDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Student Nic");

        txtEnterNic.setBackground(new java.awt.Color(153, 153, 255));
        txtEnterNic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEnterNic.setForeground(new java.awt.Color(0, 0, 0));
        txtEnterNic.setCaretColor(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Iconsmind-Outline-Student-MaleFemale.512 (3).png"))); // NOI18N
        jLabel10.setText(" Enterd Student Details");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registerd Id");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Student Name ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone Number ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");

        txtAddress1.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtAddress1.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtAddress1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress1FocusLost(evt);
            }
        });

        txtName1.setBackground(new java.awt.Color(255, 255, 255));
        txtName1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 0, 0));
        txtName1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtName1FocusLost(evt);
            }
        });

        txtPhoneNUm1.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneNUm1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtPhoneNUm1.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoneNUm1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPhoneNUm1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNUm1FocusLost(evt);
            }
        });

        txtNic1.setBackground(new java.awt.Color(255, 255, 255));
        txtNic1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtNic1.setForeground(new java.awt.Color(0, 0, 0));
        txtNic1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNic1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNic1FocusLost(evt);
            }
        });

        validateMcNUm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateMcNUm.setForeground(new java.awt.Color(0, 0, 0));
        validateMcNUm.setText("                                      ");

        validateName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateName1.setForeground(new java.awt.Color(0, 0, 0));
        validateName1.setText(" ");

        validatePnum1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validatePnum1.setForeground(new java.awt.Color(0, 0, 0));
        validatePnum1.setText("    ");

        validateAddress1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateAddress1.setForeground(new java.awt.Color(0, 0, 0));
        validateAddress1.setText("     ");

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
        jLabel16.setText("Student Nic ");

        validateNIc2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateNIc2.setForeground(new java.awt.Color(0, 0, 0));
        validateNIc2.setText("                                      ");

        txtMCNUm.setBackground(new java.awt.Color(255, 255, 255));
        txtMCNUm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtMCNUm.setForeground(new java.awt.Color(0, 0, 0));
        txtMCNUm.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMCNUm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMCNUmFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch");

        jComboBoxBatchReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxBatchRegFocusLost(evt);
            }
        });

        validateBstchReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateBstchReg.setForeground(new java.awt.Color(0, 0, 0));
        validateBstchReg.setText("   ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");

        jComboBoxCourseReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCourseReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxCourseRegFocusLost(evt);
            }
        });

        validateCourseReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateCourseReg.setForeground(new java.awt.Color(0, 0, 0));
        validateCourseReg.setText("                                                  ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Student MC");

        txtRegId.setBackground(new java.awt.Color(204, 204, 204));
        txtRegId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRegId.setForeground(new java.awt.Color(0, 0, 0));
        txtRegId.setCaretColor(new java.awt.Color(0, 0, 0));

        validateRegId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateRegId.setForeground(new java.awt.Color(0, 0, 0));
        validateRegId.setText("Registerd Id Is AutoIncrement");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status");

        validateStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateStatus.setForeground(new java.awt.Color(0, 0, 0));
        validateStatus.setText("                                                  ");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegId)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMCNUm, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                        .addComponent(validateMcNUm, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(txtNic1)
                                        .addComponent(txtName1)
                                        .addComponent(validateName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(validatePnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPhoneNUm1)
                                        .addComponent(txtAddress1)
                                        .addComponent(validateAddress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxBatchReg, 0, 281, Short.MAX_VALUE)
                                        .addComponent(validateBstchReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxCourseReg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(validateNIc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(validateRegId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(validateCourseReg, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(validateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateRegId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMCNUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateMcNUm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateNIc2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateName1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPhoneNUm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validatePnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validateAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(115, 115, 115)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBatchReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateBstchReg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCourseReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateCourseReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateStatus)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonUpdate)
                        .addComponent(jButtonInsert1))
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jComboBoxBatchReg.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxBatchReg.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCourseReg.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCourseReg.setForeground(new java.awt.Color(0, 0, 0));
        txtRegId.setEnabled(false);
        jComboBoxStatus.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxStatus.setForeground(new java.awt.Color(0, 0, 0));

        validateEnterdNic.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        validateEnterdNic.setForeground(new java.awt.Color(0, 0, 0));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Load to data registerd student details From");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enter the Nic First");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Registred Date");

        vaidateDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vaidateDate.setForeground(new java.awt.Color(255, 255, 255));
        vaidateDate.setText("                                      ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lable_IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(261, 261, 261)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lable_IBid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lable_ISid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lable_IDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(validateEnterdNic, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(204, 204, 204)
                                                .addComponent(vaidateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEnterNic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(validateEnterdNic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lable_IBid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaidateDate)
                .addGap(16, 16, 16)
                .addComponent(lable_ISid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lable_IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lable_IDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDateChooserReg.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserReg.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtEnterNic.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please Fill Fields");
        } else {

            getAddaplicantdetails();

            System.out.println("Data Ok");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtMCNUmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMCNUmFocusLost
        isvalidateMcNumber();
    }//GEN-LAST:event_txtMCNUmFocusLost

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        ClearFieldsReg();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsert1ActionPerformed

        if (isvalidateReg()) {
            try {
                SetVariableRegistation();
                String query = "INSERT INTO `student_registation` (`mc_num`, `stu_nic`, `stu_name`, `phone_num`, `address`, `batch_name`, `couse_name` , `status` , `reg_date`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                // Debug statement to print the query
                System.out.println("Executing query: " + query);

                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1, mc_number);
                pst.setString(2, Reg_nic);
                pst.setString(3, Reg_name);
                pst.setString(4, Reg_phoneNum);
                pst.setString(5, Reg_address);
                pst.setString(6, Reg_batchName);
                pst.setString(7, Reg_courseName);  // Corrected index to 7
                pst.setString(8, Reg_statusS);      // Added status parameter at correct index
                // Handling null for Reg_Date
                if (Reg_Date != null) {
                    pst.setDate(9, new java.sql.Date(Reg_Date.getTime()));
                } else {
                    pst.setNull(9, java.sql.Types.DATE);
                }

                pst.executeUpdate(); // Use executeUpdate for INSERT
                JOptionPane.showMessageDialog(null, "Save Successfull");
                System.out.println("Sucess");
                ClearFieldsReg();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Can't Insert Data");
                JOptionPane.showMessageDialog(this, Reg_batchName + " Batch  is Already Exists", "Found Duplicate Entries, HEIGHT", 2);
                System.out.println("Not");
                //                JOptionPane.showMessageDialog(this, " Duplicate entry " + Reg_batchName);s
                System.out.println(e);
                System.out.println(e);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred");
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButtonInsert1ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_NO_OPTION) {

            if (isvalidateReg()) {
                SetVariableRegistation();

                try {
                    con.setAutoCommit(false); // Disable auto-commit for transaction management

                    String query = "UPDATE `student_registation` SET `mc_num`=?, `stu_nic`=?,`stu_name`=?,`phone_num`=?,`address`=?,`batch_name`=?,`couse_name`=? , `status`=?, `reg_date`=? WHERE `reg-id`= ?";
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setInt(1, mc_number);
                        pst.setString(2, Reg_nic);
                        pst.setString(3, Reg_name);
                        pst.setString(4, Reg_phoneNum);
                        pst.setString(5, Reg_address);
                        pst.setString(6, Reg_batchName);
                        pst.setString(7, Reg_courseName);
                        pst.setString(8, Reg_statusS);
                        pst.setDate(9, new java.sql.Date(Reg_Date.getTime()));
                        pst.setInt(10, regi_Id); // Use the correct variable for the registration ID

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Update Successful");
                        } else {
                            JOptionPane.showMessageDialog(null, "Update Failed: No rows affected.");
                            System.out.println("Update Failed: No rows affected.");
                        }
                    }

                    con.commit(); // Commit the transaction
                    ClearFieldsReg();
                } catch (Exception e) {
                    try {
                        con.rollback(); // Rollback transaction on error
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Rollback failed: " + ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(this, Reg_batchName + " Batch  is Already Exists", "Found Duplicate Entries, HEIGHT", 2);
                    //                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
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

    private void txtNic1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNic1FocusLost
        isvalidateNicReg();
    }//GEN-LAST:event_txtNic1FocusLost

    private void txtPhoneNUm1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNUm1FocusLost
        isvalidatePhonenumberReg();
    }//GEN-LAST:event_txtPhoneNUm1FocusLost

    private void txtName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName1FocusLost
        isvalidateNameReg();
    }//GEN-LAST:event_txtName1FocusLost

    private void txtAddress1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress1FocusLost
        isvalidateAddressReg();
    }//GEN-LAST:event_txtAddress1FocusLost

    private void jComboBoxBatchRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxBatchRegFocusLost
        isvalidateBatchReg();
    }//GEN-LAST:event_jComboBoxBatchRegFocusLost

    private void jComboBoxCourseRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxCourseRegFocusLost
        isvalidateCourseReg();
    }//GEN-LAST:event_jComboBoxCourseRegFocusLost

    public static void main(String args[]) {

        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRegistationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonInsert1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxBatchReg;
    private javax.swing.JComboBox<String> jComboBoxCourseReg;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private com.toedter.calendar.JDateChooser jDateChooserReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lable_IBid;
    private javax.swing.JLabel lable_IDate;
    private javax.swing.JLabel lable_IDueDate;
    private javax.swing.JLabel lable_ISid;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtEnterNic;
    private javax.swing.JTextField txtMCNUm;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNic1;
    private javax.swing.JTextField txtPhoneNUm1;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JLabel vaidateDate;
    private javax.swing.JLabel validateAddress1;
    private javax.swing.JLabel validateBstchReg;
    private javax.swing.JLabel validateCourseReg;
    private javax.swing.JLabel validateEnterdNic;
    private javax.swing.JLabel validateMcNUm;
    private javax.swing.JLabel validateNIc2;
    private javax.swing.JLabel validateName1;
    private javax.swing.JLabel validatePnum1;
    private javax.swing.JLabel validateRegId;
    private javax.swing.JLabel validateStatus;
    // End of variables declaration//GEN-END:variables

    int regi_Id;
    int mc_number;
    String Reg_nic;
    String Reg_name;
    String Reg_phoneNum;
    String Reg_address;
    String Reg_batchName;
    String Reg_courseName;
    String Reg_statusS;
    Date Reg_Date;

    public void SetVariableRegistation() {

        mc_number = Integer.parseInt(txtMCNUm.getText());
        Reg_nic = txtNic1.getText();
        Reg_name = txtName1.getText();
        Reg_phoneNum = txtPhoneNUm1.getText();
        Reg_address = txtAddress1.getText();
        Reg_batchName = jComboBoxBatchReg.getSelectedItem().toString();
        Reg_courseName = jComboBoxCourseReg.getSelectedItem().toString();
        Reg_statusS = jComboBoxStatus.getSelectedItem().toString();
        Reg_Date = jDateChooserReg.getDate();

        String idTextReg = txtRegId.getText();
        if (idTextReg != null && !idTextReg.isEmpty()) {
            try {
                regi_Id = Integer.parseInt(idTextReg);
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
                        AddRegistationForm.this,
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
                    ClearFieldsReg();
                }
            }
        });
    }

    public void getAddaplicantdetails() {

        java.sql.Statement stmt;

        try {
            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM `student_details` WHERE `stu_nic`='" + txtEnterNic.getText() + "'");

            if (rs.next()) {

                String nic = rs.getString(2);
                String name = rs.getString(3);
                int phoneNum = rs.getInt(4);
                String address = rs.getString(5);

                txtNic1.setText(nic);
                txtName1.setText(name);
                txtPhoneNUm1.setText(phoneNum + "");
                txtAddress1.setText(address);

                txtNic1.setEnabled(false);
                txtName1.setEnabled(false);
                txtPhoneNUm1.setEnabled(false);
                txtAddress1.setEnabled(false);
                validateNIc2.setText("Do not Chanege Nic");
                validateName1.setText("Do not Chanege Name");
                validatePnum1.setText("Do not Chanege Phone Number");
                validateAddress1.setText("Do not Chanege Address");

            } else {
                JOptionPane.showMessageDialog(null, "Student not found");

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    public boolean isvalidateReg() {

        boolean isvalidate = isvalidateNicReg() & isvalidateNameReg() & isvalidatePhonenumberReg() & isvalidateAddressReg() & isvalidateMcNumber() & isvalidateBatchReg() & isvalidateCourseReg() & isvalidateSatusReg() & isvalidateDate();
        return isvalidate;
    }

    private boolean isvalidateMcNumber() {

        String mcNumber = this.txtMCNUm.getText();
        if (mcNumber.isBlank() | mcNumber.isEmpty()) {
            validateMcNUm.setText("plz enter the MC Number");
            return false;
        } else if (!Pattern.matches("^[0-9]{1,5}", mcNumber)) {
            validateMcNUm.setText("Invalid Mc Number");
            return false;
        } else {
            validateMcNUm.setText("");
            return true;

        }

    }

    private boolean isvalidateNicReg() {

        if (txtNic1.getText().equals("")) {

            validateNIc2.setText("Can not be empty");

        } else {
            validateNIc2.setText(" ");
        }
        return true;
    }

    public boolean isvalidateNameReg() {

        if (txtName1.getText().isEmpty()) {
            validateName1.setText("Can not be Empty");
            return false;
        } else {
            validateName1.setText("");
        }
        return true;

    }

    private boolean isvalidatePhonenumberReg() {

        if (txtPhoneNUm1.getText().isEmpty()) {

            validatePnum1.setText("Can not be empty");
        } else {
            validatePnum1.setText(" ");
        }
        return true;
    }

    private boolean isvalidateAddressReg() {

        if (txtAddress1.getText().isEmpty()) {

            validateAddress1.setText("Can not be empty");

        } else {
            validateAddress1.setText(" ");
        }
        return true;
    }

    private boolean isvalidateCourseReg() {

        if (jComboBoxCourseReg.getSelectedIndex() == 0) {

            validateCourseReg.setText("Can not be empty");

        } else {
            validateCourseReg.setText(" ");
        }
        return true;
    }

    private boolean isvalidateBatchReg() {

        if (jComboBoxBatchReg.getSelectedIndex() == 0) {
            validateBstchReg.setText("Select Batch");

        } else {
            validateBstchReg.setText("");
        }
        return true;
    }

    private boolean isvalidateSatusReg() {

        if (jComboBoxStatus.getSelectedIndex() == 0) {

            validateStatus.setText("Can not be empty");

        } else {
            validateStatus.setText(" ");
        }
        return true;
    }

    public boolean isvalidateDate() {
        if (jDateChooserReg.getDate() == null) {
            vaidateDate.setText("Choose the Date");
            JOptionPane.showMessageDialog(null, "Please choose a date.", "Date Required", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            vaidateDate.setText(" ");
        }
        return true;

    }

    public void ClearFieldsReg() {

        txtNic1.setText("");
        txtAddress1.setText("");
        txtMCNUm.setText("");
        txtName1.setText("");
        txtPhoneNUm1.setText("");
        jComboBoxBatchReg.setSelectedIndex(0);
        jComboBoxCourseReg.setSelectedIndex(0);
        jDateChooserReg.setDate(null);

        validateAddress1.setText(" ");
        validateBstchReg.setText(" ");
        validateCourseReg.setText(" ");
        validateEnterdNic.setText(" ");
        validateMcNUm.setText(" ");
        validateName1.setText(" ");
        validateName1.setText(" ");
        validatePnum1.setText(" ");
        validateStatus.setText(" ");
        validateNIc2.setText(" ");
        vaidateDate.setText(" ");
    }

    public void setBatchCombo() {

        java.sql.Statement st;

        try {

            st = con.createStatement();

            String comboBox = "SELECT  `batch_name`  FROM `batch_details`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxBatchReg.removeAllItems();

            while (rs.next()) {

                jComboBoxBatchReg.addItem(rs.getString(1));
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
            jComboBoxCourseReg.removeAllItems();

            while (rs.next()) {

                jComboBoxCourseReg.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }

    }

    public void DisableTxtFiels() {

        txtNic1.setEnabled(false);
        txtName1.setEnabled(false);
        txtPhoneNUm1.setEnabled(false);
        txtAddress1.setEnabled(false);
        validateNIc2.setText("Do not Chanege Nic");
        validateName1.setText("Do not Chanege Name");
        validatePnum1.setText("Do not Chanege Phone Number");
        validateAddress1.setText("Do not Chanege Address");
    }

    // Here the getter setter method is created. Click on the Student Registration table to disable the text fields. The getter setter method is used to disable the text fields.
    public JTextField getTxtAddress1() {
        return txtAddress1;
    }

    public JTextField getTxtName1() {
        return txtName1;
    }

    public JTextField getTxtNic1() {
        return txtNic1;
    }

    public JTextField getTxtPhoneNUm1() {
        return txtPhoneNUm1;
    }

    public JLabel getValidateAddress1() {
        return validateAddress1;
    }

    public JLabel getValidateNIc2() {
        return validateNIc2;
    }

    public JLabel getValidateName1() {
        return validateName1;
    }

    public JLabel getValidatePnum1() {
        return validatePnum1;
    }

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public void setTxtAddress1(JTextField txtAddress1) {
        this.txtAddress1 = txtAddress1;
    }

    public void setTxtName1(JTextField txtName1) {
        this.txtName1 = txtName1;
    }

    public void setTxtNic1(JTextField txtNic1) {
        this.txtNic1 = txtNic1;
    }

    public void setTxtPhoneNUm1(JTextField txtPhoneNUm1) {
        this.txtPhoneNUm1 = txtPhoneNUm1;
    }

    public void setValidateAddress1(JLabel validateAddress1) {
        this.validateAddress1 = validateAddress1;
    }

    public void setValidateNIc2(JLabel validateNIc2) {
        this.validateNIc2 = validateNIc2;
    }

    public void setValidateName1(JLabel validateName1) {
        this.validateName1 = validateName1;
    }

    public void setValidatePnum1(JLabel validatePnum1) {
        this.validatePnum1 = validatePnum1;
    }

    public void setjComboBoxStatus(JComboBox<String> jComboBoxStatus) {
        this.jComboBoxStatus = jComboBoxStatus;
    }

    private boolean addRegDuplicateCheck() {

        SetVariableRegistation();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) FROM `student_registration` WHERE `stu_nic` = ? AND `batch_name` = ?");

            while (rs.next()) {

                if (rs.getString(1).equals(Reg_nic)) {

                    JOptionPane.showMessageDialog(this, Reg_nic + " Batch  is Already Exists", "Found Duplicate Entries, HEIGHT", 2);
                    return false;

                }

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
            System.out.println(e);
        }

        return true;

    }

    private boolean addRegDuplicateChecks() {
        SetVariableRegistation(); // Ensure that this method correctly sets the variables

        try {
            String query = "SELECT COUNT(*) FROM `student_registration` WHERE `stu_nic` = ? AND `batch_name` = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, mc_number);  // Assuming mc_number is an int
            pst.setString(2, Reg_batchName);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);

                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "The Nic Number " + Reg_nic + " is already registered in the batch " + Reg_batchName, "Duplicate Entry Found", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while checking for duplicates.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }

        return true;  // No duplicates found, safe to proceed
    }

}
