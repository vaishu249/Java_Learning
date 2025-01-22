package PatternSolving;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print(i+" ");
            }
            System.out.println("  ");
        }
    }
}
//1 1 1 1 1 1 1
//2 2 2 2 2 2 2
//3 3 3 3 3 3 3
//4 4 4 4 4 4 4
//5 5 5 5 5 5 5
//6 6 6 6 6 6 6
//7 7 7 7 7 7 7
