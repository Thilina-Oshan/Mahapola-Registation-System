/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import static Interfase.AddBatchForm.con;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Oshan Demel
 */
public class AddBatchForm extends javax.swing.JFrame {

    static Connection con = MainInterfase.conn;
    private AddBatch addbatch;
    ResultSet rs;
   
    public AddBatchForm() {
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
        txtBatchName = new javax.swing.JTextField();
        txtBtchId = new javax.swing.JTextField();
        NOValidate = new javax.swing.JLabel();
        validateBatchName = new javax.swing.JLabel();
        validateSDate = new javax.swing.JLabel();
        validateEnddate = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        DateChooserStartDate = new com.toedter.calendar.JDateChooser();
        DateChooserEndDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton151 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Batch-removebg-preview (1).png"))); // NOI18N
        jLabel9.setText(" Enterd Batch Details");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Batch Id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Batch Number");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Start Date");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("End Date");

        txtBatchName.setBackground(new java.awt.Color(255, 255, 255));
        txtBatchName.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtBatchName.setForeground(new java.awt.Color(0, 0, 0));
        txtBatchName.setCaretColor(new java.awt.Color(0, 0, 0));
        txtBatchName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBatchNameFocusLost(evt);
            }
        });

        txtBtchId.setBackground(new java.awt.Color(204, 255, 255));
        txtBtchId.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtBtchId.setForeground(new java.awt.Color(0, 0, 0));
        txtBtchId.setCaretColor(new java.awt.Color(0, 0, 0));

        NOValidate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NOValidate.setForeground(new java.awt.Color(0, 0, 0));
        NOValidate.setText("Batch Id Is Auto Increment");

        validateBatchName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateBatchName.setForeground(new java.awt.Color(0, 0, 0));
        validateBatchName.setText("Batch number should be like this DR_2024(01)");

        validateSDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateSDate.setForeground(new java.awt.Color(0, 0, 0));
        validateSDate.setText("    ");

        validateEnddate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validateEnddate.setForeground(new java.awt.Color(0, 0, 0));
        validateEnddate.setText("     ");

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

        jButtonInsert.setBackground(new java.awt.Color(102, 102, 255));
        jButtonInsert.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(0, 0, 51));
        jButtonInsert.setText("Save");
        jButtonInsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 51), null, new java.awt.Color(51, 0, 51)));
        jButtonInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
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
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOValidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateBatchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateSDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validateEnddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBatchName)
                                    .addComponent(DateChooserStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtBtchId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(DateChooserEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtBtchId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooserStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14)
                .addComponent(validateSDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateChooserEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateEnddate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        txtBtchId.setEnabled(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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

    private void jButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton151ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton151ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearFiled();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        if (isvalidate()) {

            try {
                setBatchVariables();

                String query = "INSERT INTO `batch_details` (`batch_name`, `startdate`, `enddate`) VALUES (?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, BName);
                pst.setDate(2, new java.sql.Date (StartDate.getTime()));
                pst.setDate(3, new java.sql.Date (EndDate.getTime()));
               
                pst.execute();
                JOptionPane.showMessageDialog(this, "SAVE SUCCESSFUL");
                System.out.println("");
                clearFiled();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, e);
                JOptionPane.showMessageDialog(null, "Can't Save");
                clearFiled();
            }
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        if (isvalidate()) {
            setBatchVariables();

            try {
                // Print the variables to ensure they are set correctly
                System.out.println("NIC: " + bid);
                System.out.println("Name: " + BName);
                System.out.println("Phone Number: " + StartDate);
                System.out.println("Address: " + EndDate);
                

                // Check if the student ID exists
                String checkQuery = "SELECT COUNT(*) FROM `batch_details` WHERE `batch_id` = ?";
                PreparedStatement checkPst = con.prepareStatement(checkQuery);
                checkPst.setInt(1, bid);

                ResultSet rs = checkPst.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    // Proceed with the update
                    String query = "UPDATE `batch_details` SET `batch_name`= ?,`startdate`= ?,`enddate`= ? WHERE `batch_id`= ?";
                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, BName);
                    pst.setDate(2, new java.sql.Date (StartDate.getTime()));
                    pst.setDate(3, new java.sql.Date (EndDate.getTime()));
                    pst.setInt(4, bid);
                    

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
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void txtBatchNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBatchNameFocusLost
        isvalidateBatchName();
    }//GEN-LAST:event_txtBatchNameFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBatchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserEndDate;
    private com.toedter.calendar.JDateChooser DateChooserStartDate;
    private javax.swing.JLabel NOValidate;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBatchName;
    private javax.swing.JTextField txtBtchId;
    private javax.swing.JLabel validateBatchName;
    private javax.swing.JLabel validateEnddate;
    private javax.swing.JLabel validateSDate;
    // End of variables declaration//GEN-END:variables
    int bid;
    String BName;
    Date StartDate;
    Date EndDate;
    
    public void setBatchVariables() {

        BName = txtBatchName.getText();
        StartDate = DateChooserStartDate.getDate();
        EndDate = DateChooserEndDate.getDate();
        // Validate and set stu_id only if it is required (e.g., during update)
        String Batchid = txtBtchId.getText();
        if (Batchid != null && !Batchid.isEmpty()) {
            try {
                bid = Integer.parseInt(Batchid);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Batch ID");
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
                        AddBatchForm.this,
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

        boolean isvalidate = isvalidateBatchName() & isvalidate_Batch_Starting_Date() & isvalidate_Batch_End_Date();
        return isvalidate;
    }
    
    public boolean isvalidateBatchName() {

        if (txtBatchName.getText().isEmpty()) {
            validateBatchName.setText("Can not be Empty");
            return false;
        } else if (!Pattern.matches("^[A-Z]+_\\d{4}\\(\\d{2}\\)$", txtBatchName.getText())) {
            validateBatchName.setText("only 50 leters (ex: ME_2024(01)");
            return false;
        } else {
            validateBatchName.setText("");
        }
        return true;

    }
    
    public boolean isvalidate_Batch_Starting_Date() {

        if (DateChooserStartDate.getDate().toString().isBlank()) {
            validateSDate.setText("Can not be Empty");
        } else {
            validateSDate.setText("  ");
        }
        return true;

    }
    
    public boolean isvalidate_Batch_End_Date() {

        if (DateChooserEndDate.getDate().toString().isBlank()) {
            validateEnddate.setText("Can not be Empty");
        } else {
            validateEnddate.setText("  ");
        }
        return true;

    }
    
    public void clearFiled() {

        txtBtchId.setText("");
        txtBatchName.setText("");
        DateChooserStartDate.setDate(null);
        DateChooserEndDate.setDate(null);
        

    }

}
