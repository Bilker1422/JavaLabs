import java.util.Scanner;

public class Vehicles
{
    public static void main(String[] args)
    {
        type hummer = new type("Hummer EV", "March 2022", 150 ,450);
        type tesla = new type("Cyber Truck", "Jan 2022", 140 ,400);

        String name;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ;i++)
        {
            System.out.println("Name");
            name = sc.nextLine();
            switch (name) {
                case "hummer":
                System.out.printf("The %s is a new Truck with a top speed of %d and battery life of %d Miles; It will be launced in %s\n",hummer.getname(),hummer.getspeed(),hummer.getmiles(),hummer.getspeed());
                    break;
                
                case "tesla":
                System.out.printf("The %s is a new Truck with a top speed of %d and battery life of %d Miles; It will be launced in %s\n",tesla.getname(),tesla.getspeed(),tesla.getmiles(),tesla.getspeed());

                    break;
                default:
                    System.out.print("not found\n");
            }
        }
    }
}