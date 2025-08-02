import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);

    public static void dass() {
        System.out.println("***************");
    }

    public static void main(String[] args) {

        double balance = 0;
        int choice;
        boolean isRunning = true;
        dass();

        while (isRunning) {
            System.out.println("BANKING PROGRAM");
            dass();
            System.out.println("1.Deposit Money");
            System.out.println("2.Withdow Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            dass();
            System.out.print("Enter your choice (1 to 4): ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1 -> balance = balance += deposit();
                case 2 -> balance -= withdow(balance);
                case 3 -> showBalance(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");

            }
            // dass();

        }
        dass();
        System.out.println("Thank you! Have a nice day");
        scanner.close();

    }

    static void showBalance(double balance) {

        System.out.printf("$%.2f\n", balance);
        dass();

    }

    static double deposit() {
        double amount;
        System.out.print("Enter an to be deposited");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negetive");
        } else {
            return amount;
        }

        return 0;

    }

    static double withdow(double balance) {
        double amount;
        System.out.print("How much you wnat to withdow ?");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("the amount can't be negetive");
            return 0;
        } else {
            return amount;
        }

    }
}