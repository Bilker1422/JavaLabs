public class main {
    public static void main(String[] arg){
        Jenan s1= new Jenan("Saudi Arabia","Riyadh",2150000f,34810000);
        Jenan s3= new Jenan("alsharqiah","Al-khobar", 23252f);
        Jenan s2= new Jenan("alsharqiah","Al-khobar");
        System.out.println(s1.toString());
        System.out.println("-----------------------------");

        System.out.println(s2.toString());
        System.out.println("-----------------------------");
        System.out.println(s3.toString());
    }
}
