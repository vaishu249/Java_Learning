package PatternSolving;

import java.util.Scanner;

public class Pattern_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for(int i=row;i>0;i--){
            for(int j=0;j<=col;j++){
                if(i<=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//     *
//    **
//   ***
//  ****
// *****
