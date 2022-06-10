package Basicprograms;//program for create pattern using star

public class Pattern {
    public static void main(String[] args) {
        int i,j;//variables declaration
        for(i=1;i<=5;i++)//row creation
        {for(j=1;j<=5;j++)//column creation
        {
             System.out.print("*");
            }//internal for loop
            System.out.println();
        }//external for loop
    }
}
