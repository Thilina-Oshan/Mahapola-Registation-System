/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddRegistrationTable extends javax.swing.JPanel {

    static Connection con = MainInterfase.conn;
    AddRegistationForm addregistationform = new AddRegistationForm();

    DefaultTableModel AddRegisterdModel = new DefaultTableModel(new String[]{"Mc Number", "Studen Nic", "Student Name", "Phone Number", "Address", "Batch", "Course", "Registation Date"}, 0);//Set Default table

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

                studentReg = new AddRegistationClass(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getDate(8));
                Regstudentdlist.add(studentReg);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return Regstudentdlist;
    }

    void setRegistationTableData(String query) { //table ekata data set 

        AddRegisterdModel.setRowCount(0);
        addregistationArray = getRegStudentList(query);

        for (int i = 0; i < addregistationArray.size(); i++) {

            int a = addregistationArray.get(i).getMc_num();
            String b = addregistationArray.get(i).getStu_num();
            String c = addregistationArray.get(i).getStu_name();
            String d = addregistationArray.get(i).getStu_phoneNum();
            String e = addregistationArray.get(i).getStu_address();
            String f = addregistationArray.get(i).getBatch_name();
            String g = addregistationArray.get(i).getCourse_name();
            Date h = addregistationArray.get(i).getRegistation_date();

            AddRegisterdModel.addRow(new Object[]{a, b, c, d, e, f, g , h});
        }

    }

    public void setRegStudenttable() {

        setRegistationTableData("SELECT * FROM `student_registation` ORDER BY `mc_num`");
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

        jButtonRegisterd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegisterd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonRegisterd.setForeground(new java.awt.Color(204, 51, 0));
        jButtonRegisterd.setText("Registerd Student");
        jButtonRegisterd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), null, null));

        jButtonAplicant.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAplicant.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonAplicant.setForeground(new java.awt.Color(204, 51, 0));
        jButtonAplicant.setText("Add Aplicant");
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

        jComboBoxRegisterd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mc_Number", "Nic", "Name", " " }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAddRegistationTableLayout = new javax.swing.GroupLayout(jPanelAddRegistationTable);
        jPanelAddRegistationTable.setLayout(jPanelAddRegistationTableLayout);
        jPanelAddRegistationTableLayout.setHorizontalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddRegistationTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddNewRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelAddRegistationTableLayout.setVerticalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                Field fieldMcNum = addregistationForm.getClass().getDeclaredField("txtMCNUm");
                fieldMcNum.setAccessible(true);
                JTextField txtMCNUm = (JTextField) fieldMcNum.get(addregistationForm);
                txtMCNUm.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 0).toString());

                Field fieldNic = addregistationForm.getClass().getDeclaredField("txtNic1");
                fieldNic.setAccessible(true);
                JTextField txtNic1 = (JTextField) fieldNic.get(addregistationForm);
                txtNic1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 1).toString());

                Field fieldName = addregistationForm.getClass().getDeclaredField("txtName1");
                fieldName.setAccessible(true);
                JTextField txtName1 = (JTextField) fieldName.get(addregistationForm);
                txtName1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 2).toString());

                Field fieldPhoneNumber = addregistationForm.getClass().getDeclaredField("txtPhoneNUm1");
                fieldPhoneNumber.setAccessible(true);
                JTextField txtPhoneNUm1 = (JTextField) fieldPhoneNumber.get(addregistationForm);
                txtPhoneNUm1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 3).toString());

                Field fieldAddress = addregistationForm.getClass().getDeclaredField("txtAddress1");
                fieldAddress.setAccessible(true);
                JTextField txtAddress1 = (JTextField) fieldAddress.get(addregistationForm);
                txtAddress1.setText(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 4).toString());

                Field fieldBatch = addregistationForm.getClass().getDeclaredField("jComboBoxBatch");
                fieldBatch.setAccessible(true);
                JComboBox<?> jComboBoxBatch = (JComboBox<?>) fieldBatch.get(addregistationForm);
                jComboBoxBatch.setSelectedItem(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 5));

                Field fieldCourse = addregistationForm.getClass().getDeclaredField("jComboBoxCourse");
                fieldCourse.setAccessible(true);
                JComboBox<?> jComboBoxCourse = (JComboBox<?>) fieldCourse.get(addregistationForm);
                jComboBoxCourse.setSelectedItem(AddRegisterdModel.getValueAt(jTableRegisterd.getSelectedRow(), 6).toString());

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

        String[] col_names = {"mc_num", "stu_nic", "stu_name"};

        if (jTextSearchRegisterd.getText().isEmpty()) {
            setRegistationTableData("SELECT * FROM `student_registation` ORDER BY `mc_num`");
            jTextSearchRegisterd.setText("");
        } else {

            String col_name = col_names[jComboBoxRegisterd.getSelectedIndex()];
            String value = jTextSearchRegisterd.getText();
            String query = "SELECT * FROM `student_registation` WHERE " + col_name + " LIKE '%" + value + "%'";

            setRegistationTableData(query);

        }
    }//GEN-LAST:event_jTextSearchRegisterdCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewRegisterd;
    private javax.swing.JButton jButtonAplicant;
    private javax.swing.JButton jButtonRegisterd;
    private javax.swing.JComboBox<String> jComboBoxRegisterd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAddRegistationTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegisterd;
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
