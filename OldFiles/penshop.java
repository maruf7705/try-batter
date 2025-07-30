import java.util.Scanner;
public class penshop {
    public static void main(String[]args){

        Scanner Taka = new Scanner(System.in);
        System.out.print("How much money do you have: ");
        int money = Taka.nextInt();

        if (money<10){
            System.out.println("You do not have enough money");
            System.out.println("Come back with money ");
        }
        else if (money>10 && money<40){
            System.out.println("You can get 1 think");
        }
        else 
        System.out.println("You can get both ");




    }
}
