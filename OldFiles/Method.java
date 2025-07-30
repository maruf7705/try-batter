public class Method {
    public static void javaprogram()
    {
        System.out.println("I am Maruf , The java Programmer.");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void printsum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[]args){
        printname("Maruf Islam");
        printname("Sadik Islam");
        javaprogram();
        javaprogram();
        javaprogram();
        printsum(5, 7);
    }
}
