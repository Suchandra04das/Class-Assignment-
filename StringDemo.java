package String;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        String str1="Suchandra";
        String str2="Suchandra";
        String str3="Thank you";
        str1.concat(" Das");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str3));
        String s1=new String("Thank you");
        String s2=new String("Thank you");
        System.out.println(s1==s2);
        System.out.println(str1.charAt(7));
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char: ");



    }

}
