/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class New {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new New().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Student and Course Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        String[] columnNames = {"Student ID", "Student Name", "Course ID", "Course Name"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            String query = "SELECT s.StudentID, s.StudentName, c.CourseID, c.CourseName FROM Student s JOIN Course c ON s.StudentID = c.StudentID";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int studentID = resultSet.getInt("StudentID");
                String studentName = resultSet.getString("StudentName");
                int courseID = resultSet.getInt("CourseID");
                String courseName = resultSet.getString("CourseName");
                model.addRow(new Object[]{studentID, studentName, courseID, courseName});
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

