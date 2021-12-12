import java.util.Scanner;
public class main{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        try {
            int first = 0;
            int second = 1;
            int counter = in.nextInt();
            if(counter <0){
            
                throw new ExceptionInInitializerError();
            }
            else{
                number(first,second,counter);
            }
            
            
        } catch (NullPointerException e) {
            System.out.println("Number less than zero");
            main(arg);

        }
        
    }
    public static int number(int first, int second, int counter){
        int total = 0;
        if(counter != 0){
            System.out.print(first + " ");
            total = first + second;
            first = second;
            second = total;
            counter--;
            total = number(first,second,counter);
        }
        else {
            System.out.print(first);
        }
        return 0;
    }

}