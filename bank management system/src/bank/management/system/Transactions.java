package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquire,exit;
    JLabel text;
    String pinnumber;
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance( 720,720, Image.SCALE_DEFAULT);  // image class awt.*; me hoti hai
        ImageIcon i3 = new ImageIcon(i2); // image ko convert kiya imageicon me
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,720,720);
        add(image);
        
        text = new JLabel("Please select your Transaction");
        text.setBounds(155,250,600,35);//(from left,form top, self width)
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(130,332,125,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(280,332,125,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(130,362,125,25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(280,362,125,25);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(130,392,125,25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquire = new JButton("Balance Enquiry");
        balanceenquire.setBounds(280,392,125,25);
        balanceenquire.addActionListener(this);
        image.add(balanceenquire);
        
        exit = new JButton("Exit");
        exit.setBounds(280,420,125,20);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(720,720);
        setLocation(300,0);
        setUndecorated(true); // uper ki tab ko hide krne ke liye(close krne wali)
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
          System.exit(0);
        } else if(ae.getSource() == deposit)
        {
          setVisible(false);
          new Deposit(pinnumber).setVisible(true);
        }
        
    }
public static void main(String args[])
  {
      new Transactions("");
  }
        
}
