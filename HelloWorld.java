// package HelloWorld;

// public class HelloWorld{
//     public static void main(String[] args){
//         System.out.print("Java is awesome");
//     }
// }

import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args){
        System.out.print("We should we call you ");
        // Scanner UserInput = new Scanner(System.in);
        Scanner MarufInput = new Scanner(System.in);
        System.out.println("Hello "+MarufInput.nextLine());
        System.out.print("what do you to do ?");
        Scanner LifeInput = new Scanner(System.in);
        System.out.println("Is it your life"+LifeInput.nextLine());
        System.out.print("What is your next work ? ");
        Scanner Work = new Scanner(System.in);
        System.out.println("good so your work is, "+ Work.nextLine());
        System.out.print("What is your Name and vlaue of Boolean");
        Scanner lifetool = new Scanner(System.in);
        System.out.println("Oka so answer"+lifetool.nextLine());
    }
}
