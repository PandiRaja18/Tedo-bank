import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.swing.JOptionPane;
//import org.apache.derby.iapi.sql.PreparedStatement;
//import java.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Ltext = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jButton_Cancel_reg = new javax.swing.JButton();
        jLabel_Age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jTextField_Age = new javax.swing.JTextField();
        jLabel_DOB = new javax.swing.JLabel();
        Email_id = new javax.swing.JLabel();
        jTextField_email_id = new javax.swing.JTextField();
        jLabel_Qulaification = new javax.swing.JLabel();
        jLabel_User = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jTextField_mobilenumber = new javax.swing.JTextField();
        jTextField_Qualifiation = new javax.swing.JComboBox<>();
        jTextField_Gender = new javax.swing.JComboBox<>();
        jButton_Create_account = new javax.swing.JButton();
        jTextField_DOB = new javax.swing.JTextField();
        jLabel_Confirm_Password = new javax.swing.JLabel();
        jPassword_pswd = new javax.swing.JTextField();
        jPassword_Confirm_pswd = new javax.swing.JTextField();
        jLabel_phnum = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Headder = new javax.swing.JLabel();
        jLabel_Min = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(847, 739));

        jPanel1.setBackground(new java.awt.Color(255, 142, 172));

        jPanel2.setBackground(new java.awt.Color(41, 241, 195));

        jLabel_Ltext.setBackground(new java.awt.Color(197, 239, 247));
        jLabel_Ltext.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Ltext.setForeground(new java.awt.Color(83, 51, 237));
        jLabel_Ltext.setText("Enter your Details Here...");

        jLabel_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Name.setText("Your Name :");

        jTextField_Name.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jButton_Cancel_reg.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Cancel_reg.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_Cancel_reg.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel_reg.setText("Cancel");
        jButton_Cancel_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Cancel_regMouseClicked(evt);
            }
        });
        jButton_Cancel_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_regActionPerformed(evt);
            }
        });

        jLabel_Age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Age.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Age.setText("Age            :");

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender       :");

        jTextField_Age.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_Age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_Age.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AgeActionPerformed(evt);
            }
        });

        jLabel_DOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_DOB.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DOB.setText("Date of Birth :");

        Email_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email_id.setForeground(new java.awt.Color(255, 255, 255));
        Email_id.setText("E mail ID   :");

        jTextField_email_id.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_email_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_email_id.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_email_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_email_idActionPerformed(evt);
            }
        });

        jLabel_Qulaification.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Qulaification.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Qulaification.setText("Qualification :");

        jLabel_User.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_User.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_User.setText("User Name :");

        jLabel_Password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password    :");

        jTextField_mobilenumber.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_mobilenumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_mobilenumber.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_mobilenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mobilenumberActionPerformed(evt);
            }
        });

        jTextField_Qualifiation.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField_Qualifiation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higher Secondary", "Diploma", "Graduate", "Illiterate" }));
        jTextField_Qualifiation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_QualifiationActionPerformed(evt);
            }
        });

        jTextField_Gender.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Trans-Gender" }));

        jButton_Create_account.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Create_account.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_Create_account.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Create_account.setText("Create Account");
        jButton_Create_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Create_accountMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_Create_accountMouseReleased(evt);
            }
        });
        jButton_Create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Create_accountActionPerformed(evt);
            }
        });

        jTextField_DOB.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_DOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_DOB.setToolTipText("dd/mm/yyyy");
        jTextField_DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DOBActionPerformed(evt);
            }
        });

        jLabel_Confirm_Password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Confirm_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Confirm_Password.setText("Confirm Password    :");

        jPassword_pswd.setBackground(new java.awt.Color(197, 239, 247));
        jPassword_pswd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPassword_pswd.setForeground(new java.awt.Color(51, 51, 51));
        jPassword_pswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword_pswdActionPerformed(evt);
            }
        });

        jPassword_Confirm_pswd.setBackground(new java.awt.Color(197, 239, 247));
        jPassword_Confirm_pswd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPassword_Confirm_pswd.setForeground(new java.awt.Color(51, 51, 51));
        jPassword_Confirm_pswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword_Confirm_pswdActionPerformed(evt);
            }
        });

        jLabel_phnum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_phnum.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_phnum.setText("Mobile number :");

        jTextField_Username.setBackground(new java.awt.Color(197, 239, 247));
        jTextField_Username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Ltext))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel_Confirm_Password)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                    .addComponent(jPassword_Confirm_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Qulaification)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email_id, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_User, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel_phnum))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(69, 69, 69)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jTextField_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_email_id)
                                .addComponent(jTextField_Qualifiation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_mobilenumber)
                                .addComponent(jPassword_pswd)
                                .addComponent(jTextField_Username))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton_Cancel_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton_Create_account)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel_Ltext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_email_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Qulaification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Qualifiation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_phnum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_User, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Confirm_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword_Confirm_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Create_account, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(271, 271, 271))
        );

        jLabel_Headder.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_Headder.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Headder.setText("Tedo Banc");

        jLabel_Min.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Min.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Min.setText("-");
        jLabel_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinMouseClicked(evt);
            }
        });

        jLabel_Close.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Close.setText("x");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jLabel_Headder, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(jLabel_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Headder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
        //String jTextField_Name;
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jButton_Cancel_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_regActionPerformed

    }//GEN-LAST:event_jButton_Cancel_regActionPerformed

    private void jLabel_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinMouseClicked

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        System. exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jTextField_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AgeActionPerformed

    private void jTextField_email_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_email_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_email_idActionPerformed

    private void jTextField_mobilenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mobilenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mobilenumberActionPerformed

    private void jTextField_QualifiationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_QualifiationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_QualifiationActionPerformed

    private void jButton_Create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Create_accountActionPerformed
        if(evt.getSource()==jButton_Create_account)
        {
            //Getting elements from textField
            String Name=jTextField_Name.getText();
            String Age=jTextField_Age.getText();
            int agetemp=Integer.parseInt(Age);
            String DOB=jTextField_DOB.getText();
            String Gender=jTextField_Gender.getSelectedItem().toString();
            String EMail=jTextField_email_id.getText();
            String Qualification=jTextField_Qualifiation.getSelectedItem().toString();
            String mobile_no=jTextField_mobilenumber.getText();
            int mob_len=mobile_no.length();
            String user_name=jTextField_Username.getText();
            String pswd=jPassword_pswd.getText();
            String Cpswd=jPassword_Confirm_pswd.getText();
            int flag=0;
            //PreparedStatement Pstatement=(PreparedStatement) connection.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
            
            //long mobTemp=Long.parseLong(mobile_no);
            //Checking for the Password match
            if(Name.equals("") || Age.equals("") || DOB.equals("") || Gender.equals("") || EMail.equals("") || Qualification.equals("") || mobile_no.equals("") || user_name.equals("") || pswd.equals("") || Cpswd.equals("")) 
            {
                JOptionPane.showMessageDialog(null,"Make sure !! All details are Entered");
            }
            else if(!pswd.equals(Cpswd))
            {
                JOptionPane.showMessageDialog(null,"password did not match.");
            }
            else if(mob_len!=10)
            {
                JOptionPane.showMessageDialog(null,"Please !! Enter a valid Mobile number.");
            }
            else
            {
                try
                {
                    Connection connect=DriverManager.getConnection("jdbc:derby://localhost:1527/Tedo_bank","Zython","Miichan");
                    //String query_reg = "INSERT INTO account_details values('"+Name+"','"+agetemp+"','"+DOB+"','"+Gender+"','"+EMail+"','"+Qualification+"','"+mobile_no+"','"+user_name+"')";
                    Statement stmnt=connect.createStatement();
                    ResultSet rSet=stmnt.executeQuery("select * from LOGIN_DETAILS");
                    while(rSet.next())
                    {
                        if(rSet.getString(1).equals(user_name))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)
                    {
                        JOptionPane.showMessageDialog(null,"This Username is already Exists !!");     
                    }
                    else
                    {
                        //Feed Data into Account_Details table
                        PreparedStatement Pstatement=connect.prepareStatement("INSERT INTO account_details values(?,?,?,?,?,?,?,?)");
                        //Specifying the values of it's parameter
                        Pstatement.setString(1,Name);
                        Pstatement.setInt(2,agetemp);
                        Pstatement.setString(3,DOB);
                        Pstatement.setString(4,Gender);
                        Pstatement.setString(5,EMail);
                        Pstatement.setString(6,Qualification);
                        Pstatement.setString(7,mobile_no);
                        Pstatement.setString(8,user_name);
                        
                        PreparedStatement Pstatement1=connect.prepareStatement("INSERT INTO login_details values(?,?)");
                        Pstatement1.setString(1,user_name);
                        Pstatement1.setString(2,pswd);
                        
                        PreparedStatement Pstatement2=connect.prepareStatement("INSERT INTO account_transaction values(?,?)");
                        Pstatement2.setString(1,user_name);
                        Pstatement2.setInt(2,0);
                        
                        Pstatement.executeUpdate(); 
                        Pstatement1.executeUpdate();
                        Pstatement2.executeUpdate();
                        Mailer obj=new Mailer();
                        String Message="Hi! Your Account Created Successfully.Thanks for Supproting with us\n\tYour Account Balance is : 0\nPlease make sure, your Account Balance should not below Rs.1000\n\n\t<- Have a Great Day ->\n\nFor Contact (send mail at) :\nzythonencoders@gmail.com";
                        obj.send("zythonencoders@gmail.com","SanPanVen302218",EMail,"Account Created",Message);  
                        JOptionPane.showMessageDialog(null,"Your account is sucessfully Created");
                        Login log=new Login(); 
                        log.setVisible(true);
                        log.pack();
                        log.setLocationRelativeTo(null);
                        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    }
                        
                }
                catch(Exception exp)
                {
                    exp.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton_Create_accountActionPerformed

    private void jButton_Cancel_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Cancel_regMouseClicked
        Login log=new Login(); 
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jButton_Cancel_regMouseClicked

    private void jTextField_DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DOBActionPerformed

    private void jButton_Create_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Create_accountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Create_accountMouseClicked

    private void jButton_Create_accountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Create_accountMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Create_accountMouseReleased

    private void jPassword_pswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword_pswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword_pswdActionPerformed

    private void jPassword_Confirm_pswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword_Confirm_pswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword_Confirm_pswdActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email_id;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton_Cancel_reg;
    private javax.swing.JButton jButton_Create_account;
    private javax.swing.JLabel jLabel_Age;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Confirm_Password;
    private javax.swing.JLabel jLabel_DOB;
    private javax.swing.JLabel jLabel_Headder;
    private javax.swing.JLabel jLabel_Ltext;
    private javax.swing.JLabel jLabel_Min;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Qulaification;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JLabel jLabel_phnum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPassword_Confirm_pswd;
    private javax.swing.JTextField jPassword_pswd;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_DOB;
    private javax.swing.JComboBox<String> jTextField_Gender;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JComboBox<String> jTextField_Qualifiation;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_email_id;
    private javax.swing.JTextField jTextField_mobilenumber;
    // End of variables declaration//GEN-END:variables
}