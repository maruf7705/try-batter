import java.util.Scanner;
public class name {
    
    public static void main(String[]agrs){
        System.out.print("what is your name: ");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        System.out.println("Your name is: "+Name);
    }
}
