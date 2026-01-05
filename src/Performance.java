public class Performance {

    private int performanceId;
    private int employeeId;
    private int workQuality;
    private int punctuality;
    private int communication;
    private int productivity;
    private double overallScore;
    private String remarks;

    public Performance(int employeeId, int workQuality, int punctuality,
                       int communication, int productivity) {
        this.employeeId = employeeId;
        this.workQuality = workQuality;
        this.punctuality = punctuality;
        this.communication = communication;
        this.productivity = productivity;
        calculateOverallScore();
        generateRemarks();
    }

    private void calculateOverallScore() {
        this.overallScore =
                (workQuality + punctuality + communication + productivity) / 4.0;
    }

    private void generateRemarks() {
        if (overallScore >= 8) {
            remarks = "Excellent Performance";
        } else if (overallScore >= 6) {
            remarks = "Good Performance";
        } else if (overallScore >= 4) {
            remarks = "Average Performance";
        } else {
            remarks = "Needs Improvement";
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public String toString() {
        return "Performance Report\n" +
               "Employee ID: " + employeeId +
               "\nWork Quality: " + workQuality +
               "\nPunctuality: " + punctuality +
               "\nCommunication: " + communication +
               "\nProductivity: " + productivity +
               "\nOverall Score: " + overallScore +
               "\nRemarks: " + remarks;
    }
}
