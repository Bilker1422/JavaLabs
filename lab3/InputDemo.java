
import java.util.Scanner;
public class InputDemo {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int age;
        String name;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Welcome "+ name + " :)" );
        System.out.println("Your age next year is: "+(age+1) );
    }
}

import java.util.Scanner;
public class InputDemo {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int a;
        a = input.nextInt();
        int b;
        b = input.nextInt();
        int c;
        c = input.nextInt();
        int d;
        d = input.nextInt();
        if(a > b){
            if (c == d){
                System.out.println("a is greater than b and c is equal to d");
            }
            else{
                System.out.println("Conditions not satisfied");
            }
        }
        else {
            System.out.println("Conditions not satisfied");
        }
    }
}