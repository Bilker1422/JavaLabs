public class library 
{
    public static void main(String[] args)
    {
        book s1 = new book(1,"YahyaBook",1000);
        s1.DisplayInfo();

        s1.setname("YahyaafterchangeTheName");
        s1.settotal(40);
        s1.DisplayInfo();
        System.out.println(s1.getBookID());
    }
} 