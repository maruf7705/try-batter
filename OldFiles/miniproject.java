import java.util.Scanner;

public class miniproject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*10);
        int usernumber = 0;
        int attempt = 0;

        do{
            System.out.println("Guess my number: ");
            usernumber = sc.nextInt();
            attempt++;

            if(usernumber>10 || usernumber<1){
                System.out.println("Please Enter(1-10)");
            }
            else if (usernumber > mynum){
                System.out.println("You is too larage too larage");
            }
            else if(usernumber < mynum){
                System.out.println("your number is too small");
            }
            else{
               System.out.println("WOOOO, HOOO , Correct number");
                break;

            }
        } while(usernumber>=0);
        
        System.out.println("Random number was: "+mynum);
        System.out.println("Attempt is: "+attempt);

    }
}
