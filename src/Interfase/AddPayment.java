/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.AddPaymentClass;
import Classes.AddRegistationClass;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddPayment extends javax.swing.JPanel {

    AddPaymentForm addpaymentform = new AddPaymentForm();
    DefaultTableModel AddPayementdModel = new DefaultTableModel(new String[]{"Payment Id", "Mc Number", "Course Name", "Batch Name", "Amount", "Student Payment", "Deficit/Balance"}, 0);//Set Default table
    ArrayList<AddPaymentClass> addpaymentArray;
    ResultSet rs;
    Connection con;
    AddPaymentForm addpayementforms = new AddPaymentForm();
//    static Connection con = MainInterfase.conn;

    public AddPayment() {
        initComponents();
        con = MainInterfase.conn;
        jTablePayment.setModel(AddPayementdModel);
        setPaymentTable();
    }

    private ArrayList<AddPaymentClass> getPaymentList(String query) {

        ArrayList<AddPaymentClass> Payementdlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddPaymentClass addpayment;

            while (rs.next()) {

                addpayment = new AddPaymentClass(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7));
                Payementdlist.add(addpayment);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return Payementdlist;
    }

    public void setPaymentTableData(String query) { //table ekata data set 

        AddPayementdModel.setRowCount(0);
        addpaymentArray = getPaymentList(query);

        for (int i = 0; i < addpaymentArray.size(); i++) {

            int a = addpaymentArray.get(i).getPayment_id();
            int b = addpaymentArray.get(i).getMc_num();
            String c = addpaymentArray.get(i).getCourse_name();
            String d = addpaymentArray.get(i).getBatch_name();
            Double e = addpaymentArray.get(i).getAmount();
            Double f = addpaymentArray.get(i).getCoustomer_payment();
            Double g = addpaymentArray.get(i).getAlanse();

            AddPayementdModel.addRow(new Object[]{a, b, c, d, e, f, g});
        }
    }

    public void setPaymentTable() {

        setPaymentTableData("SELECT * FROM `payment` ORDER BY `payment_id`");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddPaymentTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePayment = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddpayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanelAddPaymentTable.setBackground(new java.awt.Color(102, 102, 255));

        jTablePayment.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePayment);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));

        jButtonAddpayment.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddpayment.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddpayment.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddpayment.setText("Add New Payment");
        jButtonAddpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddpaymentActionPerformed(evt);
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
                .addComponent(jButtonAddpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddPaymentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addComponent(jButtonAddpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonAddpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddpaymentActionPerformed
        addpaymentform.setVisible(true);
    }//GEN-LAST:event_jButtonAddpaymentActionPerformed

    private void jTablePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePaymentMouseClicked

        if (jTablePayment.getSelectedRowCount() == 1) {

            addpaymentform.setVisible(true);

            try {

//                DisableTxtFielsPayment();

                // Disable the txtamcload field
                Field txtamcloadField = addpaymentform.getClass().getDeclaredField("txtLoadMcNum");
                txtamcloadField.setAccessible(true);
                JTextField txtLoadMcNum = (JTextField) txtamcloadField.get(addpaymentform);
                txtLoadMcNum.setEnabled(false); // Disable the field

                // Set the message "Not selected" in validateNicPayment label
                Field validateNicField = addpaymentform.getClass().getDeclaredField("validateNicPayment");
                validateNicField.setAccessible(true);
                JLabel validateNicPayment = (JLabel) validateNicField.get(addpaymentform);
                validateNicPayment.setText("Not selected");

                Field fieldPayId = addpaymentform.getClass().getDeclaredField("txtPaymentNUm");
                fieldPayId.setAccessible(true);
                JTextField txtPaymentNUm = (JTextField) fieldPayId.get(addpaymentform);
                txtPaymentNUm.setText(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 0).toString());

                Field fieldPayMc = addpaymentform.getClass().getDeclaredField("txtPayMcNumber");
                fieldPayMc.setAccessible(true);
                JTextField txtPayMcNumber = (JTextField) fieldPayMc.get(addpaymentform);
                txtPayMcNumber.setText(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 1).toString());

                Field fieldCourse = addpaymentform.getClass().getDeclaredField("jComboBoxCoursePay");
                fieldCourse.setAccessible(true);
                JComboBox<?> jComboBoxCoursePay = (JComboBox<?>) fieldCourse.get(addpaymentform);
                jComboBoxCoursePay.setSelectedItem(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 2).toString());

                Field fieldBatch = addpaymentform.getClass().getDeclaredField("jComboBoxBatchPay");
                fieldBatch.setAccessible(true);
                JComboBox<?> jComboBoxBatchPay = (JComboBox<?>) fieldBatch.get(addpaymentform);
                jComboBoxBatchPay.setSelectedItem(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 3).toString());

                Field AmountPayFiled = addpaymentform.getClass().getDeclaredField("txtAmount1");
                AmountPayFiled.setAccessible(true);
                JTextField txtAmount1 = (JTextField) AmountPayFiled.get(addpaymentform);
                txtAmount1.setText(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 4).toString());

                Field PaymenttPayFiled = addpaymentform.getClass().getDeclaredField("txtPayment");
                PaymenttPayFiled.setAccessible(true);
                JTextField txtPayment = (JTextField) PaymenttPayFiled.get(addpaymentform);
                txtPayment.setText(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 5).toString());

                Field BalnsePayFiled = addpaymentform.getClass().getDeclaredField("txtBalnse");
                BalnsePayFiled.setAccessible(true);
                JTextField txtBalnse = (JTextField) BalnsePayFiled.get(addpaymentform);
                txtBalnse.setText(AddPayementdModel.getValueAt(jTablePayment.getSelectedRow(), 6).toString());

            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_jTablePaymentMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setPaymentTable();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddpayment;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddPaymentTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePayment;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables

    //Disable the Text Fields
    public void DisableTxtFielsPayment() {

////        addpayementform.getValidateNicPayment().setEnabled(false);
        addpayementforms.getTxtLoadMcNum().setText("Do not Update Nic");
        System.out.println("jd");

//   JLabel validateNicField = addpayementform.getValidateNicPayment();
//
//    if (validateNicField == null) {
//        System.out.println("Error: validateNicField is null");
//    } else {
//        validateNicField.setText("Do not Update Nic");
//        validateNicField.setEnabled(false);
//    }
//    
    }

}
