import java.util.Scanner;

public class Calculator {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        while (true) {
        
            System.out.println("Simple Calculator: ");
            System.out.println("Enter you frist Number: ");
            double num = input.nextDouble();

            System.out.println("Enter Oparetor (+ , - , * , / ):");
            char Oparetor = input.next().charAt(0);

            System.out.println(input);
            
        }

    }

}
