package String;
import java.util.Scanner;
public class OccurrenceChar {
    public static void main(String[] args) {
        String str="Suchandra";
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the charater: ");
        int search = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c==search)
                count++;
        }
        if(count!=0){
            System.out.println("The number of occurrence the character: "+count);
        }
        else System.out.println("Character is not found");

    }
}
