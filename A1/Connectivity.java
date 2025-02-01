package A1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
    public static void main(String[] args) {

        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/Advance_java"; // Change to your database in "Advance_java"
        String user = "root"; // Change to your MySQL username
        String password = "123456"; // Change to your MySQL password

        try {
            // Load MySQL Driver (Ensure JDBC JAR is added)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL successfully!");

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("🚨 MySQL JDBC Driver not found. Add the JAR file to the project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error connecting to MySQL database.");
            e.printStackTrace();
        }
    }
}

