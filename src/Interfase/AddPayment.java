/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.AddPaymentClass;
import Classes.AddRegistationClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddPayment extends javax.swing.JPanel {
    
    AddPaymentForm addpaymentform = new AddPaymentForm();
    DefaultTableModel AddPayementdModel = new DefaultTableModel(new String[]{"Payment Id", "Mc Number", "Course Name", "Batch Name", "Amount", "Student Payment", "Balance"}, 0);//Set Default table
    ArrayList<AddPaymentClass> addpaymentArray;
    ResultSet rs;
    static Connection con = MainInterfase.conn;
    
    public AddPayment() {
        initComponents();
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
                
                addpayment = new AddPaymentClass(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7));
                Payementdlist.add(addpayment);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, null, 2);
        }
        
        return Payementdlist;
    }
    
   public  void setPaymentTableData(String query) { //table ekata data set 

        AddPayementdModel.setRowCount(0);
        addpaymentArray = getPaymentList(query);

        for (int i = 0; i < addpaymentArray.size(); i++) {

            int a = addpaymentArray.get(i).getPayment_id();
            int b = addpaymentArray.get(i).getMc_num();
            String c = addpaymentArray.get(i).getCourse_name();
            String d = addpaymentArray.get(i).getBatch_name();
            Float e = addpaymentArray.get(i).getAmount();
            Float f = addpaymentArray.get(i).getCoustomer_payment();
            Float g = addpaymentArray.get(i).getAlanse();
          

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
            .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAddPaymentTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddPaymentTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
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
}
