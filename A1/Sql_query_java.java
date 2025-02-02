package A1;

import java.sql.*;
import java.util.Scanner;
public class Sql_query_java {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Your_Database", "User", "Your_password");
            System.out.println("Connection established");


            Scanner sc = new Scanner(System.in);


            while (true) {

                System.out.println("\nChoose an operation:");
                System.out.println("1. Insert a record");
                System.out.println("2. Update a record");
                System.out.println("3. Delete a record");
                System.out.println("4. Exit");


                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the student id:");
                        String id = sc.nextLine();
                        System.out.println("Enter the student name:");
                        String name = sc.nextLine();
                        System.out.println("Enter the age:");
                        int age = sc.nextInt();
                        sc.nextLine();  // Consume newline character
                        System.out.println("Enter the gender:");
                        String gender = sc.nextLine();
                        System.out.println("Enter the grade:");
                        String grade = sc.nextLine();


                        String insertQuery = "INSERT INTO students (id,name, age, gender, grade) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement insertStmt = con.prepareStatement(insertQuery);
                        insertStmt.setString(1, id);
                        insertStmt.setString(2, name);
                        insertStmt.setInt(3, age);
                        insertStmt.setString(4, gender);
                        insertStmt.setString(5, grade);


                        int rowsInserted = insertStmt.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Record inserted successfully.");
                        } else {
                            System.out.println("Error inserting record.");
                        }
                        break;

                    case 2:

                        System.out.println("Enter the student ID to update:");
                        int idToUpdate = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new student name:");
                        String newName = sc.nextLine();
                        System.out.println("Enter the new age:");
                        int newAge = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new gender:");
                        String newGender = sc.nextLine();
                        System.out.println("Enter the new grade:");
                        String newGrade = sc.nextLine();


                        String updateQuery = "UPDATE students SET name = ?, age = ?, gender = ?, grade = ? WHERE id = ?";
                        PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                        updateStmt.setString(1, newName);
                        updateStmt.setInt(2, newAge);
                        updateStmt.setString(3, newGender);
                        updateStmt.setString(4, newGrade);
                        updateStmt.setInt(5, idToUpdate);

                        int rowsUpdated = updateStmt.executeUpdate();
                        if (rowsUpdated > 0) {
                            System.out.println("Record updated successfully.");
                        } else {
                            System.out.println("No record found with the given ID.");
                        }
                        break;

                    case 3:

                        System.out.println("Enter the student ID to delete:");
                        int idToDelete = sc.nextInt();


                        String deleteQuery = "DELETE FROM students WHERE id = ?";
                        PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                        deleteStmt.setInt(1, idToDelete);

                        int rowsDeleted = deleteStmt.executeUpdate();
                        if (rowsDeleted > 0) {
                            System.out.println("Record deleted successfully.");
                        } else {
                            System.out.println("No record found with the given ID.");
                        }
                        break;

                    case 4:

                        System.out.println("Exiting...");
                        con.close();
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Please choose again.");
                }
            }


        }
        catch (ClassNotFoundException e) {
            System.out.println("Error loading MySQL driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }


    }
}
