public class Intlearning {
    public static void main(String[]args){

        int age = 30;
        int physics = 97;
        int chem = 99;
        int Math = 100;
        int eng = 95;

        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 95;

        System.out.println("Physics: "+marks[1]);
        System.out.println(marks[2]);

        System.out.println(marks.length);

        String[] names = new String[5];
        names[1] = "Maruf";
        names[2] = "Sadik";
        names[3] = "Rifah";
        names[4] = "Tasnia";
        System.out.println(names[1]+" & "+names[4]);

        byte[] num = new byte[5];
        // num[5] = 5;
        num[4] = 0;
        num[3] = 1;
        num[2] = 5;
        num[1] = 3;
        num[0] = 9;
        System.out.println(num[4]);

        String Name = "This Is My world";
        System.out.println(Name);
        String Name2 = Name.replace("T","i");
        System.out.println(Name2);
        String Name3 = Name2.replace("i", "T");
        System.out.println(Name3);

        int[] mar = new int[5];
        mar[1]=5;
        System.out.println(mar[1]);
    }
}
