/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConnection {

    static public Connection connect() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpma_student_registration?autoReconnect=false&useSSL=false", "root", "");

            System.out.println(" Database connected ");
            //JOptionPane.showMessageDialog(null, "Database is Connected", null, 1);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, " Database is Not Connected. Please check localhost connection. ", null, 1);

        }

        return con;
    }

}
