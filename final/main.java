import java.util.Scanner;
public class main{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        try {
            int first = 0;
            int second = 1;
            int counter = in.nextInt();
            if(counter <0){
            }
                throw new ;

            else{
                doit(first,second,counter);
            }
            
            
        } catch (Exception e) {
            System.out.println("Number less than zero");
            main(arg);

        }
        
    }
    public static int doit(int first, int second, int counter){
        int total = 0;
        if(counter != 0){
            System.out.print(first + " ");
            total = first + second;
            first = second;
            second = total;
            counter--;
            total = doit(first,second,counter);
        }
        else {
            System.out.print(first);
        }
        return 0;
    }
    public static void 
}