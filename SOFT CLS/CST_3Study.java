import java.util.Scanner;

public class CST_3Study{
    public static void main(String[]args){
        // int c;
        Scanner c = new Scanner(System.in);
        System.out.print("What is the rediouse of your circle: ");
        double r = c.nextDouble();
        double area = 3.1416*r*r;
        System.out.println("The area of circle is: "+area);
        System.out.println(area);

    }
}