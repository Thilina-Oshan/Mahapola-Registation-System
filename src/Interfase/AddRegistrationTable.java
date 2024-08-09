/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.ActiveStatus;
import Classes.AddRegistationClass;
import java.awt.BorderLayout;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static javax.swing.text.html.HTML.Tag.SELECT;

public class AddRegistrationTable extends javax.swing.JPanel {

    static Connection con = MainInterfase.conn;
    AddRegistationForm addregistationform = new AddRegistationForm();

    DefaultTableModel AddRegisterdModel = new DefaultTableModel(new String[]{"Register Id", "Mc Number", "Studen Nic", "Student Name", "Phone Number", "Address", "Batch", "Course", "Status", "Registerd Date"}, 0);//Set Default table

    ArrayList<AddRegistationClass> addregistationArray;
    ResultSet rs;

    AddRegistationForm addregistationForm = new AddRegistationForm();

    public AddRegistrationTable() {
        initComponents();
        jTableRegisterd.setModel(AddRegisterdModel);
        setRegStudenttable();
    }

    private ArrayList<AddRegistationClass> getRegStudentList(String query) {

        ArrayList<AddRegistationClass> Regstudentdlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddRegistationClass studentReg;

            while (rs.next()) {

                studentReg = new AddRegistationClass(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));
                Regstudentdlist.add(studentReg);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
            System.out.println(e);
        }

        return Regstudentdlist;
    }

    void setRegistationTableData(String query) { //table ekata data set 

        AddRegisterdModel.setRowCount(0);
        addregistationArray = getRegStudentList(query);

        for (int i = 0; i < addregistationArray.size(); i++) {

            int a = addregistationArray.get(i).getReg_id();
            int b = addregistationArray.get(i).getMc_num();
            String c = addregistationArray.get(i).getStu_num();
            String d = addregistationArray.get(i).getStu_name();
            String e = addregistationArray.get(i).getStu_phoneNum();
            String f = addregistationArray.get(i).getStu_address();
            String g = addregistationArray.get(i).getBatch_name();
            String h = addregistationArray.get(i).getCourse_name();
            String j = addregistationArray.get(i).getStatus();
            Date k = addregistationArray.get(i).getReg_date();

            AddRegisterdModel.addRow(new Object[]{a, b, c, d, e, f, g, h, j, k});
        }

    }

    public void setRegStudenttable() {

        setRegistationTableData("SELECT `reg-id`, `mc_num`, `stu_nic`, `stu_name`, `phone_num`, `address`, `batch_name`, `couse_name`, `status` , `reg_date` FROM `student_registation`");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddRegistationTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegisterd = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonRegisterd = new javax.swing.JButton();
        jButtonAplicant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRegisterd = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddNewRegisterd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextBatchNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanelAddRegistationTable.setBackground(new java.awt.Color(102, 102, 255));

        jTableRegisterd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRegisterd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegisterdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegisterd);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jButtonRegisterd.setBackground(new java.awt.Color(77, 69, 226));
        jButtonRegisterd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonRegisterd.setForeground(new java.awt.Color(255, 255, 0));
        jButtonRegisterd.setText("Registerd Student");
        jButtonRegisterd.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));

        jButtonAplicant.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAplicant.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonAplicant.setForeground(new java.awt.Color(204, 51, 0));
        jButtonAplicant.setText("Add Aplicant");
        jButtonAplicant.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        jButtonAplicant.setPreferredSize(new java.awt.Dimension(837, 71));
        jButtonAplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addComponent(jButtonAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegisterd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButtonAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        jComboBoxRegisterd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mc_Number", "Nic", "Name", "Batch", "Course" }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextSearchRegisterd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextSearchRegisterdCaretUpdate(evt);
            }
        });
        jTextSearchRegisterd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchRegisterdActionPerformed(evt);
            }
        });

        jButtonAddNewRegisterd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddNewRegisterd.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddNewRegisterd.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddNewRegisterd.setText("Registerd Student Form");
        jButtonAddNewRegisterd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewRegisterdActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(948, 82));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mpma.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(193, 193, 193))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12))
        );

        jTextBatchNumber.setBackground(new java.awt.Color(255, 255, 255));
        jTextBatchNumber.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Batch Number");

        javax.swing.GroupLayout jPanelAddRegistationTableLayout = new javax.swing.GroupLayout(jPanelAddRegistationTable);
        jPanelAddRegistationTable.setLayout(jPanelAddRegistationTableLayout);
        jPanelAddRegistationTableLayout.setHorizontalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddRegistationTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddNewRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jTextBatchNumber))
                        .addGap(34, 34, 34)
                        .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddRegistationTableLayout.setVerticalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextBatchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButtonAddNewRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddRegistationTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddRegistationTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicantActionPerformed
        AddAplicant addAplicantPanel = new AddAplicant();
        jPanelAddRegistationTable.removeAll();
        jPanelAddRegistationTable.setLayout(new BorderLayout());
        jPanelAddRegistationTable.add(addAplicantPanel, BorderLayout.WEST);
        jPanelAddRegistationTable.revalidate();
        jPanelAddRegistationTable.repaint();
    }//GEN-LAST:event_jButtonAplicantActionPerformed

    private void jButtonAddNewRegisterdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewRegisterdActionPerformed
        addregistationform.setVisible(true);
    }//GEN-LAST:event_jButtonAddNewRegisterdActionPerformed

    private void jTableRegisterdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegisterdMouseClicked
        if (jTableRegisterd.getSelectedRowCount() == 1) {

            addregistationForm.setVisible(true);

            try {
                DisableTxtFiels();

                Field fieldRegId = addregistationForm.getClass().getDeclaredField("txtRegId");
                fieldRegId.setAccessible(true);
                JTextField txtRegId = (JTextField) fieldRegId.get(addregistationForm);
                txtRegId.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 0).toString());

                Field fieldMcNum = addregistationForm.getClass().getDeclaredField("txtMCNUm");
                fieldMcNum.setAccessible(true);
                JTextField txtMCNUm = (JTextField) fieldMcNum.get(addregistationForm);
                txtMCNUm.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 1).toString());

                Field fieldNic = addregistationForm.getClass().getDeclaredField("txtNic1");
                fieldNic.setAccessible(true);
                JTextField txtNic1 = (JTextField) fieldNic.get(addregistationForm);
                txtNic1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 2).toString());

                Field fieldName = addregistationForm.getClass().getDeclaredField("txtName1");
                fieldName.setAccessible(true);
                JTextField txtName1 = (JTextField) fieldName.get(addregistationForm);
                txtName1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 3).toString());

                Field fieldPhoneNumber = addregistationForm.getClass().getDeclaredField("txtPhoneNUm1");
                fieldPhoneNumber.setAccessible(true);
                JTextField txtPhoneNUm1 = (JTextField) fieldPhoneNumber.get(addregistationForm);
                txtPhoneNUm1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 4).toString());

                Field fieldAddress = addregistationForm.getClass().getDeclaredField("txtAddress1");
                fieldAddress.setAccessible(true);
                JTextField txtAddress1 = (JTextField) fieldAddress.get(addregistationForm);
                txtAddress1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 5).toString());

                Field fieldBatch = addregistationForm.getClass().getDeclaredField("jComboBoxBatch");
                fieldBatch.setAccessible(true);
                JComboBox<?> jComboBoxBatch = (JComboBox<?>) fieldBatch.get(addregistationForm);
                jComboBoxBatch.setSelectedItem(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 6));

                Field fieldCourse = addregistationForm.getClass().getDeclaredField("jComboBoxCourse");
                fieldCourse.setAccessible(true);
                JComboBox<?> jComboBoxCourse = (JComboBox<?>) fieldCourse.get(addregistationForm);
                jComboBoxCourse.setSelectedItem(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 7).toString());

                Field fieldSatus = addregistationForm.getClass().getDeclaredField("jComboBoxStatus");
                fieldSatus.setAccessible(true);
                JComboBox<?> jComboBoxStatus = (JComboBox<?>) fieldSatus.get(addregistationForm);
                jComboBoxStatus.setSelectedItem(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 9).toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
                JOptionPane.showMessageDialog(this, e.getMessage());
                e.printStackTrace();
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_jTableRegisterdMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        setRegStudenttable();
    }//GEN-LAST:event_formFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setRegStudenttable();
    }//GEN-LAST:event_formMouseClicked

    private void jTextSearchRegisterdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchRegisterdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchRegisterdActionPerformed

    private void jTextSearchRegisterdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextSearchRegisterdCaretUpdate
        String[] col_names = {"mc_num", "stu_nic", "stu_name", "batch_name", "couse_name"};

// Get the batch number from the JTextField for batch number
        String batchNumber = jTextBatchNumber.getText().trim(); // Assuming jTextBatchNumber is your JTextField for batch number

        if (jTextSearchRegisterd.getText().isEmpty() && batchNumber.isEmpty()) {
            // No search criteria entered, display all records
            setRegistationTableData("SELECT * FROM `student_registation` ORDER BY `mc_num`");
            jTextSearchRegisterd.setText("");
        } else {
            // Start building the query
            StringBuilder query = new StringBuilder("SELECT * FROM `student_registation` WHERE ");

            if (!jTextSearchRegisterd.getText().isEmpty()) {
                // Get the selected column from JComboBox
                String col_name = col_names[jComboBoxRegisterd.getSelectedIndex()];
                String value = jTextSearchRegisterd.getText();
                query.append(col_name).append(" LIKE '%").append(value).append("%'");

                if (!batchNumber.isEmpty()) {
                    query.append(" AND "); // If both search criteria are present, add AND clause
                }
            }

            if (!batchNumber.isEmpty()) {
                query.append("`batch_name` LIKE '%").append(batchNumber).append("%'");
            }

            // Execute the constructed query
            setRegistationTableData(query.toString());
        }
    }//GEN-LAST:event_jTextSearchRegisterdCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewRegisterd;
    private javax.swing.JButton jButtonAplicant;
    private javax.swing.JButton jButtonRegisterd;
    private javax.swing.JComboBox<String> jComboBoxRegisterd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAddRegistationTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegisterd;
    private javax.swing.JTextField jTextBatchNumber;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables

    //Disable the Text Fields
    public void DisableTxtFiels() {

        addregistationForm.getTxtNic1().setEnabled(false);
        addregistationForm.getTxtName1().setEnabled(false);
        addregistationForm.getTxtPhoneNUm1().setEnabled(false);
        addregistationForm.getTxtAddress1().setEnabled(false);
        addregistationForm.getValidateNIc2().setText("Do not Update Nic");
        addregistationForm.getValidateName1().setText("Do not Update Name");
        addregistationForm.getValidatePnum1().setText("Do not Update Phone Number");
        addregistationForm.getValidateAddress1().setText("Do not Update Address");

    }

}
