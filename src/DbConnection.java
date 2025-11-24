import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "root";
    private static final String PASSWORD = "Apoorva5689";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }
        return con;
    }
}
