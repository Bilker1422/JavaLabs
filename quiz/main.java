import java.util.*;


class moive{
    private String name;
    private float rate ;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return this.rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
public class main{
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        int count;
        count = sc.nextInt();
        ArrayList <moive> list = new ArrayList<>();
        
        for(int i = 0 ; i< count; i++)
        {
            moive S1 = new moive();
            System.out.print("MOive name: ");
            S1.setName(sc.next());
            System.out.print("Rating: ");
            S1.setRate(sc.nextFloat());
            list.add(S1);
        }
        for (int i = 0; i< count; i++)
        {
            moive S2 = list.get(i);
           System.out.println(S2.getName()+" "+S2.getRate());
        }
    }

}
