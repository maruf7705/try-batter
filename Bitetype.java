import java.lang.annotation.Repeatable;

public class Bitetype {
    public static void main(String[]args){
        byte age = 19;
        int phone = 3324033;
        long phone2 = 45403285423L;
        float pi = 3.1416F;
        char Letter = 'M';
        boolean isAdult = true;
        String name = "MarufIsMaruf";
        System.out.println(name.length());
        String update = "Updatetheword";
        System.out.println(update.length());
        String Name = "Maruf";
        String Nameone = "Rifah";
        String allname = Name+" & "+Nameone;
        System.out.println(allname);
        String name2 = allname.replace('M', 'm');
        System.out.println(name2);
        System.out.println(name2.substring(5,10));
        name2 = name2.substring(4,10);
        System.out.println(name2);
        // System.out.println();

    }
}
