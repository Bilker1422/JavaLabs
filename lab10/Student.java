public class Student{
    private int id;
    private String name;
    private double GPA;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name,double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGPA() {
        return this.GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String displayInto() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", GPA='" + getGPA() + "'" +
            "}";
    }

}