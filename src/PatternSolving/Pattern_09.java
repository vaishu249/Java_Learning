package PatternSolving;

import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col; j++) {
                if(i%2==0){
                    System.out.print((col-i+1)+" ");
                }
                else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
//x x x x x x x x x x
//9 9 9 9 9 9 9 9 9 9
//x x x x x x x x x x
//7 7 7 7 7 7 7 7 7 7
//x x x x x x x x x x