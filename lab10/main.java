public class main{
    public static void main(String[] args) {
        Student s1 = new Student (213212342, "Mohammed");
        Student s2 = new Student (215619786, "Maytham", 4.31);
        StudentsList studentsList = new StudentsList ();
        studentsList.addstudent (s1);
        studentsList.addstudent (s2);
        //Searching by the id
        Student target = studentsList.search(215619786) ;
        if (target!=null)
            target.displayInfo();
        else
            System.out.println("There is no student with this id!");
        //Searching by the name
        target = studentsList.search("Mohammed");
        if (target!=null)
            target.displayInto();
        else
            System.out.printin("There is no student with this name! ");
    }
}