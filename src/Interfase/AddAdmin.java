/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import java.util.ArrayList;
import Classes.AddAdminClass;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AddAdmin extends javax.swing.JPanel {

    static Connection con = MainInterfase.conn;
    DefaultTableModel AddAdminModel = new DefaultTableModel(new String[]{"Student Id", "User Name", "User Email", "Password", "Re-Password"}, 0);
    AddAdminForm addadminform = new AddAdminForm();
    ArrayList<AddAdminClass> addadminArray;
    ResultSet rs;

    public AddAdmin() {
        initComponents();
        setAdmintable();
        jTableAdmin.setModel(AddAdminModel);

        // Customize the table header
        JTableHeader header = jTableAdmin.getTableHeader();
        header.setBackground(new Color(0, 102, 204)); // Set your desired background color
        header.setForeground(Color.WHITE); // Set your desired text color
        header.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 16)); // Customize the font if needed
//        header.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Optional: Set a border for the header

    }

    private ArrayList<AddAdminClass> getAdminLis(String query) {

        ArrayList<AddAdminClass> adminlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddAdminClass users;

            while (rs.next()) {

                users = new AddAdminClass(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                adminlist.add(users);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return adminlist;
    }

    private void setAdminTableData(String query) { //table ekata data set 

        AddAdminModel.setRowCount(0);
        addadminArray = getAdminLis(query);

        for (int i = 0; i < addadminArray.size(); i++) {

            int a = addadminArray.get(i).getUser_id();
            String b = addadminArray.get(i).getUser_name();
            String c = addadminArray.get(i).getName();
            String d = addadminArray.get(i).getPassword();
            String e = addadminArray.get(i).getRe_enterPassword();

            AddAdminModel.addRow(new Object[]{a, b, c, d, e});
        }

    }

    public void setAdmintable() {

        setAdminTableData("SELECT * FROM `users` ORDER BY `id`");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddPaymentTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanelAddPaymentTable.setBackground(new java.awt.Color(102, 102, 255));

        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAdmin);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));

        jButtonAddAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddAdmin.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddAdmin.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddAdmin.setText("Add New Admin");
        jButtonAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAdminActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelAddPaymentTableLayout = new javax.swing.GroupLayout(jPanelAddPaymentTable);
        jPanelAddPaymentTable.setLayout(jPanelAddPaymentTableLayout);
        jPanelAddPaymentTableLayout.setHorizontalGroup(
            jPanelAddPaymentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddPaymentTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                .addGroup(jPanelAddPaymentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddPaymentTableLayout.setVerticalGroup(
            jPanelAddPaymentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanelAddPaymentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddPaymentTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddPaymentTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAdminActionPerformed
        addadminform.setVisible(true);
    }//GEN-LAST:event_jButtonAddAdminActionPerformed

    private void jTableAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdminMouseClicked

        if (jTableAdmin.getSelectedRowCount() == 1) {

            addadminform.setVisible(true);

            try {

                Field fieldId = addadminform.getClass().getDeclaredField("txtAdminId");
                fieldId.setAccessible(true);
                JTextField txtAdminId = (JTextField) fieldId.get(addadminform);
                txtAdminId.setText(AddAdminModel.getValueAt(jTableAdmin.getSelectedRow(), 0).toString());

                Field fielAdminName = addadminform.getClass().getDeclaredField("txtAdminName");
                fielAdminName.setAccessible(true);
                JTextField txtAdminName = (JTextField) fielAdminName.get(addadminform);
                txtAdminName.setText(AddAdminModel.getValueAt(jTableAdmin.getSelectedRow(), 1).toString());

                Field fielAdminEmail = addadminform.getClass().getDeclaredField("txtEmail");
                fielAdminEmail.setAccessible(true);
                JTextField txtEmail = (JTextField) fielAdminEmail.get(addadminform);
                txtEmail.setText(AddAdminModel.getValueAt(jTableAdmin.getSelectedRow(), 2).toString());

                Field fiedPassword = addadminform.getClass().getDeclaredField("txtPassword");
                fiedPassword.setAccessible(true);
                JTextField txtPassword = (JTextField) fiedPassword.get(addadminform);
                txtPassword.setText(AddAdminModel.getValueAt(jTableAdmin.getSelectedRow(), 3).toString());

                Field fiedRePassword = addadminform.getClass().getDeclaredField("txtReenterPws");
                fiedRePassword.setAccessible(true);
                JTextField txtReenterPws = (JTextField) fiedRePassword.get(addadminform);
                txtReenterPws.setText(AddAdminModel.getValueAt(jTableAdmin.getSelectedRow(), 4).toString());

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jTableAdminMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setAdmintable();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAdmin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddPaymentTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables
}
