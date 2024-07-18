
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener
{
    JButton deposit,back;
    JTextField amount;
    String pinnumber;
    
    Deposit(String pinnumber)
    {
      this.pinnumber = pinnumber;
      setLayout(null);
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2 = i1.getImage().getScaledInstance(720,720,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0,0,720,720);
      add(image);
      
      JLabel text = new JLabel("Enter the amount you want to deposit");
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System",Font.BOLD,14));
      text.setBounds(145,250,600,35);
      image.add(text); // sirf add(text); se nhi chalega hume text ko image ke upr show krnana h
      
      amount = new JTextField();
      amount.setFont(new Font("Raleway",Font.BOLD,20));
      amount.setBounds(145,300,260,25);
      image.add(amount);
      
      deposit = new JButton("Deposit");
      deposit.setBounds(280,392,125,25);
      deposit.addActionListener(this);
      image.add(deposit);
      
      back = new JButton("Back");
      back.setBounds(130,392,125,25);
      back.addActionListener(this);
      image.add(back);
      
      setSize(720,720);
      setLocation(300,0);
      setVisible(true);
      
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource() == deposit)
     {
         
     }
     else if( ae.getSource() == back)
     {
         setVisible(false);
       new Transactions(pinnumber).setVisible(true);
     }
    }
    
    public static void main(String args[])
    {
    new Deposit("");
    }
}
