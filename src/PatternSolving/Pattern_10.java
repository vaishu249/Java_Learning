package PatternSolving;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        String str="Welcome";
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col ; j++) {
                if(i==j || i+j==row+1){
                    System.out.print(str.charAt(i-1)+"  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
//W                 W
//   e           e
//      l     l
//         c
//      o     o
//   m           m
//e                 e
