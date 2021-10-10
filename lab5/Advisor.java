public class Advisor {
    private int AdvisorID;
    private String AdvisorName;
    private String AdvisorDept;

    public Advisor(int AdvisorID, String AdvisorName, String AdvisorDept) {
        this.AdvisorID = AdvisorID;
        this.AdvisorName = AdvisorName;
        this.AdvisorDept = AdvisorDept;
    }
    public int getAdvisorID() {
        return this.AdvisorID;
    }

    public void setAdvisorID(int AdvisorID) {
        this.AdvisorID = AdvisorID;
    }

    public String getAdvisorName() {
        return this.AdvisorName;
    }

    public void setAdvisorName(String AdvisorName) {
        this.AdvisorName = AdvisorName;
    }

    public String getAdvisorDept() {
        return this.AdvisorDept;
    }

    public void setAdvisorDept(String AdvisorDept) {
        this.AdvisorDept = AdvisorDept;
    }

    @Override
    public String toString() {
        return "{" +
            " AdvisorID='" + getAdvisorID() + "'" +
            ", AdvisorName='" + getAdvisorName() + "'" +
            ", AdvisorDept='" + getAdvisorDept() + "'" +
            "}";
    }
    


}

    