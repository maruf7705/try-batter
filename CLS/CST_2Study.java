// import java.util.Scanner;

// public class CST_2Study {
//     public static void main(String[]args){
//         System.out.print("What is the value of a: ");
//         Scanner scannera = new Scanner(System.in);
//         int a = scannera.nextInt();
//         // The value of a 
//         System.out.print("What is the value of b: ");
//         Scanner scannerb = new Scanner(System.in);
//         int b = scannerb.nextInt();
//         // The value of b.
//         int summation;
//         summation = a+b;
//         System.out.println(summation);
//     }
// }

import java.util.Scanner;

public class CST_2Study {

    public static void main(String[]args){
        
        int a ,b , sum ;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the value of a: ");
        a = sc.nextInt();
        System.out.print("What is the value of b: ");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Total a+b= "+sum);

    }

}