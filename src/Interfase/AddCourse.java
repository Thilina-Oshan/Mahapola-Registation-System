/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.AddCourseClass;
import Classes.DbConnection;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddCourse extends javax.swing.JPanel {
    
    //Set Connection 
    static Connection conn = new DbConnection().connect();

    AddCourseForm addcourseform = new AddCourseForm();
    DefaultTableModel AddCourseModel = new DefaultTableModel(new String[]{"Course Id", "Course Name", "Course Duration"}, 0);
    ArrayList<AddCourseClass> addCourseArray;
    ResultSet rs;
    AddCourseForm ACF = new AddCourseForm();
    

    public AddCourse() {
        initComponents();
        conn = MainInterfase.conn;
        TableCourse.setModel(AddCourseModel);
        setCoursetable("SELECT * FROM `course`");
    }

    private ArrayList<AddCourseClass> getCourseList(String query) {

        ArrayList<AddCourseClass> courselist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) conn.createStatement();
            rs = st.executeQuery(query);

            AddCourseClass course;

            while (rs.next()) {

                course = new AddCourseClass(rs.getInt(1), rs.getString(2), rs.getString(3));
                courselist.add(course);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return courselist;
    }

    private void setCoursetable(String select__from_course) {

        AddCourseModel.setRowCount(0);
        addCourseArray = getCourseList("SELECT * FROM `course` ORDER BY `couse_id`");

        for (AddCourseClass i : addCourseArray) {

            AddCourseModel.addRow(new Object[]{i.getCourse_id(), i.getCourse_name(), i.getCourse_duration()});
        }

    }
    
    void setCourseTableData(String query) { //table ekata data set 

        AddCourseModel.setRowCount(0);
        addCourseArray = getCourseList(query);

        for (int i = 0; i < addCourseArray.size(); i++) {

            int a = addCourseArray.get(i).getCourse_id();
            String b = addCourseArray.get(i).getCourse_name();
            String c = addCourseArray.get(i).getCourse_duration();
            

            AddCourseModel.addRow(new Object[]{a, b, c});
        }

    }
    
    public void setCoursetable() {

        setCourseTableData("SELECT * FROM `course` ORDER BY `couse_id`");

//        AddAplicantModel.setRowCount(0);
//        addaplicantArray = getStudentList("SELECT * FROM `student_details` ORDER BY `stu_id`");
//
//        for (AddAplicantClass i : addaplicantArray) {
//
//            AddAplicantModel.addRow(new Object[]{i.getStu_id(), i.getStu_nic(), i.getStu_name(), i.getPhone_num(), i.getAddress()});
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddCourseTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SearchCombo = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddCourse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
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

        jPanelAddCourseTable.setBackground(new java.awt.Color(102, 102, 255));

        TableCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCourse);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        SearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "couse_id", "couse_name", "course_duration", " " }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextSearchRegisterd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextSearchRegisterdCaretUpdate(evt);
            }
        });

        jButtonAddCourse.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddCourse.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddCourse.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddCourse.setText("Add New Course");
        jButtonAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCourseActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelAddCourseTableLayout = new javax.swing.GroupLayout(jPanelAddCourseTable);
        jPanelAddCourseTable.setLayout(jPanelAddCourseTableLayout);
        jPanelAddCourseTableLayout.setHorizontalGroup(
            jPanelAddCourseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCourseTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAddCourseTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddCourseTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanelAddCourseTableLayout.setVerticalGroup(
            jPanelAddCourseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCourseTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanelAddCourseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddCourseTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddCourseTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCourseActionPerformed
        addcourseform.setVisible(true);
    }//GEN-LAST:event_jButtonAddCourseActionPerformed

    private void jTextSearchRegisterdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextSearchRegisterdCaretUpdate
        String[] col_names = {"couse_id", "couse_name", "course_duration"};

        if (jTextSearchRegisterd.getText().isEmpty()) {
            setCoursetable("SELECT * FROM `course`");
          
        } else {
            String col_name = col_names[SearchCombo.getSelectedIndex()];
            String value = jTextSearchRegisterd.getText();
            String query = "SELECT * FROM `course` WHERE `" + col_name + "` LIKE '%" + value + "%'";
            
            setCoursetable(query);
        }
    }//GEN-LAST:event_jTextSearchRegisterdCaretUpdate

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       setCoursetable();
    }//GEN-LAST:event_formFocusGained

    private void TableCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCourseMouseClicked
        if (TableCourse.getSelectedRowCount() == 1) {

            ACF.setVisible(true);

            try {

                Field fieldCId = ACF.getClass().getDeclaredField("txtCourseId");
                fieldCId.setAccessible(true);
                JTextField txtCourseId = (JTextField) fieldCId.get(ACF);
                txtCourseId.setText(AddCourseModel.getValueAt(TableCourse.getSelectedRow(), 0).toString());

                Field CNamefield = ACF.getClass().getDeclaredField("txtCourseName");
                CNamefield.setAccessible(true);
                JTextField txtCourseName = (JTextField) CNamefield.get(ACF);
                txtCourseName.setText(AddCourseModel.getValueAt(TableCourse.getSelectedRow(), 1).toString());

                Field DurationFiled = ACF.getClass().getDeclaredField("textDuration");
                DurationFiled.setAccessible(true);
                JTextField textDuration = (JTextField) DurationFiled.get(ACF);
                textDuration.setText(AddCourseModel.getValueAt(TableCourse.getSelectedRow(), 2).toString());


            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_TableCourseMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SearchCombo;
    private javax.swing.JTable TableCourse;
    private javax.swing.JButton jButtonAddCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddCourseTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables
}
