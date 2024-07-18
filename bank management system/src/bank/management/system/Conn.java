
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;  // to create connection
    Statement s;
     public Conn()
     {
         try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Root@123");
            s = c.createStatement();
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
         
     }
     
}
