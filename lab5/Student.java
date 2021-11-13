
public class Student 
{ 
    private int StudentID;
    private String Studentname;
    private double StudentGPA;

    public Student(int ID, String name, double GPA)
    {
        this.StudentID = ID;
        this.Studentname = name;
        this.StudentGPA = GPA;

    }

    public int getStudentID() {
        return this.StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentname() {
        return this.Studentname;
    }

    public void setStudentname(String Studentname) {
        this.Studentname = Studentname;
    }

    public double getStudentGPA() {
        return this.StudentGPA;
    }

    public void setStudentGPA(double StudentGPA) {
        this.StudentGPA = StudentGPA;
    }

    public String toString() {
        return "{" +
            " StudentID='" + getStudentID() + "'" +
            ", Studentname='" + getStudentname() + "'" +
            ", StudentGPA='" + getStudentGPA() + "'" +
            "}";
    }
    
    

}