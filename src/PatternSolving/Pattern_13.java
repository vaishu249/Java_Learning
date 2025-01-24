package PatternSolving;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1||j==1||i==row||j==col||(i+j==row+1&&(i%2!=0))||(j%2!=0&&(i>col/2))||(i%2!=0&&(j<=row/2))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//* * * * *
//*       *
//* * *   *
//*   *   *
//* * * * *