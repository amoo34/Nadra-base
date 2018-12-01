/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadra;

import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    
 
   Connection con=null;
   public static Connection ConnectDB(){
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Nadra","root","");
           
           
           //JOptionPane.showMessageDialog(null,"Connection Established");
           return con;
           
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Connection not established");
           return null;
       }
       
   }

    private static class args {

        public args() {
        }
    }
}
