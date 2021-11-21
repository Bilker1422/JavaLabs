import java.util.ArrayList;

public class StudentsList {

   private ArrayList<Student> studentsList;

   public StudentsList () {
      studentsList = new ArrayList ();
     }

   public void addstudent (Student student) {
      studentsList.add (student);
      System.out.println (student);

     }

   public void displaystudents () {
      for (Student s: studentsList) {
          s.displayInfo ();
         }
   }
   public Student search (int id) {
        Student targetstudent = null;
        for (Student s: studentsList){
            if (s.getId() == id) {
                targetStudent = S;
                break;
            }
        }
        return targetStudent;
    }
    
    public Student search (String name) {
        Student targetStudent = null;
        for (Student s: studentsList) {
            if(s.getName().equals(name)) {
                targetStudent = s;
                break;
            }
        }
        return targetStudent;
    }
}