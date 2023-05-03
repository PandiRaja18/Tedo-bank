import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCOT
 */
public class Credit extends javax.swing.JFrame {

    /**
     * Creates new form Credit
     */
    public static String uname;
    public static String email;
    
    public Credit() {
        initComponents();
        this.setLocationRelativeTo(null);
  
        try
            {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/Tedo_bank","Zython","Miichan");
                Statement stmnt=connection.createStatement();
                ResultSet rSet=stmnt.executeQuery("select * from ACCOUNT_DETAILS");
                while(rSet.next())
                {
                    if(rSet.getString(8).equals(uname))
                    {
                        String Name=rSet.getString(1);
                        email=rSet.getString(5);
                        Credit_Holdername.setText(Name);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public Credit(String username)
    {
        this.uname=username;
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
        Tedo_Banc = new javax.swing.JLabel();
        Credit_close = new javax.swing.JLabel();
        Credit_minimize = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Credit_amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Credit_currency = new javax.swing.JComboBox<>();
        Credit_OK = new javax.swing.JButton();
        Credit_Cancel = new javax.swing.JButton();
        Credit_Holdername = new javax.swing.JLabel();
        Credit_balance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(79, 244, 162));

        jPanel2.setBackground(new java.awt.Color(255, 142, 172));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        Tedo_Banc.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Tedo_Banc.setForeground(new java.awt.Color(255, 255, 255));
        Tedo_Banc.setText("Tedo Banc");

        Credit_close.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_close.setForeground(new java.awt.Color(255, 255, 255));
        Credit_close.setText("X");
        Credit_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Credit_closeMouseClicked(evt);
            }
        });

        Credit_minimize.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Credit_minimize.setForeground(new java.awt.Color(255, 255, 255));
        Credit_minimize.setText("-");
        Credit_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Credit_minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(Tedo_Banc)
                .addGap(284, 284, 284)
                .addComponent(Credit_minimize)
                .addGap(18, 18, 18)
                .addComponent(Credit_close)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Credit_close)
                    .addComponent(Credit_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(Tedo_Banc)
                .addGap(25, 25, 25))
        );

        jlabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlabel.setText("Account Holder : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Amount :");

        Credit_amount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Currency :");

        Credit_currency.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rupees", "Dollars", "Pounds" }));

        Credit_OK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_OK.setText("Credit");
        Credit_OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Credit_OKMouseClicked(evt);
            }
        });
        Credit_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Credit_OKActionPerformed(evt);
            }
        });

        Credit_Cancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_Cancel.setText("Cancel");
        Credit_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Credit_CancelMouseClicked(evt);
            }
        });
        Credit_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Credit_CancelActionPerformed(evt);
            }
        });

        Credit_Holdername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_Holdername.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Credit_HoldernamePropertyChange(evt);
            }
        });

        Credit_balance.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Credit_balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Credit_amount)
                            .addComponent(Credit_currency, 0, 105, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Credit_Holdername, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(Credit_OK)
                        .addGap(88, 88, 88)
                        .addComponent(Credit_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Credit_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel)
                    .addComponent(Credit_Holdername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Credit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Credit_currency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Credit_OK)
                    .addComponent(Credit_Cancel))
                .addGap(72, 72, 72)
                .addComponent(Credit_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 297, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Credit_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Credit_OKActionPerformed
        if(evt.getSource()==Credit_OK)
        {
            String Amount=Credit_amount.getText();
            int Cre_Amount=Integer.parseInt(Amount);
            
            try
            {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/Tedo_bank","Zython","Miichan");
                Statement stmnt=connection.createStatement();
                ResultSet rSet=stmnt.executeQuery("select * from ACCOUNT_TRANSACTION");
                while(rSet.next())
                {
                    if(rSet.getString(1).equals(uname))
                    {
                        System.out.println("Miichan");
                        int Balance=rSet.getInt(2);
                        if(Credit_currency.getSelectedItem().equals("Dollars"))
                        {
                            //System.out.println(Balance);
                            Cre_Amount=Cre_Amount*72;
                            Balance=Balance+Cre_Amount;
                            String query = "update ACCOUNT_TRANSACTION set Balance = ? where USER_NAME = ?";
                            PreparedStatement stmt= connection.prepareStatement(query);
                            stmt.setInt(1,Balance);
                            stmt.setString(2,uname);
                            stmt.executeUpdate();
                            Mailer obj=new Mailer();
                            String Message="Hi! Amount of "+Cre_Amount+" Dollar has been Credited Successfully.Thanks for Supporting with us.\n\n\t<- Have a Great Day ->\n\nFor Contact (send mail at) :\nzythonencoders@gmail.com";
                            obj.send("zythonencoders@gmail.com","SanPanVen302218",email,"Credited Successfully",Message);  
                            JOptionPane.showMessageDialog(null,"Credited Sucessfully!!");
                            Login log=new Login(); 
                            log.setVisible(true);
                            log.pack();
                            log.setLocationRelativeTo(null);
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                        }
                        else if(Credit_currency.getSelectedItem().equals("Pounds"))
                        {
                            //System.out.println(Balance);
                            Cre_Amount=Cre_Amount*103;
                            Balance=Balance+Cre_Amount;
                            String query = "update ACCOUNT_TRANSACTION set Balance = ? where user_name = ?";
                            PreparedStatement stmt= connection.prepareStatement(query);
                            stmt.setInt(1,Balance);
                            stmt.setString(2,uname);
                            stmt.executeUpdate();
                            Mailer obj=new Mailer();
                            String Message="Hi! Amount of "+Cre_Amount+" Pound has been Credited Successfully.Thanks for Supporting with us.\n\n\t<- Have a Great Day ->\n\nFor Contact (send mail at) :\nzythonencoders@gmail.com";
                            obj.send("zythonencoders@gmail.com","SanPanVen302218",email,"Credited Successfully",Message);  
                            JOptionPane.showMessageDialog(null,"Credited Sucessfully!!");
                            Login log=new Login(); 
                            log.setVisible(true);
                            log.pack();
                            log.setLocationRelativeTo(null);
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                        }
                        else if(Credit_currency.getSelectedItem()=="Rupees")
                        {
                            //System.out.println(Balance);
                            Balance=Balance+Cre_Amount;
                            String query = "update ACCOUNT_TRANSACTION set Balance = ? where user_name = ?";
                            PreparedStatement stmt= connection.prepareStatement(query);
                            stmt.setInt(1,Balance);
                            stmt.setString(2,uname);
                            stmt.executeUpdate();
                            Mailer obj=new Mailer();
                            String Message="Hi! Amount of Rs. "+Cre_Amount+" has been Credited Successfully.Thanks for Supporting with us.\n\n\t<- Have a Great Day ->\n\nFor Contact (send mail at) :\nzythonencoders@gmail.com";
                            obj.send("zythonencoders@gmail.com","SanPanVen302218",email,"Credited Successfully",Message);  
                            JOptionPane.showMessageDialog(null,"Credited Sucessfully!!");
                            Login log=new Login(); 
                            log.setVisible(true);
                            log.pack();
                            log.setLocationRelativeTo(null);
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Credit_OKActionPerformed

    private void Credit_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Credit_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Credit_minimizeMouseClicked

    private void Credit_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Credit_closeMouseClicked
        // TODO add your handling code here:
        System. exit(0);
    }//GEN-LAST:event_Credit_closeMouseClicked

    private void Credit_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Credit_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Credit_CancelActionPerformed

    private void Credit_HoldernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Credit_HoldernamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Credit_HoldernamePropertyChange

    private void Credit_OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Credit_OKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Credit_OKMouseClicked

    private void Credit_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Credit_CancelMouseClicked
        // TODO add your handling code here:
        Login log=new Login(); 
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Credit_CancelMouseClicked

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
            java.util.logging.Logger.getLogger(Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Credit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Credit_Cancel;
    private javax.swing.JLabel Credit_Holdername;
    private javax.swing.JButton Credit_OK;
    private javax.swing.JTextField Credit_amount;
    private javax.swing.JLabel Credit_balance;
    private javax.swing.JLabel Credit_close;
    private javax.swing.JComboBox<String> Credit_currency;
    private javax.swing.JLabel Credit_minimize;
    private javax.swing.JLabel Tedo_Banc;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
