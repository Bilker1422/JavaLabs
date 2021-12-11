public class Advisor extends Person{
    private String department;

    public Advisor(int ID, String name) {
        super(ID, name);
    }

    public Advisor(int ID, String name, String department) {
        super(ID, name);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}