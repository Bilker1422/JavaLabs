
public class Student extends Person{

    private float GPA;

    public Student(int ID, String name) {
        super(ID, name);
    } 

    public Student(int ID, String name, float GPA) {
        super(ID, name);
        this.GPA = GPA;
    }

    public float getGPA() {
        return this.GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public void display() {
        System.out.print("ID: \t"+ ID + "\n");
        System.out.print("Name: \t"+ name+ "\n");
        System.out.print("GPA: \t"+ GPA+ "\n");
    }
    
}
