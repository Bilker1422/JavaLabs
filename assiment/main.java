public class main{
    public static void main(String arg[])
    {
        Emplotee E1 = new Emplotee(220024667,"Yahya","Male",250.00f,"Yahyaksa28@gmail.com","Foever there","0549314419");
        Docter D1 = new Docter(220024667,"Yahya","Male",250.00f,"Yahyaksa28@gmail.com","Foever there","0549314419","Intern","idk");
        Nurse N1 = new Nurse(220024667,"Yahya","Male",250.00f,"Yahyaksa28@gmail.com","Foever there","0549314419","Nurse Practitioner");
        Administrator A1 = new Administrator(220024667,"Yahya","Male",250.00f,"Yahyaksa28@gmail.com","Foever there","0549314419","Yoh");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(N1);
        System.out.println(A1.toString());
    }

}