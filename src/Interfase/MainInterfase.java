/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import com.formdev.flatlaf.FlatLaf;
import java.awt.Color;
import javax.swing.colorchooser.DefaultColorSelectionModel;


public class MainInterfase extends javax.swing.JFrame {

      
    Color DefaultColor , ClickedColor;
    public MainInterfase() {
        initComponents();
         DefaultColor = new Color(153,153,255);
        ClickedColor = new Color(0,0,204);
        
        
        AddStudentBotton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddcoursBotton = new javax.swing.JButton();
        AddStudentBotton = new javax.swing.JButton();
        AddPaymentBotton = new javax.swing.JButton();
        Overview1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        InterfaseView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mahapola Ports & Maritime Academy");
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AddcoursBotton.setBackground(new java.awt.Color(153, 153, 255));
        AddcoursBotton.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        AddcoursBotton.setForeground(new java.awt.Color(0, 0, 0));
        AddcoursBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/online-certificate (2).png"))); // NOI18N
        AddcoursBotton.setText("  Add Course");
        AddcoursBotton.setBorder(null);
        AddcoursBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddcoursBottonMouseClicked(evt);
            }
        });
        AddcoursBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddcoursBottonActionPerformed(evt);
            }
        });

        AddStudentBotton.setBackground(new java.awt.Color(153, 153, 255));
        AddStudentBotton.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        AddStudentBotton.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iconsmind-Outline-Student-Male.512 (1).png"))); // NOI18N
        AddStudentBotton.setText("  Add Student");
        AddStudentBotton.setBorder(null);
        AddStudentBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentBottonMouseClicked(evt);
            }
        });

        AddPaymentBotton.setBackground(new java.awt.Color(153, 153, 255));
        AddPaymentBotton.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        AddPaymentBotton.setForeground(new java.awt.Color(0, 0, 0));
        AddPaymentBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-money (1).png"))); // NOI18N
        AddPaymentBotton.setText("  Add Payment");
        AddPaymentBotton.setBorder(null);
        AddPaymentBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPaymentBottonMouseClicked(evt);
            }
        });

        Overview1.setBackground(new java.awt.Color(153, 153, 255));
        Overview1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Overview1.setForeground(new java.awt.Color(0, 0, 0));
        Overview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backup (1).png"))); // NOI18N
        Overview1.setText(" View Details");
        Overview1.setBorder(null);
        Overview1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Overview1MouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images-removebg-preview (1) (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("& Maritime Academy");

        jLabel3.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mahapola Ports ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Overview1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddPaymentBotton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddStudentBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddcoursBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(AddStudentBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(AddcoursBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(AddPaymentBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Overview1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hopstarter-Button-Button-Help.256 (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pictogrammers-Material-Logout.512 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        InterfaseView.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout InterfaseViewLayout = new javax.swing.GroupLayout(InterfaseView);
        InterfaseView.setLayout(InterfaseViewLayout);
        InterfaseViewLayout.setHorizontalGroup(
            InterfaseViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        InterfaseViewLayout.setVerticalGroup(
            InterfaseViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InterfaseView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InterfaseView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddcoursBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddcoursBottonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddcoursBottonActionPerformed

    private void AddcoursBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddcoursBottonMouseClicked
       AddStudentBotton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(ClickedColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
    }//GEN-LAST:event_AddcoursBottonMouseClicked

    private void AddStudentBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentBottonMouseClicked
       
        AddStudentBotton.setBackground(ClickedColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        
//        NewJFrame addS = new NewJFrame();
//        InterfaseView.removeAll();
//        InterfaseView.add(addS).setVisible(true);
    }//GEN-LAST:event_AddStudentBottonMouseClicked

    private void AddPaymentBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPaymentBottonMouseClicked
       AddStudentBotton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(ClickedColor);
        Overview1.setBackground(DefaultColor);
    }//GEN-LAST:event_AddPaymentBottonMouseClicked

    private void Overview1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Overview1MouseClicked
       AddStudentBotton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(ClickedColor);
    }//GEN-LAST:event_Overview1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        com.formdev.flatlaf.themes.FlatMacLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPaymentBotton;
    private javax.swing.JButton AddStudentBotton;
    private javax.swing.JButton AddcoursBotton;
    private javax.swing.JPanel InterfaseView;
    private javax.swing.JButton Overview1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
