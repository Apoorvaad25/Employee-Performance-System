public void viewPerformance(int employeeId) {
    try {
        Connection con = DbConnection.getConnection();
        String query = "SELECT * FROM performance WHERE employee_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, employeeId);

        var rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Employee ID: " + rs.getInt("employee_id"));
            System.out.println("Overall Score: " + rs.getDouble("overall_score"));
            System.out.println("Remarks: " + rs.getString("remarks"));
        } else {
            System.out.println("No performance record found.");
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
