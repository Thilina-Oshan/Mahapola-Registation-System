package Interfase;

import Jframes.AddApplicantForm;
import Jframes.AddAplicantFormJFrame;
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
import javax.swing.BoxLayout;

public class AddAplicant extends javax.swing.JPanel {

    DefaultTableModel AddAplicantModel = new DefaultTableModel(new String[]{"Studen Nic", "Student Name", "Phone Number", "Address"}, 0);
    Color DefaultColor, ClickedColor;
    AddAplicantForm ADF = new AddAplicantForm();

    public AddAplicant() {
        System.out.println("AddAplicant constructor called");
        initComponents();
        jTableAddaplicant.setModel(AddAplicantModel);
        DefaultColor = new Color(0, 0, 51);
        ClickedColor = new Color(255, 255, 255);

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextAplicant = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextAplicant.setBackground(new java.awt.Color(204, 255, 255));
        jTextAplicant.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextAplicant.setForeground(new java.awt.Color(51, 0, 51));
        jTextAplicant.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelAddAplicantTableLayout = new javax.swing.GroupLayout(jPanelAddAplicantTable);
        jPanelAddAplicantTable.setLayout(jPanelAddAplicantTableLayout);
        jPanelAddAplicantTableLayout.setHorizontalGroup(
            jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddAplicantTableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddAplicantTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddAplicantTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddAplicant)
                .addGap(87, 87, 87))
            .addGroup(jPanelAddAplicantTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jTextAplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    AddAplicantFormJFrame APF = new AddAplicantFormJFrame();

    private void jButtonAddAplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAplicantActionPerformed

        APF.setVisible(true);

    }//GEN-LAST:event_jButtonAddAplicantActionPerformed

    private void jButtonAddAplicantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddAplicantMouseEntered
      jButtonAddAplicant.setForeground(ClickedColor);
      jButtonAddAplicant.setBackground(DefaultColor);
    }//GEN-LAST:event_jButtonAddAplicantMouseEntered

    private void jButtonAddAplicantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddAplicantMouseExited
       jButtonAddAplicant.setForeground(DefaultColor);
      jButtonAddAplicant.setBackground(ClickedColor);
    }//GEN-LAST:event_jButtonAddAplicantMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddAplicant;
    private javax.swing.JButton jButtonRegisterdStudent;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddAplicantTable;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAddaplicant;
    private javax.swing.JTextField jTextAplicant;
    // End of variables declaration//GEN-END:variables

}
