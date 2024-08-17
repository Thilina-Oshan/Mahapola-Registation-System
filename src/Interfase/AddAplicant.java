package Interfase;

import Classes.AddAplicantClass;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Interfase.AddAplicant;
import Popup.AddAplicantForm;
import javax.swing.GroupLayout;
import Interfase.MainInterfase;
import java.awt.BorderLayout;
import java.awt.Component;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class AddAplicant extends javax.swing.JPanel {

    DefaultTableModel AddAplicantModel = new DefaultTableModel(new String[]{"Student Id", "Student Nic", "Student Name", "Phone Number", "Address"}, 0);
    Color DefaultColor, ClickedColor;
    AddAplicantFormNew ADAF = new AddAplicantFormNew();
    Connection con;
    ArrayList<AddAplicantClass> addaplicantArray;
    ResultSet rs;

//    private javax.swing.JTable jTableAddaplicant;
    public AddAplicant() {
        System.out.println("AddAplicant constructor called");
        initComponents();
        con = MainInterfase.conn;
        jTableAddaplicant.setModel(AddAplicantModel);
        setStudenttable();
        CustimizeTableApliHeader();
        DefaultColor = new Color(0, 0, 51);
        ClickedColor = new Color(255, 255, 255);

    }

    public AddAplicant(JTable jTableAddaplicant) {
        this.jTableAddaplicant = jTableAddaplicant;
    }

    public DefaultTableModel getAddAplicantModel() {
        return AddAplicantModel;
    }

    public JPanel getjPanelAddAplicantTable() {
        return jPanelAddAplicantTable;
    }

//    create  a gette methon table eka ehaa pettata ganna
    public JTable getjTableAddaplicant() {
        return jTableAddaplicant;
    }

    private ArrayList<AddAplicantClass> getStudentList(String query) {

        ArrayList<AddAplicantClass> studentdlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddAplicantClass student;

            while (rs.next()) {

                student = new AddAplicantClass(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                studentdlist.add(student);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return studentdlist;
    }

    void setAplicantTableData(String query) { //table ekata data set 

        AddAplicantModel.setRowCount(0);
        addaplicantArray = getStudentList(query);

        for (int i = 0; i < addaplicantArray.size(); i++) {

            int a = addaplicantArray.get(i).getStu_id();
            String b = addaplicantArray.get(i).getStu_nic();
            String c = addaplicantArray.get(i).getStu_name();
            String d = addaplicantArray.get(i).getPhone_num();
            String e = addaplicantArray.get(i).getAddress();

            AddAplicantModel.addRow(new Object[]{a, b, c, d, e});
        }

    }

    public void setStudenttable() {

        setAplicantTableData("SELECT * FROM `student_details` ORDER BY `stu_id`");

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

        jPanelAddAplicantTable = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAddaplicant = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonRegisterdStudent = new javax.swing.JButton();
        jButtonAddAplicant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxSearchaplicant = new javax.swing.JComboBox<>();
        jTextAplicant = new javax.swing.JTextField();

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

        jPanelAddAplicantTable.setBackground(new java.awt.Color(102, 102, 255));

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
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableAddaplicant.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAddaplicant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAddaplicantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAddaplicant);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 51, 0));
        jButton1.setText("Add Aplicant");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), null, null));

        jButtonRegisterdStudent.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegisterdStudent.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonRegisterdStudent.setForeground(new java.awt.Color(204, 51, 0));
        jButtonRegisterdStudent.setText("Registerd Student");
        jButtonRegisterdStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterdStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonRegisterdStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegisterdStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAddAplicant.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddAplicant.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddAplicant.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddAplicant.setText("Add New Applicant");
        jButtonAddAplicant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAddAplicantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddAplicantMouseExited(evt);
            }
        });
        jButtonAddAplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAplicantActionPerformed(evt);
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
        jTextAplicant.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jTextAplicant.setForeground(new java.awt.Color(51, 0, 51));
        jTextAplicant.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextAplicant.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAplicantCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddAplicantTableLayout = new javax.swing.GroupLayout(jPanelAddAplicantTable);
        jPanelAddAplicantTable.setLayout(jPanelAddAplicantTableLayout);
        jPanelAddAplicantTableLayout.setHorizontalGroup(
            jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddAplicantTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddAplicantTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddAplicant)
                .addGap(87, 87, 87))
            .addGroup(jPanelAddAplicantTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(ComboBoxSearchaplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jTextAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        jPanelAddAplicantTableLayout.setVerticalGroup(
            jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddAplicantTableLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxSearchaplicant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddAplicantTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddAplicantTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterdStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterdStudentActionPerformed
        // Create an instance of AddRegistation
        AddRegistrationTable addRegistationPanelss = new AddRegistrationTable();

        // Remove all components from jPanelAddAplicant
        jPanelAddAplicantTable.removeAll();

        // Add AddRegistation panel to the center of jPanelAddAplicant
        jPanelAddAplicantTable.setLayout(new BorderLayout());
//        jPanelAddAplicant.add(addRegistationPanel, BorderLayout.CENTER);
        jPanelAddAplicantTable.add(addRegistationPanelss, BorderLayout.WEST);

        // Revalidate and repaint jPanelAddAplicant to apply changes
        jPanelAddAplicantTable.revalidate();
        jPanelAddAplicantTable.repaint();
    }//GEN-LAST:event_jButtonRegisterdStudentActionPerformed


    private void jButtonAddAplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAplicantActionPerformed

        ADAF.setVisible(true);

    }//GEN-LAST:event_jButtonAddAplicantActionPerformed

    private void jButtonAddAplicantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddAplicantMouseEntered
        jButtonAddAplicant.setForeground(ClickedColor);
        jButtonAddAplicant.setBackground(DefaultColor);
    }//GEN-LAST:event_jButtonAddAplicantMouseEntered

    private void jButtonAddAplicantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddAplicantMouseExited
        jButtonAddAplicant.setForeground(DefaultColor);
        jButtonAddAplicant.setBackground(ClickedColor);
    }//GEN-LAST:event_jButtonAddAplicantMouseExited

    private void ComboBoxSearchaplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSearchaplicantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSearchaplicantActionPerformed

    private void jTextAplicantCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAplicantCaretUpdate

        String[] col_names = {"stu_nic", "stu_name", "stu_name", "phone_num"};

        if (jTextAplicant.getText().isEmpty()) {
            setAplicantTableData("SELECT * FROM `student_details`  ORDER BY `stu_id`");
            jTextAplicant.setText("");
        } else {

            String col_name = col_names[ComboBoxSearchaplicant.getSelectedIndex()];
            String value = jTextAplicant.getText();
            String query = "SELECT * FROM `student_details` WHERE " + col_name + " LIKE '%" + value + "%'";

            setAplicantTableData(query);

        }

    }//GEN-LAST:event_jTextAplicantCaretUpdate

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        setStudenttable();
    }//GEN-LAST:event_formFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        setAplicantTableData("SELECT * FROM `student_details` ORDER BY `stu_id`");
    }//GEN-LAST:event_formMouseClicked

    private void jTableAddaplicantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAddaplicantMouseClicked

        if (jTableAddaplicant.getSelectedRowCount() == 1) {

            ADAF.setVisible(true);

            try {

                Field fieldId = ADAF.getClass().getDeclaredField("txtId");
                fieldId.setAccessible(true);
                JTextField txtId = (JTextField) fieldId.get(ADAF);
                txtId.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 0).toString());

                Field field = ADAF.getClass().getDeclaredField("txtNic");
                field.setAccessible(true);
                JTextField txtNic = (JTextField) field.get(ADAF);
                txtNic.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 1).toString());

                Field nameFiled = ADAF.getClass().getDeclaredField("txtName");
                nameFiled.setAccessible(true);
                JTextField txtName = (JTextField) nameFiled.get(ADAF);
                txtName.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 2).toString());

                Field pnumField = ADAF.getClass().getDeclaredField("txtPhoneNumber");
                pnumField.setAccessible(true);
                JTextField txtPhoneNumber = (JTextField) pnumField.get(ADAF);
                txtPhoneNumber.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 3).toString());

                Field addressField = ADAF.getClass().getDeclaredField("txtAddress");
                addressField.setAccessible(true);
                JTextField txtAddress = (JTextField) addressField.get(ADAF);
                txtAddress.setText(AddAplicantModel.getValueAt(jTableAddaplicant.getSelectedRow(), 4).toString());

            } catch (Exception e) {
            }

        }


    }//GEN-LAST:event_jTableAddaplicantMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSearchaplicant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddAplicant;
    private javax.swing.JButton jButtonRegisterdStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddAplicantTable;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAddaplicant;
    private javax.swing.JTextField jTextAplicant;
    // End of variables declaration//GEN-END:variables

    void CustimizeTableApliHeader() {

        JTableHeader header = jTableAddaplicant.getTableHeader();
        header.setBackground(new Color(0, 102, 204)); // Set your desired background color
        header.setForeground(Color.WHITE); // Set your desired text color
        header.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 14)); // Customize the font if needed
//        header.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Optional: Set a border for the header

    }

}
