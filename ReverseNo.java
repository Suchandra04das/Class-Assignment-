package Basicprograms;// print reverse number of a number
import java.util.Scanner;
public class ReverseNo {
    public int findReverse(int n){//create method
        int temp,rev=0,rem;//variables declare in method
        temp=n;
        while(n!=0){//calculation using while loop
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }//end method

    public static void main(String[] args) {
        int num,reverse;
        Scanner sc=new Scanner(System.in);//taking input from user
        System.out.println("Enter the number");
        num=sc.nextInt();
        ReverseNo obj=new ReverseNo();//invoking method
       reverse=obj.findReverse(num);
        System.out.println("the reverse number: "+reverse);

    }
}
