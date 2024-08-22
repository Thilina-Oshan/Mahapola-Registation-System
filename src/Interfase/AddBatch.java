/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import Classes.AddBatchClass;
import java.awt.BorderLayout;
import java.awt.Color;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Oshan Demel
 */
public class AddBatch extends javax.swing.JPanel {

    private JButton[] buttons;
    private JButton[] button;
    private JFrame recentFrame;

    AddBatchForm addBatchform = new AddBatchForm();
    DefaultTableModel AddBatchModel = new DefaultTableModel(new String[]{"Batch Id", "Batch Name", "Start Date", "End Date"}, 0);//Set Default table
    Connection con;
    ArrayList<AddBatchClass> addbatchArray;
    ResultSet rs;

    public AddBatch() {
        initComponents();
        con = MainInterfase.conn;
        jTableBatch.setModel(AddBatchModel);
        setbatchtable();
        CustimizeTableBatchHeader();

    }

    private ArrayList<AddBatchClass> getbatchList(String query) {

        ArrayList<AddBatchClass> batchdlist = new ArrayList<>();
        Statement st;

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);

            AddBatchClass batch;

            while (rs.next()) {

                batch = new AddBatchClass(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4));
                batchdlist.add(batch);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, null, 2);
        }

        return batchdlist;
    }

    void setBtatchTable(String query) { //table ekata data set 

        AddBatchModel.setRowCount(0);
        addbatchArray = getbatchList(query);

        for (int i = 0; i < addbatchArray.size(); i++) {

            int a = addbatchArray.get(i).getBatch_id();
            String b = addbatchArray.get(i).getBatch_name();
            Date c = addbatchArray.get(i).getStartdate();
            Date d = addbatchArray.get(i).getEnddate();

            AddBatchModel.addRow(new Object[]{a, b, c, d});
        }

    }

    public void setbatchtable() {

        setBtatchTable("SELECT * FROM `batch_details`");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddBatchTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBatch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBatch = new javax.swing.JComboBox<>();
        jTextSearchBatch = new javax.swing.JTextField();
        jButtonAddBatch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jPanelAddBatchTable.setBackground(new java.awt.Color(102, 102, 255));

        jTableBatch.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBatchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBatch);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        jComboBoxBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batch Id", "Batch Name" }));

        jTextSearchBatch.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchBatch.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jTextSearchBatch.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchBatch.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextSearchBatch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextSearchBatchCaretUpdate(evt);
            }
        });

        jButtonAddBatch.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddBatch.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAddBatch.setForeground(new java.awt.Color(0, 0, 51));
        jButtonAddBatch.setText("Add New Batch");
        jButtonAddBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBatchActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelAddBatchTableLayout = new javax.swing.GroupLayout(jPanelAddBatchTable);
        jPanelAddBatchTable.setLayout(jPanelAddBatchTableLayout);
        jPanelAddBatchTableLayout.setHorizontalGroup(
            jPanelAddBatchTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddBatchTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanelAddBatchTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddBatchTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddBatchTableLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextSearchBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanelAddBatchTableLayout.setVerticalGroup(
            jPanelAddBatchTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddBatchTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanelAddBatchTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jComboBoxBatch.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxBatch.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddBatchTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddBatchTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBatchActionPerformed
        addBatchform.setVisible(true);
    }//GEN-LAST:event_jButtonAddBatchActionPerformed

    private void jTextSearchBatchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextSearchBatchCaretUpdate
        String[] col_names = {"batch_id", "batch_name"};

        if (jTextSearchBatch.getText().isEmpty()) {
            setBtatchTable("SELECT * FROM `batch_details`");
            jTextSearchBatch.setText("");
        } else {

            String col_name = col_names[jComboBoxBatch.getSelectedIndex()];
            String value = jTextSearchBatch.getText();
            String query = "SELECT * FROM `batch_details` WHERE " + col_name + " LIKE '%" + value + "%'";

            setBtatchTable(query);

        }
    }//GEN-LAST:event_jTextSearchBatchCaretUpdate

    private void jTableBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBatchMouseClicked
        if (jTableBatch.getSelectedRowCount() == 1) {

            addBatchform.setVisible(true);

            try {

                DisableTxtFielsBatch();
                Field fieldIdBatch = addBatchform.getClass().getDeclaredField("txtBtchId");
                fieldIdBatch.setAccessible(true);
                JTextField txtBtchId = (JTextField) fieldIdBatch.get(addBatchform);
                txtBtchId.setText(AddBatchModel.getValueAt(jTableBatch.getSelectedRow(), 0).toString());

                Field fiedNameBatch = addBatchform.getClass().getDeclaredField("txtBatchName");
                fiedNameBatch.setAccessible(true);
                JTextField txtBatchName = (JTextField) fiedNameBatch.get(addBatchform);
                txtBatchName.setText(AddBatchModel.getValueAt(jTableBatch.getSelectedRow(), 1).toString());

                // Access the JDateChooser field via reflection
                Field fieldBStart = addBatchform.getClass().getDeclaredField("DateChooserStartDate");
                fieldBStart.setAccessible(true);
                com.toedter.calendar.JDateChooser DateChooserStartDate = (com.toedter.calendar.JDateChooser) fieldBStart.get(addBatchform);
                // Retrieve the date string from the selected row in the table
                String dateStr = AddBatchModel.getValueAt(jTableBatch.getSelectedRow(), 2).toString();
                // Parse the date string into a java.util.Date object
                java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr); // Adjust date format as needed
                // Set the parsed date in the JDateChooser
                DateChooserStartDate.setDate(utilDate);

                // Access the JDateChooser field for the end date via reflection
                Field fieldBEnd = addBatchform.getClass().getDeclaredField("DateChooserEndDate");
                fieldBEnd.setAccessible(true);
                com.toedter.calendar.JDateChooser DateChooserEndDate = (com.toedter.calendar.JDateChooser) fieldBEnd.get(addBatchform);

                // Retrieve the date string from the selected row in the table
                String dateStrEnd = AddBatchModel.getValueAt(jTableBatch.getSelectedRow(), 3).toString();

                // Parse the date string into a java.util.Date object
                java.util.Date utilDateEnd = new SimpleDateFormat("yyyy-MM-dd").parse(dateStrEnd); // Adjust date format as needed

                // Set the parsed date in the JDateChooser
                DateChooserEndDate.setDate(utilDateEnd);

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, e + "Not Selected Colom");
            }

        }

    }//GEN-LAST:event_jTableBatchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBatch;
    private javax.swing.JComboBox<String> jComboBoxBatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddBatchTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBatch;
    private javax.swing.JTextField jTextSearchBatch;
    // End of variables declaration//GEN-END:variables

    void CustimizeTableBatchHeader() {

        JTableHeader header = jTableBatch.getTableHeader();
        header.setBackground(new Color(0, 102, 204)); // Set your desired background color
        header.setForeground(Color.WHITE); // Set your desired text color
        header.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 14)); // Customize the font if needed
//        header.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Optional: Set a border for the header

    }

    //Disable the Text Fields
    public void DisableTxtFielsBatch() {

        addBatchform.getTxtBtchId().setEnabled(false);
        addBatchform.getNOValidate().setText("Do not Update Id");

    }

}
