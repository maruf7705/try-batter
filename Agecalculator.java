import java.util.Scanner;
public class Agecalculator{
    public static void main(StringLearn[] agrgs){
        System.out.print("How old are you ?");
        Scanner UserAge = new Scanner(System.in);
        int Age = UserAge.nextInt();
        System.out.print("You will be"+(Age+5)+"five years from now");
    }
}

