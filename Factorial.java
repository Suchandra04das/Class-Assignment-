package Basicprograms;// program to find factorial number
import java.sql.SQLOutput;
import java.util.Scanner;
public class Factorial {
    public int fact(int num){//method creation
       int fact=1;//variable declaration
        for(int i=1;i<=num;i++){//calculation using for loop
            fact=i*fact;//
        }
        return fact;

    }//end method

    public static void main(String[] args) {
        int no,f;//variables declaration
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        no=sc.nextInt();
        Factorial obj=new Factorial();//invoking method
        f= obj.fact(no);//method invoking
        System.out.println("Factorial of " + no + " is " + f);


    }
}
