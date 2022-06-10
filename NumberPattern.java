package Basicprograms;//program for create pattern using number

public class NumberPattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {//create row using for loop
            for (j = 5; j > i; j--) {//create space
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }//create star

            System.out.println();
        }
        for(i=5;i>=1;i--){//create row using for loop
            for(j=5;j>=i;j--){//create space
                System.out.print(" ");
            }
            for(k=1;k<i;k++){//create star
                System.out.print(k+" ");

            }
            System.out.println();
}}}

