/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfase;

import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;


public class AddRegistrationTable extends javax.swing.JPanel {

    AddRegistationForm addregistationform = new AddRegistationForm();
    
     DefaultTableModel AddRegisterdModel = new DefaultTableModel(new String[]{"Mc Number","Studen Nic", "Student Name", "Phone Number", "Address" , "Batch" , "Course"}, 0);//Set Default table
   
    public AddRegistrationTable() {
        initComponents();
          jTableRegisterd.setModel(AddRegisterdModel);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextSearchRegisterd = new javax.swing.JTextField();
        jButtonAddNewRegisterd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextSearchRegisterd.setBackground(new java.awt.Color(204, 255, 255));
        jTextSearchRegisterd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextSearchRegisterd.setForeground(new java.awt.Color(51, 0, 51));
        jTextSearchRegisterd.setCaretColor(new java.awt.Color(0, 0, 0));

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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSearchRegisterd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewRegisterd;
    private javax.swing.JButton jButtonAplicant;
    private javax.swing.JButton jButtonRegisterd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAddRegistationTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegisterd;
    private javax.swing.JTextField jTextSearchRegisterd;
    // End of variables declaration//GEN-END:variables
}
