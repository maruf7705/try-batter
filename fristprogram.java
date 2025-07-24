import java.util.Scanner;
public class fristprogram {
    public static void main(String[] args){
        System.out.print("How old are you ?");
        Scanner UserAge = new Scanner(System.in);
        int Age = UserAge.nextInt();
        System.out.println("You will be"+(Age+5)+"five years from now");
    }
}

