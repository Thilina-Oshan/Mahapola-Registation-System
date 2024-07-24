package Interfase;

import Classes.DbConnection;
import Jpanels.AddAdmin;
import Jpanels.AddApplicantForm;
import com.formdev.flatlaf.FlatLaf;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.colorchooser.DefaultColorSelectionModel;

public class MainInterfase extends javax.swing.JFrame {

    //Set Connection 
//    static Connection con = new DbConnection().connect();
    Color DefaultColor, ClickedColor, ClickForeground, ClickAfterForgrond;
    private JButton[] buttons;
    private JButton[] button;
    private JFrame recentFrame;
    
  

    public MainInterfase() {
        initComponents();
        DefaultColor = new Color(0, 0, 51);
        ClickedColor = new Color(11, 160, 244);
        ClickAfterForgrond = new Color(255, 255, 0);
        ClickForeground = new Color(255, 255, 255);

        buttons = new JButton[]{Homet1Botton, Homet1Botton, AddcoursBotton, AddBatchButton, AddPaymentBotton, AddRegisterdBotton1, Overview1, jButtonAdmin};
        

       
       

        // Add panels to InterfaseView
        InterfaseView.setLayout(new CardLayout());
        InterfaseView.add(new Home(), "Panel 0"); // Placeholder panel
        InterfaseView.add(new Home(), "Panel 1"); // Placeholder panel
        InterfaseView.add(new AddAplicant(), "Panel 2"); // Add Student panel
        InterfaseView.add(new AddCourse(), "Panel 3"); // Add Course panel
        InterfaseView.add(new AddPayment(), "Panel 4"); // Add Payment panel
        InterfaseView.add(new AddRegistation(), "Panel 5"); // Add Registerd panel
        InterfaseView.add(new AddBatch(), "Panel 6"); // Add Batch panel
        InterfaseView.add(new OverView(), "Panel 7"); // View Details panel
        InterfaseView.add(new AddAdmin(), "Panel 8"); // Admin Details panel
      
        
         
        
        
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
        AddRegisterdBotton1 = new javax.swing.JButton();
        AddBatchButton = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        InterfaseView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mahapola Ports & Maritime Academy");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        mainPanel.setBackground(new java.awt.Color(11, 160, 244));

        jPanel5.setBackground(new java.awt.Color(11, 160, 244));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        AddcoursBotton.setBackground(new java.awt.Color(0, 0, 51));
        AddcoursBotton.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        AddcoursBotton.setForeground(new java.awt.Color(255, 255, 0));
        AddcoursBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Course (1).png"))); // NOI18N
        AddcoursBotton.setText(" Add Course");
        AddcoursBotton.setBorder(null);
        AddcoursBotton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        Homet1Botton.setBackground(new java.awt.Color(11, 160, 244));
        Homet1Botton.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Homet1Botton.setForeground(new java.awt.Color(255, 255, 255));
        Homet1Botton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Home (1).png"))); // NOI18N
        Homet1Botton.setText(" Dashbord");
        Homet1Botton.setBorder(null);
        Homet1Botton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Homet1Botton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
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

        AddPaymentBotton.setBackground(new java.awt.Color(0, 0, 51));
        AddPaymentBotton.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        AddPaymentBotton.setForeground(new java.awt.Color(255, 255, 0));
        AddPaymentBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Custom-Icon-Design-Flatastic-5-Payment-card.512 (1).png"))); // NOI18N
        AddPaymentBotton.setText(" Add Payment");
        AddPaymentBotton.setBorder(null);
        AddPaymentBotton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        Overview1.setBackground(new java.awt.Color(0, 0, 51));
        Overview1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Overview1.setForeground(new java.awt.Color(255, 255, 0));
        Overview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backup (1).png"))); // NOI18N
        Overview1.setText(" View Details");
        Overview1.setBorder(null);
        Overview1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Overview1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Overview1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Overview1MouseEntered(evt);
            }
        });
        Overview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Overview1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images-removebg-preview (1) (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("& Maritime Academy");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mahapola Ports ");

        AddStudentBotton1.setBackground(new java.awt.Color(0, 0, 51));
        AddStudentBotton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        AddStudentBotton1.setForeground(new java.awt.Color(255, 255, 0));
        AddStudentBotton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Iconsmind-Outline-Student-MaleFemale.512 (3).png"))); // NOI18N
        AddStudentBotton1.setText(" Add Student");
        AddStudentBotton1.setBorder(null);
        AddStudentBotton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        AddRegisterdBotton1.setBackground(new java.awt.Color(0, 0, 51));
        AddRegisterdBotton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        AddRegisterdBotton1.setForeground(new java.awt.Color(255, 255, 0));
        AddRegisterdBotton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Iconsmind-Outline-Student-MaleFemale.512 (3).png"))); // NOI18N
        AddRegisterdBotton1.setText(" Registerd Student");
        AddRegisterdBotton1.setBorder(null);
        AddRegisterdBotton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddRegisterdBotton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddRegisterdBotton1MouseClicked(evt);
            }
        });
        AddRegisterdBotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRegisterdBotton1ActionPerformed(evt);
            }
        });

        AddBatchButton.setBackground(new java.awt.Color(0, 0, 51));
        AddBatchButton.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        AddBatchButton.setForeground(new java.awt.Color(255, 255, 0));
        AddBatchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Batch-removebg-preview (1).png"))); // NOI18N
        AddBatchButton.setText(" Add Batch");
        AddBatchButton.setBorder(null);
        AddBatchButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddBatchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBatchButtonMouseClicked(evt);
            }
        });
        AddBatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBatchButtonActionPerformed(evt);
            }
        });

        jButtonAdmin.setBackground(new java.awt.Color(0, 0, 51));
        jButtonAdmin.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jButtonAdmin.setForeground(new java.awt.Color(255, 255, 0));
        jButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Graphicloads-Folded-Add-contact-folded.256 (1).png"))); // NOI18N
        jButtonAdmin.setText(" Add New Admin");
        jButtonAdmin.setBorder(null);
        jButtonAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdminMouseClicked(evt);
            }
        });
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOgoutS.png"))); // NOI18N
        jButton1.setText("LogOut");
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddcoursBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddStudentBotton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddRegisterdBotton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBatchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Overview1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddPaymentBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(20, 20, 20)
                .addComponent(Homet1Botton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddStudentBotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddcoursBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddRegisterdBotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddPaymentBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Overview1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        InterfaseView.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout InterfaseViewLayout = new javax.swing.GroupLayout(InterfaseView);
        InterfaseView.setLayout(InterfaseViewLayout);
        InterfaseViewLayout.setHorizontalGroup(
            InterfaseViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        InterfaseViewLayout.setVerticalGroup(
            InterfaseViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InterfaseView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InterfaseView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        AddRegisterdBotton1.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);
        jButtonAdmin.setBackground(DefaultColor);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickForeground);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);
    }//GEN-LAST:event_AddcoursBottonMouseClicked

    private void Homet1BottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Homet1BottonMouseClicked

        Homet1Botton.setBackground(ClickedColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);
        jButtonAdmin.setBackground(DefaultColor);
        Homet1Botton.setForeground(ClickForeground);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickForeground);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);


    }//GEN-LAST:event_Homet1BottonMouseClicked

    private void AddPaymentBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPaymentBottonMouseClicked
        //Background Change
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(ClickedColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);
        jButtonAdmin.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickForeground);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);

    }//GEN-LAST:event_AddPaymentBottonMouseClicked

    private void Overview1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Overview1MouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(ClickedColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);
        jButtonAdmin.setBackground(DefaultColor);

        //ForeGround Change
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickForeground);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);
        AddBatchButton.setForeground(ClickAfterForgrond);

    }//GEN-LAST:event_Overview1MouseClicked

    private void Homet1BottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Homet1BottonActionPerformed
        goToPanelAt(1);
    }//GEN-LAST:event_Homet1BottonActionPerformed

    private void AddPaymentBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPaymentBottonActionPerformed
        goToPanelAt(4);
    }//GEN-LAST:event_AddPaymentBottonActionPerformed

    private void Overview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Overview1ActionPerformed
        goToPanelAt(7);
    }//GEN-LAST:event_Overview1ActionPerformed

    private void AddStudentBotton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentBotton1MouseClicked

        Homet1Botton.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(ClickedColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        jButtonAdmin.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickForeground);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);


    }//GEN-LAST:event_AddStudentBotton1MouseClicked

    private void AddStudentBotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentBotton1ActionPerformed
        goToPanelAt(2);
    }//GEN-LAST:event_AddStudentBotton1ActionPerformed

    private void AddRegisterdBotton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRegisterdBotton1MouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(ClickedColor);
        Overview1.setBackground(DefaultColor);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickForeground);
        jButtonAdmin.setForeground(ClickAfterForgrond);


    }//GEN-LAST:event_AddRegisterdBotton1MouseClicked

    private void AddRegisterdBotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRegisterdBotton1ActionPerformed
        goToPanelAt(5);
    }//GEN-LAST:event_AddRegisterdBotton1ActionPerformed

    private void AddBatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBatchButtonActionPerformed
        goToPanelAt(6);
    }//GEN-LAST:event_AddBatchButtonActionPerformed

    private void AddBatchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBatchButtonMouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        AddBatchButton.setBackground(ClickedColor);
        jButtonAdmin.setBackground(DefaultColor);

        //ForeGround Change
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickAfterForgrond);
        AddBatchButton.setForeground(ClickForeground);

    }//GEN-LAST:event_AddBatchButtonMouseClicked

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        goToPanelAt(8);
    }//GEN-LAST:event_jButtonAdminActionPerformed

    private void jButtonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdminMouseClicked
        Homet1Botton.setBackground(DefaultColor);
        AddcoursBotton.setBackground(DefaultColor);
        AddPaymentBotton.setBackground(DefaultColor);
        Overview1.setBackground(DefaultColor);
        AddStudentBotton1.setBackground(DefaultColor);
        AddRegisterdBotton1.setBackground(DefaultColor);
        AddBatchButton.setBackground(DefaultColor);
        jButtonAdmin.setBackground(ClickedColor);

        //ForeGround Change
        AddBatchButton.setForeground(ClickAfterForgrond);
        Homet1Botton.setForeground(ClickAfterForgrond);
        AddcoursBotton.setForeground(ClickAfterForgrond);
        AddPaymentBotton.setForeground(ClickAfterForgrond);
        Overview1.setForeground(ClickAfterForgrond);
        AddStudentBotton1.setForeground(ClickAfterForgrond);
        AddRegisterdBotton1.setForeground(ClickAfterForgrond);
        jButtonAdmin.setForeground(ClickForeground);
    }//GEN-LAST:event_jButtonAdminMouseClicked

    private void Overview1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Overview1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Overview1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton AddBatchButton;
    private javax.swing.JButton AddPaymentBotton;
    private javax.swing.JButton AddRegisterdBotton1;
    private javax.swing.JButton AddStudentBotton1;
    private javax.swing.JButton AddcoursBotton;
    private javax.swing.JButton Homet1Botton;
    private javax.swing.JPanel InterfaseView;
    private javax.swing.JButton Overview1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
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
