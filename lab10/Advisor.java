public class Advisor extends Person{
    private String department;

    public Advisor(int ID, String name) {
        super(ID, name);
    }

    public Advisor(int ID, String name, String department) {
        super(ID, name);
        this.department = department;
    }
    @Override
    protected void setID(int ID) {
        if (ID > 100000 && ID < 999999 ){
            this.ID = ID;
        }

    }
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void display() {
        System.out.println("ID: \t"+ ID);
        System.out.println("name: \t"+ name);
        System.out.println("department: \t"+ department);
    }
    
    
}