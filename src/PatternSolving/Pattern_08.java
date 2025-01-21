package PatternSolving;

import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==j||i+j==row+1||i==1||j==1||i==row||j==row){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
//*  *  *  *  *  *  *
//*  *           *  *
//*     *     *     *
//*        *        *
//*     *     *     *
//*  *           *  *
//*  *  *  *  *  *  *
