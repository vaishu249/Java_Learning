// logic for
        //* * * * *
        //*       *
        //*       *
        //*       *
        //* * * * *

package PatternSolving;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || i==row-1||j==0||j==col-1){
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
