import java.util.Scanner;

class Quadication {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = Sc.nextDouble();
        System.out.print("b: ");
        double b = Sc.nextDouble();
        System.out.print("c: ");
        double c = Sc.nextDouble();
        double d = ((b*b)-(4*a*c));

        if (d>0) {
            double r1 = ((-b + Math.sqrt(d))/2*a);
            double r2 = ((-b - Math.sqrt(d))/2*a);
            System.out.println("Roots are real " + r1 + " and " + r2);
        }
        else if (d==0){
            double r = (d/(2*a)); 
            System.out.println("Roots are equal " + r);
        }
        else {
            System.out.println("Roots are imaginary");
        }
    }
}