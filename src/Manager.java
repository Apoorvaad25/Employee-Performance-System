import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manager {

    public void evaluateEmployee(Performance performance) {
        try {
            Connection con = DbConnection.getConnection();

            String query = "INSERT INTO performance " +
                    "(employee_id, work_quality, punctuality, communication, productivity, overall_score, remarks) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, performance.getEmployeeId());
            ps.setInt(2, performance.workQuality);
            ps.setInt(3, performance.punctuality);
            ps.setInt(4, performance.communication);
            ps.setInt(5, performance.productivity);
            ps.setDouble(6, performance.getOverallScore());
            ps.setString(7, performance.getRemarks());

            ps.executeUpdate();
            System.out.println("Performance evaluated successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
