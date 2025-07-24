import java.util.Scanner;

public class JavaProject {
    public static void main(StringLearn[] args){
        int Value1, Value2, Total;
        System.out.print("Please Enter the value");
        Scanner Fristvalue = new Scanner(System.in);
        Value1 = Fristvalue.nextInt();
        System.out.println("Please enter the secound value");
        Scanner Secoundvalue = new Scanner(System.in);
        Value2 = Secoundvalue.nextInt();
        Total = Value1+Value2;
        System.out.println("The total of the two values is"+ Total);

    }
}