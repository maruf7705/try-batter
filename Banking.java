import java.util.Scanner;

public class Banking {

    public static void dss() {
        System.out.println("******************");
    }

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        double balance = 100000;
        boolean isruning = true;
        int choice;

        while (isruning) {

            System.out.println("\n**********************");
            System.out.println("BANKING SYSTEM");
            dss();
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            dss();
            System.out.println("Enter your choice(1 to 4)");
            // Choiceladafd = Scanner.nextInt();
            choice = Scanner.nextInt();

            // String y = "Maruf";
            // System.out.println(y.toUpperCase());

            // System.out.println();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> System.out.println("Deposit".toUpperCase());
                case 3 -> System.out.println("Withdraw".toUpperCase());
                case 4 -> isruning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }
        // Scanner.close();
    }

    static void showBalance(double balance) {

        System.out.printf("$%f", balance);

    }

}
