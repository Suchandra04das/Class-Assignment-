package String;
import java.util.Scanner;
public class FindChar {
    public static void main(String[] args) {
    int position=-1;
        String str="Hello";
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the charater which you want search: ");
        int search=sc.next().charAt(0);
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            if (search == c) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("charater found at " + (position + 1) + " position");
        } else {System.out.println("data not found");
    }
}}
