package tedo.bank;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Login_Page {
    JTextField tf1,tf2,tf3;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    Login_Page()
    {
        JFrame f=new JFrame();
       
        b1=new JButton("Login");
        b1.setBounds(50,250,150,50);
        
        b2=new JButton("Sign Up");
        b2.setBounds(210,350,150,50);
      
        f.add(b1);
        f.add(b2);
        
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionEvent(){
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
    } 
    public static void main(String[] args) {
        new Login_Page();
    }
    
}
