/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.AddExamClass;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Oshan Demel
 */
public class ExamTable extends javax.swing.JPanel {

    DefaultTableModel exameModel = new DefaultTableModel(new String[]{"Exam Id", "NIc", "Exam Date", "Exam Result", "Course", "Batch"}, 0);
    AddExamForm addexamform = new AddExamForm();
    ArrayList<AddExamClass> examArray;
    static Connection con = MainInterfase.conn;
    ResultSet rs;

    public ExamTable() {
        initComponents();
        jTableAddExamDetails.setModel(exameModel);
        setExamTable();
        // Customize the table header
        JTableHeader header = jTableAddExamDetails.getTableHeader();
        header.setBackground(new Color(0, 102, 204)); // Set your desired background color
        header.setForeground(Color.WHITE); // Set your desired text color
        header.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 16)); // Customize the font if needed
//        header.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Optional: Set a border for the header

//        // Customize the table body (cell) background color
//        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//
//                if (isSelected) {
//                    c.setBackground(new Color(100, 150, 255)); // Darker blue for selected rows
//                } else {
//                    c.setBackground(new Color(0, 0, 0)); // Light blue for unselected rows
//                }
//
//                return c;
//            }
//        };
//
//        // Apply the renderer to all columns
//        for (int i = 0; i < jTableAddExamDetails.getColumnCount(); i++) {
//            jTableAddExamDetails.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
//        }

    }

    private ArrayList<AddExamClass> getExamist(String query) {

        ArrayList<AddExamClass> examlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddExamClass exam;

            while (rs.next()) {

                exam = new AddExamClass(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4),rs.getString(5),rs.getString(6), rs.getString(7));
                examlist.add(exam);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return examlist;
    }
    
    
      private void setExamTableData(String query) { //table ekata data set 

        exameModel.setRowCount(0);
        examArray = getExamist(query);

        for (int i = 0; i < examArray.size(); i++) {

            int a = examArray.get(i).getExamId();
            String b = examArray.get(i).getNicExam();
            int c = examArray.get(i).getMc_num();
            Date d = examArray.get(i).getExameDate();
            String e = examArray.get(i).getCourseNameE();
            String f = examArray.get(i).getBatchNameE();
            String g = examArray.get(i).getExameResult();

            exameModel.addRow(new Object[]{a, b, c, d, e, f, g});
        }

    }

    public void setExamTable() {

        setExamTableData("SELECT * FROM `exam_detail`");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelExamTable = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAddExamDetails = new javax.swing.JTable();
        jButtonAddExam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxSearchaplicant = new javax.swing.JComboBox<>();
        jTextAplicant = new javax.swing.JTextField();
        jButtonTableCertificate = new javax.swing.JButton();

        jPanelExamTable.setBackground(new java.awt.Color(102, 102, 255));

        jPanelTitle.setBackground(new java.awt.Color(102, 102, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(948, 82));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mpma.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableAddExamDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAddExamDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAddExamDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAddExamDetails);

        jButtonAddExam.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddExam.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddExam.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddExam.setText("Add Exam Date");
        jButtonAddExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAddExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddExamMouseExited(evt);
            }
        });
        jButtonAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddExamActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :-");

        ComboBoxSearchaplicant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nic", "Name", "Phone Number" }));
        ComboBoxSearchaplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSearchaplicantActionPerformed(evt);
            }
        });

        jTextAplicant.setBackground(new java.awt.Color(204, 255, 255));
        jTextAplicant.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextAplicant.setForeground(new java.awt.Color(51, 0, 51));
        jTextAplicant.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextAplicant.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAplicantCaretUpdate(evt);
            }
        });

        jButtonTableCertificate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTableCertificate.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonTableCertificate.setForeground(new java.awt.Color(0, 0, 51));
        jButtonTableCertificate.setText("Certificate");
        jButtonTableCertificate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButtonTableCertificateItemStateChanged(evt);
            }
        });
        jButtonTableCertificate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTableCertificateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTableCertificateMouseExited(evt);
            }
        });
        jButtonTableCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTableCertificateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExamTableLayout = new javax.swing.GroupLayout(jPanelExamTable);
        jPanelExamTable.setLayout(jPanelExamTableLayout);
        jPanelExamTableLayout.setHorizontalGroup(
            jPanelExamTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addGroup(jPanelExamTableLayout.createSequentialGroup()
                .addGroup(jPanelExamTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelExamTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelExamTableLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(ComboBoxSearchaplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jTextAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExamTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonTableCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanelExamTableLayout.setVerticalGroup(
            jPanelExamTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExamTableLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanelExamTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxSearchaplicant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelExamTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTableCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelExamTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelExamTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAddExamDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAddExamDetailsMouseClicked

//        if (jTableAddaplicant.getSelectedRowCount() == 1) {
//
//            ADAF.setVisible(true);
//
//            try {
//
//                Field fieldId = ADAF.getClass().getDeclaredField("txtId");
//                fieldId.setAccessible(true);
//                JTextField txtId = (JTextField) fieldId.get(ADAF);
//                txtId.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 0).toString());
//
//                Field field = ADAF.getClass().getDeclaredField("txtNic");
//                field.setAccessible(true);
//                JTextField txtNic = (JTextField) field.get(ADAF);
//                txtNic.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 1).toString());
//
//                Field nameFiled = ADAF.getClass().getDeclaredField("txtName");
//                nameFiled.setAccessible(true);
//                JTextField txtName = (JTextField) nameFiled.get(ADAF);
//                txtName.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 2).toString());
//
//                Field pnumField = ADAF.getClass().getDeclaredField("txtPhoneNumber");
//                pnumField.setAccessible(true);
//                JTextField txtPhoneNumber = (JTextField) pnumField.get(ADAF);
//                txtPhoneNumber.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 3).toString());
//
//                Field addressField = ADAF.getClass().getDeclaredField("txtAddress");
//                addressField.setAccessible(true);
//                JTextField txtAddress = (JTextField) addressField.get(ADAF);
//                txtAddress.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 4).toString());
//
//            } catch (Exception e) {
//            }
//
//        }

    }//GEN-LAST:event_jTableAddExamDetailsMouseClicked

    private void jButtonAddExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddExamMouseEntered
        jButtonAddExam.setBackground(new java.awt.Color(0, 0, 51));
        jButtonAddExam.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddExam.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButtonAddExamMouseEntered

    private void jButtonAddExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddExamMouseExited
        jButtonAddExam.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddExam.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddExam.setForeground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_jButtonAddExamMouseExited

    private void jButtonAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddExamActionPerformed

        addexamform.setVisible(true);

    }//GEN-LAST:event_jButtonAddExamActionPerformed

    private void ComboBoxSearchaplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSearchaplicantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSearchaplicantActionPerformed

    private void jTextAplicantCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAplicantCaretUpdate

//        String[] col_names = {"stu_nic", "stu_name", "stu_name", "phone_num"};
//
//        if (jTextAplicant.getText().isEmpty()) {
//            setAplicantTableData("SELECT * FROM `student_details`  ORDER BY `stu_id`");
//            jTextAplicant.setText("");
//        } else {
//
//            String col_name = col_names[ComboBoxSearchaplicant.getSelectedIndex()];
//            String value = jTextAplicant.getText();
//            String query = "SELECT * FROM `student_details` WHERE " + col_name + " LIKE '%" + value + "%'";
//
//            setAplicantTableData(query);
//
//        }

    }//GEN-LAST:event_jTextAplicantCaretUpdate

    private void jButtonTableCertificateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTableCertificateMouseEntered
        jButtonTableCertificate.setBackground(new java.awt.Color(0, 0, 51));
        jButtonTableCertificate.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonTableCertificate.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButtonTableCertificateMouseEntered

    private void jButtonTableCertificateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTableCertificateMouseExited
        jButtonTableCertificate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTableCertificate.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonTableCertificate.setForeground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_jButtonTableCertificateMouseExited

    private void jButtonTableCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTableCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTableCertificateActionPerformed

    private void jButtonTableCertificateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButtonTableCertificateItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTableCertificateItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSearchaplicant;
    private javax.swing.JButton jButtonAddExam;
    private javax.swing.JButton jButtonTableCertificate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelExamTable;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAddExamDetails;
    private javax.swing.JTextField jTextAplicant;
    // End of variables declaration//GEN-END:variables
}
