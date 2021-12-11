public class Student{
    private int studentID;
    private String studentname; 
    private float studentGPA;

    public Student(int studentID, String studentname, float studentGPA) {
        this.studentID = studentID;
        this.studentname = studentname;
        this.studentGPA = studentGPA;
    }
    

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentname() {
        return this.studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public float getStudentGPA() {
        return this.studentGPA;
    }

    public void setStudentGPA(float studentGPA) {
        if (studentGPA <= 5 && studentGPA >= 0){
            this.studentGPA = studentGPA;
    }

    }
    public void displayInfo() {
        System.out.println("ID: \t" + studentID);
        System.out.println("Name: \t" + studentname);
        System.out.println("GPA: \t" + studentGPA);

    }
}