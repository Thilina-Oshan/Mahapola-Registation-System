/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DbConnection {
    
     
     public Connection connect(){
        
        Connection conn = null ;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpma_student_registration?autoReconnect=false&useSSL=false", "root", "");
            
           // JOptionPane.showMessageDialog(null, "Database connected");
           System.out.println("Database is Connected");
          
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
        return conn;
    }
    
    
}
