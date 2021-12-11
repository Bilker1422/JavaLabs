public class Student extends Person{

    private float GPA;

    public Student(int ID, String name) {
        super(ID, name);
    }
    public Student(int ID, String name,float GPA) {
        super(ID, name);
        this.GPA = GPA;
    }
    @Override
    public void setID(int ID) {
        if (ID > 200000000 && ID < 299999999 ){
            this.ID = ID;
        }
    }
    public float getGPA() {
        return this.GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public void display() {
        System.out.println("ID: "+ ID + "\n");
        System.out.println("name: "+ name + "\n");
        System.out.println("GPA: "+ GPA + "\n");
    }

}