/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Oshan Demel
 */
public class MainInterfaseClass {
    static Connection conn;
    
     public static Connection getConnection() {
         
         Connection con = null ;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpma_student_registration?autoReconnect=false&useSSL=false", "root", "");
            
           // JOptionPane.showMessageDialog(null, "Database connected");
           System.out.println("Database is Connected");
          
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
        return con;
    }
         
         
       
    
    
}
