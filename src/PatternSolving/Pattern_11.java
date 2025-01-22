package PatternSolving;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        char c='A';
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
//A
//B B
//C C C
//D D D D
//E E E E E
