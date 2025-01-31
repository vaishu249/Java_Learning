package ProblemSolving;

import java.util.Scanner;

public class P31SearchEleIn2DArray {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter row size :");
        int row=input.nextInt();
        System.out.print("Enter column size :");
        int col=input.nextInt();
        int[] [] numArr=new int[row] [col];
        System.out.println("Enter element ...");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int num= input.nextInt();
                numArr[i][j]=num;
            }
        }
        System.out.println("Your array is ...");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(numArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter element you want to search : ");
        int ele= input.nextInt();
        boolean flag=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(numArr[i][j]==ele){
                    flag=true;
                }
            }
        }
        if(flag==true){
            System.out.println("Element is present ");
        }
        else{
            System.out.println("Number is not present ");
        }
    }
}
