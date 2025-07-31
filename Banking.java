import java.util.Scanner;

public class Banking {

    public static void dcc() {
        System.out.println("*****************");
    }

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;
        dcc();

        while (isRunning) {

            System.out.println("Banking System");
            dcc();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdow");
            System.out.println("4.Exit");
            dcc();
            System.out.print("Enter your choice (1 to 4:) ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("SHow balance");
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("Withdow");
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");

            }

        }

        scanner.close();

    }

    static void showBalance(double balance){
        
    }

}