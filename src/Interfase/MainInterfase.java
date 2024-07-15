/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfase;

import com.formdev.flatlaf.FlatLaf;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.colorchooser.DefaultColorSelectionModel;

public class MainInterfase extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    private JButton[] buttons;
    private JFrame recentFrame;

    public MainInterfase() {
        initComponents();
        DefaultColor = new Color(153, 153, 255);
        ClickedColor = new Color(0, 0, 204);

        buttons = new JButton[]{Homet1Botton, Homet1Botton, AddcoursBotton, AddPaymentBotton, Overview1};

        // Add panels to InterfaseView
        InterfaseView.setLayout(new CardLayout());
        InterfaseView.add(new Home(), "Panel 0"); // Placeholder panel
        InterfaseView.add(new Home(), "Panel 1"); // Placeholder panel
        InterfaseView.add(new AddAplicant(), "Panel 2"); // Add Student panel
        InterfaseView.add(new AddCourse(), "Panel 3"); // Add Course panel
        InterfaseView.add(new AddPayment(), "Panel 4"); // Add Payment panel
        InterfaseView.add(new OverView(), "Panel 5"); // View Details panel

    }

    private void changePanel(int index) {
        CardLayout cardLayout = (CardLayout) InterfaseView.getLayout();
        if (index >= 0 && index < InterfaseView.getComponentCount()) {
            cardLayout.show(InterfaseView, "Panel " + index);
        } else {
            System.err.println("Invalid index: " + index);
        }
    }

    public void goToPanelAt(int index) {
        changePanel(index);
        for (int i = 0; i < buttons.length; i++) {
            if (i == index) {
                buttons[i].setBackground(ClickedColor);
            } else {
                buttons[i].setBackground(DefaultColor);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddcoursBotton = new javax.swing.JButton();
        Homet1Botton = new javax.swing.JButton();
        AddPaymentBotton = new javax.swing.JButton();
        Overview1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddStudentBotton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        InterfaseView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mahapola Ports & Maritime Academy");
        setSize(new java.awt.Dimension(0, 0));

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

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

        Homet1Botton.setBackground(new java.awt.Color(153, 153, 255));
        Homet1Botton.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Homet1Botton.setForeground(new java.awt.Color(0, 0, 0));
        Homet1Botton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home (1).png"))); // NOI18N
        Homet1Botton.setText("    DashBord");
        Homet1Botton.setBorder(null);
        Homet1Botton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Homet1BottonMouseClicked(evt);
            }
        });
        Homet1Botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Homet1BottonActionPerformed(evt);
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
        AddPaymentBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPaymentBottonActionPerformed(evt);
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
        Overview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Overview1ActionPerformed(evt);
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

        AddStudentBotton1.setBackground(new java.awt.Color(153, 153, 255));
        AddStudentBotton1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        AddStudentBotton1.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentBotton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iconsmind-Outline-Student-Male.512 (1).png"))); // NOI18N
        AddStudentBotton1.setText("  Add Student");
        AddStudentBotton1.setBorder(null);
        AddStudentBotton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentBotton1MouseClicked(evt);
            }
        });
        AddStudentBotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentBotton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Homet1Botton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddcoursBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Overview1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddStudentBotton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddPaymentBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(Homet1Botton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddStudentBotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddcoursBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddPaymentBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(Overview1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
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
            .addGap(0, 914, Short.MAX_VALUE)
        );
        InterfaseViewLayout.setVerticalGroup(
            InterfaseViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InterfaseView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InterfaseView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddcoursBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddcoursBottonActionPerformed
        goToPanelAt(3);
    }//GEN-LAST:event_AddcoursBottonActionPerformed

    private void AddcoursBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddcoursBottonMouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(ClickedColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
    }//GEN-LAST:event_AddcoursBottonMouseClicked

    private void Homet1BottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Homet1BottonMouseClicked

        Homet1Botton.setBackground(ClickedColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);


    }//GEN-LAST:event_Homet1BottonMouseClicked

    private void AddPaymentBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPaymentBottonMouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(ClickedColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
    }//GEN-LAST:event_AddPaymentBottonMouseClicked

    private void Overview1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Overview1MouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(ClickedColor);
        AddStudentBotton1.setBackground(DefaultColor);
    }//GEN-LAST:event_Overview1MouseClicked

    private void Homet1BottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Homet1BottonActionPerformed
        goToPanelAt(1);
    }//GEN-LAST:event_Homet1BottonActionPerformed

    private void AddPaymentBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPaymentBottonActionPerformed
        goToPanelAt(4);
    }//GEN-LAST:event_AddPaymentBottonActionPerformed

    private void Overview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Overview1ActionPerformed
        goToPanelAt(5);
    }//GEN-LAST:event_Overview1ActionPerformed

    private void AddStudentBotton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentBotton1MouseClicked

        Homet1Botton.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(ClickedColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
    }//GEN-LAST:event_AddStudentBotton1MouseClicked

    private void AddStudentBotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentBotton1ActionPerformed
        goToPanelAt(2);
    }//GEN-LAST:event_AddStudentBotton1ActionPerformed

    public static void main(String args[]) {

        com.formdev.flatlaf.themes.FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPaymentBotton;
    private javax.swing.JButton AddStudentBotton1;
    private javax.swing.JButton AddcoursBotton;
    private javax.swing.JButton Homet1Botton;
    private javax.swing.JPanel InterfaseView;
    private javax.swing.JButton Overview1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

//    public class Dashbord {
//
//        private Container container; // Assuming you have a container field
//
//        public Dashbord() {
//            // Initialize the container and add components
//            container = new JPanel(); // Example container, replace with your actual container
//            container.setLayout(new CardLayout()); // Example layout, adjust as needed
//
//            // Add your components to the container
//            container.add(new JPanel(), "Panel 1");
//            container.add(new JPanel(), "Panel 2");
//            // Add more panels as needed
//
//            // Attempt to go to a specific panel
//            goToPanelAt(2); // Example index
//        }
//
//     
//      private void changePanel(JPanel panel) {
//        ((GroupLayout) mainPanel.getLayout()).replace(mainPanel.getComponent(2), panel);
//    }
//    
//      
//        public void goToPanelAt(int index) {
//        switch (index) {
//            case 1 ->
//                changePanel(new AddAplicant());
//            case 2 ->
//                changePanel(new AddCourse());
//            default ->
//                changePanel(new AddPayment());
//        }
//
//        for (int i = 0; i < buttons.length; i++) {
//            if (i == index) {
//                buttons[i].setBackground(new Color(86, 86, 86));
//            } else {
//                buttons[i].setBackground(new Color(102, 47, 56));
//            }
//        }
//    }
}
