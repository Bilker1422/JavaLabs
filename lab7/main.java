import java.util.ArrayList;

public class main{
    public static void main(String[] arg){
        ArrayList<Advisor> Advisorlist = new ArrayList<>();

        Advisor s1 = new Advisor(10,"Yahya","me");
        Advisor s2 = new Advisor(11,"safsaf","rwtwert");
        Advisorlist.add(s1);
        Advisorlist.add(s2);
        System.out.print(s1);
        System.out.print(s2);

    }
}