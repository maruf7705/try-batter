import java.util.Scanner;

public class Arathemath {
    public static void main(String[]args){

        System.out.println("what is the value of a");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();

        System.out.println("what is the value of B");
        Scanner b = new Scanner(System.in);
        int B = b.nextInt();
        int C = A+B;
         // A + G
        System.out.println("a + b = " + C);

        System.out.println("What is the value of c ?");
        Scanner c = new Scanner(System.in);
        int C1 = c.nextInt();
        int d = C-C1;
        System.out.println("Your (a+b)-c = "+ d);
        // Div
        double E = C%C1;
        System.out.println("Your E value is " + E);


    }
}
