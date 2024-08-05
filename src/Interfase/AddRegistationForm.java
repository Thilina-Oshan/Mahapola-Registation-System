package Interfase;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddRegistationForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;

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
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
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
        jButton3 = new javax.swing.JButton();
        jButtonInsert1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        validateNIc2 = new javax.swing.JLabel();
        txtMCNUm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBatch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCourse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        validateEnterdNic = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jLabel12.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Student Details");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Student Nic");

        txtEnterNic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Iconsmind-Outline-Student-MaleFemale.512 (3).png"))); // NOI18N
        jLabel10.setText(" Enterd Student Details");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student MC");

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

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 51));
        jButton4.setText("Update");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch");

        jComboBoxBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("   ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");

        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("   ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validateNIc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(validateMcNUm, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txtMCNUm)
                                    .addComponent(txtNic1)
                                    .addComponent(txtName1)
                                    .addComponent(validateName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validatePnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNUm1)
                                    .addComponent(txtAddress1)
                                    .addComponent(validateAddress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxBatch, 0, 281, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(13, 13, 13))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMCNUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateMcNUm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNIc2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateName1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhoneNUm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validatePnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        validateEnterdNic.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        validateEnterdNic.setForeground(new java.awt.Color(0, 0, 0));
        validateEnterdNic.setText("jLabel6");

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
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lable_IBid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lable_ISid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lable_IDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(validateEnterdNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEnterNic, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEnterNic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validateEnterdNic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lable_IBid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(10, 10, 10)
                .addComponent(lable_ISid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 63, Short.MAX_VALUE)
                .addComponent(lable_IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(lable_IDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtEnterNic.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please Fill Fields");
        } else {

            getAddaplicantdetails();

            System.out.println("Data Ok");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtNic1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNic1FocusLost
        isvalidateNicReg();
    }//GEN-LAST:event_txtNic1FocusLost

    private void txtName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName1FocusLost
        isvalidateNameReg();
    }//GEN-LAST:event_txtName1FocusLost

    private void txtPhoneNUm1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNUm1FocusLost
        isvalidatePhonenumberReg();
    }//GEN-LAST:event_txtPhoneNUm1FocusLost

    private void txtAddress1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress1FocusLost
        isvalidateAddressReg();
    }//GEN-LAST:event_txtAddress1FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ClearFieldsReg();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsert1ActionPerformed

        if (isvalidateReg()) {

            SetVariableRegistation();

            try {

                String query = "INSERT INTO `student_registation`(`mc_num`, `stu_nic`, `stu_name`, `phone_num`, `address`, `batch_name`, `couse_name`) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, mc_number);
                pst.setString(2, Reg_nic);
                pst.setString(3, Reg_name);
                pst.setString(4, "0" + Reg_phoneNum);
                pst.setString(5, Reg_address);
                pst.setString(6, Reg_batchName);
                pst.setString(7, Reg_courseName);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Sucess");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Cant");
                System.out.println(e);

            }

        }

    }//GEN-LAST:event_jButtonInsert1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonInsert1;
    private javax.swing.JComboBox<String> jComboBoxBatch;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lable_IDate;
    private javax.swing.JLabel lable_IDueDate;
    private javax.swing.JLabel lable_ISid;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtEnterNic;
    private javax.swing.JTextField txtMCNUm;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNic1;
    private javax.swing.JTextField txtPhoneNUm1;
    private javax.swing.JLabel validateAddress1;
    private javax.swing.JLabel validateEnterdNic;
    private javax.swing.JLabel validateMcNUm;
    private javax.swing.JLabel validateNIc2;
    private javax.swing.JLabel validateName1;
    private javax.swing.JLabel validatePnum1;
    // End of variables declaration//GEN-END:variables

    int mc_number;
    String Reg_nic;
    String Reg_name;
    String Reg_phoneNum;
    String Reg_address;
    String Reg_batchName;
    String Reg_courseName;

    public void SetVariableRegistation() {

        mc_number = Integer.parseInt(txtMCNUm.getText());
        Reg_nic = txtNic1.getText();
        Reg_name = txtName1.getText();
        Reg_phoneNum = txtPhoneNUm1.getText();
        Reg_address = txtAddress1.getText();
        Reg_batchName = jComboBoxBatch.getSelectedItem().toString();
        Reg_courseName = jComboBoxCourse.getSelectedItem().toString();

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

        boolean isvalidate = isvalidateNicReg() & isvalidateNameReg() & isvalidatePhonenumberReg() & isvalidateAddressReg();
        return isvalidate;
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

    public void ClearFieldsReg() {

        txtNic1.setText("");
        txtAddress1.setText("");
        txtMCNUm.setText("");
        txtName1.setText("");
        txtPhoneNUm1.setText("");
        jComboBoxBatch.setSelectedIndex(0);
        jComboBoxCourse.setSelectedIndex(0);
    }

    public void setBatchCombo() {

        java.sql.Statement st;

        try {

            st = con.createStatement();

            String comboBox = "SELECT  `batch_name`  FROM `batch_details`";
            ResultSet rs = st.executeQuery(comboBox);
            jComboBoxBatch.removeAllItems();

            while (rs.next()) {

                jComboBoxBatch.addItem(rs.getString(1));
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
            jComboBoxCourse.removeAllItems();

            while (rs.next()) {

                jComboBoxCourse.addItem(rs.getString(1));
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

}
