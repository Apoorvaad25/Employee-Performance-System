import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Admin {

    Scanner sc = new Scanner(System.in);

    public void adminMenu() {

        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void addEmployee() {

        try (Connection con = DbConnection.getConnection()) {

            System.out.print("Enter employee name: ");
            sc.nextLine();  
            String name = sc.nextLine();

            System.out.print("Enter employee role: ");
            String role = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employees(name, role) VALUES (?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, role);

            ps.executeUpdate();

            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    public void viewEmployees() {

        try (Connection con = DbConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM employees");
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Employee List ---");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("role")
                );
            }

        } catch (Exception e) {
            System.out.println("Error displaying employees: " + e.getMessage());
        }
    }

    public void deleteEmployee() {

        try (Connection con = DbConnection.getConnection()) {

            System.out.print("Enter employee ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE id = ?");
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Employee Deleted!");

        } catch (Exception e) {
            System.out.println("Error deleting employee: " + e.getMessage());
        }
    }
}
