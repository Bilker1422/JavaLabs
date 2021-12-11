public class main{
    public static void main(String[] arg){

        Student s1 = new Student (101, "Ahmed", 4.5f);
        Student s2 = new Student (102, "Fatima", 4.7f);
        s1.setStudentGPA(3);
        s1.getStudentGPA();
        System.out.println ("Students Information:");
        s1.displayInfo ();
        System.out.println ("-----------------");
        s2.displayInfo ();
        System.out.println ("-----------------");
        

        Book b1 = new Book("Math", 1.2f);
        b1.display();
    }
}