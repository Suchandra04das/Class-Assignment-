package Basicprograms;//program for create pattern using star

public class StarrPattern4 {
    public static void main(String[] args) {
        int i, j, k;//variables declaration
        for (i = 1; i <= 5; i++) {//create row using for loop
            for (j = 5; j >= i; j--) {//create space
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {//create star
                System.out.print("* ");}

            System.out.println();
        }
        for(i=1;i<=5;i++){//create row using for loop
            for(j=0;j<i;j++){//create space
                System.out.print(" ");
            }
            for(k=5;k>=i;k--){//create star
                System.out.print("* ");

            }
            System.out.println();
    }}}
