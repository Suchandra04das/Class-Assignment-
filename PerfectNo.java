package Basicprograms;//find perfect number
import java.util.Scanner;
public class PerfectNo {
    public void findPerfectNo(int num) {//method creation
        int i, c = 0;//variable declare in method
        for (i = 1; i < num; i++) {//calculation using for loop
            if (num % i == 0)
                c = c + i;
        }
            if (num == c){
                System.out.println("the number is perfect number: ");}
             else
                System.out.println("the number is not perfect number: ");
             
    }//end method

    public static void main(String[] args) {
        int n;//variable declare in main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        n=sc.nextInt();//taking input from user
        PerfectNo pl=new PerfectNo();//invoking method
        pl.findPerfectNo(n);

    }

}
