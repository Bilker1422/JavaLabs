import java.util.ArrayList;


public class StudentsList
{
    private ArrayList<Student> studentsList;
}
public StudentsList()
{
    studentsList =  = new ArrayList();
}
public void addstudent(Student student)
{
    studentsList.add(student);
}
public void displayStudents()
{
    for (Student s: studentsList){
        s.displayInfo();
    }
} 