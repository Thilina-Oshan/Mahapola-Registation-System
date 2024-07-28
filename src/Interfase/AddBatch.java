/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oshan Demel
 */
public class AddBatch extends javax.swing.JPanel {

    private JButton[] buttons;
    private JButton[] button;
    private JFrame recentFrame;
    
   DefaultTableModel AddBatchModel = new DefaultTableModel(new String[]{"Batch Id","Batch Name" , "Start Date" , "End Date"}, 0);//Set Default table

    public AddBatch() {
        initComponents();
        jTableBatch.setModel(AddBatchModel);
       

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddRegistationTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBatch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddBatch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jPanelAddRegistationTable.setBackground(new java.awt.Color(102, 102, 255));

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
        jScrollPane1.setViewportView(jTableBatch);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Search By :- ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout jPanelAddRegistationTableLayout = new javax.swing.GroupLayout(jPanelAddRegistationTable);
        jPanelAddRegistationTable.setLayout(jPanelAddRegistationTableLayout);
        jPanelAddRegistationTableLayout.setHorizontalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddRegistationTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanelAddRegistationTableLayout.setVerticalGroup(
            jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddRegistationTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanelAddRegistationTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonAddBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBatchActionPerformed
        
    }//GEN-LAST:event_jButtonAddBatchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBatch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddRegistationTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBatch;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables

    

}
