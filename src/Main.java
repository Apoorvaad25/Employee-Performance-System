import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        ManagerService managerService = new ManagerService();

        while (true) {
            System.out.println("\n===== Employee Performance Evaluation System =====");
            System.out.println("1. Manager Login");
            System.out.println("2. Employee Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    managerService.managerMenu();
                    break;

                case 2:
                    employeeService.employeeMenu();
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
